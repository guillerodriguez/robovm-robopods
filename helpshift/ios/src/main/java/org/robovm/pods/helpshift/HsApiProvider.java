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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/HsApiProvider/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "_installForApiKey:domainName:appID:")
    void installForApiKey(String apiKey, String domainName, String appID);
    @Method(selector = "_installForApiKey:domainName:appID:withConfig:")
    void installForApiKey(String apiKey, String domainName, String appID, HelpshiftInstallConfig configObject);
    @Method(selector = "_login:")
    boolean login(HelpshiftUser user);
    @Method(selector = "_logout")
    boolean logout();
    @Method(selector = "_clearAnonymousUser")
    boolean clearAnonymousUser();
    @Method(selector = "_setName:andEmail:")
    void setNameAndEmail(String name, String email);
    @Method(selector = "_registerDeviceToken:")
    void registerDeviceToken(String deviceToken);
    @Method(selector = "_handleRemoteNotification:withController:")
    boolean handleRemoteNotification(NSDictionary<?, ?> notification, UIViewController viewController);
    @Method(selector = "_handleRemoteNotification:isAppLaunch:withController:")
    boolean handleRemoteNotification(NSDictionary<?, ?> notification, boolean isAppLaunch, UIViewController viewController);
    @Method(selector = "_handleLocalNotificationWithUserInfoDictionary:withController:")
    boolean handleLocalNotification(NSDictionary<?, ?> userInfo, UIViewController viewController);
    @Method(selector = "_handleInteractiveRemoteNotification:forAction:completionHandler:")
    void handleInteractiveRemoteNotification(NSDictionary<?, ?> notification, String actionIdentifier, @Block Runnable completionHandler);
    @Method(selector = "_handleInteractiveLocalNotification:forAction:completionHandler:")
    void handleInteractiveLocalNotification(NSDictionary<?, ?> notification, String actionIdentifier, @Block Runnable completionHandler);
    @Method(selector = "_handleEventsForBackgroundURLSession:completionHandler:")
    void handleEventsForBackgroundURLSession(String identifier, @Block Runnable completionHandler);
    @Method(selector = "_setSDKLanguage:")
    boolean setSDKLanguage(String langCode);
    @Method(selector = "_setTheme:")
    void setTheme(String themeName);
    @Method(selector = "_setLightTheme:darkTheme:")
    void setThemes(String lightThemeName, String darkThemeName);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
