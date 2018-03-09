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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LOTColorValueCallback/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements LOTColorValueDelegate/*</implements>*/ {

    /*<ptr>*/public static class LOTColorValueCallbackPtr extends Ptr<LOTColorValueCallback, LOTColorValueCallbackPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LOTColorValueCallback.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LOTColorValueCallback() {}
    protected LOTColorValueCallback(Handle h, long handle) { super(h, handle); }
    protected LOTColorValueCallback(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "colorValue")
    public native CGColor getColorValue();
    @Property(selector = "setColorValue:")
    public native void setColorValue(CGColor v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "withCGColor:")
    public static native LOTColorValueCallback withCGColor(CGColor color);
    @Method(selector = "colorForFrame:startKeyframe:endKeyframe:interpolatedProgress:startColor:endColor:currentColor:")
    public native CGColor getColor(@MachineSizedFloat double currentFrame, @MachineSizedFloat double startKeyframe, @MachineSizedFloat double endKeyframe, @MachineSizedFloat double interpolatedProgress, CGColor startColor, CGColor endColor, CGColor interpolatedColor);
    /*</methods>*/
}
