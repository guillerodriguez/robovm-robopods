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
package org.robovm.pods.appcenter.analytics;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSPropertyConfigurator/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MSPropertyConfiguratorPtr extends Ptr<MSPropertyConfigurator, MSPropertyConfiguratorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSPropertyConfigurator.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSPropertyConfigurator() {}
    protected MSPropertyConfigurator(Handle h, long handle) { super(h, handle); }
    protected MSPropertyConfigurator(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setAppVersion:")
    public native void setAppVersion(String appVersion);
    @Method(selector = "setAppName:")
    public native void setAppName(String appName);
    @Method(selector = "setAppLocale:")
    public native void setAppLocale(String appLocale);
    @Method(selector = "setUserId:")
    public native void setUserId(String userId);
    @Method(selector = "setEventPropertyString:forKey:")
    public native void setEventPropertyString(String propertyValue, String propertyKey);
    @Method(selector = "setEventPropertyDouble:forKey:")
    public native void setEventPropertyDouble(double propertyValue, String propertyKey);
    @Method(selector = "setEventPropertyInt64:forKey:")
    public native void setEventPropertyInt64$(long propertyValue, String propertyKey);
    @Method(selector = "setEventPropertyBool:forKey:")
    public native void setEventPropertyBool(boolean propertyValue, String propertyKey);
    @Method(selector = "setEventPropertyDate:forKey:")
    public native void setEventPropertyDate(NSDate propertyValue, String propertyKey);
    @Method(selector = "removeEventPropertyForKey:")
    public native void removeEventPropertyForKey(String propertyKey);
    @Method(selector = "collectDeviceId")
    public native void collectDeviceId();
    /*</methods>*/
}
