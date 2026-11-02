// react-native-webview needs its native module, which jest has not: a stub that renders nothing (#269). The flow
// through the provider's page is tested with ProviderPage mocked (the rider's test/cards.test.tsx, the driver's test/money.test.tsx).
module.exports = {WebView: () => null};
