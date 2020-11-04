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
package org.robovm.pods.appcenter.core;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSAppCenter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MSAppCenterPtr extends Ptr<MSAppCenter, MSAppCenterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSAppCenter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSAppCenter() {}
    protected MSAppCenter(Handle h, long handle) { super(h, handle); }
    protected MSAppCenter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "sharedInstance")
    public static native MSAppCenter sharedInstance();
    @Method(selector = "configureWithAppSecret:")
    public static native void configure(String appSecret);
    @Method(selector = "configure")
    public static native void configure();
    @Method(selector = "start:withServices:")
    public static native void start(String appSecret, NSArray<?> services);
    @Method(selector = "startWithServices:")
    public static native void start(NSArray<?> services);
    @Method(selector = "startService:")
    public static native void startService(Class<?> service);
    @Method(selector = "startFromLibraryWithServices:")
    public static native void startFromLibrary(NSArray<?> services);
    @Method(selector = "isConfigured")
    public static native boolean isConfigured();
    @Method(selector = "isRunningInAppCenterTestCloud")
    public static native boolean isRunningInAppCenterTestCloud();
    @Method(selector = "setLogUrl:")
    public static native void setLogUrl(String logUrl);
    @Method(selector = "setEnabled:")
    public static native void setEnabled(boolean isEnabled);
    @Method(selector = "isEnabled")
    public static native boolean isEnabled();
    @Method(selector = "logLevel")
    public static native MSLogLevel logLevel();
    @Method(selector = "setLogLevel:")
    public static native void setLogLevel(MSLogLevel logLevel);
    @Method(selector = "setLogHandler:")
    public static native void setLogHandler(@Block("(@Block,,,,,)") VoidBlock6<Block0<String>, MSLogLevel, NSString, BytePtr, BytePtr, Integer> logHandler);
    @Method(selector = "setWrapperSdk:")
    public static native void setWrapperSdk(MSWrapperSdk wrapperSdk);
    @Method(selector = "setCustomProperties:")
    public static native void setCustomProperties(MSCustomProperties customProperties);
    @Method(selector = "isAppDelegateForwarderEnabled")
    public static native boolean isAppDelegateForwarderEnabled();
    @Method(selector = "installId")
    public static native NSUUID installId();
    @Method(selector = "isDebuggerAttached")
    public static native boolean isDebuggerAttached();
    @Method(selector = "sdkVersion")
    public static native String sdkVersion();
    @Method(selector = "setMaxStorageSize:completionHandler:")
    public static native void setMaxStorageSize(@MachineSizedSInt long sizeInBytes, @Block VoidBooleanBlock completionHandler);
    @Method(selector = "setUserId:")
    public static native void setUserId(String userId);
    @Method(selector = "setCountryCode:")
    public static native void setCountryCode(String countryCode);
    /*</methods>*/
}
