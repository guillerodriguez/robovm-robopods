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
package org.robovm.pods.firebase.dynamiclinks;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRDynamicLinkGoogleAnalyticsParameters/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRDynamicLinkGoogleAnalyticsParametersPtr extends Ptr<FIRDynamicLinkGoogleAnalyticsParameters, FIRDynamicLinkGoogleAnalyticsParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRDynamicLinkGoogleAnalyticsParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FIRDynamicLinkGoogleAnalyticsParameters() {}
    protected FIRDynamicLinkGoogleAnalyticsParameters(Handle h, long handle) { super(h, handle); }
    protected FIRDynamicLinkGoogleAnalyticsParameters(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSource:medium:campaign:")
    public FIRDynamicLinkGoogleAnalyticsParameters(String source, String medium, String campaign) { super((SkipInit) null); initObject(init(source, medium, campaign)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "source")
    public native String getSource();
    @Property(selector = "setSource:")
    public native void setSource(String v);
    @Property(selector = "medium")
    public native String getMedium();
    @Property(selector = "setMedium:")
    public native void setMedium(String v);
    @Property(selector = "campaign")
    public native String getCampaign();
    @Property(selector = "setCampaign:")
    public native void setCampaign(String v);
    @Property(selector = "term")
    public native String getTerm();
    @Property(selector = "setTerm:")
    public native void setTerm(String v);
    @Property(selector = "content")
    public native String getContent();
    @Property(selector = "setContent:")
    public native void setContent(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSource:medium:campaign:")
    protected native @Pointer long init(String source, String medium, String campaign);
    @Method(selector = "parameters")
    public static native FIRDynamicLinkGoogleAnalyticsParameters parameters();
    /*</methods>*/
}
