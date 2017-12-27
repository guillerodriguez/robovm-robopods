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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Charts18ChartDataEntryBase")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartDataEntryBase/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ChartDataEntryBasePtr extends Ptr<ChartDataEntryBase, ChartDataEntryBasePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartDataEntryBase.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartDataEntryBase() {}
    protected ChartDataEntryBase(Handle h, long handle) { super(h, handle); }
    protected ChartDataEntryBase(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithY:")
    public ChartDataEntryBase(double y) { super((SkipInit) null); initObject(init(y)); }
    @Method(selector = "initWithY:data:")
    public ChartDataEntryBase(double y, NSObject data) { super((SkipInit) null); initObject(init(y, data)); }
    @Method(selector = "initWithY:icon:")
    public ChartDataEntryBase(double y, UIImage icon) { super((SkipInit) null); initObject(init(y, icon)); }
    @Method(selector = "initWithY:icon:data:")
    public ChartDataEntryBase(double y, UIImage icon, NSObject data) { super((SkipInit) null); initObject(init(y, icon, data)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "y")
    public native double getY();
    @Property(selector = "setY:")
    public native void setY(double v);
    @Property(selector = "data")
    public native NSObject getData();
    @Property(selector = "setData:")
    public native void setData(NSObject v);
    @Property(selector = "icon")
    public native UIImage getIcon();
    @Property(selector = "setIcon:")
    public native void setIcon(UIImage v);
    @Property(selector = "description")
    public native String getDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithY:")
    protected native @Pointer long init(double y);
    @Method(selector = "initWithY:data:")
    protected native @Pointer long init(double y, NSObject data);
    @Method(selector = "initWithY:icon:")
    protected native @Pointer long init(double y, UIImage icon);
    @Method(selector = "initWithY:icon:data:")
    protected native @Pointer long init(double y, UIImage icon, NSObject data);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    /*</methods>*/
}
