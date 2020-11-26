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
package org.robovm.pods.appcenter.analytics;

/*<imports>*/
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSAnalyticsAuthenticationProvider/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MSAnalyticsAuthenticationProviderPtr extends Ptr<MSAnalyticsAuthenticationProvider, MSAnalyticsAuthenticationProviderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSAnalyticsAuthenticationProvider.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSAnalyticsAuthenticationProvider() {}
    protected MSAnalyticsAuthenticationProvider(Handle h, long handle) { super(h, handle); }
    protected MSAnalyticsAuthenticationProvider(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAuthenticationType:ticketKey:delegate:")
    public MSAnalyticsAuthenticationProvider(MSACAnalyticsAuthenticationType type, String ticketKey, MSAnalyticsAuthenticationProviderDelegate delegate) { super((SkipInit) null); initObject(init(type, ticketKey, delegate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "type")
    public native MSACAnalyticsAuthenticationType getType();
    @Property(selector = "ticketKey")
    public native String getTicketKey();
    @Property(selector = "ticketKeyHash")
    public native String getTicketKeyHash();
    @Property(selector = "delegate")
    public native MSAnalyticsAuthenticationProviderDelegate getDelegate();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAuthenticationType:ticketKey:delegate:")
    protected native @Pointer long init(MSACAnalyticsAuthenticationType type, String ticketKey, MSAnalyticsAuthenticationProviderDelegate delegate);
    @Method(selector = "checkTokenExpiry")
    public native void checkTokenExpiry();
    /*</methods>*/
}
