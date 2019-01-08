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
package org.robovm.pods.lottie;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LOTAnimationView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class LOTAnimationViewPtr extends Ptr<LOTAnimationView, LOTAnimationViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LOTAnimationView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LOTAnimationView() {}
    protected LOTAnimationView(Handle h, long handle) { super(h, handle); }
    protected LOTAnimationView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithModel:inBundle:")
    public LOTAnimationView(LOTComposition model, NSBundle bundle) { super((SkipInit) null); initObject(init(model, bundle)); }
    @Method(selector = "initWithContentsOfURL:")
    public LOTAnimationView(NSURL url) { super((SkipInit) null); initObject(init(url)); }
    public LOTAnimationView(String animationName) { super((Handle) null, create(animationName)); retain(getHandle()); }
    public LOTAnimationView(String animationName, NSBundle bundle) { super((Handle) null, create(animationName, bundle)); retain(getHandle()); }
    public LOTAnimationView(NSDictionary<?, ?> animationJSON, NSBundle bundle) { super((Handle) null, create(animationJSON, bundle)); retain(getHandle()); }
    @Method(selector = "initWithFrame:")
    public LOTAnimationView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public LOTAnimationView(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "animation")
    public native String getAnimation();
    @Property(selector = "setAnimation:")
    public native void setAnimation(String v);
    @Property(selector = "isAnimationPlaying")
    public native boolean isAnimationPlaying();
    @Property(selector = "loopAnimation")
    public native boolean isLoopAnimation();
    @Property(selector = "setLoopAnimation:")
    public native void setLoopAnimation(boolean v);
    @Property(selector = "autoReverseAnimation")
    public native boolean isAutoReverseAnimation();
    @Property(selector = "setAutoReverseAnimation:")
    public native void setAutoReverseAnimation(boolean v);
    @Property(selector = "animationProgress")
    public native @MachineSizedFloat double getAnimationProgress();
    @Property(selector = "setAnimationProgress:")
    public native void setAnimationProgress(@MachineSizedFloat double v);
    @Property(selector = "animationSpeed")
    public native @MachineSizedFloat double getAnimationSpeed();
    @Property(selector = "setAnimationSpeed:")
    public native void setAnimationSpeed(@MachineSizedFloat double v);
    @Property(selector = "animationDuration")
    public native @MachineSizedFloat double getAnimationDuration();
    @Property(selector = "cacheEnable")
    public native boolean isCacheEnable();
    @Property(selector = "setCacheEnable:")
    public native void setCacheEnable(boolean v);
    @Property(selector = "completionBlock")
    public native @Block VoidBooleanBlock getCompletionBlock();
    @Property(selector = "setCompletionBlock:")
    public native void setCompletionBlock(@Block VoidBooleanBlock v);
    @Property(selector = "sceneModel")
    public native LOTComposition getSceneModel();
    @Property(selector = "setSceneModel:")
    public native void setSceneModel(LOTComposition v);
    @Property(selector = "shouldRasterizeWhenIdle")
    public native boolean shouldRasterizeWhenIdle();
    @Property(selector = "setShouldRasterizeWhenIdle:")
    public native void setShouldRasterizeWhenIdle(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithModel:inBundle:")
    protected native @Pointer long init(LOTComposition model, NSBundle bundle);
    @Method(selector = "initWithContentsOfURL:")
    protected native @Pointer long init(NSURL url);
    @Method(selector = "setAnimationNamed:")
    public native void setAnimationNamed(String animationName);
    @Method(selector = "setAnimationFromJSON:")
    public native void setAnimationFromJSON(NSDictionary<?, ?> animationJSON);
    @Method(selector = "playToProgress:withCompletion:")
    public native void playToProgress(@MachineSizedFloat double toProgress, @Block VoidBooleanBlock completion);
    @Method(selector = "playFromProgress:toProgress:withCompletion:")
    public native void playFromProgress(@MachineSizedFloat double fromStartProgress, @MachineSizedFloat double toEndProgress, @Block VoidBooleanBlock completion);
    @Method(selector = "playToFrame:withCompletion:")
    public native void playToFrame(NSNumber toFrame, @Block VoidBooleanBlock completion);
    @Method(selector = "playFromFrame:toFrame:withCompletion:")
    public native void playFromFrame(NSNumber fromStartFrame, NSNumber toEndFrame, @Block VoidBooleanBlock completion);
    @Method(selector = "playWithCompletion:")
    public native void play(@Block VoidBooleanBlock completion);
    @Method(selector = "play")
    public native void play();
    @Method(selector = "pause")
    public native void pause();
    @Method(selector = "stop")
    public native void stop();
    @Method(selector = "setProgressWithFrame:")
    public native void setProgress(NSNumber currentFrame);
    @Method(selector = "forceDrawingUpdate")
    public native void forceDrawingUpdate();
    @Method(selector = "logHierarchyKeypaths")
    public native void logHierarchyKeypaths();
    @Method(selector = "setValueDelegate:forKeypath:")
    public native void setValueDelegate(LOTValueDelegate delegates, LOTKeypath keypath);
    @Method(selector = "keysForKeyPath:")
    public native NSArray<?> keysForKeyPath(LOTKeypath keypath);
    @Method(selector = "convertPoint:toKeypathLayer:")
    public native @ByVal CGPoint convertPointToKeypathLayer(@ByVal CGPoint point, LOTKeypath keypath);
    @Method(selector = "convertRect:toKeypathLayer:")
    public native @ByVal CGRect convertRectToKeypathLayer(@ByVal CGRect rect, LOTKeypath keypath);
    @Method(selector = "convertPoint:fromKeypathLayer:")
    public native @ByVal CGPoint convertPointFromKeypathLayer(@ByVal CGPoint point, LOTKeypath keypath);
    @Method(selector = "convertRect:fromKeypathLayer:")
    public native @ByVal CGRect convertRectFromKeypathLayer(@ByVal CGRect rect, LOTKeypath keypath);
    @Method(selector = "addSubview:toKeypathLayer:")
    public native void addSubview(UIView view, LOTKeypath keypath);
    @Method(selector = "maskSubview:toKeypathLayer:")
    public native void maskSubview(UIView view, LOTKeypath keypath);
    @Method(selector = "setValue:forKeypath:atFrame:")
    public native void setValue(NSObject value, String keypath, NSNumber frame);
    @Method(selector = "addSubview:toLayerNamed:applyTransform:")
    public native void addSubview(UIView view, String layer, boolean applyTransform);
    @Method(selector = "convertRect:toLayerNamed:")
    public native @ByVal CGRect convertRectToLayer(@ByVal CGRect rect, String layerName);
    @Method(selector = "animationNamed:")
    protected static native @Pointer long create(String animationName);
    @Method(selector = "animationNamed:inBundle:")
    protected static native @Pointer long create(String animationName, NSBundle bundle);
    @Method(selector = "animationFromJSON:")
    public static native LOTAnimationView animationFromJSON(NSDictionary<?, ?> animationJSON);
    @Method(selector = "animationWithFilePath:")
    public static native LOTAnimationView createWithFilePath(String filePath);
    @Method(selector = "animationFromJSON:inBundle:")
    protected static native @Pointer long create(NSDictionary<?, ?> animationJSON, NSBundle bundle);
    /*</methods>*/
}
