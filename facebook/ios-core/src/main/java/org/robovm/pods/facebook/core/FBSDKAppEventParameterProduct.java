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
@Marshaler(/*<name>*/FBSDKAppEventParameterProduct/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKAppEventParameterProduct/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/FBSDKAppEventParameterProduct/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static FBSDKAppEventParameterProduct toObject(Class<FBSDKAppEventParameterProduct> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return FBSDKAppEventParameterProduct.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(FBSDKAppEventParameterProduct o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<FBSDKAppEventParameterProduct> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<FBSDKAppEventParameterProduct> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(FBSDKAppEventParameterProduct.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<FBSDKAppEventParameterProduct> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (FBSDKAppEventParameterProduct o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final FBSDKAppEventParameterProduct Category = new FBSDKAppEventParameterProduct("Category");
    public static final FBSDKAppEventParameterProduct CustomLabel0 = new FBSDKAppEventParameterProduct("CustomLabel0");
    public static final FBSDKAppEventParameterProduct CustomLabel1 = new FBSDKAppEventParameterProduct("CustomLabel1");
    public static final FBSDKAppEventParameterProduct CustomLabel2 = new FBSDKAppEventParameterProduct("CustomLabel2");
    public static final FBSDKAppEventParameterProduct CustomLabel3 = new FBSDKAppEventParameterProduct("CustomLabel3");
    public static final FBSDKAppEventParameterProduct CustomLabel4 = new FBSDKAppEventParameterProduct("CustomLabel4");
    public static final FBSDKAppEventParameterProduct AppLinkIOSUrl = new FBSDKAppEventParameterProduct("AppLinkIOSUrl");
    public static final FBSDKAppEventParameterProduct AppLinkIOSAppStoreID = new FBSDKAppEventParameterProduct("AppLinkIOSAppStoreID");
    public static final FBSDKAppEventParameterProduct AppLinkIOSAppName = new FBSDKAppEventParameterProduct("AppLinkIOSAppName");
    public static final FBSDKAppEventParameterProduct AppLinkIPhoneUrl = new FBSDKAppEventParameterProduct("AppLinkIPhoneUrl");
    public static final FBSDKAppEventParameterProduct AppLinkIPhoneAppStoreID = new FBSDKAppEventParameterProduct("AppLinkIPhoneAppStoreID");
    public static final FBSDKAppEventParameterProduct AppLinkIPhoneAppName = new FBSDKAppEventParameterProduct("AppLinkIPhoneAppName");
    public static final FBSDKAppEventParameterProduct AppLinkIPadUrl = new FBSDKAppEventParameterProduct("AppLinkIPadUrl");
    public static final FBSDKAppEventParameterProduct AppLinkIPadAppStoreID = new FBSDKAppEventParameterProduct("AppLinkIPadAppStoreID");
    public static final FBSDKAppEventParameterProduct AppLinkIPadAppName = new FBSDKAppEventParameterProduct("AppLinkIPadAppName");
    public static final FBSDKAppEventParameterProduct AppLinkAndroidUrl = new FBSDKAppEventParameterProduct("AppLinkAndroidUrl");
    public static final FBSDKAppEventParameterProduct AppLinkAndroidPackage = new FBSDKAppEventParameterProduct("AppLinkAndroidPackage");
    public static final FBSDKAppEventParameterProduct AppLinkAndroidAppName = new FBSDKAppEventParameterProduct("AppLinkAndroidAppName");
    public static final FBSDKAppEventParameterProduct AppLinkWindowsPhoneUrl = new FBSDKAppEventParameterProduct("AppLinkWindowsPhoneUrl");
    public static final FBSDKAppEventParameterProduct AppLinkWindowsPhoneAppID = new FBSDKAppEventParameterProduct("AppLinkWindowsPhoneAppID");
    public static final FBSDKAppEventParameterProduct AppLinkWindowsPhoneAppName = new FBSDKAppEventParameterProduct("AppLinkWindowsPhoneAppName");
    /*</constants>*/
    
    private static /*<name>*/FBSDKAppEventParameterProduct/*</name>*/[] values = new /*<name>*/FBSDKAppEventParameterProduct/*</name>*/[] {/*<value_list>*/Category, CustomLabel0, CustomLabel1, CustomLabel2, CustomLabel3, CustomLabel4, AppLinkIOSUrl, AppLinkIOSAppStoreID, AppLinkIOSAppName, AppLinkIPhoneUrl, AppLinkIPhoneAppStoreID, AppLinkIPhoneAppName, AppLinkIPadUrl, AppLinkIPadAppStoreID, AppLinkIPadAppName, AppLinkAndroidUrl, AppLinkAndroidPackage, AppLinkAndroidAppName, AppLinkWindowsPhoneUrl, AppLinkWindowsPhoneAppID, AppLinkWindowsPhoneAppName/*</value_list>*/};
    
    /*<name>*/FBSDKAppEventParameterProduct/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/FBSDKAppEventParameterProduct/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/FBSDKAppEventParameterProduct/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/FBSDKAppEventParameterProduct/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="FBSDKAppEventParameterProductCategory", optional=true)
        public static native NSString Category();
        @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel0", optional=true)
        public static native NSString CustomLabel0();
        @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel1", optional=true)
        public static native NSString CustomLabel1();
        @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel2", optional=true)
        public static native NSString CustomLabel2();
        @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel3", optional=true)
        public static native NSString CustomLabel3();
        @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel4", optional=true)
        public static native NSString CustomLabel4();
        @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIOSUrl", optional=true)
        public static native NSString AppLinkIOSUrl();
        @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIOSAppStoreID", optional=true)
        public static native NSString AppLinkIOSAppStoreID();
        @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIOSAppName", optional=true)
        public static native NSString AppLinkIOSAppName();
        @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPhoneUrl", optional=true)
        public static native NSString AppLinkIPhoneUrl();
        @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPhoneAppStoreID", optional=true)
        public static native NSString AppLinkIPhoneAppStoreID();
        @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPhoneAppName", optional=true)
        public static native NSString AppLinkIPhoneAppName();
        @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPadUrl", optional=true)
        public static native NSString AppLinkIPadUrl();
        @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPadAppStoreID", optional=true)
        public static native NSString AppLinkIPadAppStoreID();
        @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPadAppName", optional=true)
        public static native NSString AppLinkIPadAppName();
        @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkAndroidUrl", optional=true)
        public static native NSString AppLinkAndroidUrl();
        @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkAndroidPackage", optional=true)
        public static native NSString AppLinkAndroidPackage();
        @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkAndroidAppName", optional=true)
        public static native NSString AppLinkAndroidAppName();
        @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkWindowsPhoneUrl", optional=true)
        public static native NSString AppLinkWindowsPhoneUrl();
        @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkWindowsPhoneAppID", optional=true)
        public static native NSString AppLinkWindowsPhoneAppID();
        @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkWindowsPhoneAppName", optional=true)
        public static native NSString AppLinkWindowsPhoneAppName();
        /*</values>*/
    }
}
