# Charts iOS

## Sample app

[Link](https://github.com/dkimitsa/robovm-samples/tree/alt/robopods/charts/ios)

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `Charts.framework`. Easiest way is to use [Carthage](https://github.com/Carthage/Carthage#installing-carthage). Refer sample application above for [fetch-natives.sh] script which does this.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>
    </frameworkPaths>
    <frameworks>
        <framework>Charts</framework>
    </frameworks>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "io.github.dkimitsa.robovm:robopods-charts-ios:$altpodsVersion"
}
```

## Charts home page

[Link](https://github.com/danielgindi/Charts)