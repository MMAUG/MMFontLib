package org.mmaug.mmfont;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class MM3 extends TextView {

	public MM3(Context context) {
		super(context);
		setStyle(context);
	}

	public MM3(Context context, AttributeSet attrs) {
		super(context, attrs);
		setStyle(context);
	}

	public MM3(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		setStyle(context);
	}

	private void setStyle(Context context) {
		setTypeface(Typeface.createFromAsset(context.getAssets(),
				"fonts/mm3.ttf"));
	}

}
