package com.ivanmwiruki.ryangoslingsoulmate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class DriverActivity extends AppCompatActivity {

    private Button startOver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);

        startOver = (Button) findViewById(R.id.startOver);
    }
}
