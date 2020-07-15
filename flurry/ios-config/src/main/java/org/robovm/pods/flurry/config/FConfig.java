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
package org.robovm.pods.flurry.config;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FConfigPtr extends Ptr<FConfig, FConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FConfig() {}
    protected FConfig(Handle h, long handle) { super(h, handle); }
    protected FConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "fetchConfig")
    public native void fetchConfig();
    @Method(selector = "activateConfig")
    public native boolean activateConfig();
    @Method(selector = "getStringForKey:withDefault:")
    public native String getString(String key, String def);
    @Method(selector = "getBoolForKey:withDefault:")
    public native boolean getBool(String key, boolean def);
    @Method(selector = "getNumberForKey:withDefault:")
    public native NSNumber getNumber(String key, NSNumber def);
    @Method(selector = "registerObserver:withExecutionQueue:")
    public native void registerObserver(FConfigObserver observer, DispatchQueue queue);
    @Method(selector = "sharedInstance")
    public static native FConfig sharedInstance();
    /*</methods>*/
}
