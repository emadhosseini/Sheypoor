package com.example.emad.sheypoor;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by emad on 04/12/2017.
 */

public class MyButtonLight extends android.support.v7.widget.AppCompatButton {
    public MyButtonLight(Context context) {
        super(context);
        init();
    }

    public MyButtonLight(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyButtonLight(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    init();
    }

    public void init(){
        if (!isInEditMode()){
            Typeface Font=Typeface.createFromAsset(getContext().getAssets(),"Font/IRANYekanMobileLight.ttf");
            this.setTypeface(Font);
        }
    }
}
