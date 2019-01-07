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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BNCCurrencies/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(BNCCurrencies.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="BNCCurrencyAED", optional=true)
    public static native String AED();
    @GlobalValue(symbol="BNCCurrencyAED", optional=true)
    public static native void AED(String v);
    @GlobalValue(symbol="BNCCurrencyAFN", optional=true)
    public static native String AFN();
    @GlobalValue(symbol="BNCCurrencyAFN", optional=true)
    public static native void AFN(String v);
    @GlobalValue(symbol="BNCCurrencyALL", optional=true)
    public static native String ALL();
    @GlobalValue(symbol="BNCCurrencyALL", optional=true)
    public static native void ALL(String v);
    @GlobalValue(symbol="BNCCurrencyAMD", optional=true)
    public static native String AMD();
    @GlobalValue(symbol="BNCCurrencyAMD", optional=true)
    public static native void AMD(String v);
    @GlobalValue(symbol="BNCCurrencyANG", optional=true)
    public static native String ANG();
    @GlobalValue(symbol="BNCCurrencyANG", optional=true)
    public static native void ANG(String v);
    @GlobalValue(symbol="BNCCurrencyAOA", optional=true)
    public static native String AOA();
    @GlobalValue(symbol="BNCCurrencyAOA", optional=true)
    public static native void AOA(String v);
    @GlobalValue(symbol="BNCCurrencyARS", optional=true)
    public static native String ARS();
    @GlobalValue(symbol="BNCCurrencyARS", optional=true)
    public static native void ARS(String v);
    @GlobalValue(symbol="BNCCurrencyAUD", optional=true)
    public static native String AUD();
    @GlobalValue(symbol="BNCCurrencyAUD", optional=true)
    public static native void AUD(String v);
    @GlobalValue(symbol="BNCCurrencyAWG", optional=true)
    public static native String AWG();
    @GlobalValue(symbol="BNCCurrencyAWG", optional=true)
    public static native void AWG(String v);
    @GlobalValue(symbol="BNCCurrencyAZN", optional=true)
    public static native String AZN();
    @GlobalValue(symbol="BNCCurrencyAZN", optional=true)
    public static native void AZN(String v);
    @GlobalValue(symbol="BNCCurrencyBAM", optional=true)
    public static native String BAM();
    @GlobalValue(symbol="BNCCurrencyBAM", optional=true)
    public static native void BAM(String v);
    @GlobalValue(symbol="BNCCurrencyBBD", optional=true)
    public static native String BBD();
    @GlobalValue(symbol="BNCCurrencyBBD", optional=true)
    public static native void BBD(String v);
    @GlobalValue(symbol="BNCCurrencyBDT", optional=true)
    public static native String BDT();
    @GlobalValue(symbol="BNCCurrencyBDT", optional=true)
    public static native void BDT(String v);
    @GlobalValue(symbol="BNCCurrencyBGN", optional=true)
    public static native String BGN();
    @GlobalValue(symbol="BNCCurrencyBGN", optional=true)
    public static native void BGN(String v);
    @GlobalValue(symbol="BNCCurrencyBHD", optional=true)
    public static native String BHD();
    @GlobalValue(symbol="BNCCurrencyBHD", optional=true)
    public static native void BHD(String v);
    @GlobalValue(symbol="BNCCurrencyBIF", optional=true)
    public static native String BIF();
    @GlobalValue(symbol="BNCCurrencyBIF", optional=true)
    public static native void BIF(String v);
    @GlobalValue(symbol="BNCCurrencyBMD", optional=true)
    public static native String BMD();
    @GlobalValue(symbol="BNCCurrencyBMD", optional=true)
    public static native void BMD(String v);
    @GlobalValue(symbol="BNCCurrencyBND", optional=true)
    public static native String BND();
    @GlobalValue(symbol="BNCCurrencyBND", optional=true)
    public static native void BND(String v);
    @GlobalValue(symbol="BNCCurrencyBOB", optional=true)
    public static native String BOB();
    @GlobalValue(symbol="BNCCurrencyBOB", optional=true)
    public static native void BOB(String v);
    @GlobalValue(symbol="BNCCurrencyBOV", optional=true)
    public static native String BOV();
    @GlobalValue(symbol="BNCCurrencyBOV", optional=true)
    public static native void BOV(String v);
    @GlobalValue(symbol="BNCCurrencyBRL", optional=true)
    public static native String BRL();
    @GlobalValue(symbol="BNCCurrencyBRL", optional=true)
    public static native void BRL(String v);
    @GlobalValue(symbol="BNCCurrencyBSD", optional=true)
    public static native String BSD();
    @GlobalValue(symbol="BNCCurrencyBSD", optional=true)
    public static native void BSD(String v);
    @GlobalValue(symbol="BNCCurrencyBTN", optional=true)
    public static native String BTN();
    @GlobalValue(symbol="BNCCurrencyBTN", optional=true)
    public static native void BTN(String v);
    @GlobalValue(symbol="BNCCurrencyBWP", optional=true)
    public static native String BWP();
    @GlobalValue(symbol="BNCCurrencyBWP", optional=true)
    public static native void BWP(String v);
    @GlobalValue(symbol="BNCCurrencyBYN", optional=true)
    public static native String BYN();
    @GlobalValue(symbol="BNCCurrencyBYN", optional=true)
    public static native void BYN(String v);
    @GlobalValue(symbol="BNCCurrencyBYR", optional=true)
    public static native String BYR();
    @GlobalValue(symbol="BNCCurrencyBYR", optional=true)
    public static native void BYR(String v);
    @GlobalValue(symbol="BNCCurrencyBZD", optional=true)
    public static native String BZD();
    @GlobalValue(symbol="BNCCurrencyBZD", optional=true)
    public static native void BZD(String v);
    @GlobalValue(symbol="BNCCurrencyCAD", optional=true)
    public static native String CAD();
    @GlobalValue(symbol="BNCCurrencyCAD", optional=true)
    public static native void CAD(String v);
    @GlobalValue(symbol="BNCCurrencyCDF", optional=true)
    public static native String CDF();
    @GlobalValue(symbol="BNCCurrencyCDF", optional=true)
    public static native void CDF(String v);
    @GlobalValue(symbol="BNCCurrencyCHE", optional=true)
    public static native String CHE();
    @GlobalValue(symbol="BNCCurrencyCHE", optional=true)
    public static native void CHE(String v);
    @GlobalValue(symbol="BNCCurrencyCHF", optional=true)
    public static native String CHF();
    @GlobalValue(symbol="BNCCurrencyCHF", optional=true)
    public static native void CHF(String v);
    @GlobalValue(symbol="BNCCurrencyCHW", optional=true)
    public static native String CHW();
    @GlobalValue(symbol="BNCCurrencyCHW", optional=true)
    public static native void CHW(String v);
    @GlobalValue(symbol="BNCCurrencyCLF", optional=true)
    public static native String CLF();
    @GlobalValue(symbol="BNCCurrencyCLF", optional=true)
    public static native void CLF(String v);
    @GlobalValue(symbol="BNCCurrencyCLP", optional=true)
    public static native String CLP();
    @GlobalValue(symbol="BNCCurrencyCLP", optional=true)
    public static native void CLP(String v);
    @GlobalValue(symbol="BNCCurrencyCNY", optional=true)
    public static native String CNY();
    @GlobalValue(symbol="BNCCurrencyCNY", optional=true)
    public static native void CNY(String v);
    @GlobalValue(symbol="BNCCurrencyCOP", optional=true)
    public static native String COP();
    @GlobalValue(symbol="BNCCurrencyCOP", optional=true)
    public static native void COP(String v);
    @GlobalValue(symbol="BNCCurrencyCOU", optional=true)
    public static native String COU();
    @GlobalValue(symbol="BNCCurrencyCOU", optional=true)
    public static native void COU(String v);
    @GlobalValue(symbol="BNCCurrencyCRC", optional=true)
    public static native String CRC();
    @GlobalValue(symbol="BNCCurrencyCRC", optional=true)
    public static native void CRC(String v);
    @GlobalValue(symbol="BNCCurrencyCUC", optional=true)
    public static native String CUC();
    @GlobalValue(symbol="BNCCurrencyCUC", optional=true)
    public static native void CUC(String v);
    @GlobalValue(symbol="BNCCurrencyCUP", optional=true)
    public static native String CUP();
    @GlobalValue(symbol="BNCCurrencyCUP", optional=true)
    public static native void CUP(String v);
    @GlobalValue(symbol="BNCCurrencyCVE", optional=true)
    public static native String CVE();
    @GlobalValue(symbol="BNCCurrencyCVE", optional=true)
    public static native void CVE(String v);
    @GlobalValue(symbol="BNCCurrencyCZK", optional=true)
    public static native String CZK();
    @GlobalValue(symbol="BNCCurrencyCZK", optional=true)
    public static native void CZK(String v);
    @GlobalValue(symbol="BNCCurrencyDJF", optional=true)
    public static native String DJF();
    @GlobalValue(symbol="BNCCurrencyDJF", optional=true)
    public static native void DJF(String v);
    @GlobalValue(symbol="BNCCurrencyDKK", optional=true)
    public static native String DKK();
    @GlobalValue(symbol="BNCCurrencyDKK", optional=true)
    public static native void DKK(String v);
    @GlobalValue(symbol="BNCCurrencyDOP", optional=true)
    public static native String DOP();
    @GlobalValue(symbol="BNCCurrencyDOP", optional=true)
    public static native void DOP(String v);
    @GlobalValue(symbol="BNCCurrencyDZD", optional=true)
    public static native String DZD();
    @GlobalValue(symbol="BNCCurrencyDZD", optional=true)
    public static native void DZD(String v);
    @GlobalValue(symbol="BNCCurrencyEGP", optional=true)
    public static native String EGP();
    @GlobalValue(symbol="BNCCurrencyEGP", optional=true)
    public static native void EGP(String v);
    @GlobalValue(symbol="BNCCurrencyERN", optional=true)
    public static native String ERN();
    @GlobalValue(symbol="BNCCurrencyERN", optional=true)
    public static native void ERN(String v);
    @GlobalValue(symbol="BNCCurrencyETB", optional=true)
    public static native String ETB();
    @GlobalValue(symbol="BNCCurrencyETB", optional=true)
    public static native void ETB(String v);
    @GlobalValue(symbol="BNCCurrencyEUR", optional=true)
    public static native String EUR();
    @GlobalValue(symbol="BNCCurrencyEUR", optional=true)
    public static native void EUR(String v);
    @GlobalValue(symbol="BNCCurrencyFJD", optional=true)
    public static native String FJD();
    @GlobalValue(symbol="BNCCurrencyFJD", optional=true)
    public static native void FJD(String v);
    @GlobalValue(symbol="BNCCurrencyFKP", optional=true)
    public static native String FKP();
    @GlobalValue(symbol="BNCCurrencyFKP", optional=true)
    public static native void FKP(String v);
    @GlobalValue(symbol="BNCCurrencyGBP", optional=true)
    public static native String GBP();
    @GlobalValue(symbol="BNCCurrencyGBP", optional=true)
    public static native void GBP(String v);
    @GlobalValue(symbol="BNCCurrencyGEL", optional=true)
    public static native String GEL();
    @GlobalValue(symbol="BNCCurrencyGEL", optional=true)
    public static native void GEL(String v);
    @GlobalValue(symbol="BNCCurrencyGHS", optional=true)
    public static native String GHS();
    @GlobalValue(symbol="BNCCurrencyGHS", optional=true)
    public static native void GHS(String v);
    @GlobalValue(symbol="BNCCurrencyGIP", optional=true)
    public static native String GIP();
    @GlobalValue(symbol="BNCCurrencyGIP", optional=true)
    public static native void GIP(String v);
    @GlobalValue(symbol="BNCCurrencyGMD", optional=true)
    public static native String GMD();
    @GlobalValue(symbol="BNCCurrencyGMD", optional=true)
    public static native void GMD(String v);
    @GlobalValue(symbol="BNCCurrencyGNF", optional=true)
    public static native String GNF();
    @GlobalValue(symbol="BNCCurrencyGNF", optional=true)
    public static native void GNF(String v);
    @GlobalValue(symbol="BNCCurrencyGTQ", optional=true)
    public static native String GTQ();
    @GlobalValue(symbol="BNCCurrencyGTQ", optional=true)
    public static native void GTQ(String v);
    @GlobalValue(symbol="BNCCurrencyGYD", optional=true)
    public static native String GYD();
    @GlobalValue(symbol="BNCCurrencyGYD", optional=true)
    public static native void GYD(String v);
    @GlobalValue(symbol="BNCCurrencyHKD", optional=true)
    public static native String HKD();
    @GlobalValue(symbol="BNCCurrencyHKD", optional=true)
    public static native void HKD(String v);
    @GlobalValue(symbol="BNCCurrencyHNL", optional=true)
    public static native String HNL();
    @GlobalValue(symbol="BNCCurrencyHNL", optional=true)
    public static native void HNL(String v);
    @GlobalValue(symbol="BNCCurrencyHRK", optional=true)
    public static native String HRK();
    @GlobalValue(symbol="BNCCurrencyHRK", optional=true)
    public static native void HRK(String v);
    @GlobalValue(symbol="BNCCurrencyHTG", optional=true)
    public static native String HTG();
    @GlobalValue(symbol="BNCCurrencyHTG", optional=true)
    public static native void HTG(String v);
    @GlobalValue(symbol="BNCCurrencyHUF", optional=true)
    public static native String HUF();
    @GlobalValue(symbol="BNCCurrencyHUF", optional=true)
    public static native void HUF(String v);
    @GlobalValue(symbol="BNCCurrencyIDR", optional=true)
    public static native String IDR();
    @GlobalValue(symbol="BNCCurrencyIDR", optional=true)
    public static native void IDR(String v);
    @GlobalValue(symbol="BNCCurrencyILS", optional=true)
    public static native String ILS();
    @GlobalValue(symbol="BNCCurrencyILS", optional=true)
    public static native void ILS(String v);
    @GlobalValue(symbol="BNCCurrencyINR", optional=true)
    public static native String INR();
    @GlobalValue(symbol="BNCCurrencyINR", optional=true)
    public static native void INR(String v);
    @GlobalValue(symbol="BNCCurrencyIQD", optional=true)
    public static native String IQD();
    @GlobalValue(symbol="BNCCurrencyIQD", optional=true)
    public static native void IQD(String v);
    @GlobalValue(symbol="BNCCurrencyIRR", optional=true)
    public static native String IRR();
    @GlobalValue(symbol="BNCCurrencyIRR", optional=true)
    public static native void IRR(String v);
    @GlobalValue(symbol="BNCCurrencyISK", optional=true)
    public static native String ISK();
    @GlobalValue(symbol="BNCCurrencyISK", optional=true)
    public static native void ISK(String v);
    @GlobalValue(symbol="BNCCurrencyJMD", optional=true)
    public static native String JMD();
    @GlobalValue(symbol="BNCCurrencyJMD", optional=true)
    public static native void JMD(String v);
    @GlobalValue(symbol="BNCCurrencyJOD", optional=true)
    public static native String JOD();
    @GlobalValue(symbol="BNCCurrencyJOD", optional=true)
    public static native void JOD(String v);
    @GlobalValue(symbol="BNCCurrencyJPY", optional=true)
    public static native String JPY();
    @GlobalValue(symbol="BNCCurrencyJPY", optional=true)
    public static native void JPY(String v);
    @GlobalValue(symbol="BNCCurrencyKES", optional=true)
    public static native String KES();
    @GlobalValue(symbol="BNCCurrencyKES", optional=true)
    public static native void KES(String v);
    @GlobalValue(symbol="BNCCurrencyKGS", optional=true)
    public static native String KGS();
    @GlobalValue(symbol="BNCCurrencyKGS", optional=true)
    public static native void KGS(String v);
    @GlobalValue(symbol="BNCCurrencyKHR", optional=true)
    public static native String KHR();
    @GlobalValue(symbol="BNCCurrencyKHR", optional=true)
    public static native void KHR(String v);
    @GlobalValue(symbol="BNCCurrencyKMF", optional=true)
    public static native String KMF();
    @GlobalValue(symbol="BNCCurrencyKMF", optional=true)
    public static native void KMF(String v);
    @GlobalValue(symbol="BNCCurrencyKPW", optional=true)
    public static native String KPW();
    @GlobalValue(symbol="BNCCurrencyKPW", optional=true)
    public static native void KPW(String v);
    @GlobalValue(symbol="BNCCurrencyKRW", optional=true)
    public static native String KRW();
    @GlobalValue(symbol="BNCCurrencyKRW", optional=true)
    public static native void KRW(String v);
    @GlobalValue(symbol="BNCCurrencyKWD", optional=true)
    public static native String KWD();
    @GlobalValue(symbol="BNCCurrencyKWD", optional=true)
    public static native void KWD(String v);
    @GlobalValue(symbol="BNCCurrencyKYD", optional=true)
    public static native String KYD();
    @GlobalValue(symbol="BNCCurrencyKYD", optional=true)
    public static native void KYD(String v);
    @GlobalValue(symbol="BNCCurrencyKZT", optional=true)
    public static native String KZT();
    @GlobalValue(symbol="BNCCurrencyKZT", optional=true)
    public static native void KZT(String v);
    @GlobalValue(symbol="BNCCurrencyLAK", optional=true)
    public static native String LAK();
    @GlobalValue(symbol="BNCCurrencyLAK", optional=true)
    public static native void LAK(String v);
    @GlobalValue(symbol="BNCCurrencyLBP", optional=true)
    public static native String LBP();
    @GlobalValue(symbol="BNCCurrencyLBP", optional=true)
    public static native void LBP(String v);
    @GlobalValue(symbol="BNCCurrencyLKR", optional=true)
    public static native String LKR();
    @GlobalValue(symbol="BNCCurrencyLKR", optional=true)
    public static native void LKR(String v);
    @GlobalValue(symbol="BNCCurrencyLRD", optional=true)
    public static native String LRD();
    @GlobalValue(symbol="BNCCurrencyLRD", optional=true)
    public static native void LRD(String v);
    @GlobalValue(symbol="BNCCurrencyLSL", optional=true)
    public static native String LSL();
    @GlobalValue(symbol="BNCCurrencyLSL", optional=true)
    public static native void LSL(String v);
    @GlobalValue(symbol="BNCCurrencyLYD", optional=true)
    public static native String LYD();
    @GlobalValue(symbol="BNCCurrencyLYD", optional=true)
    public static native void LYD(String v);
    @GlobalValue(symbol="BNCCurrencyMAD", optional=true)
    public static native String MAD();
    @GlobalValue(symbol="BNCCurrencyMAD", optional=true)
    public static native void MAD(String v);
    @GlobalValue(symbol="BNCCurrencyMDL", optional=true)
    public static native String MDL();
    @GlobalValue(symbol="BNCCurrencyMDL", optional=true)
    public static native void MDL(String v);
    @GlobalValue(symbol="BNCCurrencyMGA", optional=true)
    public static native String MGA();
    @GlobalValue(symbol="BNCCurrencyMGA", optional=true)
    public static native void MGA(String v);
    @GlobalValue(symbol="BNCCurrencyMKD", optional=true)
    public static native String MKD();
    @GlobalValue(symbol="BNCCurrencyMKD", optional=true)
    public static native void MKD(String v);
    @GlobalValue(symbol="BNCCurrencyMMK", optional=true)
    public static native String MMK();
    @GlobalValue(symbol="BNCCurrencyMMK", optional=true)
    public static native void MMK(String v);
    @GlobalValue(symbol="BNCCurrencyMNT", optional=true)
    public static native String MNT();
    @GlobalValue(symbol="BNCCurrencyMNT", optional=true)
    public static native void MNT(String v);
    @GlobalValue(symbol="BNCCurrencyMOP", optional=true)
    public static native String MOP();
    @GlobalValue(symbol="BNCCurrencyMOP", optional=true)
    public static native void MOP(String v);
    @GlobalValue(symbol="BNCCurrencyMRO", optional=true)
    public static native String MRO();
    @GlobalValue(symbol="BNCCurrencyMRO", optional=true)
    public static native void MRO(String v);
    @GlobalValue(symbol="BNCCurrencyMUR", optional=true)
    public static native String MUR();
    @GlobalValue(symbol="BNCCurrencyMUR", optional=true)
    public static native void MUR(String v);
    @GlobalValue(symbol="BNCCurrencyMVR", optional=true)
    public static native String MVR();
    @GlobalValue(symbol="BNCCurrencyMVR", optional=true)
    public static native void MVR(String v);
    @GlobalValue(symbol="BNCCurrencyMWK", optional=true)
    public static native String MWK();
    @GlobalValue(symbol="BNCCurrencyMWK", optional=true)
    public static native void MWK(String v);
    @GlobalValue(symbol="BNCCurrencyMXN", optional=true)
    public static native String MXN();
    @GlobalValue(symbol="BNCCurrencyMXN", optional=true)
    public static native void MXN(String v);
    @GlobalValue(symbol="BNCCurrencyMXV", optional=true)
    public static native String MXV();
    @GlobalValue(symbol="BNCCurrencyMXV", optional=true)
    public static native void MXV(String v);
    @GlobalValue(symbol="BNCCurrencyMYR", optional=true)
    public static native String MYR();
    @GlobalValue(symbol="BNCCurrencyMYR", optional=true)
    public static native void MYR(String v);
    @GlobalValue(symbol="BNCCurrencyMZN", optional=true)
    public static native String MZN();
    @GlobalValue(symbol="BNCCurrencyMZN", optional=true)
    public static native void MZN(String v);
    @GlobalValue(symbol="BNCCurrencyNAD", optional=true)
    public static native String NAD();
    @GlobalValue(symbol="BNCCurrencyNAD", optional=true)
    public static native void NAD(String v);
    @GlobalValue(symbol="BNCCurrencyNGN", optional=true)
    public static native String NGN();
    @GlobalValue(symbol="BNCCurrencyNGN", optional=true)
    public static native void NGN(String v);
    @GlobalValue(symbol="BNCCurrencyNIO", optional=true)
    public static native String NIO();
    @GlobalValue(symbol="BNCCurrencyNIO", optional=true)
    public static native void NIO(String v);
    @GlobalValue(symbol="BNCCurrencyNOK", optional=true)
    public static native String NOK();
    @GlobalValue(symbol="BNCCurrencyNOK", optional=true)
    public static native void NOK(String v);
    @GlobalValue(symbol="BNCCurrencyNPR", optional=true)
    public static native String NPR();
    @GlobalValue(symbol="BNCCurrencyNPR", optional=true)
    public static native void NPR(String v);
    @GlobalValue(symbol="BNCCurrencyNZD", optional=true)
    public static native String NZD();
    @GlobalValue(symbol="BNCCurrencyNZD", optional=true)
    public static native void NZD(String v);
    @GlobalValue(symbol="BNCCurrencyOMR", optional=true)
    public static native String OMR();
    @GlobalValue(symbol="BNCCurrencyOMR", optional=true)
    public static native void OMR(String v);
    @GlobalValue(symbol="BNCCurrencyPAB", optional=true)
    public static native String PAB();
    @GlobalValue(symbol="BNCCurrencyPAB", optional=true)
    public static native void PAB(String v);
    @GlobalValue(symbol="BNCCurrencyPEN", optional=true)
    public static native String PEN();
    @GlobalValue(symbol="BNCCurrencyPEN", optional=true)
    public static native void PEN(String v);
    @GlobalValue(symbol="BNCCurrencyPGK", optional=true)
    public static native String PGK();
    @GlobalValue(symbol="BNCCurrencyPGK", optional=true)
    public static native void PGK(String v);
    @GlobalValue(symbol="BNCCurrencyPHP", optional=true)
    public static native String PHP();
    @GlobalValue(symbol="BNCCurrencyPHP", optional=true)
    public static native void PHP(String v);
    @GlobalValue(symbol="BNCCurrencyPKR", optional=true)
    public static native String PKR();
    @GlobalValue(symbol="BNCCurrencyPKR", optional=true)
    public static native void PKR(String v);
    @GlobalValue(symbol="BNCCurrencyPLN", optional=true)
    public static native String PLN();
    @GlobalValue(symbol="BNCCurrencyPLN", optional=true)
    public static native void PLN(String v);
    @GlobalValue(symbol="BNCCurrencyPYG", optional=true)
    public static native String PYG();
    @GlobalValue(symbol="BNCCurrencyPYG", optional=true)
    public static native void PYG(String v);
    @GlobalValue(symbol="BNCCurrencyQAR", optional=true)
    public static native String QAR();
    @GlobalValue(symbol="BNCCurrencyQAR", optional=true)
    public static native void QAR(String v);
    @GlobalValue(symbol="BNCCurrencyRON", optional=true)
    public static native String RON();
    @GlobalValue(symbol="BNCCurrencyRON", optional=true)
    public static native void RON(String v);
    @GlobalValue(symbol="BNCCurrencyRSD", optional=true)
    public static native String RSD();
    @GlobalValue(symbol="BNCCurrencyRSD", optional=true)
    public static native void RSD(String v);
    @GlobalValue(symbol="BNCCurrencyRUB", optional=true)
    public static native String RUB();
    @GlobalValue(symbol="BNCCurrencyRUB", optional=true)
    public static native void RUB(String v);
    @GlobalValue(symbol="BNCCurrencyRWF", optional=true)
    public static native String RWF();
    @GlobalValue(symbol="BNCCurrencyRWF", optional=true)
    public static native void RWF(String v);
    @GlobalValue(symbol="BNCCurrencySAR", optional=true)
    public static native String SAR();
    @GlobalValue(symbol="BNCCurrencySAR", optional=true)
    public static native void SAR(String v);
    @GlobalValue(symbol="BNCCurrencySBD", optional=true)
    public static native String SBD();
    @GlobalValue(symbol="BNCCurrencySBD", optional=true)
    public static native void SBD(String v);
    @GlobalValue(symbol="BNCCurrencySCR", optional=true)
    public static native String SCR();
    @GlobalValue(symbol="BNCCurrencySCR", optional=true)
    public static native void SCR(String v);
    @GlobalValue(symbol="BNCCurrencySDG", optional=true)
    public static native String SDG();
    @GlobalValue(symbol="BNCCurrencySDG", optional=true)
    public static native void SDG(String v);
    @GlobalValue(symbol="BNCCurrencySEK", optional=true)
    public static native String SEK();
    @GlobalValue(symbol="BNCCurrencySEK", optional=true)
    public static native void SEK(String v);
    @GlobalValue(symbol="BNCCurrencySGD", optional=true)
    public static native String SGD();
    @GlobalValue(symbol="BNCCurrencySGD", optional=true)
    public static native void SGD(String v);
    @GlobalValue(symbol="BNCCurrencySHP", optional=true)
    public static native String SHP();
    @GlobalValue(symbol="BNCCurrencySHP", optional=true)
    public static native void SHP(String v);
    @GlobalValue(symbol="BNCCurrencySLL", optional=true)
    public static native String SLL();
    @GlobalValue(symbol="BNCCurrencySLL", optional=true)
    public static native void SLL(String v);
    @GlobalValue(symbol="BNCCurrencySOS", optional=true)
    public static native String SOS();
    @GlobalValue(symbol="BNCCurrencySOS", optional=true)
    public static native void SOS(String v);
    @GlobalValue(symbol="BNCCurrencySRD", optional=true)
    public static native String SRD();
    @GlobalValue(symbol="BNCCurrencySRD", optional=true)
    public static native void SRD(String v);
    @GlobalValue(symbol="BNCCurrencySSP", optional=true)
    public static native String SSP();
    @GlobalValue(symbol="BNCCurrencySSP", optional=true)
    public static native void SSP(String v);
    @GlobalValue(symbol="BNCCurrencySTD", optional=true)
    public static native String STD();
    @GlobalValue(symbol="BNCCurrencySTD", optional=true)
    public static native void STD(String v);
    @GlobalValue(symbol="BNCCurrencySYP", optional=true)
    public static native String SYP();
    @GlobalValue(symbol="BNCCurrencySYP", optional=true)
    public static native void SYP(String v);
    @GlobalValue(symbol="BNCCurrencySZL", optional=true)
    public static native String SZL();
    @GlobalValue(symbol="BNCCurrencySZL", optional=true)
    public static native void SZL(String v);
    @GlobalValue(symbol="BNCCurrencyTHB", optional=true)
    public static native String THB();
    @GlobalValue(symbol="BNCCurrencyTHB", optional=true)
    public static native void THB(String v);
    @GlobalValue(symbol="BNCCurrencyTJS", optional=true)
    public static native String TJS();
    @GlobalValue(symbol="BNCCurrencyTJS", optional=true)
    public static native void TJS(String v);
    @GlobalValue(symbol="BNCCurrencyTMT", optional=true)
    public static native String TMT();
    @GlobalValue(symbol="BNCCurrencyTMT", optional=true)
    public static native void TMT(String v);
    @GlobalValue(symbol="BNCCurrencyTND", optional=true)
    public static native String TND();
    @GlobalValue(symbol="BNCCurrencyTND", optional=true)
    public static native void TND(String v);
    @GlobalValue(symbol="BNCCurrencyTOP", optional=true)
    public static native String TOP();
    @GlobalValue(symbol="BNCCurrencyTOP", optional=true)
    public static native void TOP(String v);
    @GlobalValue(symbol="BNCCurrencyTRY", optional=true)
    public static native String TRY();
    @GlobalValue(symbol="BNCCurrencyTRY", optional=true)
    public static native void TRY(String v);
    @GlobalValue(symbol="BNCCurrencyTTD", optional=true)
    public static native String TTD();
    @GlobalValue(symbol="BNCCurrencyTTD", optional=true)
    public static native void TTD(String v);
    @GlobalValue(symbol="BNCCurrencyTWD", optional=true)
    public static native String TWD();
    @GlobalValue(symbol="BNCCurrencyTWD", optional=true)
    public static native void TWD(String v);
    @GlobalValue(symbol="BNCCurrencyTZS", optional=true)
    public static native String TZS();
    @GlobalValue(symbol="BNCCurrencyTZS", optional=true)
    public static native void TZS(String v);
    @GlobalValue(symbol="BNCCurrencyUAH", optional=true)
    public static native String UAH();
    @GlobalValue(symbol="BNCCurrencyUAH", optional=true)
    public static native void UAH(String v);
    @GlobalValue(symbol="BNCCurrencyUGX", optional=true)
    public static native String UGX();
    @GlobalValue(symbol="BNCCurrencyUGX", optional=true)
    public static native void UGX(String v);
    @GlobalValue(symbol="BNCCurrencyUSD", optional=true)
    public static native String USD();
    @GlobalValue(symbol="BNCCurrencyUSD", optional=true)
    public static native void USD(String v);
    @GlobalValue(symbol="BNCCurrencyUSN", optional=true)
    public static native String USN();
    @GlobalValue(symbol="BNCCurrencyUSN", optional=true)
    public static native void USN(String v);
    @GlobalValue(symbol="BNCCurrencyUYI", optional=true)
    public static native String UYI();
    @GlobalValue(symbol="BNCCurrencyUYI", optional=true)
    public static native void UYI(String v);
    @GlobalValue(symbol="BNCCurrencyUYU", optional=true)
    public static native String UYU();
    @GlobalValue(symbol="BNCCurrencyUYU", optional=true)
    public static native void UYU(String v);
    @GlobalValue(symbol="BNCCurrencyUZS", optional=true)
    public static native String UZS();
    @GlobalValue(symbol="BNCCurrencyUZS", optional=true)
    public static native void UZS(String v);
    @GlobalValue(symbol="BNCCurrencyVEF", optional=true)
    public static native String VEF();
    @GlobalValue(symbol="BNCCurrencyVEF", optional=true)
    public static native void VEF(String v);
    @GlobalValue(symbol="BNCCurrencyVND", optional=true)
    public static native String VND();
    @GlobalValue(symbol="BNCCurrencyVND", optional=true)
    public static native void VND(String v);
    @GlobalValue(symbol="BNCCurrencyVUV", optional=true)
    public static native String VUV();
    @GlobalValue(symbol="BNCCurrencyVUV", optional=true)
    public static native void VUV(String v);
    @GlobalValue(symbol="BNCCurrencyWST", optional=true)
    public static native String WST();
    @GlobalValue(symbol="BNCCurrencyWST", optional=true)
    public static native void WST(String v);
    @GlobalValue(symbol="BNCCurrencyXAF", optional=true)
    public static native String XAF();
    @GlobalValue(symbol="BNCCurrencyXAF", optional=true)
    public static native void XAF(String v);
    @GlobalValue(symbol="BNCCurrencyXAG", optional=true)
    public static native String XAG();
    @GlobalValue(symbol="BNCCurrencyXAG", optional=true)
    public static native void XAG(String v);
    @GlobalValue(symbol="BNCCurrencyXAU", optional=true)
    public static native String XAU();
    @GlobalValue(symbol="BNCCurrencyXAU", optional=true)
    public static native void XAU(String v);
    @GlobalValue(symbol="BNCCurrencyXBA", optional=true)
    public static native String XBA();
    @GlobalValue(symbol="BNCCurrencyXBA", optional=true)
    public static native void XBA(String v);
    @GlobalValue(symbol="BNCCurrencyXBB", optional=true)
    public static native String XBB();
    @GlobalValue(symbol="BNCCurrencyXBB", optional=true)
    public static native void XBB(String v);
    @GlobalValue(symbol="BNCCurrencyXBC", optional=true)
    public static native String XBC();
    @GlobalValue(symbol="BNCCurrencyXBC", optional=true)
    public static native void XBC(String v);
    @GlobalValue(symbol="BNCCurrencyXBD", optional=true)
    public static native String XBD();
    @GlobalValue(symbol="BNCCurrencyXBD", optional=true)
    public static native void XBD(String v);
    @GlobalValue(symbol="BNCCurrencyXCD", optional=true)
    public static native String XCD();
    @GlobalValue(symbol="BNCCurrencyXCD", optional=true)
    public static native void XCD(String v);
    @GlobalValue(symbol="BNCCurrencyXDR", optional=true)
    public static native String XDR();
    @GlobalValue(symbol="BNCCurrencyXDR", optional=true)
    public static native void XDR(String v);
    @GlobalValue(symbol="BNCCurrencyXFU", optional=true)
    public static native String XFU();
    @GlobalValue(symbol="BNCCurrencyXFU", optional=true)
    public static native void XFU(String v);
    @GlobalValue(symbol="BNCCurrencyXOF", optional=true)
    public static native String XOF();
    @GlobalValue(symbol="BNCCurrencyXOF", optional=true)
    public static native void XOF(String v);
    @GlobalValue(symbol="BNCCurrencyXPD", optional=true)
    public static native String XPD();
    @GlobalValue(symbol="BNCCurrencyXPD", optional=true)
    public static native void XPD(String v);
    @GlobalValue(symbol="BNCCurrencyXPF", optional=true)
    public static native String XPF();
    @GlobalValue(symbol="BNCCurrencyXPF", optional=true)
    public static native void XPF(String v);
    @GlobalValue(symbol="BNCCurrencyXPT", optional=true)
    public static native String XPT();
    @GlobalValue(symbol="BNCCurrencyXPT", optional=true)
    public static native void XPT(String v);
    @GlobalValue(symbol="BNCCurrencyXSU", optional=true)
    public static native String XSU();
    @GlobalValue(symbol="BNCCurrencyXSU", optional=true)
    public static native void XSU(String v);
    @GlobalValue(symbol="BNCCurrencyXTS", optional=true)
    public static native String XTS();
    @GlobalValue(symbol="BNCCurrencyXTS", optional=true)
    public static native void XTS(String v);
    @GlobalValue(symbol="BNCCurrencyXUA", optional=true)
    public static native String XUA();
    @GlobalValue(symbol="BNCCurrencyXUA", optional=true)
    public static native void XUA(String v);
    @GlobalValue(symbol="BNCCurrencyXXX", optional=true)
    public static native String XXX();
    @GlobalValue(symbol="BNCCurrencyXXX", optional=true)
    public static native void XXX(String v);
    @GlobalValue(symbol="BNCCurrencyYER", optional=true)
    public static native String YER();
    @GlobalValue(symbol="BNCCurrencyYER", optional=true)
    public static native void YER(String v);
    @GlobalValue(symbol="BNCCurrencyZAR", optional=true)
    public static native String ZAR();
    @GlobalValue(symbol="BNCCurrencyZAR", optional=true)
    public static native void ZAR(String v);
    @GlobalValue(symbol="BNCCurrencyZMW", optional=true)
    public static native String ZMW();
    @GlobalValue(symbol="BNCCurrencyZMW", optional=true)
    public static native void ZMW(String v);
    /*</methods>*/
}
