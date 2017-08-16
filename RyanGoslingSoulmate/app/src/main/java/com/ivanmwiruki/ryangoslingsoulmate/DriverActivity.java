package com.ivanmwiruki.ryangoslingsoulmate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.ivanmwiruki.ryangoslingsoulmate.listeners.StartOverButtonListener;

public class DriverActivity extends AppCompatActivity {

    private Button startOver;
    private StartOverButtonListener startOverButtonListener = new StartOverButtonListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);

        startOver = (Button) findViewById(R.id.startOver);
        startOver.setOnClickListener(startOverButtonListener);
    }
}
