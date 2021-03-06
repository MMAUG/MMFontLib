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

package org.mmaug.mmfont.fonts;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import org.mmaug.mmfont.utils.FontCache;

public class MSP extends TextView {

  public MSP(Context context) {
    super(context);
    setStyle(context);
  }

  public MSP(Context context, AttributeSet attrs) {
    super(context, attrs);
    setStyle(context);
  }

  public MSP(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
    setStyle(context);
  }

  private void setStyle(Context context) {
    setTypeface(FontCache.get("msp.ttf", context));
  }
}
