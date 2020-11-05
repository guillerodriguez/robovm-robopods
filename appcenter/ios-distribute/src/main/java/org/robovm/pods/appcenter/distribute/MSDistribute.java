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
package org.robovm.pods.appcenter.distribute;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSDistribute/*</name>*/ 
    extends /*<extends>*/MSServiceAbstract/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MSDistributePtr extends Ptr<MSDistribute, MSDistributePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSDistribute.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSDistribute() {}
    protected MSDistribute(Handle h, long handle) { super(h, handle); }
    protected MSDistribute(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "updateTrack")
    public static native MSUpdateTrack getUpdateTrack();
    @Property(selector = "setUpdateTrack:")
    public static native void setUpdateTrack(MSUpdateTrack v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setDelegate:")
    public static native void setDelegate(MSDistributeDelegate delegate);
    @Method(selector = "notifyUpdateAction:")
    public static native void notifyUpdateAction(MSUpdateAction action);
    @Method(selector = "setApiUrl:")
    public static native void setApiUrl(String apiUrl);
    @Method(selector = "setInstallUrl:")
    public static native void setInstallUrl(String installUrl);
    @Method(selector = "openURL:")
    public static native boolean openURL(NSURL url);
    @Method(selector = "disableAutomaticCheckForUpdate")
    public static native void disableAutomaticCheckForUpdate();
    @Method(selector = "checkForUpdate")
    public static native void checkForUpdate();
    /*</methods>*/
}
