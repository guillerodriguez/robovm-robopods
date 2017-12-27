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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartMarkerView/*</name>*/ 
    extends /*<extends>*/NSUIView/*</extends>*/ 
    /*<implements>*/implements IChartMarker/*</implements>*/ {

    /*<ptr>*/public static class ChartMarkerViewPtr extends Ptr<ChartMarkerView, ChartMarkerViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartMarkerView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartMarkerView() {}
    protected ChartMarkerView(Handle h, long handle) { super(h, handle); }
    protected ChartMarkerView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public ChartMarkerView(@ByVal CGRect frame) { super((SkipInit) null); initObject(initWithFrame(frame)); }
    @Method(selector = "initWithCoder:")
    public ChartMarkerView(NSCoder aDecoder) { super((SkipInit) null); initObject(initWithCoder(aDecoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "offset")
    public native @ByVal CGPoint getOffset();
    @Property(selector = "setOffset:")
    public native void setOffset(@ByVal CGPoint v);
    @Property(selector = "chartView")
    public native ChartViewBase getChartView();
    @Property(selector = "setChartView:", strongRef = true)
    public native void setChartView(ChartViewBase v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "offsetForDrawingAtPoint:")
    public native @ByVal CGPoint offsetForDrawingAtPoint(@ByVal CGPoint point);
    @Method(selector = "refreshContentWithEntry:highlight:")
    public native void refreshContent(ChartDataEntry entry, ChartHighlight highlight);
    @Method(selector = "drawWithContext:point:")
    public native void draw(CGContext context, @ByVal CGPoint point);
    @Method(selector = "initWithFrame:")
    protected native @Pointer long initWithFrame(@ByVal CGRect frame);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long initWithCoder(NSCoder aDecoder);
    @Method(selector = "viewFromXib")
    public static native ChartMarkerView viewFromXib();
    /*</methods>*/
}
