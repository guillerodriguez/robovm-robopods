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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HsApiProviderAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements HsApiProvider/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("_installForApiKey:domainName:appID:")
    public void installForApiKey(String apiKey, String domainName, String appID) {}
    @NotImplemented("_installForApiKey:domainName:appID:withConfig:")
    public void installForApiKey(String apiKey, String domainName, String appID, HelpshiftInstallConfig configObject) {}
    @NotImplemented("_login:")
    public boolean login(HelpshiftUser user) { return false; }
    @NotImplemented("_logout")
    public boolean logout() { return false; }
    @NotImplemented("_clearAnonymousUser")
    public boolean clearAnonymousUser() { return false; }
    @NotImplemented("_setName:andEmail:")
    public void setNameAndEmail(String name, String email) {}
    @NotImplemented("_registerDeviceToken:")
    public void registerDeviceToken(String deviceToken) {}
    @NotImplemented("_handleRemoteNotification:withController:")
    public boolean handleRemoteNotification(NSDictionary<?, ?> notification, UIViewController viewController) { return false; }
    @NotImplemented("_handleRemoteNotification:isAppLaunch:withController:")
    public boolean handleRemoteNotification(NSDictionary<?, ?> notification, boolean isAppLaunch, UIViewController viewController) { return false; }
    @NotImplemented("_handleLocalNotificationWithUserInfoDictionary:withController:")
    public boolean handleLocalNotification(NSDictionary<?, ?> userInfo, UIViewController viewController) { return false; }
    @NotImplemented("_handleInteractiveRemoteNotification:forAction:completionHandler:")
    public void handleInteractiveRemoteNotification(NSDictionary<?, ?> notification, String actionIdentifier, @Block Runnable completionHandler) {}
    @NotImplemented("_handleInteractiveLocalNotification:forAction:completionHandler:")
    public void handleInteractiveLocalNotification(NSDictionary<?, ?> notification, String actionIdentifier, @Block Runnable completionHandler) {}
    @NotImplemented("_handleEventsForBackgroundURLSession:completionHandler:")
    public void handleEventsForBackgroundURLSession(String identifier, @Block Runnable completionHandler) {}
    @NotImplemented("_setSDKLanguage:")
    public boolean setSDKLanguage(String langCode) { return false; }
    @NotImplemented("_setTheme:")
    public void setTheme(String themeName) {}
    @NotImplemented("_setLightTheme:darkTheme:")
    public void setThemes(String lightThemeName, String darkThemeName) {}
    /*</methods>*/
}
