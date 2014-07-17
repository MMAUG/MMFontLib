MMFont
======

Myanmar font embedded TextViews. Currently, it supports
- Myanmar 3
- Masterpiece
- MyMyanmar
- Yunghkio
- Zawgyi One

Sample
------
Checkout [sample app](https://github.com/MMAUG/MMFontLib/blob/master/sample).

Quick Start
-----------
MMFont Lib is pushed to Maven Central as an AAR, so you just need to add the following dependency to your build.gradle.

```Groovy
dependencies {
    compile 'org.mmaug.mmfont:library:1.0.0'
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
