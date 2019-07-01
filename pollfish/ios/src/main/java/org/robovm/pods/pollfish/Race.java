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
public enum /*<name>*/Race/*</name>*/ implements ValuedEnum {
    /*<values>*/
    ARAB(0L),
    ASIAN(1L),
    BLACK(2L),
    WHITE(3L),
    HISPANIC(4L),
    LATINO(5L),
    MULTIRACIAL(6L),
    OTHER_RACE(7L),
    PREFER_NOT_TO_SAY_RACE(8L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(Race.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    @Bridge(symbol="RACE", optional=true)
    protected static native NSString asString0(Race race);
    /*</methods>*/

    public NSString asString() {
        return asString0(this);
    }

    private final long n;

    private /*<name>*/Race/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/Race/*</name>*/ valueOf(long n) {
        for (/*<name>*/Race/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/Race/*</name>*/.class.getName());
    }
}
