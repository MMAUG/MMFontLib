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

/*
 * FontCache solution via http://stackoverflow.com/a/16902532/2438460
 */

package org.mmaug.mmfont.utils;

import android.content.Context;
import android.graphics.Typeface;
import java.util.Hashtable;

/**
 * Created by Ye Lin Aung on 14/08/09.
 */

public class FontCache {
  private static Hashtable<String, Typeface> fontCache = new Hashtable<String, Typeface>();

  /**
   * @param name - name of the font with *.ttf extention
   * @param context - require context for getAssets
   * @return the new Typeface
   */
  public static Typeface get(String name, Context context) {
    Typeface tf = fontCache.get(name);
    if (tf == null) {
      try {
        tf = Typeface.createFromAsset(context.getAssets(), "fonts/" + name);
      } catch (Exception e) {
        e.printStackTrace();
      }
      fontCache.put(name, tf);
    }
    return tf;
  }
}
