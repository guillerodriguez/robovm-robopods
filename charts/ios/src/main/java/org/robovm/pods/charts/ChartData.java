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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Charts9ChartData")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ChartDataPtr extends Ptr<ChartData, ChartDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartData() {}
    protected ChartData(Handle h, long handle) { super(h, handle); }
    protected ChartData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDataSets:")
    public ChartData(NSArray<?> dataSets) { super((SkipInit) null); initObject(init(dataSets)); }
    @Method(selector = "initWithDataSet:")
    public ChartData(IChartDataSet dataSet) { super((SkipInit) null); initObject(init(dataSet)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dataSetCount")
    public native @MachineSizedSInt long getDataSetCount();
    @Property(selector = "yMin")
    public native double getYMin();
    @Property(selector = "yMax")
    public native double getYMax();
    @Property(selector = "xMin")
    public native double getXMin();
    @Property(selector = "xMax")
    public native double getXMax();
    @Property(selector = "dataSets")
    public native NSArray<?> getDataSets();
    @Property(selector = "setDataSets:")
    public native void setDataSets(NSArray<?> v);
    @Property(selector = "highlightEnabled")
    public native boolean highlightEnabled();
    @Property(selector = "setHighlightEnabled:")
    public native void setHighlightEnabled(boolean v);
    @Property(selector = "isHighlightEnabled")
    public native boolean isHighlightEnabled();
    @Property(selector = "entryCount")
    public native @MachineSizedSInt long getEntryCount();
    @Property(selector = "maxEntryCountSet")
    public native IChartDataSet getMaxEntryCountSet();
    @Property(selector = "accessibilityEntryLabelPrefix")
    public native String getAccessibilityEntryLabelPrefix();
    @Property(selector = "setAccessibilityEntryLabelPrefix:")
    public native void setAccessibilityEntryLabelPrefix(String v);
    @Property(selector = "accessibilityEntryLabelSuffix")
    public native String getAccessibilityEntryLabelSuffix();
    @Property(selector = "setAccessibilityEntryLabelSuffix:")
    public native void setAccessibilityEntryLabelSuffix(String v);
    @Property(selector = "accessibilityEntryLabelSuffixIsCount")
    public native boolean isAccessibilityEntryLabelSuffixIsCount();
    @Property(selector = "setAccessibilityEntryLabelSuffixIsCount:")
    public native void setAccessibilityEntryLabelSuffixIsCount(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDataSets:")
    protected native @Pointer long init(NSArray<?> dataSets);
    @Method(selector = "initWithDataSet:")
    protected native @Pointer long init(IChartDataSet dataSet);
    @Method(selector = "notifyDataChanged")
    public native void notifyDataChanged();
    @Method(selector = "calcMinMaxYFromX:toX:")
    public native void calcMinMaxY(double fromX, double toX);
    @Method(selector = "calcMinMax")
    public native void calcMinMax();
    @Method(selector = "calcMinMaxWithEntry:axis:")
    public native void calcMinMax(ChartDataEntry e, AxisDependency axis);
    @Method(selector = "calcMinMaxWithDataSet:")
    public native void calcMinMax(IChartDataSet d);
    @Method(selector = "getYMinWithAxis:")
    public native double getYMin(AxisDependency axis);
    @Method(selector = "getYMaxWithAxis:")
    public native double getYMax(AxisDependency axis);
    @Method(selector = "entryForHighlight:")
    public native ChartDataEntry entryForHighlight(ChartHighlight highlight);
    @Method(selector = "getDataSetByLabel:ignorecase:")
    public native IChartDataSet getDataSet(String label, boolean ignorecase);
    @Method(selector = "getDataSetByIndex:")
    public native IChartDataSet getDataSetByIndex(@MachineSizedSInt long index);
    @Method(selector = "addDataSet:")
    public native void addDataSet(IChartDataSet dataSet);
    @Method(selector = "removeDataSet:")
    public native boolean removeDataSet(IChartDataSet dataSet);
    @Method(selector = "removeDataSetByIndex:")
    public native boolean removeDataSetByIndex(@MachineSizedSInt long index);
    @Method(selector = "addEntry:dataSetIndex:")
    public native void addEntry(ChartDataEntry e, @MachineSizedSInt long dataSetIndex);
    @Method(selector = "removeEntry:dataSetIndex:")
    public native boolean removeEntry(ChartDataEntry entry, @MachineSizedSInt long dataSetIndex);
    @Method(selector = "removeEntryWithXValue:dataSetIndex:")
    public native boolean removeEntry(double xValue, @MachineSizedSInt long dataSetIndex);
    @Method(selector = "getDataSetForEntry:")
    public native IChartDataSet getDataSetForEntry(ChartDataEntry e);
    @Method(selector = "indexOfDataSet:")
    public native @MachineSizedSInt long indexOfDataSet(IChartDataSet dataSet);
    @Method(selector = "getFirstLeftWithDataSets:")
    public native IChartDataSet getFirstLeft(NSArray<?> dataSets);
    @Method(selector = "getFirstRightWithDataSets:")
    public native IChartDataSet getFirstRight(NSArray<?> dataSets);
    @Method(selector = "getColors")
    public native NSArray<UIColor> getColors();
    @Method(selector = "setValueFormatter:")
    public native void setValueFormatter(IChartValueFormatter formatter);
    @Method(selector = "setValueTextColor:")
    public native void setValueTextColor(UIColor color);
    @Method(selector = "setValueFont:")
    public native void setValueFont(UIFont font);
    @Method(selector = "setDrawValues:")
    public native void setDrawValues(boolean enabled);
    @Method(selector = "clearValues")
    public native void clearValues();
    @Method(selector = "containsWithDataSet:")
    public native boolean contains(IChartDataSet dataSet);
    /*</methods>*/
}
