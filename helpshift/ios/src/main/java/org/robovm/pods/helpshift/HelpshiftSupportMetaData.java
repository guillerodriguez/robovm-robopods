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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HelpshiftSupportMetaData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HelpshiftSupportMetaDataPtr extends Ptr<HelpshiftSupportMetaData, HelpshiftSupportMetaDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HelpshiftSupportMetaData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HelpshiftSupportMetaData() {}
    protected HelpshiftSupportMetaData(Handle h, long handle) { super(h, handle); }
    protected HelpshiftSupportMetaData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMetaData:")
    public HelpshiftSupportMetaData(NSDictionary<?, ?> metaData) { super((SkipInit) null); initObject(init(metaData)); }
    @Method(selector = "initWithMetaData:andTags:")
    public HelpshiftSupportMetaData(NSDictionary<?, ?> metaData, NSArray<?> tags) { super((SkipInit) null); initObject(init(metaData, tags)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "metaData")
    public native NSDictionary<?, ?> getMetaData();
    @Property(selector = "issueTags")
    public native NSArray<?> getIssueTags();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMetaData:")
    protected native @Pointer long init(NSDictionary<?, ?> metaData);
    @Method(selector = "initWithMetaData:andTags:")
    protected native @Pointer long init(NSDictionary<?, ?> metaData, NSArray<?> tags);
    /*</methods>*/
}
