# Lottie iOS

## Sample app

[Link](https://github.com/dkimitsa/robovm-samples/tree/alt/robopods/lottie/ios)

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `Lottie.framework`. Easiest way is to use [Carthage](https://github.com/Carthage/Carthage#installing-carthage). Refer sample application above for [fetch-natives.sh] script which does this.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>
    </frameworkPaths>
    <frameworks>
        <framework>Lottie</framework>
    </frameworks>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "io.github.dkimitsa.robovm:robopods-lottie-ios:$altpodsVersion"
}
```

## Lottie home page

[Link](https://github.com/airbnb/lottie-ios)