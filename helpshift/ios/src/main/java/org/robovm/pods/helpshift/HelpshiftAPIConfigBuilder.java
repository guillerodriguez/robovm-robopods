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
package org.robovm.pods.helpshift;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HelpshiftAPIConfigBuilder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HelpshiftAPIConfigBuilderPtr extends Ptr<HelpshiftAPIConfigBuilder, HelpshiftAPIConfigBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HelpshiftAPIConfigBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HelpshiftAPIConfigBuilder() {}
    protected HelpshiftAPIConfigBuilder(Handle h, long handle) { super(h, handle); }
    protected HelpshiftAPIConfigBuilder(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "presentFullScreenOniPad")
    public native boolean isPresentFullScreenOniPad();
    @Property(selector = "setPresentFullScreenOniPad:")
    public native void setPresentFullScreenOniPad(boolean v);
    @Property(selector = "enableFullPrivacy")
    public native boolean isEnableFullPrivacy();
    @Property(selector = "setEnableFullPrivacy:")
    public native void setEnableFullPrivacy(boolean v);
    @Property(selector = "showConversationInfoScreen")
    public native boolean isShowConversationInfoScreen();
    @Property(selector = "setShowConversationInfoScreen:")
    public native void setShowConversationInfoScreen(boolean v);
    @Property(selector = "enableContactUs")
    public native HsEnableContactUs getEnableContactUs();
    @Property(selector = "setEnableContactUs:")
    public native void setEnableContactUs(HsEnableContactUs v);
    @Property(selector = "customContactUsFlows")
    public native NSArray<?> getCustomContactUsFlows();
    @Property(selector = "setCustomContactUsFlows:")
    public native void setCustomContactUsFlows(NSArray<?> v);
    @Property(selector = "withTagsMatching")
    public native HelpshiftFAQFilter getWithTagsMatching();
    @Property(selector = "setWithTagsMatching:")
    public native void setWithTagsMatching(HelpshiftFAQFilter v);
    @Property(selector = "customMetaData")
    public native HelpshiftSupportMetaData getCustomMetaData();
    @Property(selector = "setCustomMetaData:")
    public native void setCustomMetaData(HelpshiftSupportMetaData v);
    @Property(selector = "customIssueFields")
    public native NSDictionary<?, ?> getCustomIssueFields();
    @Property(selector = "setCustomIssueFields:")
    public native void setCustomIssueFields(NSDictionary<?, ?> v);
    @Property(selector = "extraConfig")
    public native NSDictionary<?, ?> getExtraConfig();
    @Property(selector = "setExtraConfig:")
    public native void setExtraConfig(NSDictionary<?, ?> v);
    @Property(selector = "gotoConversationAfterContactUs")
    public native boolean isGotoConversationAfterContactUs();
    @Property(selector = "setGotoConversationAfterContactUs:")
    public native void setGotoConversationAfterContactUs(boolean v);
    @Property(selector = "requireEmail")
    public native boolean isRequireEmail();
    @Property(selector = "setRequireEmail:")
    public native void setRequireEmail(boolean v);
    @Property(selector = "hideNameAndEmail")
    public native boolean isHideNameAndEmail();
    @Property(selector = "setHideNameAndEmail:")
    public native void setHideNameAndEmail(boolean v);
    @Property(selector = "showSearchOnNewConversation")
    public native boolean isShowSearchOnNewConversation();
    @Property(selector = "setShowSearchOnNewConversation:")
    public native void setShowSearchOnNewConversation(boolean v);
    @Property(selector = "conversationPrefillText")
    public native String getConversationPrefillText();
    @Property(selector = "setConversationPrefillText:")
    public native void setConversationPrefillText(String v);
    @Property(selector = "showConversationResolutionQuestion")
    public native boolean isShowConversationResolutionQuestion();
    @Property(selector = "setShowConversationResolutionQuestion:")
    public native void setShowConversationResolutionQuestion(boolean v);
    @Property(selector = "enableTypingIndicator")
    public native boolean isEnableTypingIndicator();
    @Property(selector = "setEnableTypingIndicator:")
    public native void setEnableTypingIndicator(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "build")
    public native HelpshiftAPIConfig build();
    /*</methods>*/
}
