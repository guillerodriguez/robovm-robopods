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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Charts16LineChartDataSet")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LineChartDataSet/*</name>*/ 
    extends /*<extends>*/LineRadarChartDataSet/*</extends>*/ 
    /*<implements>*/implements ILineChartDataSet/*</implements>*/ {

    /*<ptr>*/public static class LineChartDataSetPtr extends Ptr<LineChartDataSet, LineChartDataSetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LineChartDataSet.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected LineChartDataSet() {}
    protected LineChartDataSet(Handle h, long handle) { super(h, handle); }
    protected LineChartDataSet(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithValues:label:")
    public LineChartDataSet(NSArray<ChartDataEntry> values, String label) { super((SkipInit) null); initObject(init(values, label)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mode")
    public native LineChartMode getMode();
    @Property(selector = "setMode:")
    public native void setMode(LineChartMode v);
    @Property(selector = "cubicIntensity")
    public native @MachineSizedFloat double getCubicIntensity();
    @Property(selector = "setCubicIntensity:")
    public native void setCubicIntensity(@MachineSizedFloat double v);
    @Property(selector = "drawCubicEnabled")
    public native boolean drawCubicEnabled();
    @Property(selector = "setDrawCubicEnabled:")
    public native void setDrawCubicEnabled(boolean v);
    @Property(selector = "isDrawCubicEnabled")
    public native boolean isDrawCubicEnabled();
    @Property(selector = "drawSteppedEnabled")
    public native boolean drawSteppedEnabled();
    @Property(selector = "setDrawSteppedEnabled:")
    public native void setDrawSteppedEnabled(boolean v);
    @Property(selector = "isDrawSteppedEnabled")
    public native boolean isDrawSteppedEnabled();
    @Property(selector = "circleRadius")
    public native @MachineSizedFloat double getCircleRadius();
    @Property(selector = "setCircleRadius:")
    public native void setCircleRadius(@MachineSizedFloat double v);
    @Property(selector = "circleHoleRadius")
    public native @MachineSizedFloat double getCircleHoleRadius();
    @Property(selector = "setCircleHoleRadius:")
    public native void setCircleHoleRadius(@MachineSizedFloat double v);
    @Property(selector = "circleColors")
    public native NSArray<UIColor> getCircleColors();
    @Property(selector = "setCircleColors:")
    public native void setCircleColors(NSArray<UIColor> v);
    @Property(selector = "drawCirclesEnabled")
    public native boolean drawCirclesEnabled();
    @Property(selector = "setDrawCirclesEnabled:")
    public native void setDrawCirclesEnabled(boolean v);
    @Property(selector = "isDrawCirclesEnabled")
    public native boolean isDrawCirclesEnabled();
    @Property(selector = "circleHoleColor")
    public native UIColor getCircleHoleColor();
    @Property(selector = "setCircleHoleColor:")
    public native void setCircleHoleColor(UIColor v);
    @Property(selector = "drawCircleHoleEnabled")
    public native boolean drawCircleHoleEnabled();
    @Property(selector = "setDrawCircleHoleEnabled:")
    public native void setDrawCircleHoleEnabled(boolean v);
    @Property(selector = "isDrawCircleHoleEnabled")
    public native boolean isDrawCircleHoleEnabled();
    @Property(selector = "lineDashPhase")
    public native @MachineSizedFloat double getLineDashPhase();
    @Property(selector = "setLineDashPhase:")
    public native void setLineDashPhase(@MachineSizedFloat double v);
    @Property(selector = "lineDashLengths")
    public native NSArray<NSNumber> getLineDashLengths();
    @Property(selector = "setLineDashLengths:")
    public native void setLineDashLengths(NSArray<NSNumber> v);
    @Property(selector = "lineCapType")
    public native CGLineCap getLineCapType();
    @Property(selector = "setLineCapType:")
    public native void setLineCapType(CGLineCap v);
    @Property(selector = "fillFormatter")
    public native IChartFillFormatter getFillFormatter();
    @Property(selector = "setFillFormatter:")
    public native void setFillFormatter(IChartFillFormatter v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithValues:label:")
    protected native @Pointer long init(NSArray<ChartDataEntry> values, String label);
    @Method(selector = "getCircleColorAtIndex:")
    public native UIColor getCircleColorAtIndex(@MachineSizedSInt long index);
    @Method(selector = "setCircleColor:")
    public native void setCircleColor(UIColor color);
    @Method(selector = "resetCircleColors:")
    public native void resetCircleColors(@MachineSizedSInt long index);
    @Method(selector = "copyWithZone:")
    public native NSObject copyWithZone(NSZone zone);
    /*</methods>*/
}
