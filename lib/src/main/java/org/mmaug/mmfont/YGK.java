package org.mmaug.mmfont;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class YGK extends TextView {
	public YGK(Context context) {
		super(context);
		setStyle(context);
	}

	public YGK(Context context, AttributeSet attrs) {
		super(context, attrs);
		setStyle(context);
	}

	public YGK(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		setStyle(context);
	}

	private void setStyle(Context context) {
		setTypeface(Typeface.createFromAsset(context.getAssets(),
				"fonts/yunghkio.ttf"));
	}

}
