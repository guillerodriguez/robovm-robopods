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
public enum /*<name>*/YearOfBirth/*</name>*/ implements ValuedEnum {
    /*<values>*/
    _1950(0L),
    _1951(1L),
    _1952(2L),
    _1953(3L),
    _1954(4L),
    _1955(5L),
    _1956(6L),
    _1957(7L),
    _1958(8L),
    _1959(9L),
    _1960(10L),
    _1961(11L),
    _1962(12L),
    _1963(13L),
    _1964(14L),
    _1965(15L),
    _1966(16L),
    _1967(17L),
    _1968(18L),
    _1969(19L),
    _1970(20L),
    _1971(21L),
    _1972(22L),
    _1973(23L),
    _1974(24L),
    _1975(25L),
    _1976(26L),
    _1977(27L),
    _1978(28L),
    _1979(29L),
    _1980(30L),
    _1981(31L),
    _1982(32L),
    _1983(33L),
    _1984(34L),
    _1985(35L),
    _1986(36L),
    _1987(37L),
    _1988(38L),
    _1989(39L),
    _1990(40L),
    _1991(41L),
    _1992(42L),
    _1993(43L),
    _1994(44L),
    _1995(45L),
    _1996(46L),
    _1997(47L),
    _1998(48L),
    _1999(49L),
    _2000(50L),
    _2001(51L),
    _2002(52L),
    _2003(53L),
    _2004(54L),
    _2005(55L),
    _2006(56L),
    _2007(57L),
    _2008(58L),
    _2009(59L),
    _2010(60L),
    _2011(61L),
    _2012(62L),
    _2013(63L),
    _2014(64L),
    _2015(65L),
    _2016(66L),
    _2017(67L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(YearOfBirth.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    @Bridge(symbol="YEAR_OF_BIRTH", optional=true)
    public native NSString asString();
    /*</methods>*/

    private final long n;

    private /*<name>*/YearOfBirth/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/YearOfBirth/*</name>*/ valueOf(long n) {
        for (/*<name>*/YearOfBirth/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/YearOfBirth/*</name>*/.class.getName());
    }
}
