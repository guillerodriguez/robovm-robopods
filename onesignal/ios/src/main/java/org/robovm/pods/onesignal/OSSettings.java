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
package org.robovm.pods.onesignal;

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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
@Marshaler(/*<name>*/OSSettings/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSSettings/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static OSSettings toObject(Class<OSSettings> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new OSSettings(o);
        }
        @MarshalsPointer
        public static long toNative(OSSettings o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<OSSettings> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<OSSettings> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new OSSettings(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<OSSettings> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (OSSettings i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    OSSettings(NSDictionary data) {
        super(data);
    }
    public OSSettings() {}
    /*</constructors>*/

    /*<methods>*/
    public boolean has(NSString key) {
        return data.containsKey(key);
    }
    public NSObject get(NSString key) {
        if (has(key)) {
            return data.get(key);
        }
        return null;
    }
    public OSSettings set(NSString key, NSObject value) {
        data.put(key, value);
        return this;
    }
    /*</methods>*/

    // manually added methods
    public OSSettings setAutoPrompt(boolean v) {
        this.set(Keys.AutoPrompt(), NSNumber.valueOf(v));
        return this;
    }

    public OSSettings setInAppAlerts(boolean v) {
        this.set(Keys.InAppAlerts(), NSNumber.valueOf(v));
        return this;
    }

    public OSSettings setInAppLaunchURL(boolean v) {
        this.set(Keys.InAppLaunchURL(), NSNumber.valueOf(v));
        return this;
    }

    public OSSettings setInFocusDisplayOption(OSNotificationDisplayType v) {
        this.set(Keys.InFocusDisplayOption(), NSNumber.valueOf(v.value()));
        return this;
    }

    /*<keys>*/
    @Library(Library.INTERNAL)
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="kOSSettingsKeyAutoPrompt", optional=true)
        public static native NSString AutoPrompt();
        @GlobalValue(symbol="kOSSettingsKeyInAppAlerts", optional=true)
        public static native NSString InAppAlerts();
        @GlobalValue(symbol="kOSSettingsKeyInAppLaunchURL", optional=true)
        public static native NSString InAppLaunchURL();
        @GlobalValue(symbol="kOSSSettingsKeyPromptBeforeOpeningPushURL", optional=true)
        public static native NSString PromptBeforeOpeningPushURL();
        @GlobalValue(symbol="kOSSettingsKeyInFocusDisplayOption", optional=true)
        public static native NSString InFocusDisplayOption();
        @GlobalValue(symbol="kOSSettingsKeyProvidesAppNotificationSettings", optional=true)
        public static native NSString ProvidesAppNotificationSettings();
    }
    /*</keys>*/
}
