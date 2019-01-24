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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HelpshiftInboxMessageAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements HelpshiftInboxMessage/*</implements>*/ {

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
    @NotImplemented("getIdentifier")
    public String getIdentifier() { return null; }
    @NotImplemented("getCoverImage")
    public UIImage getCoverImage() { return null; }
    @NotImplemented("getIconImage")
    public UIImage getIconImage() { return null; }
    @NotImplemented("getTitle")
    public String getTitle() { return null; }
    @NotImplemented("getTitleColor")
    public String getTitleColor() { return null; }
    @NotImplemented("getBody")
    public String getBody() { return null; }
    @NotImplemented("getBodyColor")
    public String getBodyColor() { return null; }
    @NotImplemented("getBackgroundColor")
    public String getBackgroundColor() { return null; }
    @NotImplemented("getReadStatus")
    public boolean getReadStatus() { return false; }
    @NotImplemented("getSeenStatus")
    public boolean getSeenStatus() { return false; }
    @NotImplemented("getCreatedAt")
    public double getCreatedAt() { return 0; }
    @NotImplemented("getExpiryTimestamp")
    public double getExpiryTimestamp() { return 0; }
    @NotImplemented("getCountOfActions")
    public @MachineSizedSInt long getCountOfActions() { return 0; }
    @NotImplemented("getActionTitleAtIndex:")
    public String getActionTitleAtIndex(@MachineSizedSInt long index) { return null; }
    @NotImplemented("getActionTitleColorAtIndex:")
    public String getActionTitleColorAtIndex(@MachineSizedSInt long index) { return null; }
    @NotImplemented("getActionTypeAtIndex:")
    public HelpshiftInboxMessageActionType getActionTypeAtIndex(@MachineSizedSInt long index) { return null; }
    @NotImplemented("getActionDataAtIndex:")
    public String getActionDataAtIndex(@MachineSizedSInt long index) { return null; }
    @NotImplemented("getActionGoalCompletionAtIndex:")
    public boolean getActionGoalCompletionAtIndex(@MachineSizedSInt long index) { return false; }
    @NotImplemented("executeActionAtIndex:onViewController:")
    public void executeAction(@MachineSizedSInt long index, UIViewController viewController) {}
    /*</methods>*/
}
