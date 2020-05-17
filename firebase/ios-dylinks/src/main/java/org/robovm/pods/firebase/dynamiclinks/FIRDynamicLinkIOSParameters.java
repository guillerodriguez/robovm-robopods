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
package org.robovm.pods.firebase.dynamiclinks;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRDynamicLinkIOSParameters/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRDynamicLinkIOSParametersPtr extends Ptr<FIRDynamicLinkIOSParameters, FIRDynamicLinkIOSParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRDynamicLinkIOSParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FIRDynamicLinkIOSParameters() {}
    protected FIRDynamicLinkIOSParameters(Handle h, long handle) { super(h, handle); }
    protected FIRDynamicLinkIOSParameters(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBundleID:")
    public FIRDynamicLinkIOSParameters(String bundleID) { super((SkipInit) null); initObject(init(bundleID)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "bundleID")
    public native String getBundleID();
    @Property(selector = "appStoreID")
    public native String getAppStoreID();
    @Property(selector = "setAppStoreID:")
    public native void setAppStoreID(String v);
    @Property(selector = "fallbackURL")
    public native NSURL getFallbackURL();
    @Property(selector = "setFallbackURL:")
    public native void setFallbackURL(NSURL v);
    @Property(selector = "customScheme")
    public native String getCustomScheme();
    @Property(selector = "setCustomScheme:")
    public native void setCustomScheme(String v);
    @Property(selector = "iPadBundleID")
    public native String getIPadBundleID();
    @Property(selector = "setIPadBundleID:")
    public native void setIPadBundleID(String v);
    @Property(selector = "iPadFallbackURL")
    public native NSURL getIPadFallbackURL();
    @Property(selector = "setIPadFallbackURL:")
    public native void setIPadFallbackURL(NSURL v);
    @Property(selector = "minimumAppVersion")
    public native String getMinimumAppVersion();
    @Property(selector = "setMinimumAppVersion:")
    public native void setMinimumAppVersion(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBundleID:")
    protected native @Pointer long init(String bundleID);
    /*</methods>*/
}
