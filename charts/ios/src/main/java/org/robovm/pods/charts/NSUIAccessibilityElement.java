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
package org.robovm.pods.charts;

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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Charts24NSUIAccessibilityElement")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSUIAccessibilityElement/*</name>*/ 
    extends /*<extends>*/UIAccessibilityElement/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSUIAccessibilityElementPtr extends Ptr<NSUIAccessibilityElement, NSUIAccessibilityElementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSUIAccessibilityElement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSUIAccessibilityElement(Handle h, long handle) { super(h, handle); }
    protected NSUIAccessibilityElement(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAccessibilityContainer:")
    public NSUIAccessibilityElement(UIAccessibilityContainer container) { super((SkipInit) null); initObject(init(container)); }
    public NSUIAccessibilityElement() { super((Handle) null, newElement());  }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "accessibilityFrame")
    public native @ByVal CGRect getAccessibilityFrame();
    @Property(selector = "setAccessibilityFrame:")
    public native void setAccessibilityFrame(@ByVal CGRect v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAccessibilityContainer:")
    protected native @Pointer long init(UIAccessibilityContainer container);
    @Method(selector = "new")
    protected static native @Pointer long newElement();
    /*</methods>*/
}