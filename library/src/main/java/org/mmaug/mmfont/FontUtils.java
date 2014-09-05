package org.mmaug.mmfont;

import android.content.Context;
import android.widget.TextView;

/**
 * Created by Ye Lin Aung on 14/09/04.
 */
public class FontUtils {

  public static void setTypeFace(String fontName, Context context, TextView textView) {
    textView.setTypeface(FontCache.get(fontName, context));
  }

  public static void setTypeFace(String fontName, Context context, TextView... textViews) {
    for (TextView t : textViews) {
      t.setTypeface(FontCache.get(fontName, context));
    }
  }
}
