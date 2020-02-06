# Facebook iOS Audience framework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FBAudienceNetwork.framework is located -->
    </frameworkPaths>
</config>
```

## Versions

| RoboPods Version  | FBAudience Version  |
|-------------------|---------------------|
| 1.5.0             | 5.6.1               |
| 1.4.0             | 5.6.0               |
| 1.3.0             | 5.5.0               |

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "io.github.dkimitsa.robovm:robopods-facebook-audience-ios:$altpodsVersion"
}
```
