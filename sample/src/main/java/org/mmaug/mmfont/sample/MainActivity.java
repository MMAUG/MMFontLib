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

package org.mmaug.mmfont.sample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;
import org.mmaug.mmfont.utils.FontUtils;
import org.mmaug.mmfont.utils.Fonts;

public class MainActivity extends ActionBarActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    TextView zgTextView = (TextView) findViewById(R.id.custom_zg_text);
    TextView uniTextView = (TextView) findViewById(R.id.custom_uni_text);

    FontUtils fontUtils = new FontUtils(this);
    zgTextView.setText(R.string.zg_mm);
    uniTextView.setText(R.string.uni_mm);

    fontUtils.setTypeFace(Fonts.ZG, zgTextView);
    fontUtils.setTypeFace(Fonts.MM3, uniTextView);
  }
}
