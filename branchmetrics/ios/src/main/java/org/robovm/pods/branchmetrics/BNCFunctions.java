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
package org.robovm.pods.branchmetrics;

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
import org.robovm.apple.corespotlight.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BNCFunctions/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(BNCFunctions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="BNCURLForBranchDirectory", optional=true)
    public static native NSURL uRLForBranchDirectory();
    @Bridge(symbol="BNCProductCategoryAllCategories", optional=true)
    public static native NSArray<NSString> productCategoryAllCategories();
    @Bridge(symbol="BNCCurrencyAllCurrencies", optional=true)
    public static native NSArray<NSString> currencyAllCurrencies();
    @Bridge(symbol="BNCDebuggerIsAttached", optional=true)
    public static native boolean debuggerIsAttached();
    @Bridge(symbol="BNCDebugStringFromObject", optional=true)
    public static native String debugStringFromObject(NSObject object);
    @Bridge(symbol="BNCDebugArrayOfReqisteredClasses", optional=true)
    public static native NSArray<NSString> debugArrayOfReqisteredClasses();
    @Bridge(symbol="BNCForceNSErrorCategoryToLoad", optional=true)
    public static native void forceNSErrorCategoryToLoad();
    @Bridge(symbol="BNCLogInitialize", optional=true)
    public static native void logInitialize();
    @Bridge(symbol="BNCLogDisplayLevel", optional=true)
    public static native BNCLogLevel logDisplayLevel();
    @Bridge(symbol="BNCLogSetDisplayLevel", optional=true)
    public static native void logSetDisplayLevel(BNCLogLevel level);
    @Bridge(symbol="BNCLogStringFromLogLevel", optional=true)
    public static native String logStringFromLogLevel(BNCLogLevel level);
    @Bridge(symbol="BNCLogLevelFromString", optional=true)
    public static native BNCLogLevel logLevelFromString(String string);
    @Bridge(symbol="BNCLogBreakPointsAreEnabled", optional=true)
    public static native boolean logBreakPointsAreEnabled();
    @Bridge(symbol="BNCLogSetBreakPointsEnabled", optional=true)
    public static native void logSetBreakPointsEnabled(boolean enabled);
    @Bridge(symbol="BNCLogSetClientInitializeFunction", optional=true)
    public static native FunctionPtr logSetClientInitializeFunction(FunctionPtr clientInitializationFunction);
    @Bridge(symbol="BNCLogFunctionOutputToStdOut", optional=true)
    public static native void logFunctionOutputToStdOut(NSDate timestamp, BNCLogLevel level, String message);
    @Bridge(symbol="BNCLogFunctionOutputToStdErr", optional=true)
    public static native void logFunctionOutputToStdErr(NSDate timestamp, BNCLogLevel level, String message);
    @Bridge(symbol="BNCLogSetOutputFunction", optional=true)
    public static native void logSetOutputFunction(FunctionPtr functionPtr);
    @Bridge(symbol="BNCLogOutputFunction", optional=true)
    public static native FunctionPtr logOutputFunction();
    @Bridge(symbol="BNCLogCloseLogFile", optional=true)
    public static native void logCloseLogFile();
    @Bridge(symbol="BNCLogSetOutputToURL", optional=true)
    public static native void logSetOutputToURL(NSURL URL);
    @Bridge(symbol="BNCLogSetOutputToURLRecordWrap", optional=true)
    public static native void logSetOutputToURLRecordWrap(NSURL URL, @MachineSizedSInt long maxRecords);
    @Bridge(symbol="BNCLogSetOutputToURLByteWrap", optional=true)
    public static native void logSetOutputToURLByteWrap(NSURL URL, @MachineSizedSInt long maxBytes);
    @Bridge(symbol="BNCLogSetFlushFunction", optional=true)
    public static native void logSetFlushFunction(FunctionPtr flushFunction);
    @Bridge(symbol="BNCLogFlushFunction", optional=true)
    public static native FunctionPtr logFlushFunction();
    @Bridge(symbol="BNCLogWriteMessage", optional=true)
    public static native void logWriteMessage(BNCLogLevel logLevel, String sourceFileName, int sourceLineNumber, String message);
    @Bridge(symbol="BNCLogFlushMessages", optional=true)
    public static native void logFlushMessages();
    @Bridge(symbol="BNCForceUIViewControllerCategoryToLoad", optional=true)
    public static native void forceUIViewControllerCategoryToLoad();
    /*</methods>*/
}
