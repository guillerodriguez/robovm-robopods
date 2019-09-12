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
package org.robovm.pods.facebook.places;

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
import org.robovm.apple.corelocation.*;
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKPlacesFieldKey/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(FBSDKPlacesFieldKey.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FBSDKPlacesFieldKeyAbout", optional=true)
    public static native NSString About();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyAppLinks", optional=true)
    public static native NSString AppLinks();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyCategories", optional=true)
    public static native NSString Categories();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyCheckins", optional=true)
    public static native NSString Checkins();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyConfidence", optional=true)
    public static native NSString Confidence();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyCoverPhoto", optional=true)
    public static native NSString CoverPhoto();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyDescription", optional=true)
    public static native NSString Description();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyEngagement", optional=true)
    public static native NSString Engagement();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyHours", optional=true)
    public static native NSString Hours();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyIsAlwaysOpen", optional=true)
    public static native NSString IsAlwaysOpen();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyIsPermanentlyClosed", optional=true)
    public static native NSString IsPermanentlyClosed();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyIsVerified", optional=true)
    public static native NSString IsVerified();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyLocation", optional=true)
    public static native NSString Location();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyLink", optional=true)
    public static native NSString Link();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyName", optional=true)
    public static native NSString Name();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyOverallStarRating", optional=true)
    public static native NSString OverallStarRating();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyPage", optional=true)
    public static native NSString Page();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyParking", optional=true)
    public static native NSString Parking();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyPaymentOptions", optional=true)
    public static native NSString PaymentOptions();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyPlaceID", optional=true)
    public static native NSString PlaceID();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyPhone", optional=true)
    public static native NSString Phone();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyPhotos", optional=true)
    public static native NSString Photos();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyPriceRange", optional=true)
    public static native NSString PriceRange();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyProfilePhoto", optional=true)
    public static native NSString ProfilePhoto();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyRatingCount", optional=true)
    public static native NSString RatingCount();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyRestaurantServices", optional=true)
    public static native NSString RestaurantServices();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyRestaurantSpecialties", optional=true)
    public static native NSString RestaurantSpecialties();
    @GlobalValue(symbol="FBSDKPlacesFieldKeySingleLineAddress", optional=true)
    public static native NSString SingleLineAddress();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyWebsite", optional=true)
    public static native NSString Website();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyWorkflows", optional=true)
    public static native NSString Workflows();
    /*</methods>*/
}
