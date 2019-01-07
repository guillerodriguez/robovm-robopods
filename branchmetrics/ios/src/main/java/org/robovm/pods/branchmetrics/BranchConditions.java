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
package org.robovm.pods.branchmetrics;

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
import org.robovm.apple.corespotlight.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BranchConditions/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(BranchConditions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="BranchConditionOther", optional=true)
    public static native String Other();
    @GlobalValue(symbol="BranchConditionOther", optional=true)
    public static native void Other(String v);
    @GlobalValue(symbol="BranchConditionNew", optional=true)
    public static native String New();
    @GlobalValue(symbol="BranchConditionNew", optional=true)
    public static native void New(String v);
    @GlobalValue(symbol="BranchConditionExcellent", optional=true)
    public static native String Excellent();
    @GlobalValue(symbol="BranchConditionExcellent", optional=true)
    public static native void Excellent(String v);
    @GlobalValue(symbol="BranchConditionGood", optional=true)
    public static native String Good();
    @GlobalValue(symbol="BranchConditionGood", optional=true)
    public static native void Good(String v);
    @GlobalValue(symbol="BranchConditionFair", optional=true)
    public static native String Fair();
    @GlobalValue(symbol="BranchConditionFair", optional=true)
    public static native void Fair(String v);
    @GlobalValue(symbol="BranchConditionPoor", optional=true)
    public static native String Poor();
    @GlobalValue(symbol="BranchConditionPoor", optional=true)
    public static native void Poor(String v);
    @GlobalValue(symbol="BranchConditionUsed", optional=true)
    public static native String Used();
    @GlobalValue(symbol="BranchConditionUsed", optional=true)
    public static native void Used(String v);
    @GlobalValue(symbol="BranchConditionRefurbished", optional=true)
    public static native String Refurbished();
    @GlobalValue(symbol="BranchConditionRefurbished", optional=true)
    public static native void Refurbished(String v);
    /*</methods>*/
}
