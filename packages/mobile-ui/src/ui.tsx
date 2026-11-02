import type {ReactNode} from 'react';
import {Pressable, ScrollView, StyleSheet, Text, TextInput, useColorScheme, View} from 'react-native';

export const palette = {
  light: {background: '#FFFFFF', text: '#111827', muted: '#4B5563', accent: '#F5B700', onAccent: '#111827',
    error: '#B91C1C', ok: '#047857', border: '#D1D5DB'},
  dark: {background: '#111827', text: '#F9FAFB', muted: '#D1D5DB', accent: '#F5B700', onAccent: '#111827',
    error: '#FCA5A5', ok: '#6EE7B7', border: '#374151'}
};

export function useTheme() {
  return palette[useColorScheme() === 'dark' ? 'dark' : 'light'];
}

/** accessibilityLabel: what a screen reader says when the label alone says too little (a bare "5" for a score). */
export function Button({label, onPress, disabled, accessibilityLabel}: {label: string; onPress: () => void;
  disabled?: boolean; accessibilityLabel?: string}) {
  const theme = useTheme();
  return (
    <Pressable accessibilityRole="button" accessibilityLabel={accessibilityLabel ?? label} accessibilityState={{disabled: Boolean(disabled)}}
      disabled={disabled} onPress={onPress}
      style={[styles.button, {backgroundColor: theme.accent, opacity: disabled ? 0.5 : 1}]}>
      <Text style={[styles.buttonText, {color: theme.onAccent}]}>{label}</Text>
    </Pressable>
  );
}

export function Field({label, value, onChange, keyboard, error}: {label: string; value: string;
  onChange: (value: string) => void; keyboard?: 'phone-pad' | 'number-pad' | 'decimal-pad'; error?: string | null}) {
  const theme = useTheme();
  return (
    <View style={styles.field}>
      <Text style={{color: theme.muted}}>{label}</Text>
      <TextInput accessibilityLabel={label} value={value} onChangeText={onChange} keyboardType={keyboard}
        style={[styles.input, {color: theme.text, borderColor: error ? theme.error : theme.border}]} />
      {error ? <Text accessibilityRole="alert" style={{color: theme.error}}>{error}</Text> : null}
    </View>
  );
}

export function Screen({title, children}: {title?: string; children: ReactNode}) {
  const theme = useTheme();
  return (
    <ScrollView style={{backgroundColor: theme.background}} contentContainerStyle={styles.screen}>
      {title ? <Text accessibilityRole="header" style={[styles.title, {color: theme.text}]}>{title}</Text> : null}
      {children}
    </ScrollView>
  );
}

export function Alert({text}: {text: string | null}) {
  const theme = useTheme();
  return text ? <Text accessibilityRole="alert" style={{color: theme.error}}>{text}</Text> : null;
}

const styles = StyleSheet.create({
  screen: {padding: 24, gap: 16, flexGrow: 1},
  title: {fontSize: 24, fontWeight: '700'},
  field: {gap: 6},
  input: {borderWidth: 1, borderRadius: 12, paddingHorizontal: 14, paddingVertical: 12, fontSize: 18},
  button: {borderRadius: 12, paddingVertical: 14, alignItems: 'center'},
  buttonText: {fontSize: 17, fontWeight: '600'}
});
