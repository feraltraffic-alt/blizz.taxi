module.exports = {
  preset: 'jest-expo',
  testMatch: ['<rootDir>/test/**/*.test.tsx'],
  // A first render compiles the app's modules: on a loaded CI runner that alone can pass the default 5 s (#262).
  testTimeout: 20_000,
  moduleNameMapper: {'^react-native-webview$': '<rootDir>/test/webview-stub.js'},
  transformIgnorePatterns: [
    'node_modules/(?!((jest-)?react-native|@react-native(-community)?)|expo(nent)?|@expo(nent)?/.*|@blizz/.*)'
  ]
};
