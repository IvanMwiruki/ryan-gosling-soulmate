package com.ivanmwiruki.ryangoslingsoulmate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button start;
    private Context mContext;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;

        start = (Button) findViewById(R.id.start);
        start.setOnClickListener(v -> {
            i = new Intent(mContext, PickAnEmojiActivity.class);
            finish();
            startActivity(i);
        });
    }
}
