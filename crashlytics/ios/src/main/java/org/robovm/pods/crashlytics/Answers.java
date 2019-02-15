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
package org.robovm.pods.crashlytics;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Answers/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AnswersPtr extends Ptr<Answers, AnswersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Answers.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public Answers() {}
    protected Answers(Handle h, long handle) { super(h, handle); }
    protected Answers(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "logSignUpWithMethod:success:customAttributes:")
    public static native void logSignUp(String signUpMethodOrNil, NSNumber signUpSucceededOrNil, NSDictionary<NSString, ?> customAttributesOrNil);
    @Method(selector = "logLoginWithMethod:success:customAttributes:")
    public static native void logLogin(String loginMethodOrNil, NSNumber loginSucceededOrNil, NSDictionary<NSString, ?> customAttributesOrNil);
    @Method(selector = "logShareWithMethod:contentName:contentType:contentId:customAttributes:")
    public static native void logShare(String shareMethodOrNil, String contentNameOrNil, String contentTypeOrNil, String contentIdOrNil, NSDictionary<NSString, ?> customAttributesOrNil);
    @Method(selector = "logInviteWithMethod:customAttributes:")
    public static native void logInvite(String inviteMethodOrNil, NSDictionary<NSString, ?> customAttributesOrNil);
    @Method(selector = "logPurchaseWithPrice:currency:success:itemName:itemType:itemId:customAttributes:")
    public static native void logPurchase(NSDecimalNumber itemPriceOrNil, String currencyOrNil, NSNumber purchaseSucceededOrNil, String itemNameOrNil, String itemTypeOrNil, String itemIdOrNil, NSDictionary<NSString, ?> customAttributesOrNil);
    @Method(selector = "logLevelStart:customAttributes:")
    public static native void logLevelStart(String levelNameOrNil, NSDictionary<NSString, ?> customAttributesOrNil);
    @Method(selector = "logLevelEnd:score:success:customAttributes:")
    public static native void logLevelEnd(String levelNameOrNil, NSNumber scoreOrNil, NSNumber levelCompletedSuccesfullyOrNil, NSDictionary<NSString, ?> customAttributesOrNil);
    @Method(selector = "logAddToCartWithPrice:currency:itemName:itemType:itemId:customAttributes:")
    public static native void logAddToCart(NSDecimalNumber itemPriceOrNil, String currencyOrNil, String itemNameOrNil, String itemTypeOrNil, String itemIdOrNil, NSDictionary<NSString, ?> customAttributesOrNil);
    @Method(selector = "logStartCheckoutWithPrice:currency:itemCount:customAttributes:")
    public static native void logStartCheckout(NSDecimalNumber totalPriceOrNil, String currencyOrNil, NSNumber itemCountOrNil, NSDictionary<NSString, ?> customAttributesOrNil);
    @Method(selector = "logRating:contentName:contentType:contentId:customAttributes:")
    public static native void logRating(NSNumber ratingOrNil, String contentNameOrNil, String contentTypeOrNil, String contentIdOrNil, NSDictionary<NSString, ?> customAttributesOrNil);
    @Method(selector = "logContentViewWithName:contentType:contentId:customAttributes:")
    public static native void logContentView(String contentNameOrNil, String contentTypeOrNil, String contentIdOrNil, NSDictionary<NSString, ?> customAttributesOrNil);
    @Method(selector = "logSearchWithQuery:customAttributes:")
    public static native void logSearch(String queryOrNil, NSDictionary<NSString, ?> customAttributesOrNil);
    @Method(selector = "logCustomEventWithName:customAttributes:")
    public static native void logCustomEvent(String eventName, NSDictionary<NSString, ?> customAttributesOrNil);
    /*</methods>*/
}
