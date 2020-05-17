# Firebase iOS Authentication framework

### Frameworks required for this pod: 
* FirebaseAuth.framework
* GTMSessionFetcher.framework

### Frameworks required for dependencies
* FirebaseCore.framework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseAuth.framework is located -->
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "io.github.dkimitsa.robovm:robopods-firebase-auth-ios:$altpodsVersion"
}
```