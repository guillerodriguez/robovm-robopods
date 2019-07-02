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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HelpshiftSupportDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements HelpshiftSupportDelegate/*</implements>*/ {

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
    @NotImplemented("didReceiveUnreadMessagesCount:")
    public void didReceiveUnreadMessagesCount(@MachineSizedSInt long count) {}
    @Deprecated
    @NotImplemented("didReceiveNotificationCount:")
    public void didReceiveNotificationCount(@MachineSizedSInt long count) {}
    @NotImplemented("helpshiftSupportSessionHasBegun")
    public void helpshiftSupportSessionHasBegun() {}
    @NotImplemented("helpshiftSupportSessionHasEnded")
    public void helpshiftSupportSessionHasEnded() {}
    @NotImplemented("didReceiveInAppNotificationWithMessageCount:")
    public void didReceiveInAppNotification(@MachineSizedSInt long count) {}
    @NotImplemented("newConversationStartedWithMessage:")
    public void newConversationStarted(String newConversationMessage) {}
    @NotImplemented("conversationEnded")
    public void conversationEnded() {}
    @NotImplemented("didCheckIfConversationActive:")
    public void didCheckIfConversationActive(boolean isActive) {}
    @NotImplemented("userRepliedToConversationWithMessage:")
    public void userRepliedToConversation(String newMessage) {}
    @NotImplemented("userCompletedCustomerSatisfactionSurvey:withFeedback:")
    public void userCompletedCustomerSatisfactionSurvey(@MachineSizedSInt long rating, String feedback) {}
    @NotImplemented("displayAttachmentFileAtLocation:onViewController:")
    public boolean displayAttachmentFile(NSURL fileLocation, UIViewController parentViewController) { return false; }
    @NotImplemented("configForFAQViaSearch")
    public NSDictionary<?, ?> configForFAQViaSearch() { return null; }
    @NotImplemented("didCreateDynamicForm:")
    public void didCreateDynamicForm(UINavigationController form) {}
    @NotImplemented("authenticationFailedForUser:withReason:")
    public void authenticationFailed(HelpshiftUser user, HelpshiftAuthenticationFailureReason reason) {}
    /*</methods>*/
}
