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
package org.robovm.pods.appcenter.crashes;

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
import org.robovm.pods.appcenter.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSCrashes/*</name>*/ 
    extends /*<extends>*/MSServiceAbstract/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MSCrashesPtr extends Ptr<MSCrashes, MSCrashesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSCrashes.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSCrashes() {}
    protected MSCrashes(Handle h, long handle) { super(h, handle); }
    protected MSCrashes(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "generateTestCrash")
    public static native void generateTestCrash();
    @Method(selector = "hasCrashedInLastSession")
    public static native boolean hasCrashedInLastSession();
    @Method(selector = "hasReceivedMemoryWarningInLastSession")
    public static native boolean hasReceivedMemoryWarningInLastSession();
    @Method(selector = "lastSessionCrashReport")
    public static native MSErrorReport lastSessionCrashReport();
    @Method(selector = "disableMachExceptionHandler")
    public static native void disableMachExceptionHandler();
    @Method(selector = "setDelegate:")
    public static native void setDelegate(MSCrashesDelegate delegate);
    @Method(selector = "setUserConfirmationHandler:")
    public static native void setUserConfirmationHandler(@Block Block1<NSArray<MSErrorReport>, Boolean> userConfirmationHandler);
    @Method(selector = "notifyWithUserConfirmation:")
    public static native void notify(MSUserConfirmation userConfirmation);
    /*</methods>*/
}
