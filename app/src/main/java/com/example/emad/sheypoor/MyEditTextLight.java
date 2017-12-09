package com.example.emad.sheypoor;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by emad on 04/12/2017.
 */

public class MyEditTextLight extends android.support.v7.widget.AppCompatEditText {
    public MyEditTextLight(Context context) {
        super(context);
        init();
    }

    public MyEditTextLight(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyEditTextLight(Context context, AttributeSet attrs, int defStyleAttr) {
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
