# Firebase iOS Messaging framework

### Frameworks required for this pod: 
* FirebaseMessaging.framework
* FirebaseInstanceID.framework
* Protobuf>nanopb.framework

Plus ones required for ios-core module:
* GoogleUtilities.framework
* FirebaseCore.framework
* PromisesObjC.framework

### to use this pod configure your `robovm.xml`

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