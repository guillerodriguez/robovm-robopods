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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BNCProductCategories/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(BNCProductCategories.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="BNCProductCategoryAnimalSupplies", optional=true)
    public static native String AnimalSupplies();
    @GlobalValue(symbol="BNCProductCategoryAnimalSupplies", optional=true)
    public static native void AnimalSupplies(String v);
    @GlobalValue(symbol="BNCProductCategoryApparel", optional=true)
    public static native String Apparel();
    @GlobalValue(symbol="BNCProductCategoryApparel", optional=true)
    public static native void Apparel(String v);
    @GlobalValue(symbol="BNCProductCategoryArtsEntertainment", optional=true)
    public static native String ArtsEntertainment();
    @GlobalValue(symbol="BNCProductCategoryArtsEntertainment", optional=true)
    public static native void ArtsEntertainment(String v);
    @GlobalValue(symbol="BNCProductCategoryBabyToddler", optional=true)
    public static native String BabyToddler();
    @GlobalValue(symbol="BNCProductCategoryBabyToddler", optional=true)
    public static native void BabyToddler(String v);
    @GlobalValue(symbol="BNCProductCategoryBusinessIndustrial", optional=true)
    public static native String BusinessIndustrial();
    @GlobalValue(symbol="BNCProductCategoryBusinessIndustrial", optional=true)
    public static native void BusinessIndustrial(String v);
    @GlobalValue(symbol="BNCProductCategoryCamerasOptics", optional=true)
    public static native String CamerasOptics();
    @GlobalValue(symbol="BNCProductCategoryCamerasOptics", optional=true)
    public static native void CamerasOptics(String v);
    @GlobalValue(symbol="BNCProductCategoryElectronics", optional=true)
    public static native String Electronics();
    @GlobalValue(symbol="BNCProductCategoryElectronics", optional=true)
    public static native void Electronics(String v);
    @GlobalValue(symbol="BNCProductCategoryFoodBeverageTobacco", optional=true)
    public static native String FoodBeverageTobacco();
    @GlobalValue(symbol="BNCProductCategoryFoodBeverageTobacco", optional=true)
    public static native void FoodBeverageTobacco(String v);
    @GlobalValue(symbol="BNCProductCategoryFurniture", optional=true)
    public static native String Furniture();
    @GlobalValue(symbol="BNCProductCategoryFurniture", optional=true)
    public static native void Furniture(String v);
    @GlobalValue(symbol="BNCProductCategoryHardware", optional=true)
    public static native String Hardware();
    @GlobalValue(symbol="BNCProductCategoryHardware", optional=true)
    public static native void Hardware(String v);
    @GlobalValue(symbol="BNCProductCategoryHealthBeauty", optional=true)
    public static native String HealthBeauty();
    @GlobalValue(symbol="BNCProductCategoryHealthBeauty", optional=true)
    public static native void HealthBeauty(String v);
    @GlobalValue(symbol="BNCProductCategoryHomeGarden", optional=true)
    public static native String HomeGarden();
    @GlobalValue(symbol="BNCProductCategoryHomeGarden", optional=true)
    public static native void HomeGarden(String v);
    @GlobalValue(symbol="BNCProductCategoryLuggageBags", optional=true)
    public static native String LuggageBags();
    @GlobalValue(symbol="BNCProductCategoryLuggageBags", optional=true)
    public static native void LuggageBags(String v);
    @GlobalValue(symbol="BNCProductCategoryMature", optional=true)
    public static native String Mature();
    @GlobalValue(symbol="BNCProductCategoryMature", optional=true)
    public static native void Mature(String v);
    @GlobalValue(symbol="BNCProductCategoryMedia", optional=true)
    public static native String Media();
    @GlobalValue(symbol="BNCProductCategoryMedia", optional=true)
    public static native void Media(String v);
    @GlobalValue(symbol="BNCProductCategoryOfficeSupplies", optional=true)
    public static native String OfficeSupplies();
    @GlobalValue(symbol="BNCProductCategoryOfficeSupplies", optional=true)
    public static native void OfficeSupplies(String v);
    @GlobalValue(symbol="BNCProductCategoryReligious", optional=true)
    public static native String Religious();
    @GlobalValue(symbol="BNCProductCategoryReligious", optional=true)
    public static native void Religious(String v);
    @GlobalValue(symbol="BNCProductCategorySoftware", optional=true)
    public static native String Software();
    @GlobalValue(symbol="BNCProductCategorySoftware", optional=true)
    public static native void Software(String v);
    @GlobalValue(symbol="BNCProductCategorySportingGoods", optional=true)
    public static native String SportingGoods();
    @GlobalValue(symbol="BNCProductCategorySportingGoods", optional=true)
    public static native void SportingGoods(String v);
    @GlobalValue(symbol="BNCProductCategoryToysGames", optional=true)
    public static native String ToysGames();
    @GlobalValue(symbol="BNCProductCategoryToysGames", optional=true)
    public static native void ToysGames(String v);
    @GlobalValue(symbol="BNCProductCategoryVehiclesParts", optional=true)
    public static native String VehiclesParts();
    @GlobalValue(symbol="BNCProductCategoryVehiclesParts", optional=true)
    public static native void VehiclesParts(String v);
    /*</methods>*/
}
