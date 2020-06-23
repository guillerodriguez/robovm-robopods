# Firebase iOS RemoteConfig framework

### Frameworks required for this pod: 
* FirebaseRemoteConfig.framework
* FirebaseABTesting.framework
* FirebaseInstallations.framework
* Protobuf.framework

Plus ones required for ios-core module:
* GoogleUtilities.framework
* FirebaseCore.framework
* PromisesObjC.framework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseRemoteConfig.framework (and other) are located -->
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "io.github.dkimitsa.robovm:robopods-firebase-remote-config-ios:$altpodsVersion"
}
```