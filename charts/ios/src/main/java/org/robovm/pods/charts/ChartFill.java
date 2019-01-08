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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartFill/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ChartFillPtr extends Ptr<ChartFill, ChartFillPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartFill.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartFill() {}
    protected ChartFill(Handle h, long handle) { super(h, handle); }
    protected ChartFill(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCGColor:")
    public ChartFill(CGColor CGColor) { super((SkipInit) null); initObject(init(CGColor)); }
    @Method(selector = "initWithColor:")
    public ChartFill(UIColor color) { super((SkipInit) null); initObject(init(color)); }
    @Method(selector = "initWithLinearGradient:angle:")
    public ChartFill(CGGradient linearGradient, @MachineSizedFloat double angle) { super((SkipInit) null); initObject(init(linearGradient, angle)); }
    @Method(selector = "initWithRadialGradient:startOffsetPercent:startRadiusPercent:endOffsetPercent:endRadiusPercent:")
    public ChartFill(CGGradient radialGradient, @ByVal CGPoint startOffsetPercent, @MachineSizedFloat double startRadiusPercent, @ByVal CGPoint endOffsetPercent, @MachineSizedFloat double endRadiusPercent) { super((SkipInit) null); initObject(init(radialGradient, startOffsetPercent, startRadiusPercent, endOffsetPercent, endRadiusPercent)); }
    @Method(selector = "initWithRadialGradient:")
    public ChartFill(CGGradient radialGradient) { super((SkipInit) null); initObject(init(radialGradient)); }
    @Method(selector = "initWithCGImage:tiled:")
    public ChartFill(CGImage CGImage, boolean tiled) { super((SkipInit) null); initObject(init(CGImage, tiled)); }
    @Method(selector = "initWithImage:tiled:")
    public ChartFill(UIImage image, boolean tiled) { super((SkipInit) null); initObject(init(image, tiled)); }
    @Method(selector = "initWithCGImage:")
    public ChartFill(CGImage CGImage) { super((SkipInit) null); initObject(init(CGImage)); }
    @Method(selector = "initWithImage:")
    public ChartFill(UIImage image) { super((SkipInit) null); initObject(init(image)); }
    @Method(selector = "initWithCGLayer:")
    public ChartFill(CGLayer CGLayer) { super((SkipInit) null); initObject(init(CGLayer)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "type")
    public native ChartFillType getType();
    @Property(selector = "color")
    public native CGColor getColor();
    @Property(selector = "gradient")
    public native CGGradient getGradient();
    @Property(selector = "gradientAngle")
    public native @MachineSizedFloat double getGradientAngle();
    @Property(selector = "gradientStartOffsetPercent")
    public native @ByVal CGPoint getGradientStartOffsetPercent();
    @Property(selector = "gradientStartRadiusPercent")
    public native @MachineSizedFloat double getGradientStartRadiusPercent();
    @Property(selector = "gradientEndOffsetPercent")
    public native @ByVal CGPoint getGradientEndOffsetPercent();
    @Property(selector = "gradientEndRadiusPercent")
    public native @MachineSizedFloat double getGradientEndRadiusPercent();
    @Property(selector = "image")
    public native CGImage getImage();
    @Property(selector = "layer")
    public native CGLayer getLayer();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCGColor:")
    protected native @Pointer long init(CGColor CGColor);
    @Method(selector = "initWithColor:")
    protected native @Pointer long init(UIColor color);
    @Method(selector = "initWithLinearGradient:angle:")
    protected native @Pointer long init(CGGradient linearGradient, @MachineSizedFloat double angle);
    @Method(selector = "initWithRadialGradient:startOffsetPercent:startRadiusPercent:endOffsetPercent:endRadiusPercent:")
    protected native @Pointer long init(CGGradient radialGradient, @ByVal CGPoint startOffsetPercent, @MachineSizedFloat double startRadiusPercent, @ByVal CGPoint endOffsetPercent, @MachineSizedFloat double endRadiusPercent);
    @Method(selector = "initWithRadialGradient:")
    protected native @Pointer long init(CGGradient radialGradient);
    @Method(selector = "initWithCGImage:tiled:")
    protected native @Pointer long init(CGImage CGImage, boolean tiled);
    @Method(selector = "initWithImage:tiled:")
    protected native @Pointer long init(UIImage image, boolean tiled);
    @Method(selector = "initWithCGImage:")
    protected native @Pointer long init(CGImage CGImage);
    @Method(selector = "initWithImage:")
    protected native @Pointer long init(UIImage image);
    @Method(selector = "initWithCGLayer:")
    protected native @Pointer long init(CGLayer CGLayer);
    @Method(selector = "fillPathWithContext:rect:")
    public native void fillPath(CGContext context, @ByVal CGRect rect);
    /*</methods>*/
}
