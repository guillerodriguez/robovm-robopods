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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Charts21CombinedChartRenderer")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CombinedChartRenderer/*</name>*/ 
    extends /*<extends>*/ChartDataRendererBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CombinedChartRendererPtr extends Ptr<CombinedChartRenderer, CombinedChartRendererPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CombinedChartRenderer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CombinedChartRenderer() {}
    protected CombinedChartRenderer(Handle h, long handle) { super(h, handle); }
    protected CombinedChartRenderer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithChart:animator:viewPortHandler:")
    public CombinedChartRenderer(CombinedChartView chart, ChartAnimator animator, ChartViewPortHandler viewPortHandler) { super((SkipInit) null); initObject(init(chart, animator, viewPortHandler)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "chart")
    public native CombinedChartView getChart();
    @Property(selector = "setChart:", strongRef = true)
    public native void setChart(CombinedChartView v);
    @Property(selector = "drawValueAboveBarEnabled")
    public native boolean drawValueAboveBarEnabled();
    @Property(selector = "setDrawValueAboveBarEnabled:")
    public native void setDrawValueAboveBarEnabled(boolean v);
    @Property(selector = "drawBarShadowEnabled")
    public native boolean drawBarShadowEnabled();
    @Property(selector = "setDrawBarShadowEnabled:")
    public native void setDrawBarShadowEnabled(boolean v);
    @Property(selector = "_renderers")
    public native NSArray<ChartDataRendererBase> get_renderers();
    @Property(selector = "set_renderers:")
    public native void set_renderers(NSArray<ChartDataRendererBase> v);
    @Property(selector = "subRenderers")
    public native NSArray<ChartDataRendererBase> getSubRenderers();
    @Property(selector = "setSubRenderers:")
    public native void setSubRenderers(NSArray<ChartDataRendererBase> v);
    @Property(selector = "isDrawValueAboveBarEnabled")
    public native boolean isDrawValueAboveBarEnabled();
    @Property(selector = "isDrawBarShadowEnabled")
    public native boolean isDrawBarShadowEnabled();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithChart:animator:viewPortHandler:")
    protected native @Pointer long init(CombinedChartView chart, ChartAnimator animator, ChartViewPortHandler viewPortHandler);
    @Method(selector = "createRenderers")
    public native void createRenderers();
    @Method(selector = "initBuffers")
    public native void initBuffers();
    @Method(selector = "drawDataWithContext:")
    public native void drawDataWithContext(CGContext context);
    @Method(selector = "drawValuesWithContext:")
    public native void drawValuesWithContext(CGContext context);
    @Method(selector = "drawExtrasWithContext:")
    public native void drawExtrasWithContext(CGContext context);
    @Method(selector = "drawHighlightedWithContext:indices:")
    public native void drawHighlighted(CGContext context, NSArray<ChartHighlight> indices);
    @Method(selector = "getSubRendererWithIndex:")
    public native ChartDataRendererBase getSubRendererWithIndex(@MachineSizedSInt long index);
    /*</methods>*/
}
