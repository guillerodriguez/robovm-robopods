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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LOTAnimatedSwitch/*</name>*/ 
    extends /*<extends>*/LOTAnimatedControl/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class LOTAnimatedSwitchPtr extends Ptr<LOTAnimatedSwitch, LOTAnimatedSwitchPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LOTAnimatedSwitch.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LOTAnimatedSwitch() {}
    protected LOTAnimatedSwitch(Handle h, long handle) { super(h, handle); }
    protected LOTAnimatedSwitch(SkipInit skipInit) { super(skipInit); }
    public LOTAnimatedSwitch(String toggleName, NSBundle bundle) { super((Handle) null, create(toggleName, bundle)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isOn")
    public native boolean isOn();
    @Property(selector = "setOn:")
    public native void setOn(boolean v);
    @Property(selector = "interactiveGesture")
    public native boolean isInteractiveGesture();
    @Property(selector = "setInteractiveGesture:")
    public native void setInteractiveGesture(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setOn:animated:")
    public native void setOn(boolean on, boolean animated);
    @Method(selector = "setProgressRangeForOnState:toProgress:")
    public native void setProgressRangeForOnState(@MachineSizedFloat double fromProgress, @MachineSizedFloat double toProgress);
    @Method(selector = "setProgressRangeForOffState:toProgress:")
    public native void setProgressRangeForOffState(@MachineSizedFloat double fromProgress, @MachineSizedFloat double toProgress);
    @Method(selector = "switchNamed:")
    public static native LOTAnimatedSwitch switchNamed(String toggleName);
    @Method(selector = "switchNamed:inBundle:")
    protected static native @Pointer long create(String toggleName, NSBundle bundle);
    /*</methods>*/
}
