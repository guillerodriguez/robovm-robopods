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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSServiceAbstract/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MSService/*</implements>*/ {

    /*<ptr>*/public static class MSServiceAbstractPtr extends Ptr<MSServiceAbstract, MSServiceAbstractPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSServiceAbstract.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSServiceAbstract() {}
    protected MSServiceAbstract(Handle h, long handle) { super(h, handle); }
    protected MSServiceAbstract(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "startedFromApplication")
    public native boolean isStartedFromApplication();
    @Property(selector = "setStartedFromApplication:")
    public native void setStartedFromApplication(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "startWithChannelGroup:appSecret:transmissionTargetToken:fromApplication:")
    public native void start(NSObject channelGroup, String appSecret, String token, boolean fromApplication);
    @Method(selector = "updateConfigurationWithAppSecret:transmissionTargetToken:")
    public native void updateConfiguration(String appSecret, String token);
    @Method(selector = "isAppSecretRequired")
    public native boolean isAppSecretRequired();
    @Method(selector = "setEnabled:")
    public static native void setEnabled(boolean isEnabled);
    @Method(selector = "isEnabled")
    public static native boolean isEnabled();
    /*</methods>*/
}
