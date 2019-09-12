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
package org.robovm.pods.facebook.core;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/FBSDKAppEventUserDataType/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKAppEventUserDataType/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/FBSDKAppEventUserDataType/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static FBSDKAppEventUserDataType toObject(Class<FBSDKAppEventUserDataType> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return FBSDKAppEventUserDataType.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(FBSDKAppEventUserDataType o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<FBSDKAppEventUserDataType> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<FBSDKAppEventUserDataType> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(FBSDKAppEventUserDataType.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<FBSDKAppEventUserDataType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (FBSDKAppEventUserDataType o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final FBSDKAppEventUserDataType EventEmail = new FBSDKAppEventUserDataType("EventEmail");
    public static final FBSDKAppEventUserDataType EventFirstName = new FBSDKAppEventUserDataType("EventFirstName");
    public static final FBSDKAppEventUserDataType EventLastName = new FBSDKAppEventUserDataType("EventLastName");
    public static final FBSDKAppEventUserDataType EventPhone = new FBSDKAppEventUserDataType("EventPhone");
    public static final FBSDKAppEventUserDataType EventDateOfBirth = new FBSDKAppEventUserDataType("EventDateOfBirth");
    public static final FBSDKAppEventUserDataType EventGender = new FBSDKAppEventUserDataType("EventGender");
    public static final FBSDKAppEventUserDataType EventCity = new FBSDKAppEventUserDataType("EventCity");
    public static final FBSDKAppEventUserDataType EventState = new FBSDKAppEventUserDataType("EventState");
    public static final FBSDKAppEventUserDataType EventZip = new FBSDKAppEventUserDataType("EventZip");
    public static final FBSDKAppEventUserDataType EventCountry = new FBSDKAppEventUserDataType("EventCountry");
    /*</constants>*/
    
    private static /*<name>*/FBSDKAppEventUserDataType/*</name>*/[] values = new /*<name>*/FBSDKAppEventUserDataType/*</name>*/[] {/*<value_list>*/EventEmail, EventFirstName, EventLastName, EventPhone, EventDateOfBirth, EventGender, EventCity, EventState, EventZip, EventCountry/*</value_list>*/};
    
    /*<name>*/FBSDKAppEventUserDataType/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/FBSDKAppEventUserDataType/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/FBSDKAppEventUserDataType/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/FBSDKAppEventUserDataType/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="FBSDKAppEventEmail", optional=true)
        public static native NSString EventEmail();
        @GlobalValue(symbol="FBSDKAppEventFirstName", optional=true)
        public static native NSString EventFirstName();
        @GlobalValue(symbol="FBSDKAppEventLastName", optional=true)
        public static native NSString EventLastName();
        @GlobalValue(symbol="FBSDKAppEventPhone", optional=true)
        public static native NSString EventPhone();
        @GlobalValue(symbol="FBSDKAppEventDateOfBirth", optional=true)
        public static native NSString EventDateOfBirth();
        @GlobalValue(symbol="FBSDKAppEventGender", optional=true)
        public static native NSString EventGender();
        @GlobalValue(symbol="FBSDKAppEventCity", optional=true)
        public static native NSString EventCity();
        @GlobalValue(symbol="FBSDKAppEventState", optional=true)
        public static native NSString EventState();
        @GlobalValue(symbol="FBSDKAppEventZip", optional=true)
        public static native NSString EventZip();
        @GlobalValue(symbol="FBSDKAppEventCountry", optional=true)
        public static native NSString EventCountry();
        /*</values>*/
    }
}
