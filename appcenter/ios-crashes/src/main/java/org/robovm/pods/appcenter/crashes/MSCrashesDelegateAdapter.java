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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSCrashesDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MSCrashesDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("crashes:shouldProcessErrorReport:")
    public boolean shouldProcessErrorReport(MSCrashes crashes, MSErrorReport errorReport) { return false; }
    @NotImplemented("crashes:willSendErrorReport:")
    public void willSendErrorReport(MSCrashes crashes, MSErrorReport errorReport) {}
    @NotImplemented("crashes:didSucceedSendingErrorReport:")
    public void didSucceedSendingErrorReport(MSCrashes crashes, MSErrorReport errorReport) {}
    @NotImplemented("crashes:didFailSendingErrorReport:withError:")
    public void didFailSendingErrorReport(MSCrashes crashes, MSErrorReport errorReport, NSError error) {}
    @NotImplemented("attachmentsWithCrashes:forErrorReport:")
    public NSArray<MSErrorAttachmentLog> getAttachments(MSCrashes crashes, MSErrorReport errorReport) { return null; }
    /*</methods>*/
}
