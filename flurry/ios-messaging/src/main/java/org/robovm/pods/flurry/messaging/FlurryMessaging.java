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
package org.robovm.pods.flurry.messaging;

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
import org.robovm.apple.usernotifications.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FlurryMessaging/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FlurryMessagingPtr extends Ptr<FlurryMessaging, FlurryMessagingPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FlurryMessaging.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FlurryMessaging() {}
    protected FlurryMessaging(Handle h, long handle) { super(h, handle); }
    protected FlurryMessaging(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setDeviceToken:")
    public static native void setDeviceToken(NSData deviceToken);
    @Method(selector = "receivedRemoteNotification:withCompletionHandler:")
    public static native void receivedRemoteNotification(NSDictionary<?, ?> userInfo, @Block Runnable completionHandler);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "presentNotification:withCompletionHandler:")
    public static native void presentNotification(UNNotification notification, @Block Runnable completionHandler);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "receivedNotificationResponse:withCompletionHandler:")
    public static native void receivedNotificationResponse(UNNotificationResponse response, @Block Runnable completionHandler);
    @Method(selector = "isFlurryMsg:")
    public static native boolean isFlurryMsg(NSDictionary<?, ?> userInfo);
    @Method(selector = "setAutoIntegrationForMessaging")
    public static native void setAutoIntegrationForMessaging();
    @Method(selector = "setMessagingDelegate:")
    public static native void setMessagingDelegate(FlurryMessagingDelegate delegate);
    @Method(selector = "setMessagingDelegate:withCallbackQueue:")
    public static native void setMessagingDelegate(FlurryMessagingDelegate delegate, DispatchQueue messagingCallbackQueue);
    /*</methods>*/
}
