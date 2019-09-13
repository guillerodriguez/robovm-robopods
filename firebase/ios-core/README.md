# Firebase iOS Core framework

### Frameworks required for this pod: 
* GoogleUtilities.framework
* FirebaseCore.framework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseCore.framework is located -->
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "io.github.dkimitsa.robovm:robopods-farebase-core-ios:$altpodsVersion"
}
```