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
package org.robovm.pods.appcenter.core;

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
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/MSACHTTPCodesNo/*</name>*/ implements ValuedEnum {
    /*<values>*/
    No0XXInvalidUnknown(0L),
    No1XXInformationalUnknown(1L),
    No100Continue(100L),
    No101SwitchingProtocols(101L),
    No102Processing(102L),
    No2XXSuccessUnknown(2L),
    No200OK(200L),
    No201Created(201L),
    No202Accepted(202L),
    No203NonAuthoritativeInformation(203L),
    No204NoContent(204L),
    No205ResetContent(205L),
    No206PartialContent(206L),
    No207MultiStatus(207L),
    No208AlreadyReported(208L),
    No209IMUsed(209L),
    No3XXSuccessUnknown(3L),
    No300MultipleChoices(300L),
    No301MovedPermanently(301L),
    No302Found(302L),
    No303SeeOther(303L),
    No304NotModified(304L),
    No305UseProxy(305L),
    No306SwitchProxy(306L),
    No307TemporaryRedirect(307L),
    No308PermanentRedirect(308L),
    No4XXSuccessUnknown(4L),
    No400BadRequest(400L),
    No401Unauthorised(401L),
    No402PaymentRequired(402L),
    No403Forbidden(403L),
    No404NotFound(404L),
    No405MethodNotAllowed(405L),
    No406NotAcceptable(406L),
    No407ProxyAuthenticationRequired(407L),
    No408RequestTimeout(408L),
    No409Conflict(409L),
    No410Gone(410L),
    No411LengthRequired(411L),
    No412PreconditionFailed(412L),
    No413RequestEntityTooLarge(413L),
    No414RequestURITooLong(414L),
    No415UnsupportedMediaType(415L),
    No416RequestedRangeNotSatisfiable(416L),
    No417ExpectationFailed(417L),
    No418IamATeapot(418L),
    No419AuthenticationTimeout(419L),
    No420MethodFailureSpringFramework(420L),
    No420EnhanceYourCalmTwitter(4200L),
    No422UnprocessableEntity(422L),
    No423Locked(423L),
    No424FailedDependency(424L),
    No424MethodFailureWebDaw(4240L),
    No425UnorderedCollection(425L),
    No426UpgradeRequired(426L),
    No428PreconditionRequired(428L),
    No429TooManyRequests(429L),
    No431RequestHeaderFieldsTooLarge(431L),
    No444NoResponseNginx(444L),
    No449RetryWithMicrosoft(449L),
    No450BlockedByWindowsParentalControls(450L),
    No451RedirectMicrosoft(451L),
    No451UnavailableForLegalReasons(4510L),
    No494RequestHeaderTooLargeNginx(494L),
    No495CertErrorNginx(495L),
    No496NoCertNginx(496L),
    No497HTTPToHTTPSNginx(497L),
    No499ClientClosedRequestNginx(499L),
    No5XXSuccessUnknown(5L),
    No500InternalServerError(500L),
    No501NotImplemented(501L),
    No502BadGateway(502L),
    No503ServiceUnavailable(503L),
    No504GatewayTimeout(504L),
    No505HTTPVersionNotSupported(505L),
    No506VariantAlsoNegotiates(506L),
    No507InsufficientStorage(507L),
    No508LoopDetected(508L),
    No509BandwidthLimitExceeded(509L),
    No510NotExtended(510L),
    No511NetworkAuthenticationRequired(511L),
    No522ConnectionTimedOut(522L),
    No598NetworkReadTimeoutErrorUnknown(598L),
    No599NetworkConnectTimeoutErrorUnknown(599L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MSACHTTPCodesNo/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MSACHTTPCodesNo/*</name>*/ valueOf(long n) {
        for (/*<name>*/MSACHTTPCodesNo/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MSACHTTPCodesNo/*</name>*/.class.getName());
    }
}
