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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LOTPathBlockCallback/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements LOTPathValueDelegate/*</implements>*/ {

    /*<ptr>*/public static class LOTPathBlockCallbackPtr extends Ptr<LOTPathBlockCallback, LOTPathBlockCallbackPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LOTPathBlockCallback.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LOTPathBlockCallback() {}
    protected LOTPathBlockCallback(Handle h, long handle) { super(h, handle); }
    protected LOTPathBlockCallback(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "callback")
    public native @Block("(@MachineSizedFloat,@MachineSizedFloat,@MachineSizedFloat,@MachineSizedFloat)") Block4<Double, Double, Double, Double, CGPath> getCallback();
    @Property(selector = "setCallback:")
    public native void setCallback(@Block("(@MachineSizedFloat,@MachineSizedFloat,@MachineSizedFloat,@MachineSizedFloat)") Block4<Double, Double, Double, Double, CGPath> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "withBlock:")
    public static native LOTPathBlockCallback withBlock(@Block("(@MachineSizedFloat,@MachineSizedFloat,@MachineSizedFloat,@MachineSizedFloat)") Block4<Double, Double, Double, Double, CGPath> block);
    @Method(selector = "pathForFrame:startKeyframe:endKeyframe:interpolatedProgress:")
    public native CGPath getPath(@MachineSizedFloat double currentFrame, @MachineSizedFloat double startKeyframe, @MachineSizedFloat double endKeyframe, @MachineSizedFloat double interpolatedProgress);
    /*</methods>*/
}
