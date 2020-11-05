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
import org.robovm.pods.appcenter.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSReleaseDetails/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MSReleaseDetailsPtr extends Ptr<MSReleaseDetails, MSReleaseDetailsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSReleaseDetails.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSReleaseDetails() {}
    protected MSReleaseDetails(Handle h, long handle) { super(h, handle); }
    protected MSReleaseDetails(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "id")
    public native NSNumber getId();
    @Property(selector = "setId:")
    public native void setId(NSNumber v);
    @Property(selector = "version")
    public native String getVersion();
    @Property(selector = "setVersion:")
    public native void setVersion(String v);
    @Property(selector = "shortVersion")
    public native String getShortVersion();
    @Property(selector = "setShortVersion:")
    public native void setShortVersion(String v);
    @Property(selector = "releaseNotes")
    public native String getReleaseNotes();
    @Property(selector = "setReleaseNotes:")
    public native void setReleaseNotes(String v);
    @Property(selector = "isMandatoryUpdate")
    public native boolean isMandatoryUpdate();
    @Property(selector = "setMandatoryUpdate:")
    public native void setMandatoryUpdate(boolean v);
    @Property(selector = "releaseNotesUrl")
    public native NSURL getReleaseNotesUrl();
    @Property(selector = "setReleaseNotesUrl:")
    public native void setReleaseNotesUrl(NSURL v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
