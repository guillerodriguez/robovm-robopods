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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Charts12PieChartData")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PieChartData/*</name>*/ 
    extends /*<extends>*/ChartData/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PieChartDataPtr extends Ptr<PieChartData, PieChartDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PieChartData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PieChartData() {}
    protected PieChartData(Handle h, long handle) { super(h, handle); }
    protected PieChartData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDataSets:")
    public PieChartData(NSArray<?> dataSets) { super((SkipInit) null); initObject(initWithDataSets(dataSets)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dataSet")
    public native IPieChartDataSet getDataSet();
    @Property(selector = "setDataSet:")
    public native void setDataSet(IPieChartDataSet v);
    @Property(selector = "yValueSum")
    public native double getYValueSum();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDataSets:")
    protected native @Pointer long initWithDataSets(NSArray<?> dataSets);
    @Method(selector = "getDataSetByIndex:")
    public native IChartDataSet getDataSetByIndex(@MachineSizedSInt long index);
    @Method(selector = "getDataSetByLabel:ignorecase:")
    public native IChartDataSet getDataSet(String label, boolean ignorecase);
    @Method(selector = "entryForHighlight:")
    public native ChartDataEntry entryForHighlight(ChartHighlight highlight);
    @Method(selector = "addDataSet:")
    public native void addDataSet(IChartDataSet d);
    @Method(selector = "removeDataSetByIndex:")
    public native boolean removeDataSetByIndex(@MachineSizedSInt long index);
    /*</methods>*/
}
