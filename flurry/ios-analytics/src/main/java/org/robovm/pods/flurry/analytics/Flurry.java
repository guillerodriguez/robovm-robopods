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
package org.robovm.pods.flurry.analytics;

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
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Flurry/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FlurryPtr extends Ptr<Flurry, FlurryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Flurry.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public Flurry() {}
    protected Flurry(Handle h, long handle) { super(h, handle); }
    protected Flurry(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library(Library.INTERNAL)
    public static class Properties {
        static { Bro.bind(Properties.class); }

        @GlobalValue(symbol="FlurryPropertyCurrencyPreference", optional=true)
        public static native String CurrencyPreference();
        @GlobalValue(symbol="FlurryPropertyPurchaser", optional=true)
        public static native String Purchaser();
        @GlobalValue(symbol="FlurryPropertyRegisteredUser", optional=true)
        public static native String RegisteredUser();
        @GlobalValue(symbol="FlurryPropertySubscriber", optional=true)
        public static native String Subscriber();
    }

    @Library(Library.INTERNAL)
    public static class Syndication {
        static { Bro.bind(Syndication.class); }

        @GlobalValue(symbol="kSyndicationiOSDeepLink", optional=true)
        public static native String iOSDeepLink();
        @GlobalValue(symbol="kSyndicationAndroidDeepLink", optional=true)
        public static native String AndroidDeepLink();
        @GlobalValue(symbol="kSyndicationWebDeepLink", optional=true)
        public static native String WebDeepLink();
    }
    
    @Method(selector = "getFlurryAgentVersion")
    public static native String getFlurryAgentVersion();
    @Method(selector = "setShowErrorInLogEnabled:")
    public static native void setShowErrorInLogEnabled(boolean value);
    @Method(selector = "setLogLevel:")
    public static native void setLogLevel(FlurryLogLevel value);
    @Method(selector = "setDelegate:")
    public static native void setDelegate(FlurryDelegate delegate);
    @Method(selector = "setDelegate:withCallbackQueue:")
    public static native void setDelegate(FlurryDelegate delegate, DispatchQueue flurryCallbackQueue);
    @Method(selector = "startSession:")
    public static native void startSession(String apiKey);
    @Method(selector = "startSession:withOptions:")
    public static native void startSession(String apiKey, NSObject options);
    @Method(selector = "startSession:withOptions:withSessionBuilder:")
    public static native void startSession(String apiKey, NSObject options, FlurrySessionBuilder sessionBuilder);
    @Method(selector = "startSession:withSessionBuilder:")
    public static native void startSession(String apiKey, FlurrySessionBuilder sessionBuilder);
    @Method(selector = "activeSessionExists")
    public static native boolean activeSessionExists();
    @Method(selector = "getSessionID")
    public static native String getSessionID();
    @Method(selector = "pauseBackgroundSession")
    public static native void pauseBackgroundSession();
    @Method(selector = "setUserID:")
    public static native void setUserID(String userID);
    @Method(selector = "setAge:")
    public static native void setAge(int age);
    @Method(selector = "setGender:")
    public static native void setGender(String gender);
    @Method(selector = "trackPreciseLocation:")
    public static native boolean trackPreciseLocation(boolean state);
    @Deprecated
    @Method(selector = "setSessionReportsOnCloseEnabled:")
    public static native void setSessionReportsOnCloseEnabled(boolean sendSessionReportsOnClose);
    @Deprecated
    @Method(selector = "setSessionReportsOnPauseEnabled:")
    public static native void setSessionReportsOnPauseEnabled(boolean setSessionReportsOnPauseEnabled);
    @Method(selector = "setIAPReportingEnabled:")
    public static native void setIAPReportingEnabled(boolean value);
    @Method(selector = "addSessionOrigin:")
    public static native void addSessionOrigin(String sessionOriginName);
    @Method(selector = "addSessionOrigin:withDeepLink:")
    public static native void addSessionOrigin(String sessionOriginName, String deepLink);
    @Method(selector = "sessionProperties:")
    public static native void sessionProperties(NSDictionary<?, ?> parameters);
    @Method(selector = "addOrigin:withVersion:")
    public static native void addOrigin(String originName, String originVersion);
    @Method(selector = "addOrigin:withVersion:withParameters:")
    public static native void addOrigin(String originName, String originVersion, NSDictionary<?, ?> parameters);
    @Method(selector = "logEvent:")
    public static native FlurryEventRecordStatus logEvent(String eventName);
    @Method(selector = "logEvent:withParameters:")
    public static native FlurryEventRecordStatus logEvent(String eventName, NSDictionary<?, ?> parameters);
    @Method(selector = "logEvent:syndicationID:parameters:")
    public static native FlurryEventRecordStatus logEvent(FlurrySyndicationEvent syndicationEvent, String syndicationID, NSDictionary<?, ?> parameters);
    @Method(selector = "logPaymentTransaction:statusCallback:")
    public static native void logPaymentTransaction(SKPaymentTransaction transaction, @Block VoidBlock1<FlurryTransactionRecordStatus> statusCallback);
    /**
     * @deprecated use +logFlurryPaymentTransactionParamsWithTransactionId:productId:quantity:price:currency:productName:transactionState:userDefinedParams:statusCallback:
     */
    @Deprecated
    @Method(selector = "logPaymentTransactionParamsWithTransactionId:productId:quantity:price:currency:productName:transactionState:userDefinedParams:statusCallback:")
    public static native void logPaymentTransactionParams(String transactionId, String productId, String quantity, String price, String currency, String productName, String transactionState, NSDictionary<?, ?> transactionParams, @Block VoidBlock1<FlurryTransactionRecordStatus> statusCallback);
    @Method(selector = "logFlurryPaymentTransactionParamsWithTransactionId:productId:quantity:price:currency:productName:transactionState:userDefinedParams:statusCallback:")
    public static native void logFlurryPaymentTransactionParams(String transactionId, String productId, MachineSizedUIntPtr quantity, NSDecimalNumber price, String currency, String productName, FlurryPaymentTransactionState transactionState, NSDictionary<?, ?> transactionParams, @Block VoidBlock1<FlurryTransactionRecordStatus> statusCallback);
    @Method(selector = "logEvent:timed:")
    public static native FlurryEventRecordStatus logEvent(String eventName, boolean timed);
    @Method(selector = "logEvent:withParameters:timed:")
    public static native FlurryEventRecordStatus logEvent(String eventName, NSDictionary<?, ?> parameters, boolean timed);
    @Method(selector = "endTimedEvent:withParameters:")
    public static native void endTimedEvent(String eventName, NSDictionary<?, ?> parameters);
    @Method(selector = "logError:message:exception:")
    public static native void logError(String errorID, String message, NSException exception);
    @Method(selector = "logError:message:exception:withParameters:")
    public static native void logError(String errorID, String message, NSException exception, NSDictionary<?, ?> parameters);
    @Method(selector = "logError:message:error:")
    public static native void logError(String errorID, String message, NSError error);
    @Method(selector = "logError:message:error:withParameters:")
    public static native void logError(String errorID, String message, NSError error, NSDictionary<?, ?> parameters);
    @Method(selector = "leaveBreadcrumb:")
    public static native void leaveBreadcrumb(String breadcrumb);
    @Method(selector = "openPrivacyDashboard:")
    public static native void openPrivacyDashboard(@Block VoidBooleanBlock completionHandler);
    /*</methods>*/
}
