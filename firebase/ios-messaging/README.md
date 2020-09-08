# Firebase iOS Messaging framework

### Frameworks required for this pod: 
* FirebaseMessaging.framework
* FirebaseInstanceID.framework
* Protobuf.framework
* nanopb.framework

Plus ones required for ios-core module:
* GoogleUtilities.framework
* FirebaseCore.framework
* PromisesObjC.framework

### to use this pod configure your `robovm.xml`
[the official guide](https://firebase.google.com/docs/cloud-messaging/ios/client).

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseMessaging.framework (and other) are located -->
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "io.github.dkimitsa.robovm:robopods-firebase-messaging-ios:$altpodsVersion"
}
```

### Disable method swizzling
This is required to be done in case of RoboVM. Following steps to be done as specified in the [guide](https://firebase.google.com/docs/cloud-messaging/ios/client):
- add following lines to `info.plist`:  
```
<key>FirebaseAppDelegateProxyEnabled</key>
<false />
```
- explicitly map your APNs token to the FCM registration token in app delegate:  
```
@Override
public void didRegisterForRemoteNotifications(UIApplication application, NSData deviceToken) {
    super.didRegisterForRemoteNotifications(application, deviceToken);
    FIRMessaging.messaging().setAPNSToken(deviceToken);
}
```
 