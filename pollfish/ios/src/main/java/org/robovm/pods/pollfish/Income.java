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
public enum /*<name>*/Income/*</name>*/ implements ValuedEnum {
    /*<values>*/
    LOWER_I(0L),
    LOWER_II(1L),
    MIDDLE_I(2L),
    MIDDLE_II(3L),
    HIGH_I(4L),
    HIGH_II(5L),
    HIGH_III(6L),
    PREFER_NOT_TO_SAY_INCOME(7L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(Income.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    @Bridge(symbol="INCOME", optional=true)
    public native NSString asString();
    /*</methods>*/

    private final long n;

    private /*<name>*/Income/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/Income/*</name>*/ valueOf(long n) {
        for (/*<name>*/Income/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/Income/*</name>*/.class.getName());
    }
}