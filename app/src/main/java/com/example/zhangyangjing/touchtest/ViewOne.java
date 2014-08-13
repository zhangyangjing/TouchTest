package com.example.zhangyangjing.touchtest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;


public class ViewOne extends View {

    public ViewOne(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.w("zyj", "ViewOne dispatchTouchEvent:" + ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Log.w("zyj", "ViewOne onTouchEvent:" + ev.getAction());
        return super.onTouchEvent(ev);
    }
}
