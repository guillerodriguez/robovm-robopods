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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BNCPreferenceHelper/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BNCPreferenceHelperPtr extends Ptr<BNCPreferenceHelper, BNCPreferenceHelperPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BNCPreferenceHelper.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BNCPreferenceHelper() {}
    protected BNCPreferenceHelper(Handle h, long handle) { super(h, handle); }
    protected BNCPreferenceHelper(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "lastRunBranchKey")
    public native String getLastRunBranchKey();
    @Property(selector = "setLastRunBranchKey:")
    public native void setLastRunBranchKey(String v);
    @Property(selector = "lastStrongMatchDate")
    public native NSDate getLastStrongMatchDate();
    @Property(selector = "setLastStrongMatchDate:")
    public native void setLastStrongMatchDate(NSDate v);
    @Property(selector = "appVersion")
    public native String getAppVersion();
    @Property(selector = "setAppVersion:")
    public native void setAppVersion(String v);
    @Property(selector = "deviceFingerprintID")
    public native String getDeviceFingerprintID();
    @Property(selector = "setDeviceFingerprintID:")
    public native void setDeviceFingerprintID(String v);
    @Property(selector = "sessionID")
    public native String getSessionID();
    @Property(selector = "setSessionID:")
    public native void setSessionID(String v);
    @Property(selector = "identityID")
    public native String getIdentityID();
    @Property(selector = "setIdentityID:")
    public native void setIdentityID(String v);
    @Property(selector = "linkClickIdentifier")
    public native String getLinkClickIdentifier();
    @Property(selector = "setLinkClickIdentifier:")
    public native void setLinkClickIdentifier(String v);
    @Property(selector = "spotlightIdentifier")
    public native String getSpotlightIdentifier();
    @Property(selector = "setSpotlightIdentifier:")
    public native void setSpotlightIdentifier(String v);
    @Property(selector = "universalLinkUrl")
    public native String getUniversalLinkUrl();
    @Property(selector = "setUniversalLinkUrl:")
    public native void setUniversalLinkUrl(String v);
    @Property(selector = "userUrl")
    public native String getUserUrl();
    @Property(selector = "setUserUrl:")
    public native void setUserUrl(String v);
    @Property(selector = "userIdentity")
    public native String getUserIdentity();
    @Property(selector = "setUserIdentity:")
    public native void setUserIdentity(String v);
    @Property(selector = "sessionParams")
    public native String getSessionParams();
    @Property(selector = "setSessionParams:")
    public native void setSessionParams(String v);
    @Property(selector = "installParams")
    public native String getInstallParams();
    @Property(selector = "setInstallParams:")
    public native void setInstallParams(String v);
    @Property(selector = "isDebug")
    public native boolean isDebug();
    @Property(selector = "setIsDebug:")
    public native void setIsDebug(boolean v);
    @Property(selector = "checkedFacebookAppLinks")
    public native boolean isCheckedFacebookAppLinks();
    @Property(selector = "setCheckedFacebookAppLinks:")
    public native void setCheckedFacebookAppLinks(boolean v);
    @Property(selector = "checkedAppleSearchAdAttribution")
    public native boolean isCheckedAppleSearchAdAttribution();
    @Property(selector = "setCheckedAppleSearchAdAttribution:")
    public native void setCheckedAppleSearchAdAttribution(boolean v);
    @Property(selector = "retryCount")
    public native @MachineSizedSInt long getRetryCount();
    @Property(selector = "setRetryCount:")
    public native void setRetryCount(@MachineSizedSInt long v);
    @Property(selector = "retryInterval")
    public native double getRetryInterval();
    @Property(selector = "setRetryInterval:")
    public native void setRetryInterval(double v);
    @Property(selector = "timeout")
    public native double getTimeout();
    @Property(selector = "setTimeout:")
    public native void setTimeout(double v);
    @Property(selector = "externalIntentURI")
    public native String getExternalIntentURI();
    @Property(selector = "setExternalIntentURI:")
    public native void setExternalIntentURI(String v);
    @Property(selector = "savedAnalyticsData")
    public native NSMutableDictionary<?, ?> getSavedAnalyticsData();
    @Property(selector = "setSavedAnalyticsData:")
    public native void setSavedAnalyticsData(NSMutableDictionary<?, ?> v);
    @Property(selector = "appleSearchAdDetails")
    public native NSDictionary<?, ?> getAppleSearchAdDetails();
    @Property(selector = "setAppleSearchAdDetails:")
    public native void setAppleSearchAdDetails(NSDictionary<?, ?> v);
    @Property(selector = "appleSearchAdNeedsSend")
    public native boolean isAppleSearchAdNeedsSend();
    @Property(selector = "setAppleSearchAdNeedsSend:")
    public native void setAppleSearchAdNeedsSend(boolean v);
    @Property(selector = "lastSystemBuildVersion")
    public native String getLastSystemBuildVersion();
    @Property(selector = "setLastSystemBuildVersion:")
    public native void setLastSystemBuildVersion(String v);
    @Property(selector = "browserUserAgentString")
    public native String getBrowserUserAgentString();
    @Property(selector = "setBrowserUserAgentString:")
    public native void setBrowserUserAgentString(String v);
    @Property(selector = "referringURL")
    public native String getReferringURL();
    @Property(selector = "setReferringURL:")
    public native void setReferringURL(String v);
    @Property(selector = "branchAPIURL")
    public native String getBranchAPIURL();
    @Property(selector = "setBranchAPIURL:")
    public native void setBranchAPIURL(String v);
    @Property(selector = "branchBlacklistURL")
    public native String getBranchBlacklistURL();
    @Property(selector = "setBranchBlacklistURL:")
    public native void setBranchBlacklistURL(String v);
    @Property(selector = "limitFacebookTracking")
    public native boolean isLimitFacebookTracking();
    @Property(selector = "setLimitFacebookTracking:")
    public native void setLimitFacebookTracking(boolean v);
    @Property(selector = "previousAppBuildDate")
    public native NSDate getPreviousAppBuildDate();
    @Property(selector = "setPreviousAppBuildDate:")
    public native void setPreviousAppBuildDate(NSDate v);
    @Property(selector = "faceBookAppLink")
    public native NSURL getFaceBookAppLink();
    @Property(selector = "setFaceBookAppLink:")
    public native void setFaceBookAppLink(NSURL v);
    @Property(selector = "URLBlackList")
    public native NSArray<NSString> getURLBlackList();
    @Property(selector = "setURLBlackList:")
    public native void setURLBlackList(NSArray<NSString> v);
    @Property(selector = "URLBlackListVersion")
    public native @MachineSizedSInt long getURLBlackListVersion();
    @Property(selector = "setURLBlackListVersion:")
    public native void setURLBlackListVersion(@MachineSizedSInt long v);
    @Property(selector = "blacklistURLOpen")
    public native boolean isBlacklistURLOpen();
    @Property(selector = "setBlacklistURLOpen:")
    public native void setBlacklistURLOpen(boolean v);
    @Property(selector = "trackingDisabled")
    public native boolean isTrackingDisabled();
    @Property(selector = "setTrackingDisabled:")
    public native void setTrackingDisabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "clearTrackingInformation")
    public native void clearTrackingInformation();
    @Method(selector = "getAPIBaseURL")
    public native String getAPIBaseURL();
    @Method(selector = "getAPIURL:")
    public native String getAPIURL(String endpoint);
    @Method(selector = "getEndpointFromURL:")
    public native String getEndpointFromURL(String url);
    @Method(selector = "clearUserCreditsAndCounts")
    public native void clearUserCreditsAndCounts();
    @Method(selector = "clearUserCredits")
    public native void clearUserCredits();
    @Method(selector = "getBranchUniversalLinkDomains")
    public native NSObject getBranchUniversalLinkDomains();
    @Method(selector = "setCreditCount:")
    public native void setCreditCount(@MachineSizedSInt long count);
    @Method(selector = "setCreditCount:forBucket:")
    public native void setCreditCount(@MachineSizedSInt long count, String bucket);
    @Method(selector = "removeCreditCountForBucket:")
    public native void removeCreditCountForBucket(String bucket);
    @Method(selector = "getCreditDictionary")
    public native NSDictionary<?, ?> getCreditDictionary();
    @Method(selector = "getCreditCount")
    public native @MachineSizedSInt long getCreditCount();
    @Method(selector = "getCreditCountForBucket:")
    public native @MachineSizedSInt long getCreditCountForBucket(String bucket);
    @Method(selector = "setRequestMetadataKey:value:")
    public native void setRequestMetadata(String key, NSObject value);
    @Method(selector = "requestMetadataDictionary")
    public native NSMutableDictionary<?, ?> requestMetadataDictionary();
    @Method(selector = "addInstrumentationDictionaryKey:value:")
    public native void addInstrumentationDictionary(String key, String value);
    @Method(selector = "instrumentationDictionary")
    public native NSMutableDictionary<?, ?> instrumentationDictionary();
    @Method(selector = "clearInstrumentationDictionary")
    public native void clearInstrumentationDictionary();
    @Method(selector = "saveBranchAnalyticsData:")
    public native void saveBranchAnalyticsData(NSDictionary<?, ?> analyticsData);
    @Method(selector = "clearBranchAnalyticsData")
    public native void clearBranchAnalyticsData();
    @Method(selector = "getBranchAnalyticsData")
    public native NSMutableDictionary<?, ?> getBranchAnalyticsData();
    @Method(selector = "getContentAnalyticsManifest")
    public native NSDictionary<?, ?> getContentAnalyticsManifest();
    @Method(selector = "saveContentAnalyticsManifest:")
    public native void saveContentAnalyticsManifest(NSDictionary<?, ?> cdManifest);
    @Method(selector = "sanitizedMutableBaseURL:")
    public native NSMutableString sanitizedMutableBaseURL(String baseUrl);
    @Method(selector = "synchronize")
    public native void synchronize();
    @Method(selector = "preferenceHelper")
    public static native BNCPreferenceHelper preferenceHelper();
    @Method(selector = "clearAll")
    public static native void clearAll();
    /*</methods>*/
}
