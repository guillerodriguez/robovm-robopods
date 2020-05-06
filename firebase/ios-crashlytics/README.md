# Firebase iOS Crashlytics framework

### Frameworks required for this pod: 
* FirebaseCrashlytics.framework
* GoogleUtilities.framework
* FirebaseCore.framework
* PromisesObjC.framework
* FirebaseInstanceID.framework
* FirebaseInstallations.framework

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