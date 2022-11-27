# Android Chart
[![](https://jitpack.io/v/fajaragungpramana/chart.svg)](https://jitpack.io/#fajaragungpramana/chart)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
</br>
</br>
Library for android. For chart view.

## Installation
Add it in your root settings.gradle at the end of repositories:
```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
Add the dependency:
```gradle
dependencies {
	implementation 'com.github.fajaragungpramana:chart:0.0.1'
}
```

## Usage HorizontalBarChart
Define a view in your layout file:
```xml
<?xml version="1.0" encoding="utf-8"?>
<com.github.fajaragungpramana.chart.view.HorizontalBarChart
        android:id="@+id/hbc_view"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:layout_gravity="center" />
```

To set data of horizontal bar chart:
```kotlin
val horizontalBarChart = findViewById<HorizontalBarChart>(R.id.hbc_view)

val percentages = arrayListOf(50, 30)
val backgrounds = arrayListOf(Color.RED, Color.YELLOW)

horizontalBarChart.submitPercentage(percentages)
horizontalBarChart.submitBackground(backgrounds)
```

## License
Copyright 2022 Fajar Agung Pramana

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
