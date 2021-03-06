package com.ivanmwiruki.ryangoslingsoulmate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

public class NoahActivity extends AppCompatActivity {

    private static final String TAG = NoahActivity.class.getSimpleName();
    private Button startOver;
    private Context mContext;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noah);
        mContext = this;

        startOver = (Button) findViewById(R.id.startOverNoah);
        startOver.setOnClickListener(v -> {
            Log.d(TAG, "clicked");
            i = new Intent(mContext, MainActivity.class);
            finish();
            startActivity(i);
            Toast.makeText(mContext, "Started over", Toast.LENGTH_SHORT).show();
        });
    }
}
