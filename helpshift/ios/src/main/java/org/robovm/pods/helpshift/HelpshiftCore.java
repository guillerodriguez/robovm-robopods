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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HelpshiftCore/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HelpshiftCorePtr extends Ptr<HelpshiftCore, HelpshiftCorePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HelpshiftCore.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HelpshiftCore() {}
    protected HelpshiftCore(Handle h, long handle) { super(h, handle); }
    protected HelpshiftCore(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "enableTestingMode")
    public static native void enableTestingMode();
    @Method(selector = "initializeWithProvider:")
    public static native void initialize(HsApiProvider apiProvider);
    @Method(selector = "installForApiKey:domainName:appID:")
    public static native void installForApiKey(String apiKey, String domainName, String appID);
    @Deprecated
    @Method(selector = "installForApiKey:domainName:appID:withOptions:")
    public static native void installForApiKey(String apiKey, String domainName, String appID, NSDictionary<?, ?> optionsDictionary);
    @Method(selector = "installForApiKey:domainName:appID:withConfig:")
    public static native void installForApiKey(String apiKey, String domainName, String appID, HelpshiftInstallConfig configObject);
    /**
     * @deprecated Use login: instead
     */
    @Deprecated
    @Method(selector = "loginWithIdentifier:withName:andEmail:")
    public static native void login(String identifier, String name, String email);
    @Method(selector = "login:")
    public static native void login(HelpshiftUser user);
    @Method(selector = "logout")
    public static native void logout();
    @Method(selector = "clearAnonymousUser")
    public static native void clearAnonymousUser();
    /**
     * @deprecated Use login: instead
     */
    @Deprecated
    @Method(selector = "setName:andEmail:")
    public static native void setNameAndEmail(String name, String email);
    @Method(selector = "registerDeviceToken:")
    public static native void registerDeviceToken(NSData deviceToken);
    @Method(selector = "handleNotificationWithUserInfoDictionary:isAppLaunch:withController:")
    public static native boolean handleNotification(NSDictionary<?, ?> userInfo, boolean isAppLaunch, UIViewController viewController);
    @Method(selector = "handleNotificationResponseWithActionIdentifier:userInfo:completionHandler:")
    public static native boolean handleNotificationResponse(String actionIdentifier, NSDictionary<?, ?> userInfo, @Block Runnable completionHandler);
    @Method(selector = "handleEventsForBackgroundURLSession:completionHandler:")
    public static native boolean handleEventsForBackgroundURLSession(String identifier, @Block Runnable completionHandler);
    @Method(selector = "setLanguage:")
    public static native void setLanguage(String languageCode);
    /**
     * @deprecated Use setLanguage: instead
     */
    @Deprecated
    @Method(selector = "setSDKLanguage:")
    public static native boolean setSDKLanguage(String languageCode);
    /**
     * @deprecated Use handleNotificationWithUserInfoDictionary:isAppLaunch:withController: instead
     */
    @Deprecated
    @Method(selector = "handleRemoteNotification:withController:")
    public static native boolean handleRemoteNotification(NSDictionary<?, ?> notification, UIViewController viewController);
    /**
     * @deprecated Use handleNotificationWithUserInfoDictionary:isAppLaunch:withController: instead
     */
    @Deprecated
    @Method(selector = "handleRemoteNotification:isAppLaunch:withController:")
    public static native boolean handleRemoteNotification(NSDictionary<?, ?> notification, boolean isAppLaunch, UIViewController viewController);
    /**
     * @deprecated Use handleNotificationWithUserInfoDictionary:isAppLaunch:withController: instead
     */
    @Deprecated
    @Method(selector = "handleLocalNotification:withController:")
    public static native boolean handleLocalNotification(UILocalNotification notification, UIViewController viewController);
    /**
     * @deprecated Use handleInteractiveLocalNotificationWithUserInfoDictionary:forAction:completionHandler: instead
     */
    @Deprecated
    @Method(selector = "handleInteractiveLocalNotification:forAction:completionHandler:")
    public static native boolean handleInteractiveLocalNotification(UILocalNotification notification, String actionIdentifier, @Block Runnable completionHandler);
    /**
     * @deprecated Use handleNotificationResponseWithActionIdentifier:userInfo:completionHandler: instead
     */
    @Deprecated
    @Method(selector = "handleInteractiveRemoteNotification:forAction:completionHandler:")
    public static native boolean handleInteractiveRemoteNotification(NSDictionary<?, ?> notification, String actionIdentifier, @Block Runnable completionHandler);
    /**
     * @deprecated Use handleNotificationResponseWithActionIdentifier:userInfo:completionHandler: instead
     */
    @Deprecated
    @Method(selector = "handleInteractiveLocalNotificationWithUserInfoDictionary:forAction:completionHandler:")
    public static native boolean handleInteractiveLocalNotification(NSDictionary<?, ?> userInfo, String actionIdentifier, @Block Runnable completionHandler);
    /*</methods>*/
}
