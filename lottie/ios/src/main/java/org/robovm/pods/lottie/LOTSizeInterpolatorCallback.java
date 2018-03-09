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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LOTSizeInterpolatorCallback/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements LOTSizeValueDelegate/*</implements>*/ {

    /*<ptr>*/public static class LOTSizeInterpolatorCallbackPtr extends Ptr<LOTSizeInterpolatorCallback, LOTSizeInterpolatorCallbackPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LOTSizeInterpolatorCallback.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LOTSizeInterpolatorCallback() {}
    protected LOTSizeInterpolatorCallback(Handle h, long handle) { super(h, handle); }
    protected LOTSizeInterpolatorCallback(SkipInit skipInit) { super(skipInit); }
    public LOTSizeInterpolatorCallback(@ByVal CGSize fromSize, @ByVal CGSize toSize) { super((Handle) null, create(fromSize, toSize)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "fromSize")
    public native @ByVal CGSize getFromSize();
    @Property(selector = "setFromSize:")
    public native void setFromSize(@ByVal CGSize v);
    @Property(selector = "toSize")
    public native @ByVal CGSize getToSize();
    @Property(selector = "setToSize:")
    public native void setToSize(@ByVal CGSize v);
    @Property(selector = "currentProgress")
    public native @MachineSizedFloat double getCurrentProgress();
    @Property(selector = "setCurrentProgress:")
    public native void setCurrentProgress(@MachineSizedFloat double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "withFromSize:toSize:")
    protected static native @Pointer long create(@ByVal CGSize fromSize, @ByVal CGSize toSize);
    @Method(selector = "sizeForFrame:startKeyframe:endKeyframe:interpolatedProgress:startSize:endSize:currentSize:")
    public native @ByVal CGSize getSize(@MachineSizedFloat double currentFrame, @MachineSizedFloat double startKeyframe, @MachineSizedFloat double endKeyframe, @MachineSizedFloat double interpolatedProgress, @ByVal CGSize startSize, @ByVal CGSize endSize, @ByVal CGSize interpolatedSize);
    /*</methods>*/
}
