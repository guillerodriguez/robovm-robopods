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
package org.robovm.pods.helpshift;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HelpshiftCampaigns/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements HsApiProvider/*</implements>*/ {

    /*<ptr>*/public static class HelpshiftCampaignsPtr extends Ptr<HelpshiftCampaigns, HelpshiftCampaignsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HelpshiftCampaigns.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HelpshiftCampaigns() {}
    protected HelpshiftCampaigns(Handle h, long handle) { super(h, handle); }
    protected HelpshiftCampaigns(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native HelpshiftCampaignsDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(HelpshiftCampaignsDelegate v);
    /**
     * @deprecated This delegate is now deprecated. Please use HelpshiftInbox.delegate instead.
     */
    @Deprecated
    @Property(selector = "inboxDelegate")
    public native HelpshiftInboxDelegate getInboxDelegate();
    /**
     * @deprecated This delegate is now deprecated. Please use HelpshiftInbox.delegate instead.
     */
    @Deprecated
    @Property(selector = "setInboxDelegate:", strongRef = true)
    public native void setInboxDelegate(HelpshiftInboxDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "sharedInstance")
    public static native HelpshiftCampaigns sharedInstance();
    @Method(selector = "addProperty:withInteger:")
    public static native boolean addProperty(String key, @MachineSizedSInt long value);
    @Method(selector = "addProperty:withLongLong:")
    public static native boolean addPropertyLong(String key, long value);
    @Method(selector = "addProperty:withString:")
    public static native boolean addProperty(String key, String value);
    @Method(selector = "addProperty:withBoolean:")
    public static native boolean addProperty(String key, boolean value);
    @Method(selector = "addProperty:withDate:")
    public static native boolean addProperty(String key, NSDate value);
    @Method(selector = "addProperties:")
    public static native NSArray<?> addProperties(NSDictionary<?, ?> keyValues);
    @Method(selector = "showInboxOnViewController:withOptions:")
    public static native void showInbox(UIViewController viewController, NSDictionary<?, ?> optionsDictionary);
    @Method(selector = "showInboxOnViewController:withConfig:")
    public static native void showInbox(UIViewController viewController, HelpshiftAPIConfig configObject);
    @Method(selector = "showMessageWithId:onViewController:withOptions:")
    public static native void showMessage(String messageId, UIViewController viewController, NSDictionary<?, ?> optionsDictionary);
    @Method(selector = "showMessageWithId:onViewController:withConfig:")
    public static native void showMessage(String messageId, UIViewController viewController, HelpshiftAPIConfig configObject);
    @Method(selector = "refetchMessages")
    public static native void refetchMessages();
    /**
     * @deprecated Use requestUnreadMessagesCount instead.
     */
    @Deprecated
    @Method(selector = "getCountOfUnreadMessages")
    public static native @MachineSizedSInt long getCountOfUnreadMessages();
    @Method(selector = "requestUnreadMessagesCount")
    public static native void requestUnreadMessagesCount();
    @Method(selector = "configureWithOptions:")
    public static native void configure(NSDictionary<?, ?> configOptions);
    @Method(selector = "_installForApiKey:domainName:appID:")
    public native void installForApiKey(String apiKey, String domainName, String appID);
    @Method(selector = "_installForApiKey:domainName:appID:withConfig:")
    public native void installForApiKey(String apiKey, String domainName, String appID, HelpshiftInstallConfig configObject);
    @Method(selector = "_login:")
    public native boolean login(HelpshiftUser user);
    @Method(selector = "_logout")
    public native boolean logout();
    @Method(selector = "_clearAnonymousUser")
    public native boolean clearAnonymousUser();
    @Method(selector = "_setName:andEmail:")
    public native void setNameAndEmail(String name, String email);
    @Method(selector = "_registerDeviceToken:")
    public native void registerDeviceToken(String deviceToken);
    @Method(selector = "_handleRemoteNotification:withController:")
    public native boolean handleRemoteNotification(NSDictionary<?, ?> notification, UIViewController viewController);
    @Method(selector = "_handleRemoteNotification:isAppLaunch:withController:")
    public native boolean handleRemoteNotification(NSDictionary<?, ?> notification, boolean isAppLaunch, UIViewController viewController);
    @Method(selector = "_handleLocalNotificationWithUserInfoDictionary:withController:")
    public native boolean handleLocalNotification(NSDictionary<?, ?> userInfo, UIViewController viewController);
    @Method(selector = "_handleInteractiveRemoteNotification:forAction:completionHandler:")
    public native void handleInteractiveRemoteNotification(NSDictionary<?, ?> notification, String actionIdentifier, @Block Runnable completionHandler);
    @Method(selector = "_handleInteractiveLocalNotification:forAction:completionHandler:")
    public native void handleInteractiveLocalNotification(NSDictionary<?, ?> notification, String actionIdentifier, @Block Runnable completionHandler);
    @Method(selector = "_handleEventsForBackgroundURLSession:completionHandler:")
    public native void handleEventsForBackgroundURLSession(String identifier, @Block Runnable completionHandler);
    @Method(selector = "_setSDKLanguage:")
    public native boolean setSDKLanguage(String langCode);
    @Method(selector = "_setTheme:")
    public native void setTheme(String themeName);
    @Method(selector = "_setLightTheme:darkTheme:")
    public native void setThemes(String lightThemeName, String darkThemeName);
    /*</methods>*/
}
