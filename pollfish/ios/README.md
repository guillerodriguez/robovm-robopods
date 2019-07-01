# PollFish iOS

## Sample app

TODO

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `pollfish.framework`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>
    </frameworkPaths>
    <frameworks>
        <framework>pollfish</framework>
    </frameworks>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "io.github.dkimitsa.robovm:robopods-pollfish-ios:$altpodsVersion"
}
```

## Pollfish home page

[Link](https://www.pollfish.com/docs/ios)