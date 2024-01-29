import * as React from 'react';

import { StyleSheet, View } from 'react-native';
import { EmojiPickerView } from 'react-native-emoji-picker';

export default function App() {
  return (
    <View style={styles.container}>
      <EmojiPickerView style={styles.box} emojiColumns={10} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flexGrow: 1,
    // flex: 1,
    // alignItems: 'center',
    // justifyContent: 'center',
  },
  box: {
    // width: 100,
    // height: 100,
    flexGrow: 1,
    // backgroundColor: 'pink',
    // marginVertical: 20,
  },
});
