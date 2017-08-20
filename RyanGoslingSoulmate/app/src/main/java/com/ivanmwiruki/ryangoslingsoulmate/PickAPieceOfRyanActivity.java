package com.ivanmwiruki.ryangoslingsoulmate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

public class PickAPieceOfRyanActivity extends AppCompatActivity {

    private static final String TAG = PickAPieceOfRyanActivity.class.getSimpleName();
    private Button pieceEye;
    private Button pieceEar;
    private Button pieceNose;
    private Button back;
    private Context mContext;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_a_piece_of_ryan);
        mContext = this;

        pieceEye = (Button) findViewById(R.id.pieceEye);
        pieceEar = (Button) findViewById(R.id.pieceEar);
        pieceNose = (Button) findViewById(R.id.pieceNose);
        back = (Button) findViewById(R.id.backPiece);

        //TODO: refactor repetitive listeners into 1 class or switch case
        pieceEye.setOnClickListener(v -> {
            Log.d(TAG, "clicked");
            i = new Intent(mContext, PickAMovieActivity.class);
            finish();
            startActivity(i);
        });
        pieceEar.setOnClickListener(v -> {
            Log.d(TAG, "clicked");
            i = new Intent(mContext, PickAMovieActivity.class);
            finish();
            startActivity(i);
        });
        pieceNose.setOnClickListener(v -> {
            Log.d(TAG, "clicked");
            i = new Intent(mContext, PickAMovieActivity.class);
            finish();
            startActivity(i);
        });
        back.setOnClickListener(v -> {
            Log.d(TAG, "clicked");
            i = new Intent(mContext, PickAnEmojiActivity.class);
            finish();
            startActivity(i);
        });
    }
}
