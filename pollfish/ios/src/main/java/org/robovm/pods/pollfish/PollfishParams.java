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
package org.robovm.pods.pollfish;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PollfishParams/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PollfishParamsPtr extends Ptr<PollfishParams, PollfishParamsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PollfishParams.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PollfishParams() {}
    protected PollfishParams(Handle h, long handle) { super(h, handle); }
    protected PollfishParams(SkipInit skipInit) { super(skipInit); }
    public PollfishParams(@Block VoidBlock1<PollfishParams> block) { super((Handle) null, create(block)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "indicatorPosition")
    public native PollfishPosition getIndicatorPosition();
    @Property(selector = "setIndicatorPosition:")
    public native void setIndicatorPosition(PollfishPosition v);
    @Property(selector = "indicatorPadding")
    public native int getIndicatorPadding();
    @Property(selector = "setIndicatorPadding:")
    public native void setIndicatorPadding(int v);
    @Property(selector = "surveyFormat")
    public native SurveyFormat getSurveyFormat();
    @Property(selector = "setSurveyFormat:")
    public native void setSurveyFormat(SurveyFormat v);
    @Property(selector = "releaseMode")
    public native boolean isReleaseMode();
    @Property(selector = "setReleaseMode:")
    public native void setReleaseMode(boolean v);
    @Property(selector = "rewardMode")
    public native boolean isRewardMode();
    @Property(selector = "setRewardMode:")
    public native void setRewardMode(boolean v);
    @Property(selector = "offerwallMode")
    public native boolean isOfferwallMode();
    @Property(selector = "setOfferwallMode:")
    public native void setOfferwallMode(boolean v);
    @Property(selector = "requestUUID")
    public native String getRequestUUID();
    @Property(selector = "setRequestUUID:")
    public native void setRequestUUID(String v);
    @Property(selector = "pollfishViewContainer")
    public native UIView getPollfishViewContainer();
    @Property(selector = "setPollfishViewContainer:")
    public native void setPollfishViewContainer(UIView v);
    @Property(selector = "userAttributes")
    public native NSMutableDictionary<?, ?> getUserAttributes();
    @Property(selector = "setUserAttributes:")
    public native void setUserAttributes(NSMutableDictionary<?, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWith:")
    protected static native @Pointer long create(@Block VoidBlock1<PollfishParams> block);
    /*</methods>*/
}
