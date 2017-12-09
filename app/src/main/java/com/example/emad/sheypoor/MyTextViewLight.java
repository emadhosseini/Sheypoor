package com.example.emad.sheypoor;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by emad on 04/12/2017.
 */

public class MyTextViewLight extends android.support.v7.widget.AppCompatTextView {
    public MyTextViewLight(Context context) {
        super(context);
        init();
    }

    public MyTextViewLight(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextViewLight(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    public void init(){
        if (!isInEditMode()) {
            Typeface Font=Typeface.createFromAsset(getContext().getAssets(),"Font/IRANYekanMobileLight.ttf");
            this.setTypeface(Font);
        }
    }

}
