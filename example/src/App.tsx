import * as React from 'react';

import { StyleSheet, View } from 'react-native';
import { EmojiPickerView } from 'react-native-emoji-picker';

export default function App() {
  return (
    <View style={styles.container}>
      <EmojiPickerView style={styles.box} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flexGrow: 1,
  },
  box: {
    flexGrow: 1,
  },
});
