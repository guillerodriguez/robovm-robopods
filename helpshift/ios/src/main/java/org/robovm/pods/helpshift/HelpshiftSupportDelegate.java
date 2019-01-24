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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/HelpshiftSupportDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "didReceiveUnreadMessagesCount:")
    void didReceiveUnreadMessagesCount(@MachineSizedSInt long count);
    @Method(selector = "didReceiveNotificationCount:")
    void didReceiveNotificationCount(@MachineSizedSInt long count);
    @Method(selector = "helpshiftSupportSessionHasBegun")
    void helpshiftSupportSessionHasBegun();
    @Method(selector = "helpshiftSupportSessionHasEnded")
    void helpshiftSupportSessionHasEnded();
    @Method(selector = "didReceiveInAppNotificationWithMessageCount:")
    void didReceiveInAppNotification(@MachineSizedSInt long count);
    @Method(selector = "newConversationStartedWithMessage:")
    void newConversationStarted(String newConversationMessage);
    @Method(selector = "conversationEnded")
    void conversationEnded();
    @Method(selector = "didCheckIfConversationActive:")
    void didCheckIfConversationActive(boolean isActive);
    @Method(selector = "userRepliedToConversationWithMessage:")
    void userRepliedToConversation(String newMessage);
    @Method(selector = "userCompletedCustomerSatisfactionSurvey:withFeedback:")
    void userCompletedCustomerSatisfactionSurvey(@MachineSizedSInt long rating, String feedback);
    @Method(selector = "displayAttachmentFileAtLocation:onViewController:")
    boolean displayAttachmentFile(NSURL fileLocation, UIViewController parentViewController);
    @Method(selector = "configForFAQViaSearch")
    NSDictionary<?, ?> configForFAQViaSearch();
    @Method(selector = "didCreateDynamicForm:")
    void didCreateDynamicForm(UINavigationController form);
    @Method(selector = "authenticationFailedForUser:withReason:")
    void authenticationFailed(HelpshiftUser user, HelpshiftAuthenticationFailureReason reason);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
