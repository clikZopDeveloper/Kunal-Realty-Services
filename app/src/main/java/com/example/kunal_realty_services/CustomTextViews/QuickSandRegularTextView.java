package com.example.kunal_realty_services.CustomTextViews;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class QuickSandRegularTextView extends AppCompatTextView {

    public QuickSandRegularTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public QuickSandRegularTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public QuickSandRegularTextView(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "font/roboto_regular.ttf");
            setTypeface(tf);
        }
    }

}
