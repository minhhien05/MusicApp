package com.minhien.musicappasm;


import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


public class CustomsFont extends TextView {

    /*
     * Caches typefaces based on their file path and name, so that they don't have to be created every time when they are referenced.
     */
    private static Typeface mTypeface;

    public CustomsFont(final Context context) {
        this(context, null);
    }

    public CustomsFont(final Context context, final AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomsFont(final Context context, final AttributeSet attrs, final int defStyle) {
        super(context, attrs, defStyle);

        if (mTypeface == null) {
            mTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Metropolis-SemiBold.otf");
        }
        setTypeface(mTypeface);
    }

}