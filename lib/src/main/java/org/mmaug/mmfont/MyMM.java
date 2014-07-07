package org.mmaug.mmfont;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class MyMM extends TextView {

	public MyMM(Context context) {
		super(context);
		setStyle(context);
	}

	public MyMM(Context context, AttributeSet attrs) {
		super(context, attrs);
		setStyle(context);
	}

	public MyMM(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		setStyle(context);
	}

	private void setStyle(Context context) {
		setTypeface(Typeface.createFromAsset(context.getAssets(),
				"fonts/MyMM.ttf"));
	}
}
