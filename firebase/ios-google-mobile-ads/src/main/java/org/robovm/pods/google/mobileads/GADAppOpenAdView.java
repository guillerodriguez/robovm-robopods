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
package org.robovm.pods.google.mobileads;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADAppOpenAdView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADAppOpenAdViewPtr extends Ptr<GADAppOpenAdView, GADAppOpenAdViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADAppOpenAdView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADAppOpenAdView() {}
    protected GADAppOpenAdView(Handle h, long handle) { super(h, handle); }
    protected GADAppOpenAdView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public GADAppOpenAdView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public GADAppOpenAdView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "appOpenAd")
    public native GADAppOpenAd getAppOpenAd();
    @Property(selector = "setAppOpenAd:")
    public native void setAppOpenAd(GADAppOpenAd v);
    @Property(selector = "adCloseHandler")
    public native @Block Runnable getAdCloseHandler();
    @Property(selector = "setAdCloseHandler:")
    public native void setAdCloseHandler(@Block Runnable v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
