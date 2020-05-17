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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRDynamicLinkComponents/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRDynamicLinkComponentsPtr extends Ptr<FIRDynamicLinkComponents, FIRDynamicLinkComponentsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRDynamicLinkComponents.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FIRDynamicLinkComponents() {}
    protected FIRDynamicLinkComponents(Handle h, long handle) { super(h, handle); }
    protected FIRDynamicLinkComponents(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLink:domainURIPrefix:")
    public FIRDynamicLinkComponents(NSURL link, String domainURIPrefix) { super((SkipInit) null); initObject(init(link, domainURIPrefix)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "analyticsParameters")
    public native FIRDynamicLinkGoogleAnalyticsParameters getAnalyticsParameters();
    @Property(selector = "setAnalyticsParameters:")
    public native void setAnalyticsParameters(FIRDynamicLinkGoogleAnalyticsParameters v);
    @Property(selector = "socialMetaTagParameters")
    public native FIRDynamicLinkSocialMetaTagParameters getSocialMetaTagParameters();
    @Property(selector = "setSocialMetaTagParameters:")
    public native void setSocialMetaTagParameters(FIRDynamicLinkSocialMetaTagParameters v);
    @Property(selector = "iOSParameters")
    public native FIRDynamicLinkIOSParameters getIOSParameters();
    @Property(selector = "setIOSParameters:")
    public native void setIOSParameters(FIRDynamicLinkIOSParameters v);
    @Property(selector = "iTunesConnectParameters")
    public native FIRDynamicLinkItunesConnectAnalyticsParameters getITunesConnectParameters();
    @Property(selector = "setITunesConnectParameters:")
    public native void setITunesConnectParameters(FIRDynamicLinkItunesConnectAnalyticsParameters v);
    @Property(selector = "androidParameters")
    public native FIRDynamicLinkAndroidParameters getAndroidParameters();
    @Property(selector = "setAndroidParameters:")
    public native void setAndroidParameters(FIRDynamicLinkAndroidParameters v);
    @Property(selector = "navigationInfoParameters")
    public native FIRDynamicLinkNavigationInfoParameters getNavigationInfoParameters();
    @Property(selector = "setNavigationInfoParameters:")
    public native void setNavigationInfoParameters(FIRDynamicLinkNavigationInfoParameters v);
    @Property(selector = "otherPlatformParameters")
    public native FIRDynamicLinkOtherPlatformParameters getOtherPlatformParameters();
    @Property(selector = "setOtherPlatformParameters:")
    public native void setOtherPlatformParameters(FIRDynamicLinkOtherPlatformParameters v);
    @Property(selector = "options")
    public native FIRDynamicLinkComponentsOptions getOptions();
    @Property(selector = "setOptions:")
    public native void setOptions(FIRDynamicLinkComponentsOptions v);
    @Property(selector = "link")
    public native NSURL getLink();
    @Property(selector = "setLink:")
    public native void setLink(NSURL v);
    @Property(selector = "domain")
    public native String getDomain();
    @Property(selector = "setDomain:")
    public native void setDomain(String v);
    @Property(selector = "url")
    public native NSURL getUrl();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLink:domainURIPrefix:")
    protected native @Pointer long init(NSURL link, String domainURIPrefix);
    @Method(selector = "shortenWithCompletion:")
    public native void shorten(@Block VoidBlock3<NSURL, NSArray<NSString>, NSError> completion);
    @Method(selector = "shortenURL:options:completion:")
    public static native void shortenURL(NSURL url, FIRDynamicLinkComponentsOptions options, @Block VoidBlock3<NSURL, NSArray<NSString>, NSError> completion);
    /*</methods>*/
}
