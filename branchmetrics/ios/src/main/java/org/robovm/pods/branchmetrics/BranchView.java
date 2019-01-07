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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BranchView/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BranchViewPtr extends Ptr<BranchView, BranchViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BranchView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BranchView() {}
    protected BranchView(Handle h, long handle) { super(h, handle); }
    protected BranchView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBranchView:andActionName:")
    public BranchView(NSDictionary<?, ?> branchViewDict, String actionName) { super((SkipInit) null); initObject(init(branchViewDict, actionName)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "branchViewID")
    public native String getBranchViewID();
    @Property(selector = "setBranchViewID:")
    public native void setBranchViewID(String v);
    @Property(selector = "branchViewAction")
    public native String getBranchViewAction();
    @Property(selector = "setBranchViewAction:")
    public native void setBranchViewAction(String v);
    @Property(selector = "numOfUse")
    public native @MachineSizedSInt long getNumOfUse();
    @Property(selector = "setNumOfUse:")
    public native void setNumOfUse(@MachineSizedSInt long v);
    @Property(selector = "webUrl")
    public native String getWebUrl();
    @Property(selector = "setWebUrl:")
    public native void setWebUrl(String v);
    @Property(selector = "webHtml")
    public native String getWebHtml();
    @Property(selector = "setWebHtml:")
    public native void setWebHtml(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBranchView:andActionName:")
    protected native @Pointer long init(NSDictionary<?, ?> branchViewDict, String actionName);
    @Method(selector = "isAvailable")
    public native boolean isAvailable();
    @Method(selector = "updateUsageCount")
    public native void updateUsageCount();
    /*</methods>*/
}
