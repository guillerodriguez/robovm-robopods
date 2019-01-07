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
package org.robovm.pods.branchmetrics;

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
import org.robovm.apple.corespotlight.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BranchStandardEvents/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(BranchStandardEvents.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="BranchStandardEventAddToCart", optional=true)
    public static native String getAddToCart();
    @GlobalValue(symbol="BranchStandardEventAddToCart", optional=true)
    public static native void getAddToCart(String v);
    @GlobalValue(symbol="BranchStandardEventAddToWishlist", optional=true)
    public static native String getAddToWishlist();
    @GlobalValue(symbol="BranchStandardEventAddToWishlist", optional=true)
    public static native void getAddToWishlist(String v);
    @GlobalValue(symbol="BranchStandardEventViewCart", optional=true)
    public static native String getViewCart();
    @GlobalValue(symbol="BranchStandardEventViewCart", optional=true)
    public static native void getViewCart(String v);
    @GlobalValue(symbol="BranchStandardEventInitiatePurchase", optional=true)
    public static native String getInitiatePurchase();
    @GlobalValue(symbol="BranchStandardEventInitiatePurchase", optional=true)
    public static native void getInitiatePurchase(String v);
    @GlobalValue(symbol="BranchStandardEventAddPaymentInfo", optional=true)
    public static native String getAddPaymentInfo();
    @GlobalValue(symbol="BranchStandardEventAddPaymentInfo", optional=true)
    public static native void getAddPaymentInfo(String v);
    @GlobalValue(symbol="BranchStandardEventPurchase", optional=true)
    public static native String getPurchase();
    @GlobalValue(symbol="BranchStandardEventPurchase", optional=true)
    public static native void getPurchase(String v);
    @GlobalValue(symbol="BranchStandardEventSpendCredits", optional=true)
    public static native String getSpendCredits();
    @GlobalValue(symbol="BranchStandardEventSpendCredits", optional=true)
    public static native void getSpendCredits(String v);
    @GlobalValue(symbol="BranchStandardEventSearch", optional=true)
    public static native String getSearch();
    @GlobalValue(symbol="BranchStandardEventSearch", optional=true)
    public static native void getSearch(String v);
    @GlobalValue(symbol="BranchStandardEventViewItem", optional=true)
    public static native String getViewItem();
    @GlobalValue(symbol="BranchStandardEventViewItem", optional=true)
    public static native void getViewItem(String v);
    @GlobalValue(symbol="BranchStandardEventViewItems", optional=true)
    public static native String getViewItems();
    @GlobalValue(symbol="BranchStandardEventViewItems", optional=true)
    public static native void getViewItems(String v);
    @GlobalValue(symbol="BranchStandardEventRate", optional=true)
    public static native String getRate();
    @GlobalValue(symbol="BranchStandardEventRate", optional=true)
    public static native void getRate(String v);
    @GlobalValue(symbol="BranchStandardEventShare", optional=true)
    public static native String getShare();
    @GlobalValue(symbol="BranchStandardEventShare", optional=true)
    public static native void getShare(String v);
    @GlobalValue(symbol="BranchStandardEventCompleteRegistration", optional=true)
    public static native String getCompleteRegistration();
    @GlobalValue(symbol="BranchStandardEventCompleteRegistration", optional=true)
    public static native void getCompleteRegistration(String v);
    @GlobalValue(symbol="BranchStandardEventCompleteTutorial", optional=true)
    public static native String getCompleteTutorial();
    @GlobalValue(symbol="BranchStandardEventCompleteTutorial", optional=true)
    public static native void getCompleteTutorial(String v);
    @GlobalValue(symbol="BranchStandardEventAchieveLevel", optional=true)
    public static native String getAchieveLevel();
    @GlobalValue(symbol="BranchStandardEventAchieveLevel", optional=true)
    public static native void getAchieveLevel(String v);
    @GlobalValue(symbol="BranchStandardEventUnlockAchievement", optional=true)
    public static native String getUnlockAchievement();
    @GlobalValue(symbol="BranchStandardEventUnlockAchievement", optional=true)
    public static native void getUnlockAchievement(String v);
    /*</methods>*/
}
