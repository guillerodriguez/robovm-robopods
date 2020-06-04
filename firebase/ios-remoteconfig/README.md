# Firebase iOS Crashlytics framework

### Frameworks required for this pod: 
* FirebaseCrashlytics.framework
* FirebaseInstallations.framework
* framework>nanopb.framework
* GoogleDataTransport.framework

Plus ones required for ios-core module:
* GoogleUtilities.framework
* FirebaseCore.framework
* PromisesObjC.framework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseCrashlytics.framework (and other) are located -->
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "io.github.dkimitsa.robovm:robopods-firebase-crashlytics-ios:$altpodsVersion"
}
```