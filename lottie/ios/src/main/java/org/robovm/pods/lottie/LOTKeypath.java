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
package org.robovm.pods.lottie;

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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LOTKeypath/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class LOTKeypathPtr extends Ptr<LOTKeypath, LOTKeypathPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LOTKeypath.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LOTKeypath() {}
    protected LOTKeypath(Handle h, long handle) { super(h, handle); }
    protected LOTKeypath(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "absoluteKeypath")
    public native String getAbsoluteKeypath();
    @Property(selector = "currentKey")
    public native String getCurrentKey();
    @Property(selector = "currentKeyPath")
    public native String getCurrentKeyPath();
    @Property(selector = "searchResults")
    public native NSDictionary<?, ?> getSearchResults();
    @Property(selector = "hasFuzzyWildcard")
    public native boolean hasFuzzyWildcard();
    @Property(selector = "hasWildcard")
    public native boolean hasWildcard();
    @Property(selector = "endOfKeypath")
    public native boolean isEndOfKeypath();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kLOTKeypathEnd", optional=true)
    public static native String getKeypathEnd();
    
    @Method(selector = "pushKey:")
    public native boolean pushKey(String key);
    @Method(selector = "popKey")
    public native void popKey();
    @Method(selector = "popToRootKey")
    public native void popToRootKey();
    @Method(selector = "addSearchResultForCurrentPath:")
    public native void addSearchResultForCurrentPath(NSObject result);
    @Method(selector = "keypathWithString:")
    public static native LOTKeypath keypathWithString(String keypath);
    /*</methods>*/
}
