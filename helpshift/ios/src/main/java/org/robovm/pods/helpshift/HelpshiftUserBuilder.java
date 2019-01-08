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
package org.robovm.pods.helpshift;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HelpshiftUserBuilder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HelpshiftUserBuilderPtr extends Ptr<HelpshiftUserBuilder, HelpshiftUserBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HelpshiftUserBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HelpshiftUserBuilder() {}
    protected HelpshiftUserBuilder(Handle h, long handle) { super(h, handle); }
    protected HelpshiftUserBuilder(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:andEmail:")
    public HelpshiftUserBuilder(String identifier, String email) { super((SkipInit) null); initObject(init(identifier, email)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "email")
    public native String getEmail();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "authToken")
    public native String getAuthToken();
    @Property(selector = "setAuthToken:")
    public native void setAuthToken(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:andEmail:")
    protected native @Pointer long init(String identifier, String email);
    @Method(selector = "build")
    public native HelpshiftUser build();
    /*</methods>*/
}
