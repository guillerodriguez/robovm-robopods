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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSACCustomProperties/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MSACCustomPropertiesPtr extends Ptr<MSACCustomProperties, MSACCustomPropertiesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSACCustomProperties.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSACCustomProperties() {}
    protected MSACCustomProperties(Handle h, long handle) { super(h, handle); }
    protected MSACCustomProperties(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setString:forKey:")
    public native MSACCustomProperties setString(String value, String key);
    @Method(selector = "setNumber:forKey:")
    public native MSACCustomProperties setNumber(NSNumber value, String key);
    @Method(selector = "setBool:forKey:")
    public native MSACCustomProperties setBool(boolean value, String key);
    @Method(selector = "setDate:forKey:")
    public native MSACCustomProperties setDate(NSDate value, String key);
    @Method(selector = "clearPropertyForKey:")
    public native MSACCustomProperties clearPropertyForKey(String key);
    /*</methods>*/
}
