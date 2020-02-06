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
public enum /*<name>*/NumberOfEmployees/*</name>*/ implements ValuedEnum {
    /*<values>*/
    ONE_EMPLOYEE(0L),
    TWO_TO_FIVE(1L),
    SIX_TO_TEN(2L),
    ELEVEN_TO_TWENTY_FIVE(3L),
    TWENTY_SIX_TO_FIFTY(4L),
    FIFTY_ONE_TO_HUNDREND(5L),
    HUNDREND_ONE_TO_TWO_HUNDRENDS_FIFTY(6L),
    TWO_HUNDRENDS_FIFTY_ONE_TO_FIVE_HUNDRENDS(7L),
    FIVE_HUNDRENDS_ONE_TO_THOUSAND(8L),
    THOUSAND_ONE_TO_FIVE_THOUSANDS(9L),
    GREATER_THAN_FIVE_THOUSANDS(10L),
    DO_NOT_WORK(11L),
    PREFER_NOTTO_SAY(12L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(NumberOfEmployees.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    @Bridge(symbol="NUMBER_OF_EMPLOYEES", optional=true)
    protected static native NSString asString0(NumberOfEmployees number_of_employees);
    /*</methods>*/

    public NSString asString() {
        return asString0(this);
    }

    private final long n;

    private /*<name>*/NumberOfEmployees/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/NumberOfEmployees/*</name>*/ valueOf(long n) {
        for (/*<name>*/NumberOfEmployees/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/NumberOfEmployees/*</name>*/.class.getName());
    }
}
