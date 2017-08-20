package com.ivanmwiruki.ryangoslingsoulmate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class PickAMovieActivity extends AppCompatActivity {

    private Button movieTheFastAndFurious;
    private Button movieTheHangover;
    private Button movieTitanic;
    private Button back;
    private Context mContext;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_a_movie);
        mContext = this;

        movieTheFastAndFurious = (Button) findViewById(R.id.movieTheFastAndFurious);
        movieTheHangover = (Button) findViewById(R.id.movieTheHangover);
        movieTitanic = (Button) findViewById(R.id.movieTitanic);
        back = (Button) findViewById(R.id.backMovie);

        //TODO: refactor repetitive listeners into 1 class or switch case
        movieTheFastAndFurious.setOnClickListener(v -> {
            i = new Intent(mContext, NoahActivity.class);
            finish();
            startActivity(i);
        });
        movieTheHangover.setOnClickListener(v -> {
            i = new Intent(mContext, JacobActivity.class);
            finish();
            startActivity(i);
        });
        movieTitanic.setOnClickListener(v -> {
            i = new Intent(mContext, DriverActivity.class);
            finish();
            startActivity(i);
        });
        back.setOnClickListener(v -> {
            i = new Intent(mContext, PickAnEmojiActivity.class);
            finish();
            startActivity(i);
        });
    }
}
