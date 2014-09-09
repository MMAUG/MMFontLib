package org.mmaug.mmfont;

import android.content.Context;
import android.widget.TextView;

/**
 * TextView တစ်ခု (သို့) အများအပြားကို Typeface set လုပ်ပေးမည့် Utility methods များ
 *
 * @author Ye Lin Aung me@yelinaung.com
 */
public class FontUtils {

  /**
   * TextView တစ်ခုကို Typeface set လုပ်ခြင်း
   *
   * @param fontName embed လုပ်မည့် font အမည်
   * @param context ဖောင့်များကို {@link FontCache} မှ တဆင့် load လုပ်ရန်အတွက် လိုအပ်သည့် Context
   * @param textView Typeface set လုပ်မည့် TextView
   */

  public static void setTypeFace(String fontName, Context context, TextView textView) {
    textView.setTypeface(FontCache.get(fontName, context));
  }

  /**
   * TextViews များကို Typeface set လုပ်ခြင်း
   *
   * @param fontName embed လုပ်မည့် font အမည်
   * @param context ဖောင့်များကို {@link FontCache} မှ တဆင့် load လုပ်ရန်အတွက် လိုအပ်သည့် Context
   * @param textViews Typeface set လုပ်မည့် TextView များ
   */
  public static void setTypeFace(String fontName, Context context, TextView... textViews) {
    for (TextView t : textViews) {
      t.setTypeface(FontCache.get(fontName, context));
    }
  }
}
