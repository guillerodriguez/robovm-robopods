
#include <TargetConditionals.h>

#if TARGET_OS_IPHONE || TARGET_OS_TV || TARGET_IPHONE_SIMULATOR
	#import <UIKit/UIKit.h>
#else
    #import <Cocoa/Cocoa.h>
#endif


// In this header, you should import all the public headers of your framework using statements like #import <Lottie/Lottie-Swift.h>
#import <Lottie/Lottie-Swift.h>
