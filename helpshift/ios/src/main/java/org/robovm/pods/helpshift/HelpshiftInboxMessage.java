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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/HelpshiftInboxMessage/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "getIdentifier")
    String getIdentifier();
    @Method(selector = "getCoverImage")
    UIImage getCoverImage();
    @Method(selector = "getIconImage")
    UIImage getIconImage();
    @Method(selector = "getTitle")
    String getTitle();
    @Method(selector = "getTitleColor")
    String getTitleColor();
    @Method(selector = "getBody")
    String getBody();
    @Method(selector = "getBodyColor")
    String getBodyColor();
    @Method(selector = "getBackgroundColor")
    String getBackgroundColor();
    @Method(selector = "getReadStatus")
    boolean getReadStatus();
    @Method(selector = "getSeenStatus")
    boolean getSeenStatus();
    @Method(selector = "getCreatedAt")
    double getCreatedAt();
    @Method(selector = "getExpiryTimestamp")
    double getExpiryTimestamp();
    @Method(selector = "getCountOfActions")
    @MachineSizedSInt long getCountOfActions();
    @Method(selector = "getActionTitleAtIndex:")
    String getActionTitleAtIndex(@MachineSizedSInt long index);
    @Method(selector = "getActionTitleColorAtIndex:")
    String getActionTitleColorAtIndex(@MachineSizedSInt long index);
    @Method(selector = "getActionTypeAtIndex:")
    HelpshiftInboxMessageActionType getActionTypeAtIndex(@MachineSizedSInt long index);
    @Method(selector = "getActionDataAtIndex:")
    String getActionDataAtIndex(@MachineSizedSInt long index);
    @Method(selector = "getActionGoalCompletionAtIndex:")
    boolean getActionGoalCompletionAtIndex(@MachineSizedSInt long index);
    @Method(selector = "executeActionAtIndex:onViewController:")
    void executeAction(@MachineSizedSInt long index, UIViewController viewController);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
