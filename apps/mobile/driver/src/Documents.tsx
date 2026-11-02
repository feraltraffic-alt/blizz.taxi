import {useRef, useState} from 'react';
import {Text, View} from 'react-native';
import {ApiError} from '@blizz/api-client';
import {Alert, Button, Field, Screen, useTheme, type PickedFile, type Shared} from '@blizz/mobile-ui';

export type {PickedFile} from '@blizz/mobile-ui';

export type Vehicle = {id: string; registration_number: string; make: string; model: string; color: string;
  production_year: number; state: string};
export type DocumentRow = {type: string; decision: string; decision_reason?: string | null;
  vehicle_id?: string | null};
export type AdmissionProfile = {review_status: string; version: number; vehicles: Vehicle[];
  documents: DocumentRow[]};

const DRIVER_TYPES = ['DRIVER_LICENSE', 'IDENTITY', 'TAXI_PERMIT'];
const VEHICLE_TYPES = ['VEHICLE_REGISTRATION', 'INSURANCE'];
const ALLOWED = ['image/jpeg', 'image/png', 'application/pdf'];
const MAX_BYTES = 10 * 1024 * 1024;
const SUBMITTABLE = ['NOT_SUBMITTED', 'CHANGES_REQUIRED', 'EXPIRED'];

type Upload = {file_id: string; upload_path: string};
type Stored = {state: 'SAFE' | 'QUARANTINE' | 'REJECTED'; reject_reason?: string | null};

/**
 * The vehicle and the documents for admission (#284): a vehicle by a form, each document as a checked file attached
 * when SAFE, and the submit for review. One action at a time; what the phone refuses never reaches the server.
 */
export function Documents({client, t, guard, failure, newId, pickFile, profile, onChanged, onBack}: Shared & {
  newId: () => string; pickFile?: () => Promise<PickedFile | null>; profile: AdmissionProfile;
  onChanged: () => Promise<void>; onBack: () => void}) {
  const [car, setCar] = useState({plate: '', make: '', model: '', color: '', year: ''});
  const [message, setMessage] = useState<string | null>(null);
  const [busy, setBusy] = useState(false);
  const acting = useRef(false);
  const theme = useTheme();
  const vehicle = profile.vehicles[0];

  /** Runs one action at a time; the refusals it knows get their own text. */
  async function act(action: () => Promise<void>, refusal: (error: ApiError) => string | null = () => null) {
    if (acting.current) return;
    acting.current = true;
    setBusy(true);
    setMessage(null);
    try {
      await action();
    } catch (error) {
      const known = error instanceof ApiError ? refusal(error) ?? (error.status === 409 ? t('conflict') : null) : null;
      setMessage(known ?? failure(error));
    } finally {
      acting.current = false;
      setBusy(false);
    }
  }

  function addVehicle() {
    const fields = {plate: car.plate.trim(), make: car.make.trim(), model: car.model.trim(), color: car.color.trim()};
    const year = /^\d{4}$/.test(car.year.trim()) ? Number(car.year.trim()) : NaN;
    if (Object.values(fields).some(v => v === '') || !(year >= 1950 && year <= 2100) || fields.plate.length > 16
      || fields.make.length > 60 || fields.model.length > 60 || fields.color.length > 40) {
      setMessage(t('vehicleInvalid'));
      return;
    }
    return act(async () => {
      await guard(() => client.post('/api/driver/v1/vehicles', {body: {command_id: newId(),
        registration_number: fields.plate, make: fields.make, model: fields.model, color: fields.color,
        production_year: year}}));
      await onChanged();
    }, error => error.code === 'VALIDATION_FAILED' ? t('vehicleInvalid') : null);
  }

  function upload(type: string) {
    if (!pickFile) return;
    return act(async () => {
      const file = await pickFile();
      if (!file) return;
      if (!ALLOWED.includes(file.type)) {
        setMessage(t('fileType'));
        return;
      }
      if (file.size > MAX_BYTES) {
        setMessage(t('fileTooBig'));
        return;
      }
      const opened = await guard(() => client.post('/api/driver/v1/documents/upload-sessions', {body: {
        command_id: newId(), content_type: file.type as 'image/png', size_bytes: file.size}})) as Upload;
      const stored = await guard(() => client.upload(opened.upload_path, file.data, file.type)) as Stored;
      if (stored.state === 'REJECTED') {
        setMessage(t('fileRejected', {reason: stored.reject_reason ?? ''}));
        return;
      }
      if (stored.state === 'QUARANTINE') {
        setMessage(t('fileQuarantine'));
        return;
      }
      await guard(() => client.post('/api/driver/v1/documents', {body: {command_id: newId(), type: type as never,
        file_id: opened.file_id, ...(VEHICLE_TYPES.includes(type) && vehicle ? {vehicle_id: vehicle.id} : {})}}));
      await onChanged();
      setMessage(t('documentAdded'));
    });
  }

  function submit() {
    return act(async () => {
      await guard(() => client.post('/api/driver/v1/verification/submit', {body: {command_id: newId(),
        expected_version: profile.version}}));
      await onChanged();
    }, error => error.code === 'VALIDATION_FAILED' ? t('submitMissing') : null);
  }

  function row(type: string) {
    const current = profile.documents.find(d => d.type === type
      && (!VEHICLE_TYPES.includes(type) || !vehicle || !d.vehicle_id || d.vehicle_id === vehicle.id));
    const name = t('docType_' + type);
    const state = current ? t('decision_' + current.decision) + (current.decision_reason ? ' — '
      + current.decision_reason : '') : t('notUploaded');
    const canUpload = Boolean(pickFile) && (!VEHICLE_TYPES.includes(type) || Boolean(vehicle));
    return (
      <View key={type} style={{gap: 4}}>
        <Text style={{color: theme.text}}>{name + ': ' + state}</Text>
        {canUpload ? <Button label={t('upload')} accessibilityLabel={t('uploadOf', {type: name})}
          onPress={() => void upload(type)} disabled={busy} /> : null}
      </View>
    );
  }

  return (
    <Screen title={t('documents')}>
      <Text style={{color: theme.muted}}>{t('review', {status: t('review' + profile.review_status)})}</Text>
      {vehicle ? profile.vehicles.map(v => (
        <Text key={v.id} style={{color: theme.text}}>
          {v.make + ' ' + v.model + ' ' + v.registration_number + ' — ' + t('vehicle_' + v.state)}
        </Text>
      )) : (
        <>
          <Field label={t('plate')} value={car.plate} onChange={plate => setCar(c => ({...c, plate}))} />
          <Field label={t('make')} value={car.make} onChange={make => setCar(c => ({...c, make}))} />
          <Field label={t('model')} value={car.model} onChange={model => setCar(c => ({...c, model}))} />
          <Field label={t('color')} value={car.color} onChange={color => setCar(c => ({...c, color}))} />
          <Field label={t('year')} value={car.year} keyboard="number-pad"
            onChange={year => setCar(c => ({...c, year}))} />
          <Button label={t('addVehicle')} onPress={() => void addVehicle()} disabled={busy} />
        </>
      )}
      {DRIVER_TYPES.map(row)}
      {vehicle ? VEHICLE_TYPES.map(row) : (
        <>
          {VEHICLE_TYPES.map(type => <Text key={type} style={{color: theme.muted}}>{t('docType_' + type) + ': '
            + t('notUploaded')}</Text>)}
          <Text style={{color: theme.muted}}>{t('vehicleFirst')}</Text>
        </>
      )}
      {pickFile ? null : <Text style={{color: theme.muted}}>{t('noPicker')}</Text>}
      {SUBMITTABLE.includes(profile.review_status)
        ? <Button label={t('submitReview')} onPress={() => void submit()} disabled={busy} /> : null}
      <Alert text={message} />
      <Button label={t('home')} onPress={onBack} />
    </Screen>
  );
}
