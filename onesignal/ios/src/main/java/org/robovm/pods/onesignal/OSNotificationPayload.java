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
package org.robovm.pods.onesignal;

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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSNotificationPayload/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSNotificationPayloadPtr extends Ptr<OSNotificationPayload, OSNotificationPayloadPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSNotificationPayload.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSNotificationPayload() {}
    protected OSNotificationPayload(Handle h, long handle) { super(h, handle); }
    protected OSNotificationPayload(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "notificationID")
    public native String getNotificationID();
    @Property(selector = "templateID")
    public native String getTemplateID();
    @Property(selector = "templateName")
    public native String getTemplateName();
    @Property(selector = "contentAvailable")
    public native boolean isContentAvailable();
    @Property(selector = "mutableContent")
    public native boolean isMutableContent();
    @Property(selector = "category")
    public native String getCategory();
    @Property(selector = "badge")
    public native @MachineSizedUInt long getBadge();
    @Property(selector = "badgeIncrement")
    public native @MachineSizedSInt long getBadgeIncrement();
    @Property(selector = "sound")
    public native String getSound();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "subtitle")
    public native String getSubtitle();
    @Property(selector = "body")
    public native String getBody();
    @Property(selector = "launchURL")
    public native String getLaunchURL();
    @Property(selector = "additionalData")
    public native NSDictionary<?, ?> getAdditionalData();
    @Property(selector = "attachments")
    public native NSDictionary<?, ?> getAttachments();
    @Property(selector = "actionButtons")
    public native NSArray<?> getActionButtons();
    @Property(selector = "rawPayload")
    public native NSDictionary<?, ?> getRawPayload();
    @Property(selector = "threadId")
    public native String getThreadId();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
