/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.applovinsdk;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALInterstitialAd/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALInterstitialAdPtr extends Ptr<ALInterstitialAd, ALInterstitialAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALInterstitialAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ALInterstitialAd() {}
    protected ALInterstitialAd(Handle h, long handle) { super(h, handle); }
    protected ALInterstitialAd(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSdk:")
    public ALInterstitialAd(ALSdk sdk) { super((SkipInit) null); initObject(init(sdk)); }
    /**
     * @deprecated Initializing with the `frame` property has been deprecated and will be removed in a future SDK version.
     */
    @Deprecated
    @Method(selector = "initWithFrame:sdk:")
    public ALInterstitialAd(@ByVal CGRect frame, ALSdk sdk) { super((SkipInit) null); initObject(init(frame, sdk)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adLoadDelegate")
    public native ALAdLoadDelegate getAdLoadDelegate();
    @Property(selector = "setAdLoadDelegate:")
    public native void setAdLoadDelegate(ALAdLoadDelegate v);
    @Property(selector = "adDisplayDelegate")
    public native ALAdDisplayDelegate getAdDisplayDelegate();
    @Property(selector = "setAdDisplayDelegate:")
    public native void setAdDisplayDelegate(ALAdDisplayDelegate v);
    @Property(selector = "adVideoPlaybackDelegate")
    public native ALAdVideoPlaybackDelegate getAdVideoPlaybackDelegate();
    @Property(selector = "setAdVideoPlaybackDelegate:")
    public native void setAdVideoPlaybackDelegate(ALAdVideoPlaybackDelegate v);
    /**
     * @deprecated Checking whether an ad is ready for display has been deprecated and will be removed in a future SDK version. Please use `show`, `showOver:` or `showOver:andRender:` to display an ad.
     */
    @Deprecated
    @Property(selector = "isReadyForDisplay")
    public native boolean isReadyForDisplay();
    /**
     * @deprecated Setting the `frame` property has no effect. It has been deprecated and will be removed in a future SDK version.
     */
    @Deprecated
    @Property(selector = "frame")
    public native @ByVal CGRect getFrame();
    /**
     * @deprecated Setting the `frame` property has no effect. It has been deprecated and will be removed in a future SDK version.
     */
    @Deprecated
    @Property(selector = "setFrame:")
    public native void setFrame(@ByVal CGRect v);
    /**
     * @deprecated Setting the `hidden` property has no effect. It has been deprecated and will be removed in a future SDK version.
     */
    @Deprecated
    @Property(selector = "hidden")
    public native boolean isHidden();
    /**
     * @deprecated Setting the `hidden` property has no effect. It has been deprecated and will be removed in a future SDK version.
     */
    @Deprecated
    @Property(selector = "setHidden:")
    public native void setHidden(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "show")
    public native void show();
    @Method(selector = "showAd:")
    public native void showAd(ALAd ad);
    @Method(selector = "initWithSdk:")
    protected native @Pointer long init(ALSdk sdk);
    @Method(selector = "show")
    public static native ALInterstitialAd Show();
    @Method(selector = "shared")
    public static native ALInterstitialAd shared();
    /**
     * @deprecated Placements have been deprecated and will be removed in a future SDK version. Please configure zones from the UI and use them instead.
     */
    @Deprecated
    @Method(selector = "showOverPlacement:")
    public native void showOverPlacement(String placement);
    /**
     * @deprecated Placements have been deprecated and will be removed in a future SDK version. Please configure zones from the UI and use them instead.
     */
    @Deprecated
    @Method(selector = "showOver:placement:andRender:")
    public native void showOver(UIWindow window, String placement, ALAd ad);
    /**
     * @deprecated Initializing with the `frame` property has been deprecated and will be removed in a future SDK version.
     */
    @Deprecated
    @Method(selector = "initWithFrame:sdk:")
    protected native @Pointer long init(@ByVal CGRect frame, ALSdk sdk);
    /**
     * @deprecated Dismissing an interstitial while playing negatively affects CPM and is highy discouraged. It is now deprecated and will be removed in a future SDK version.
     */
    @Deprecated
    @Method(selector = "dismiss")
    public native void dismiss();
    /**
     * @deprecated Explicitly passing in an UIWindow to show an ad is deprecated as all cases show over the application's key window. Use show instead.
     */
    @Deprecated
    @Method(selector = "showOver:")
    public native void showOver(UIWindow window);
    /**
     * @deprecated Explicitly passing in an UIWindow to show an ad is deprecated as all cases show over the application's key window. Use showAd: instead.
     */
    @Deprecated
    @Method(selector = "showOver:andRender:")
    public native void showOver(UIWindow window, ALAd ad);
    /**
     * @deprecated Placements have been deprecated and will be removed in a future SDK version. Please configure zones from the UI and use them instead.
     */
    @Deprecated
    @Method(selector = "showOverPlacement:")
    public static native ALInterstitialAd ShowOverPlacement(String placement);
    /**
     * @deprecated Placements have been deprecated and will be removed in a future SDK version. Please configure zones from the UI and use them instead.
     */
    @Deprecated
    @Method(selector = "showOver:placement:")
    public static native ALInterstitialAd ShowOver(UIWindow window, String placement);
    /**
     * @deprecated Checking whether an ad is ready for display has been deprecated and will be removed in a future SDK version. Please use `show`, `showOver:` or `showOver:andRender:` to display an ad.
     */
    @Deprecated
    @Method(selector = "isReadyForDisplay")
    public static native boolean IsReadyForDisplay();
    /**
     * @deprecated Explicitly passing in an UIWindow to show an ad is deprecated as all cases show over the application's key window. Use show instead.
     */
    @Deprecated
    @Method(selector = "showOver:")
    public static native ALInterstitialAd ShowOver(UIWindow window);
    /*</methods>*/
}
