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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Charts12ChartDataSet")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartDataSet/*</name>*/ 
    extends /*<extends>*/ChartBaseDataSet/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ChartDataSetPtr extends Ptr<ChartDataSet, ChartDataSetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartDataSet.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartDataSet() {}
    protected ChartDataSet(Handle h, long handle) { super(h, handle); }
    protected ChartDataSet(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLabel:")
    public ChartDataSet(String label) { super((SkipInit) null); initObject(initWithLabel(label)); }
    @Method(selector = "initWithValues:label:")
    public ChartDataSet(NSArray<ChartDataEntry> values, String label) { super((SkipInit) null); initObject(init(values, label)); }
    @Method(selector = "initWithValues:")
    public ChartDataSet(NSArray<ChartDataEntry> values) { super((SkipInit) null); initObject(initWithValues(values)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "_values")
    public native NSArray<ChartDataEntry> get_values();
    @Property(selector = "set_values:")
    public native void set_values(NSArray<ChartDataEntry> v);
    @Property(selector = "_yMax")
    public native double get_yMax();
    @Property(selector = "set_yMax:")
    public native void set_yMax(double v);
    @Property(selector = "_yMin")
    public native double get_yMin();
    @Property(selector = "set_yMin:")
    public native void set_yMin(double v);
    @Property(selector = "_xMax")
    public native double get_xMax();
    @Property(selector = "set_xMax:")
    public native void set_xMax(double v);
    @Property(selector = "_xMin")
    public native double get_xMin();
    @Property(selector = "set_xMin:")
    public native void set_xMin(double v);
    @Property(selector = "values")
    public native NSArray<ChartDataEntry> getValues();
    @Property(selector = "setValues:")
    public native void setValues(NSArray<ChartDataEntry> v);
    @Property(selector = "yMin")
    public native double getYMin();
    @Property(selector = "yMax")
    public native double getYMax();
    @Property(selector = "xMin")
    public native double getXMin();
    @Property(selector = "xMax")
    public native double getXMax();
    @Property(selector = "entryCount")
    public native @MachineSizedSInt long getEntryCount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLabel:")
    protected native @Pointer long initWithLabel(String label);
    @Method(selector = "initWithValues:label:")
    protected native @Pointer long init(NSArray<ChartDataEntry> values, String label);
    @Method(selector = "initWithValues:")
    protected native @Pointer long initWithValues(NSArray<ChartDataEntry> values);
    @Method(selector = "notifyDataSetChanged")
    public native void notifyDataSetChanged();
    @Method(selector = "calcMinMax")
    public native void calcMinMax();
    @Method(selector = "calcMinMaxYFromX:toX:")
    public native void calcMinMaxY(double fromX, double toX);
    @Method(selector = "calcMinMaxXWithEntry:")
    public native void calcMinMaxXWithEntry(ChartDataEntry e);
    @Method(selector = "calcMinMaxYWithEntry:")
    public native void calcMinMaxYWithEntry(ChartDataEntry e);
    @Method(selector = "calcMinMaxWithEntry:")
    public native void calcMinMaxWithEntry(ChartDataEntry e);
    @Method(selector = "entryForIndex:")
    public native ChartDataEntry entryForIndex(@MachineSizedSInt long i);
    @Method(selector = "entryForXValue:closestToY:rounding:")
    public native ChartDataEntry getEntryForX(double xValue, double yValue, ChartDataSetRounding rounding);
    @Method(selector = "entryForXValue:closestToY:")
    public native ChartDataEntry getEntryForX(double xValue, double yValue);
    @Method(selector = "entriesForXValue:")
    public native NSArray<ChartDataEntry> entriesForXValue(double xValue);
    @Method(selector = "entryIndexWithX:closestToY:rounding:")
    public native @MachineSizedSInt long getEntryIndex(double xValue, double yValue, ChartDataSetRounding rounding);
    @Method(selector = "entryIndexWithEntry:")
    public native @MachineSizedSInt long entryIndexWithEntry(ChartDataEntry e);
    @Method(selector = "addEntry:")
    public native boolean addEntry(ChartDataEntry e);
    @Method(selector = "addEntryOrdered:")
    public native boolean addEntryOrdered(ChartDataEntry e);
    @Method(selector = "removeEntry:")
    public native boolean removeEntry(ChartDataEntry entry);
    @Method(selector = "removeFirst")
    public native boolean removeFirst();
    @Method(selector = "removeLast")
    public native boolean removeLast();
    @Method(selector = "contains:")
    public native boolean contains(ChartDataEntry e);
    @Method(selector = "clear")
    public native void clear();
    @Method(selector = "copyWithZone:")
    public native NSObject copyWithZone(NSZone zone);
    /*</methods>*/
}
