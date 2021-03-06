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
package org.robovm.pods.ironsource;

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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/ISDemandOnlyRewardedVideoDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "rewardedVideoHasChangedAvailability:instanceId:")
    void rewardedVideoHasChangedAvailability(boolean available, String instanceId);
    @Method(selector = "didReceiveRewardForPlacement:instanceId:")
    void didReceiveRewardForPlacement(ISPlacementInfo placementInfo, String instanceId);
    @Method(selector = "rewardedVideoDidFailToShowWithError:instanceId:")
    void rewardedVideoDidFailToShow(NSError error, String instanceId);
    @Method(selector = "rewardedVideoDidOpen:")
    void rewardedVideoDidOpen(String instanceId);
    @Method(selector = "rewardedVideoDidClose:")
    void rewardedVideoDidClose(String instanceId);
    @Method(selector = "didClickRewardedVideo:instanceId:")
    void didClickRewardedVideo(ISPlacementInfo placementInfo, String instanceId);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
