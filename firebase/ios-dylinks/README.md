# Firebase iOS Dynamic Links framework

### Frameworks required for this pod: 
* FirebaseDynamicLinks.framework

### Frameworks required for dependencies
* FirebaseCore.framework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseDynamicLinks.framework is located -->
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "io.github.dkimitsa.robovm:robopods-firebase-dynamic-links-ios:$altpodsVersion"
}
```