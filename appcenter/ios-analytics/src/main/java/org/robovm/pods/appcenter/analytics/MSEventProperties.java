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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSEventProperties/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MSEventPropertiesPtr extends Ptr<MSEventProperties, MSEventPropertiesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSEventProperties.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSEventProperties() {}
    protected MSEventProperties(Handle h, long handle) { super(h, handle); }
    protected MSEventProperties(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setString:forKey:")
    public native MSEventProperties setString(String value, String key);
    @Method(selector = "setDouble:forKey:")
    public native MSEventProperties setDouble(double value, String key);
    @Method(selector = "setInt64:forKey:")
    public native MSEventProperties setInt64(long value, String key);
    @Method(selector = "setBool:forKey:")
    public native MSEventProperties setBool(boolean value, String key);
    @Method(selector = "setDate:forKey:")
    public native MSEventProperties setDate(NSDate value, String key);
    /*</methods>*/
}
