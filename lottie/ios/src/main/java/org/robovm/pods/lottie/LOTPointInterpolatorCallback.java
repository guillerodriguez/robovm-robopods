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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LOTPointInterpolatorCallback/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements LOTPointValueDelegate/*</implements>*/ {

    /*<ptr>*/public static class LOTPointInterpolatorCallbackPtr extends Ptr<LOTPointInterpolatorCallback, LOTPointInterpolatorCallbackPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LOTPointInterpolatorCallback.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LOTPointInterpolatorCallback() {}
    protected LOTPointInterpolatorCallback(Handle h, long handle) { super(h, handle); }
    protected LOTPointInterpolatorCallback(SkipInit skipInit) { super(skipInit); }
    public LOTPointInterpolatorCallback(@ByVal CGPoint fromPoint, @ByVal CGPoint toPoint) { super((Handle) null, create(fromPoint, toPoint)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "fromPoint")
    public native @ByVal CGPoint getFromPoint();
    @Property(selector = "setFromPoint:")
    public native void setFromPoint(@ByVal CGPoint v);
    @Property(selector = "toPoint")
    public native @ByVal CGPoint getToPoint();
    @Property(selector = "setToPoint:")
    public native void setToPoint(@ByVal CGPoint v);
    @Property(selector = "currentProgress")
    public native @MachineSizedFloat double getCurrentProgress();
    @Property(selector = "setCurrentProgress:")
    public native void setCurrentProgress(@MachineSizedFloat double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "withFromPoint:toPoint:")
    protected static native @Pointer long create(@ByVal CGPoint fromPoint, @ByVal CGPoint toPoint);
    @Method(selector = "pointForFrame:startKeyframe:endKeyframe:interpolatedProgress:startPoint:endPoint:currentPoint:")
    public native @ByVal CGPoint getPoint(@MachineSizedFloat double currentFrame, @MachineSizedFloat double startKeyframe, @MachineSizedFloat double endKeyframe, @MachineSizedFloat double interpolatedProgress, @ByVal CGPoint startPoint, @ByVal CGPoint endPoint, @ByVal CGPoint interpolatedPoint);
    /*</methods>*/
}
