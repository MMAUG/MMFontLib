/*
 * Copyright 2014 Myanmar Android User Group(MMAUG)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mmaug.mmfont.utils;

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
