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
public enum /*<name>*/MSHTTPCodesNo/*</name>*/ implements ValuedEnum {
    /*<values>*/
    _0XXInvalidUnknown(0L),
    _1XXInformationalUnknown(1L),
    _100Continue(100L),
    _101SwitchingProtocols(101L),
    _102Processing(102L),
    _2XXSuccessUnknown(2L),
    _200OK(200L),
    _201Created(201L),
    _202Accepted(202L),
    _203NonAuthoritativeInformation(203L),
    _204NoContent(204L),
    _205ResetContent(205L),
    _206PartialContent(206L),
    _207MultiStatus(207L),
    _208AlreadyReported(208L),
    _209IMUsed(209L),
    _3XXSuccessUnknown(3L),
    _300MultipleChoices(300L),
    _301MovedPermanently(301L),
    _302Found(302L),
    _303SeeOther(303L),
    _304NotModified(304L),
    _305UseProxy(305L),
    _306SwitchProxy(306L),
    _307TemporaryRedirect(307L),
    _308PermanentRedirect(308L),
    _4XXSuccessUnknown(4L),
    _400BadRequest(400L),
    _401Unauthorised(401L),
    _402PaymentRequired(402L),
    _403Forbidden(403L),
    _404NotFound(404L),
    _405MethodNotAllowed(405L),
    _406NotAcceptable(406L),
    _407ProxyAuthenticationRequired(407L),
    _408RequestTimeout(408L),
    _409Conflict(409L),
    _410Gone(410L),
    _411LengthRequired(411L),
    _412PreconditionFailed(412L),
    _413RequestEntityTooLarge(413L),
    _414RequestURITooLong(414L),
    _415UnsupportedMediaType(415L),
    _416RequestedRangeNotSatisfiable(416L),
    _417ExpectationFailed(417L),
    _418IamATeapot(418L),
    _419AuthenticationTimeout(419L),
    _420MethodFailureSpringFramework(420L),
    _420EnhanceYourCalmTwitter(4200L),
    _422UnprocessableEntity(422L),
    _423Locked(423L),
    _424FailedDependency(424L),
    _424MethodFailureWebDaw(4240L),
    _425UnorderedCollection(425L),
    _426UpgradeRequired(426L),
    _428PreconditionRequired(428L),
    _429TooManyRequests(429L),
    _431RequestHeaderFieldsTooLarge(431L),
    _444NoResponseNginx(444L),
    _449RetryWithMicrosoft(449L),
    _450BlockedByWindowsParentalControls(450L),
    _451RedirectMicrosoft(451L),
    _451UnavailableForLegalReasons(4510L),
    _494RequestHeaderTooLargeNginx(494L),
    _495CertErrorNginx(495L),
    _496NoCertNginx(496L),
    _497HTTPToHTTPSNginx(497L),
    _499ClientClosedRequestNginx(499L),
    _5XXSuccessUnknown(5L),
    _500InternalServerError(500L),
    _501NotImplemented(501L),
    _502BadGateway(502L),
    _503ServiceUnavailable(503L),
    _504GatewayTimeout(504L),
    _505HTTPVersionNotSupported(505L),
    _506VariantAlsoNegotiates(506L),
    _507InsufficientStorage(507L),
    _508LoopDetected(508L),
    _509BandwidthLimitExceeded(509L),
    _510NotExtended(510L),
    _511NetworkAuthenticationRequired(511L),
    _522ConnectionTimedOut(522L),
    _598NetworkReadTimeoutErrorUnknown(598L),
    _599NetworkConnectTimeoutErrorUnknown(599L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MSHTTPCodesNo/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MSHTTPCodesNo/*</name>*/ valueOf(long n) {
        for (/*<name>*/MSHTTPCodesNo/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MSHTTPCodesNo/*</name>*/.class.getName());
    }
}
