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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HelpshiftInstallConfigBuilder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HelpshiftInstallConfigBuilderPtr extends Ptr<HelpshiftInstallConfigBuilder, HelpshiftInstallConfigBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HelpshiftInstallConfigBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HelpshiftInstallConfigBuilder() {}
    protected HelpshiftInstallConfigBuilder(Handle h, long handle) { super(h, handle); }
    protected HelpshiftInstallConfigBuilder(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "enableDefaultFallbackLanguage")
    public native boolean isEnableDefaultFallbackLanguage();
    @Property(selector = "setEnableDefaultFallbackLanguage:")
    public native void setEnableDefaultFallbackLanguage(boolean v);
    @Property(selector = "disableEntryExitAnimations")
    public native boolean isDisableEntryExitAnimations();
    @Property(selector = "setDisableEntryExitAnimations:")
    public native void setDisableEntryExitAnimations(boolean v);
    @Property(selector = "enableInboxPolling")
    public native boolean isEnableInboxPolling();
    @Property(selector = "setEnableInboxPolling:")
    public native void setEnableInboxPolling(boolean v);
    @Property(selector = "enableInAppNotifications")
    public native boolean isEnableInAppNotifications();
    @Property(selector = "setEnableInAppNotifications:")
    public native void setEnableInAppNotifications(boolean v);
    @Property(selector = "enableLogging")
    public native boolean isEnableLogging();
    @Property(selector = "setEnableLogging:")
    public native void setEnableLogging(boolean v);
    @Property(selector = "addFaqsToDeviceSearch")
    public native HsAddFAQsToDeviceSearch getAddFaqsToDeviceSearch();
    @Property(selector = "setAddFaqsToDeviceSearch:")
    public native void setAddFaqsToDeviceSearch(HsAddFAQsToDeviceSearch v);
    @Property(selector = "disableAutomaticPushHandling")
    public native boolean isDisableAutomaticPushHandling();
    @Property(selector = "setDisableAutomaticPushHandling:")
    public native void setDisableAutomaticPushHandling(boolean v);
    @Property(selector = "extraConfig")
    public native NSDictionary<?, ?> getExtraConfig();
    @Property(selector = "setExtraConfig:")
    public native void setExtraConfig(NSDictionary<?, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "build")
    public native HelpshiftInstallConfig build();
    /*</methods>*/
}
