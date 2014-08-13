package com.example.zhangyangjing.touchtest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;


public class GroupOne extends RelativeLayout {

    public GroupOne(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.w("zyj", "GroupOne dispatchTouchEvent:" + ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.w("zyj", "GroupOne onInterceptTouchEvent:" + ev.getAction());
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Log.w("zyj", "GroupOne onTouchEvent:" + ev.getAction());
        return super.onTouchEvent(ev);
    }
}
