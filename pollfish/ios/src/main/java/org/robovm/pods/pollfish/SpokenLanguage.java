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
package org.robovm.pods.pollfish;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
public enum /*<name>*/SpokenLanguage/*</name>*/ implements ValuedEnum {
    /*<values>*/
    ENGLISH(0L),
    ARABIC(1L),
    BULGARIAN(2L),
    CHINESE(3L),
    CZECH(4L),
    DANISH(5L),
    DUTCH(6L),
    FILIPINO(7L),
    THAI(8L),
    FINNISH(9L),
    FRENCH(10L),
    GERMAN(11L),
    GREEK(12L),
    HINDI(13L),
    INDONESIAN(14L),
    ITALIAN(15L),
    JAPANESE(16L),
    POLISH(17L),
    PORTUGUESE(18L),
    ROMANIAN(19L),
    RUSSIAN(20L),
    SERBIAN(21L),
    SPANISH(22L),
    SWEDISH(23L),
    TURKISH(24L),
    VIETNAMESE(25L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(SpokenLanguage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    @Bridge(symbol="SPOKEN_LANGUAGE", optional=true)
    protected static native NSString asString0(SpokenLanguage spoken_language);
    /*</methods>*/

    public NSString asString() {
        return asString0(this);
    }

    private final long n;

    private /*<name>*/SpokenLanguage/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/SpokenLanguage/*</name>*/ valueOf(long n) {
        for (/*<name>*/SpokenLanguage/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/SpokenLanguage/*</name>*/.class.getName());
    }
}
