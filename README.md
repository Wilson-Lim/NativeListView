
# react-native-native-list-view

## Getting started

`$ npm install react-native-native-list-view --save`

### Mostly automatic installation

`$ react-native link react-native-native-list-view`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-native-list-view` and add `RNNativeListView.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNNativeListView.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNNativeListViewPackage;` to the imports at the top of the file
  - Add `new RNNativeListViewPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-native-list-view'
  	project(':react-native-native-list-view').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-native-list-view/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-native-list-view')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNNativeListView.sln` in `node_modules/react-native-native-list-view/windows/RNNativeListView.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Native.List.View.RNNativeListView;` to the usings at the top of the file
  - Add `new RNNativeListViewPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNNativeListView from 'react-native-native-list-view';

// TODO: What to do with the module?
RNNativeListView;
```
  