package com.example.projetosofrimento;

import android.content.Context;
import android.util.AttributeSet;

import com.google.android.material.bottomappbar.BottomAppBar;

public class CustomAppBar extends BottomAppBar {

    public CustomAppBar(Context context) {
        super(context);
        init();
    }

    public CustomAppBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomAppBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {

    }
}
