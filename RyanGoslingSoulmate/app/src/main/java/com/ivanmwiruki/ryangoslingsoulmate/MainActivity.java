package com.ivanmwiruki.ryangoslingsoulmate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.start);
        start.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), PickAnEmojiActivity.class);
            finish();
            startActivity(i);
        });
    }
}
