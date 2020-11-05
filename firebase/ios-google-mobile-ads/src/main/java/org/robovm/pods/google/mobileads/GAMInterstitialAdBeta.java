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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GAMInterstitialAdBeta/*</name>*/ 
    extends /*<extends>*/GADInterstitialAdBeta/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GAMInterstitialAdBetaPtr extends Ptr<GAMInterstitialAdBeta, GAMInterstitialAdBetaPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GAMInterstitialAdBeta.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GAMInterstitialAdBeta() {}
    protected GAMInterstitialAdBeta(Handle h, long handle) { super(h, handle); }
    protected GAMInterstitialAdBeta(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "appEventDelegate")
    public native GADAppEventDelegateBeta getAppEventDelegate();
    @Property(selector = "setAppEventDelegate:", strongRef = true)
    public native void setAppEventDelegate(GADAppEventDelegateBeta v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadWithAdManagerAdUnitID:request:completionHandler:")
    public static native void load(String adUnitID, DFPRequest request, @Block VoidBlock2<GAMInterstitialAdBeta, NSError> completionHandler);
    /*</methods>*/
}
