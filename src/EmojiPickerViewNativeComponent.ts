import codegenNativeComponent from 'react-native/Libraries/Utilities/codegenNativeComponent';
import type { ViewProps } from 'react-native';
import type { Float, Int32 } from 'react-native/Libraries/Types/CodegenTypes';

interface NativeProps extends ViewProps {
  emojiRows?: Float;
  emojiColumns?: Int32;
}

export default codegenNativeComponent<NativeProps>('EmojiPickerView');
