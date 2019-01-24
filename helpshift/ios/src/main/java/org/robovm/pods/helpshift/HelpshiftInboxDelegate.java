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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/HelpshiftInboxDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "inboxMessageAdded:")
    void inboxMessageAdded(HelpshiftInboxMessage newMessage);
    @Method(selector = "inboxMessageDeleted:")
    void inboxMessageDeleted(String identifier);
    @Method(selector = "failedToAddInboxMessageWithId:")
    void failedToAddInboxMessage(String identifier);
    @Method(selector = "iconImageDownloadedForInboxMessage:")
    void iconImageDownloadedForInboxMessage(String identifier);
    @Method(selector = "coverImageDownloadedForInboxMessage:")
    void coverImageDownloadedForInboxMessage(String identifier);
    @Method(selector = "inboxMessageMarkedAsSeen:")
    void inboxMessageMarkedAsSeen(String identifier);
    @Method(selector = "inboxMessageMarkedAsRead:")
    void inboxMessageMarkedAsRead(String identifier);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
