MMFont
======

Myanmar font embedded TextViews. Currently, it supports
- Myanmar 3
- Masterpiece
- MyMyanmar
- Yunghkio
- Zawgyi One
- NotoSans Myanmar Regular
- NotoSans Myanmar Bold

Sample
------
Checkout [sample app](https://github.com/MMAUG/MMFontLib/blob/master/sample).

<img src="https://cloud.githubusercontent.com/assets/275120/3637479/248483ea-100c-11e4-9a1a-0cb9412a3d16.png" alt="Screenshot 1" style="width: 300px; height: 500px;"/>
<img src="https://cloud.githubusercontent.com/assets/275120/3637480/288b5c02-100c-11e4-881e-145234009cec.png" alt="Screenshot 2" style="width: 300px; height: 500px;"/>


Quick Start
-----------
MMFont Lib is pushed to Maven Central as an AAR, so you just need to add the following dependency to your build.gradle.

```Groovy
dependencies {
    compile 'org.mmaug.mmfont:library:1.1.0'
}
```

Replace your `TextView` with embedded view.

```xml
<org.mmodroid.mmfont.MM3
    android:id="@+id/tv_mm3"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:textSize="25sp" />
```

Contributing
------------

 1. Fork it
 2. Create your feature branch (`git checkout -b my-new-feature`)
 3. Commit your changes (`git commit -am 'Added some feature'`)
 4. Push to the branch (`git push origin my-new-feature`)
 5. Create new Pull Request

License
--------

    Copyright 2014 Myanmar Android User Group(MMAUG)

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


Fonts are respectively copyrighted by font owners.
