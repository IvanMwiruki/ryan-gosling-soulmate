package com.ivanmwiruki.ryangoslingsoulmate.listeners;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public final class GoBackButtonListener extends AppCompatActivity
        implements OnClickListener {

    private static final String TAG = "GoBackButtonListener";

    @Override
    public void onClick(View v) {
        Log.d(TAG, "clicked");

        finish();
    }
}
