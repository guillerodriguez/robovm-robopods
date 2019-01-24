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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HelpshiftInbox/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HelpshiftInboxPtr extends Ptr<HelpshiftInbox, HelpshiftInboxPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HelpshiftInbox.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HelpshiftInbox() {}
    protected HelpshiftInbox(Handle h, long handle) { super(h, handle); }
    protected HelpshiftInbox(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native HelpshiftInboxDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(HelpshiftInboxDelegate v);
    @Property(selector = "hsInboxNotificationDelegate")
    public native HelpshiftInboxNotificationDelegate getHsInboxNotificationDelegate();
    @Property(selector = "setHsInboxNotificationDelegate:", strongRef = true)
    public native void setHsInboxNotificationDelegate(HelpshiftInboxNotificationDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="HS_NO_EXPIRY_TIMESTAMP", optional=true)
    public static native double NO_EXPIRY_TIMESTAMP();
    
    @Method(selector = "cleanUp")
    public native void cleanUp();
    @Method(selector = "getAllInboxMessages")
    public native NSArray<?> getAllInboxMessages();
    @Method(selector = "getInboxMessageForId:")
    public native HelpshiftInboxMessage getInboxMessageForId(String identifier);
    @Method(selector = "markInboxMessageAsRead:")
    public native void markInboxMessageAsRead(String identifier);
    @Method(selector = "markInboxMessageAsSeen:")
    public native void markInboxMessageAsSeen(String identifier);
    @Method(selector = "deleteInboxMessage:")
    public native void deleteInboxMessage(String identifier);
    @Method(selector = "sharedInstance")
    public static native HelpshiftInbox sharedInstance();
    /*</methods>*/
}
