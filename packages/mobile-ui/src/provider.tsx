import {useEffect} from 'react';

type Props = {url: string; fields: Record<string, string>; returnUrl: string | null; onDone: () => void;
  closeLabel?: string};
type Form = {method: string; action: string; target: string; style: {display: string}; submit(): void; remove(): void;
  appendChild(child: unknown): void};
type Doc = {createElement(tag: string): Form & {type: string; name: string; value: string}; body: {appendChild(child:
  unknown): void}};

/**
 * The provider's page on the web build (#269, end-to-end runs only): the form is posted in a new tab, and the app
 * reads the binding until it settles. The phone's build uses provider.native.tsx (a WebView).
 */
export function ProviderPage({url, fields, onDone}: Props) {
  useEffect(() => {
    const doc = (globalThis as unknown as {document: Doc}).document;
    const form = doc.createElement('form');
    form.method = 'POST';
    form.action = url;
    form.target = '_blank';
    form.style.display = 'none';
    for (const [name, value] of Object.entries(fields)) {
      const input = doc.createElement('input');
      input.type = 'hidden';
      input.name = name;
      input.value = value;
      form.appendChild(input);
    }
    doc.body.appendChild(form);
    form.submit();
    form.remove();
    onDone();
  }, []); // once per binding
  return null;
}
