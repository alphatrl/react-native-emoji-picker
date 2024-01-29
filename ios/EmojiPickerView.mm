#ifdef RCT_NEW_ARCH_ENABLED
#import "EmojiPickerView.h"

#import <react/renderer/components/RNEmojiPickerViewSpec/ComponentDescriptors.h>
#import <react/renderer/components/RNEmojiPickerViewSpec/EventEmitters.h>
#import <react/renderer/components/RNEmojiPickerViewSpec/Props.h>
#import <react/renderer/components/RNEmojiPickerViewSpec/RCTComponentViewHelpers.h>

#import "RCTFabricComponentsPlugins.h"
#import "Utils.h"

using namespace facebook::react;

@interface EmojiPickerView () <RCTEmojiPickerViewViewProtocol>

@end

@implementation EmojiPickerView {
    UIView * _view;
}

+ (ComponentDescriptorProvider)componentDescriptorProvider
{
    return concreteComponentDescriptorProvider<EmojiPickerViewComponentDescriptor>();
}

- (instancetype)initWithFrame:(CGRect)frame
{
  if (self = [super initWithFrame:frame]) {
    static const auto defaultProps = std::make_shared<const EmojiPickerViewProps>();
    _props = defaultProps;

    _view = [[UIView alloc] init];

    self.contentView = _view;
  }

  return self;
}

- (void)updateProps:(Props::Shared const &)props oldProps:(Props::Shared const &)oldProps
{
    const auto &oldViewProps = *std::static_pointer_cast<EmojiPickerViewProps const>(_props);
    const auto &newViewProps = *std::static_pointer_cast<EmojiPickerViewProps const>(props);

    if (oldViewProps.color != newViewProps.color) {
        NSString * colorToConvert = [[NSString alloc] initWithUTF8String: newViewProps.color.c_str()];
        [_view setBackgroundColor: [Utils hexStringToColor:colorToConvert]];
    }

    [super updateProps:props oldProps:oldProps];
}

Class<RCTComponentViewProtocol> EmojiPickerViewCls(void)
{
    return EmojiPickerView.class;
}

@end
#endif
