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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSWrapperCrashesHelper/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MSWrapperCrashesHelperPtr extends Ptr<MSWrapperCrashesHelper, MSWrapperCrashesHelperPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSWrapperCrashesHelper.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSWrapperCrashesHelper() {}
    protected MSWrapperCrashesHelper(Handle h, long handle) { super(h, handle); }
    protected MSWrapperCrashesHelper(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setCrashHandlerSetupDelegate:")
    public static native void setCrashHandlerSetupDelegate(MSCrashHandlerSetupDelegate delegate);
    @Method(selector = "getCrashHandlerSetupDelegate")
    public static native MSCrashHandlerSetupDelegate getCrashHandlerSetupDelegate();
    @Method(selector = "setAutomaticProcessing:")
    public static native void setAutomaticProcessing(boolean automaticProcessing);
    @Method(selector = "unprocessedCrashReports")
    public static native NSArray<MSErrorReport> unprocessedCrashReports();
    @Method(selector = "sendCrashReportsOrAwaitUserConfirmationForFilteredIds:")
    public static native boolean sendCrashReportsOrAwaitUserConfirmationForFilteredIds(NSArray<NSString> filteredIds);
    @Method(selector = "sendErrorAttachments:withIncidentIdentifier:")
    public static native void sendErrorAttachments(NSArray<MSErrorAttachmentLog> errorAttachments, String incidentIdentifier);
    @Method(selector = "trackModelException:withProperties:withAttachments:")
    public static native String trackModelException(NSObject exception, NSDictionary<NSString, NSString> properties, NSArray<MSErrorAttachmentLog> attachments);
    @Method(selector = "buildHandledErrorReportWithErrorID:")
    public static native MSErrorReport buildHandledErrorReport(String errorID);
    /*</methods>*/
}
