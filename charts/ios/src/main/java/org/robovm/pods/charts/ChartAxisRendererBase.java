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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartAxisRendererBase/*</name>*/ 
    extends /*<extends>*/ChartRenderer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ChartAxisRendererBasePtr extends Ptr<ChartAxisRendererBase, ChartAxisRendererBasePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartAxisRendererBase.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ChartAxisRendererBase() {}
    protected ChartAxisRendererBase(Handle h, long handle) { super(h, handle); }
    protected ChartAxisRendererBase(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithViewPortHandler:transformer:axis:")
    public ChartAxisRendererBase(ChartViewPortHandler viewPortHandler, ChartTransformer transformer, ChartAxisBase axis) { super((SkipInit) null); initObject(init(viewPortHandler, transformer, axis)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "axis")
    public native ChartAxisBase getAxis();
    @Property(selector = "setAxis:")
    public native void setAxis(ChartAxisBase v);
    @Property(selector = "transformer")
    public native ChartTransformer getTransformer();
    @Property(selector = "setTransformer:")
    public native void setTransformer(ChartTransformer v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithViewPortHandler:transformer:axis:")
    protected native @Pointer long init(ChartViewPortHandler viewPortHandler, ChartTransformer transformer, ChartAxisBase axis);
    @Method(selector = "renderAxisLabelsWithContext:")
    public native void renderAxisLabels(CGContext context);
    @Method(selector = "renderGridLinesWithContext:")
    public native void renderGridLines(CGContext context);
    @Method(selector = "renderAxisLineWithContext:")
    public native void renderAxisLine(CGContext context);
    @Method(selector = "renderLimitLinesWithContext:")
    public native void renderLimitLines(CGContext context);
    @Method(selector = "computeAxisWithMin:max:inverted:")
    public native void computeAxis(double min, double max, boolean inverted);
    @Method(selector = "computeAxisValuesWithMin:max:")
    public native void computeAxis(double min, double max);
    /*</methods>*/
}
