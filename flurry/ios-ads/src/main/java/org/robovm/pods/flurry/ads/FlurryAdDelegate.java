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
package org.robovm.pods.flurry.ads;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/FlurryAdDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "spaceDidReceiveAd:")
    void spaceDidReceiveAd(String adSpace);
    @Method(selector = "spaceDidFailToReceiveAd:error:")
    void spaceDidFailToReceiveAd(String adSpace, NSError error);
    @Method(selector = "spaceShouldDisplay:interstitial:")
    boolean spaceShouldDisplay(String adSpace, boolean interstitial);
    @Deprecated
    @Method(selector = "spaceShouldDisplay:forType:")
    boolean spaceShouldDisplay(String adSpace, FlurryAdType type);
    @Method(selector = "spaceDidRender:interstitial:")
    void spaceDidRender(String space, boolean interstitial);
    @Method(selector = "spaceDidFailToRender:error:")
    void spaceDidFailToRender(String space, NSError error);
    @Method(selector = "spaceWillDismiss:interstitial:")
    void spaceWillDismiss(String adSpace, boolean interstitial);
    @Method(selector = "spaceDidDismiss:interstitial:")
    void spaceDidDismiss(String adSpace, boolean interstitial);
    @Method(selector = "spaceWillLeaveApplication:")
    void spaceWillLeaveApplication(String adSpace);
    @Method(selector = "spaceWillExpand:")
    void spaceWillExpand(String adSpace);
    @Method(selector = "spaceWillCollapse:")
    void spaceWillCollapse(String adSpace);
    @Method(selector = "spaceDidCollapse:")
    void spaceDidCollapse(String adSpace);
    @Method(selector = "spaceDidReceiveClick:")
    void spaceDidReceiveClick(String adSpace);
    @Method(selector = "spaceClickActionDidFail:error:")
    void spaceClickActionDidFail(String adSpace, NSError error);
    @Method(selector = "videoDidFinish:")
    void videoDidFinish(String adSpace);
    @Method(selector = "videoDidNotFinish:")
    void videoDidNotFinish(String adSpace);
    @Method(selector = "appSpotMillennialAppKey")
    String appSpotMillennialAppKey();
    @Method(selector = "appSpotMillennialInterstitalAppKey")
    String appSpotMillennialInterstitalAppKey();
    @Method(selector = "appSpotInMobiAppKey")
    String appSpotInMobiAppKey();
    @Method(selector = "appSpotFANAppPlacementID")
    String appSpotFANAppPlacementID();
    @Method(selector = "appSpotAdMobPublisherID")
    String appSpotAdMobPublisherID();
    @Method(selector = "appSpotMobclixApplicationID")
    String appSpotMobclixApplicationID();
    @Method(selector = "appSpotJumptapPublisherID")
    String appSpotJumptapPublisherID();
    @Method(selector = "appSpotJumptapSiteID")
    String appSpotJumptapSiteID();
    @Method(selector = "appSpotJumptapBannerAdSpotID")
    String appSpotJumptapBannerAdSpotID();
    @Method(selector = "appSpotJumptapLeaderboardAdSpotID")
    String appSpotJumptapLeaderboardAdSpotID();
    @Method(selector = "appSpotJumptapMediumRectangleAdSpotID")
    String appSpotJumptapMediumRectangleAdSpotID();
    @Deprecated
    @Method(selector = "appSpotRootViewController")
    NSObject appSpotRootViewController();
    @Method(selector = "appSpotAccelerometerEnabled")
    boolean appSpotAccelerometerEnabled();
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
