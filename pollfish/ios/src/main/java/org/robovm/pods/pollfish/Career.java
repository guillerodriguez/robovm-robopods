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
public enum /*<name>*/Career/*</name>*/ implements ValuedEnum {
    /*<values>*/
    AGRICULTURE_FORESTRY_FISHING_OR_HUNTING(0L),
    ARTS_ENTERTAINMENT_OR_RECREATION(1L),
    BROADCASTING(2L),
    CONSTRUCTION(3L),
    EDUCATION(4L),
    FINANCE_AND_INSURANCE(5L),
    GOVERNMENT_AND_PUBLIC_ADMINISTRATION(6L),
    HEALTH_CARE_AND_SOCIAL_ASSISTANCE(7L),
    HOMEMAKER_(8L),
    HOTEL_AND_FOOD_SERVICES(9L),
    INFORMATION_OTHER(10L),
    INFORMATION_SERVICES_AND_DATA(11L),
    LEGAL_SERVICES(12L),
    MANUFACTURING_COMPUTER_AND_ELECTRONICS(13L),
    MANUFACTURING_OTHER(14L),
    MILITARY_(15L),
    MINING(16L),
    PROCESSING(17L),
    PUBLISHING(18L),
    REAL_ESTATE_RENTAL_OR_LEASING(19L),
    RELIGIOUS(20L),
    RETAIL(21L),
    RETIRED_(22L),
    SCIENTIFIC_OR_TECHNICAL_SERVICES(23L),
    SOFTWARE(24L),
    STUDENT_(25L),
    TELECOMMUNICATIONS(26L),
    TRANSPORTATION_AND_WAREHOUSING(27L),
    UNEMPLOYED(28L),
    UTILITIES(29L),
    WHOLESALE(30L),
    OTHER_CAREER(31L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(Career.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    @Bridge(symbol="CAREER", optional=true)
    public native NSString asString();
    /*</methods>*/

    private final long n;

    private /*<name>*/Career/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/Career/*</name>*/ valueOf(long n) {
        for (/*<name>*/Career/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/Career/*</name>*/.class.getName());
    }
}
