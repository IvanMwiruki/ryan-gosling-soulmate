package com.ivanmwiruki.ryangoslingsoulmate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class PickAMovieActivity extends AppCompatActivity {

    private Button movieTheFastAndFurious;
    private Button movieTheHangover;
    private Button movieTitanic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_a_movie);

        movieTheFastAndFurious = (Button) findViewById(R.id.movieTheFastAndFurious);
        movieTheHangover = (Button) findViewById(R.id.movieTheHangover);
        movieTitanic = (Button) findViewById(R.id.movieTitanic);

        movieTheFastAndFurious.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), NoahActivity.class);
            finish();
            startActivity(i);
        });

        movieTheHangover.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), JacobActivity.class);
            finish();
            startActivity(i);
        });

        movieTitanic.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), DriverActivity.class);
            finish();
            startActivity(i);
        });
    }
}
