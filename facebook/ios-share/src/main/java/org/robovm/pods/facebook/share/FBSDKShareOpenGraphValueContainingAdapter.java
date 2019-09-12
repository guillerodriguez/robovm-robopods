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
package org.robovm.pods.facebook.share;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.photos.*;
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKShareOpenGraphValueContainingAdapter/*</name>*/ 
    extends /*<extends>*/NSCodingAdapter/*</extends>*/ 
    /*<implements>*/implements FBSDKShareOpenGraphValueContaining/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("allProperties")
    public NSDictionary<NSString, ?> getAllProperties() { return null; }
    @NotImplemented("keyEnumerator")
    public NSEnumerator<?> getKeyEnumerator() { return null; }
    @NotImplemented("objectEnumerator")
    public NSEnumerator<?> getObjectEnumerator() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("arrayForKey:")
    public NSArray<?> arrayForKey(String key) { return null; }
    @NotImplemented("enumerateKeysAndObjectsUsingBlock:")
    public void enumerateKeysAndObjectsUsingBlock(@Block VoidBlock3<NSString, NSObject, BooleanPtr> block) {}
    @NotImplemented("numberForKey:")
    public NSNumber numberForKey(String key) { return null; }
    @NotImplemented("stringForKey:")
    public String stringForKey(String key) { return null; }
    @NotImplemented("URLForKey:")
    public NSURL URLForKey(String key) { return null; }
    @NotImplemented("objectForKey:")
    public FBSDKShareOpenGraphObject objectForKey(String key) { return null; }
    @NotImplemented("objectForKeyedSubscript:")
    public NSObject objectForKeyedSubscript(String key) { return null; }
    @NotImplemented("parseProperties:")
    public void parseProperties(NSDictionary<NSString, ?> properties) {}
    @NotImplemented("photoForKey:")
    public FBSDKSharePhoto photoForKey(String key) { return null; }
    @NotImplemented("removeObjectForKey:")
    public void removeObjectForKey(String key) {}
    @NotImplemented("setArray:forKey:")
    public void setArray(NSArray<?> array, String key) {}
    @NotImplemented("setNumber:forKey:")
    public void setNumber(NSNumber number, String key) {}
    @NotImplemented("setObject:forKey:")
    public void setObject(FBSDKShareOpenGraphObject object, String key) {}
    @NotImplemented("setPhoto:forKey:")
    public void setPhoto(FBSDKSharePhoto photo, String key) {}
    @NotImplemented("setString:forKey:")
    public void setString(String string, String key) {}
    @NotImplemented("setURL:forKey:")
    public void setURL(NSURL URL, String key) {}
    /*</methods>*/
}
