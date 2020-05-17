# Firebase iOS Analytics framework

### Frameworks required for this pod: 
* FirebaseAnalytics.framework
* GoogleAppMeasurement.framework
* FirebaseInstallations.framework
* nanopb.framework

Plus ones required for ios-core module:
* GoogleUtilities.framework
* FirebaseCore.framework
* PromisesObjC.framework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseAnalytics.framework is located -->
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "io.github.dkimitsa.robovm:robopods-firebase-analytics-ios:$altpodsVersion"
}
```
