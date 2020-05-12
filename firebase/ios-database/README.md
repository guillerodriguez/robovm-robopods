# Firebase iOS Realtime Database framework

### Frameworks required for this pod: 
* GoogleUtilities.framework
* FirebaseCore.framework
* FirebaseDatabase.frameworkß
* leveldb-library.framework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseDatabase.framework is located -->
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "io.github.dkimitsa.robovm:robopods-firebase-database-ios:$altpodsVersion"
}
```
