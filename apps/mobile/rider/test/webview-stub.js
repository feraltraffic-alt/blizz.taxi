// react-native-webview needs its native module, which jest has not: a stub that renders nothing (#269). The flow
// through the provider's page is tested with ProviderPage mocked (test/cards.test.tsx).
module.exports = {WebView: () => null};
