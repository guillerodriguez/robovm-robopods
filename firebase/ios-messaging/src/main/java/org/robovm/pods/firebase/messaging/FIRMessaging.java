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
package org.robovm.pods.firebase.messaging;

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
import org.robovm.apple.usernotifications.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRMessaging/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRMessagingPtr extends Ptr<FIRMessaging, FIRMessagingPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRMessaging.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRMessaging() {}
    protected FIRMessaging(Handle h, long handle) { super(h, handle); }
    protected FIRMessaging(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native FIRMessagingDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FIRMessagingDelegate v);
    /**
     * @deprecated FCM direct channel is deprecated, please use APNs channel for downstream message delivery.
     */
    @Deprecated
    @Property(selector = "shouldEstablishDirectChannel")
    public native boolean shouldEstablishDirectChannel();
    /**
     * @deprecated FCM direct channel is deprecated, please use APNs channel for downstream message delivery.
     */
    @Deprecated
    @Property(selector = "setShouldEstablishDirectChannel:")
    public native void setShouldEstablishDirectChannel(boolean v);
    /**
     * @deprecated FCM direct channel is deprecated, please use APNs channel for downstream message delivery.
     */
    @Deprecated
    @Property(selector = "isDirectChannelEstablished")
    public native boolean isDirectChannelEstablished();
    @Property(selector = "APNSToken")
    public native NSData getAPNSToken();
    @Property(selector = "setAPNSToken:")
    public native void setAPNSToken(NSData v);
    @Property(selector = "isAutoInitEnabled")
    public native boolean isAutoInitEnabled();
    @Property(selector = "setAutoInitEnabled:")
    public native void setAutoInitEnabled(boolean v);
    @Property(selector = "FCMToken")
    public native String getFCMToken();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library(Library.INTERNAL)
    public static class Notifications {
        static { Bro.bind(Notifications.class); }

        @Deprecated
        @GlobalValue(symbol="FIRMessagingSendSuccessNotification", optional=true)
        public static native NSString SendSuccess();
        @Deprecated
        @GlobalValue(symbol="FIRMessagingSendErrorNotification", optional=true)
        public static native NSString SendError();
        @Deprecated
        @GlobalValue(symbol="FIRMessagingMessagesDeletedNotification", optional=true)
        public static native NSString MessagesDeleted();
        @Deprecated
        @GlobalValue(symbol="FIRMessagingConnectionStateChangedNotification", optional=true)
        public static native NSString ConnectionStateChanged();
        @GlobalValue(symbol="FIRMessagingRegistrationTokenRefreshedNotification", optional=true)
        public static native NSString RegistrationTokenRefreshed();
    }
    
    @Method(selector = "setAPNSToken:type:")
    public native void setAPNSToken(NSData apnsToken, FIRMessagingAPNSTokenType type);
    @Method(selector = "retrieveFCMTokenForSenderID:completion:")
    public native void retrieveFCMToken(String senderID, @Block VoidBlock2<NSString, NSError> completion);
    @Method(selector = "deleteFCMTokenForSenderID:completion:")
    public native void deleteFCMToken(String senderID, @Block VoidBlock1<NSError> completion);
    @Method(selector = "subscribeToTopic:")
    public native void subscribeToTopic(String topic);
    @Method(selector = "subscribeToTopic:completion:")
    public native void subscribeToTopic(String topic, @Block VoidBlock1<NSError> completion);
    @Method(selector = "unsubscribeFromTopic:")
    public native void unsubscribeFromTopic(String topic);
    @Method(selector = "unsubscribeFromTopic:completion:")
    public native void unsubscribeFromTopic(String topic, @Block VoidBlock1<NSError> completion);
    /**
     * @deprecated Upstream messaging through direct channel is deprecated. For realtime updates, use Cloud Firestore, Realtime Database, or other services.
     */
    @Deprecated
    @Method(selector = "sendMessage:to:withMessageID:timeToLive:")
    public native void sendMessage(NSDictionary<?, ?> message, String receiver, String messageID, long ttl);
    @Method(selector = "appDidReceiveMessage:")
    public native FIRMessagingMessageInfo appDidReceiveMessage(NSDictionary<?, ?> message);
    @Method(selector = "messaging")
    public static native FIRMessaging messaging();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "extensionHelper")
    public static native FIRMessagingExtensionHelper extensionHelper();
    /*</methods>*/
}
