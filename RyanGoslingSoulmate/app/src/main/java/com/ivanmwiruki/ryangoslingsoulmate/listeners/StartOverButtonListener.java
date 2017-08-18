package com.ivanmwiruki.ryangoslingsoulmate.listeners;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.ivanmwiruki.ryangoslingsoulmate.MainActivity;

public final class StartOverButtonListener extends AppCompatActivity
        implements OnClickListener {

    private static final String TAG = StartOverButtonListener.class.getSimpleName();

    @Override
    public void onClick(View v) {
        Log.d(TAG, "clicked");

        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        finish();
        startActivity(i);
        Toast.makeText(getApplicationContext(), "Started over", Toast.LENGTH_SHORT).show();
    }
}
