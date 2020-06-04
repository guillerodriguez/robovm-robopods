# Firebase iOS Google SignIn framework

### Frameworks required for this pod: 
* GoogleSignIn.framework
* AppAuth.framework
* GTMAppAuth.framework
* GTMSessionFetcher.framework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where GoogleSignIn.framework (and other) are located -->
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "io.github.dkimitsa.robovm:robopods-firebase-google-signin-ios:$altpodsVersion"
}
```