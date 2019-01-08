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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LOTComposition/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class LOTCompositionPtr extends Ptr<LOTComposition, LOTCompositionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LOTComposition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LOTComposition() {}
    protected LOTComposition(Handle h, long handle) { super(h, handle); }
    protected LOTComposition(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithJSON:withAssetBundle:")
    public LOTComposition(NSDictionary<?, ?> jsonDictionary, NSBundle bundle) { super((SkipInit) null); initObject(init(jsonDictionary, bundle)); }
    public LOTComposition(String animationName, NSBundle bundle) { super((Handle) null, create(animationName, bundle)); retain(getHandle()); }
    public LOTComposition(String filePath) { super((Handle) null, create(filePath)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "compBounds")
    public native @ByVal CGRect getCompBounds();
    @Property(selector = "startFrame")
    public native NSNumber getStartFrame();
    @Property(selector = "endFrame")
    public native NSNumber getEndFrame();
    @Property(selector = "framerate")
    public native NSNumber getFramerate();
    @Property(selector = "timeDuration")
    public native double getTimeDuration();
    @Property(selector = "layerGroup")
    public native ObjCObject.ObjCObjectPtr getLayerGroup();
    @Property(selector = "assetGroup")
    public native ObjCObject.ObjCObjectPtr getAssetGroup();
    @Property(selector = "rootDirectory")
    public native String getRootDirectory();
    @Property(selector = "setRootDirectory:")
    public native void setRootDirectory(String v);
    @Property(selector = "assetBundle")
    public native NSBundle getAssetBundle();
    @Property(selector = "cacheKey")
    public native String getCacheKey();
    @Property(selector = "setCacheKey:")
    public native void setCacheKey(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithJSON:withAssetBundle:")
    protected native @Pointer long init(NSDictionary<?, ?> jsonDictionary, NSBundle bundle);
    @Method(selector = "animationNamed:")
    public static native LOTComposition animationNamed(String animationName);
    @Method(selector = "animationNamed:inBundle:")
    protected static native @Pointer long create(String animationName, NSBundle bundle);
    @Method(selector = "animationWithFilePath:")
    protected static native @Pointer long create(String filePath);
    @Method(selector = "animationFromJSON:")
    public static native LOTComposition animationFromJSON(NSDictionary<?, ?> animationJSON);
    /*</methods>*/
}
