package com.example.zhangyangjing.touchtest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.w("zyj", "Activity dispatchTouchEvent:" + ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Log.w("zyj", "Activity onTouchEvent:" + ev.getAction());
        return super.onTouchEvent(ev);
    }
}
