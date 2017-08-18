package com.ivanmwiruki.ryangoslingsoulmate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.ivanmwiruki.ryangoslingsoulmate.listeners.PickAPieceOfRyanListener;

public class PickAPieceOfRyanActivity extends AppCompatActivity {

    private Button pieceEye;
    private Button pieceEar;
    private Button pieceNose;
    private PickAPieceOfRyanListener pickAPieceOfRyanListener = new PickAPieceOfRyanListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_a_piece_of_ryan);

        pieceEye = (Button) findViewById(R.id.pieceEye);
        pieceEar = (Button) findViewById(R.id.pieceEar);
        pieceNose = (Button) findViewById(R.id.pieceNose);

        pieceEye.setOnClickListener(pickAPieceOfRyanListener);
        pieceEar.setOnClickListener(pickAPieceOfRyanListener);
        pieceNose.setOnClickListener(pickAPieceOfRyanListener);
    }
}
