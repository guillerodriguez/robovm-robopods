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
public enum /*<name>*/OrganizationRole/*</name>*/ implements ValuedEnum {
    /*<values>*/
    OWNER_PARTNER(0L),
    PRESIDENT_CEO_CHAIRPERSON(1L),
    C_LEVEL_EXECUTIVE(2L),
    MIDDLE_MANAGEMENT(3L),
    CHIEF_FINANCIAL_OFFICER(4L),
    CHIEF_TECHNICAL_OFFICER(5L),
    SENIOR_MANAGEMENT(6L),
    DIRECTOR(7L),
    HR_MANAGER(8L),
    PRODUCT_MANAGER(9L),
    SUPPLY_MANAGER(10L),
    PROJECT_MANAGEMENT(11L),
    SALES_MANAGER(12L),
    BUSINESS_ADMINISTRATOR(13L),
    SUPERVISOR(14L),
    ADMINISTRATIVE_CLERICAL(15L),
    CRAFTSMAN(16L),
    FOREMAN(17L),
    TECHNICAL_STAFF(18L),
    FACULTY_STAFF(19L),
    SALES_STAFF(20L),
    BUYER_PURCHASING_AGENT(21L),
    OTHER_NON_MANAGEMENT(22L),
    NOT_WORK(23L),
    PREFER_NOT_TOSAY(24L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(OrganizationRole.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    @Bridge(symbol="ORGANIZATION_ROLE", optional=true)
    protected static native NSString asString0(OrganizationRole organization_role);
    /*</methods>*/

    public NSString asString() {
        return asString0(this);
    }

    private final long n;

    private /*<name>*/OrganizationRole/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/OrganizationRole/*</name>*/ valueOf(long n) {
        for (/*<name>*/OrganizationRole/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/OrganizationRole/*</name>*/.class.getName());
    }
}
