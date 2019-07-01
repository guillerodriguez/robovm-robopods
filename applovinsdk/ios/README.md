# AppLovinSDK iOS

## Sample app

TODO

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `AppLovinSDK.framework`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>
    </frameworkPaths>
    <frameworks>
        <framework>AppLovinSDK</framework>
    </frameworks>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "io.github.dkimitsa.robovm:robopods-applovinsdk-ios:$altpodsVersion"
}
```

## Pollfish home page

[Link](https://dash.applovin.com/docs)