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
package org.robovm.pods.firebase.dynamiclinks;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRDynamicLinkAndroidParameters/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRDynamicLinkAndroidParametersPtr extends Ptr<FIRDynamicLinkAndroidParameters, FIRDynamicLinkAndroidParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRDynamicLinkAndroidParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FIRDynamicLinkAndroidParameters() {}
    protected FIRDynamicLinkAndroidParameters(Handle h, long handle) { super(h, handle); }
    protected FIRDynamicLinkAndroidParameters(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPackageName:")
    public FIRDynamicLinkAndroidParameters(String packageName) { super((SkipInit) null); initObject(init(packageName)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "packageName")
    public native String getPackageName();
    @Property(selector = "fallbackURL")
    public native NSURL getFallbackURL();
    @Property(selector = "setFallbackURL:")
    public native void setFallbackURL(NSURL v);
    @Property(selector = "minimumVersion")
    public native @MachineSizedSInt long getMinimumVersion();
    @Property(selector = "setMinimumVersion:")
    public native void setMinimumVersion(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPackageName:")
    protected native @Pointer long init(String packageName);
    /*</methods>*/
}
