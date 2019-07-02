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
package org.robovm.pods.applovinsdk;

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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALAdSize/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALAdSizePtr extends Ptr<ALAdSize, ALAdSizePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALAdSize.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ALAdSize() {}
    protected ALAdSize(Handle h, long handle) { super(h, handle); }
    protected ALAdSize(SkipInit skipInit) { super(skipInit); }
    /**
     * @deprecated Custom ad sizes are no longer supported; use an existing singleton size like [ALAdSize sizeBanner]
     */
    @Deprecated
    public ALAdSize(String label, ALAdSize defaultSize) { super((Handle) null, create(label, defaultSize)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "label")
    public native String getLabel();
    /**
     */
    @Deprecated
    @Property(selector = "width")
    public native @MachineSizedFloat double getWidth();
    /**
     */
    @Deprecated
    @Property(selector = "height")
    public native @MachineSizedFloat double getHeight();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "sizeBanner")
    public static native ALAdSize sizeBanner();
    @Method(selector = "sizeInterstitial")
    public static native ALAdSize sizeInterstitial();
    @Method(selector = "sizeNative")
    public static native ALAdSize sizeNative();
    @Method(selector = "sizeMRec")
    public static native ALAdSize sizeMRec();
    @Method(selector = "sizeLeader")
    public static native ALAdSize sizeLeader();
    /**
     * @deprecated Retrieval of all sizes is deprecated and will be removed in a future SDK version.
     */
    @Deprecated
    @Method(selector = "allSizes")
    public static native NSArray<?> allSizes();
    /**
     * @deprecated Custom ad sizes are no longer supported; use an existing singleton size like [ALAdSize sizeBanner]
     */
    @Deprecated
    @Method(selector = "sizeWithLabel:orDefault:")
    protected static native @Pointer long create(String label, ALAdSize defaultSize);
    /*</methods>*/
}
