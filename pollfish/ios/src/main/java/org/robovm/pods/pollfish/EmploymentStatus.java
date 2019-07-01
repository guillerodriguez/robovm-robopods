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
public enum /*<name>*/EmploymentStatus/*</name>*/ implements ValuedEnum {
    /*<values>*/
    EMPLOYED_FOR_WAGES(0L),
    SELF_EMPLOYED(1L),
    UNEMPLOYED_LOOKING(2L),
    UNEMPLOYED_NOT_LOOKING(3L),
    HOMEMAKER(4L),
    STUDENT(5L),
    MILITARY(6L),
    RETIRED(7L),
    UNABLE_TO_WORK(8L),
    OTHER_STATUS(9L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(EmploymentStatus.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    @Bridge(symbol="EMPLOYMENT_STATUS", optional=true)
    public native NSString asString();
    /*</methods>*/

    private final long n;

    private /*<name>*/EmploymentStatus/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/EmploymentStatus/*</name>*/ valueOf(long n) {
        for (/*<name>*/EmploymentStatus/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/EmploymentStatus/*</name>*/.class.getName());
    }
}
