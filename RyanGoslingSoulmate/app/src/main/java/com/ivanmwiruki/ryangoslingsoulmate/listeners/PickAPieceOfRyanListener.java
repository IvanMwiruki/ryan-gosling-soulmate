package com.ivanmwiruki.ryangoslingsoulmate.listeners;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import com.ivanmwiruki.ryangoslingsoulmate.PickAMovieActivity;

public final class PickAPieceOfRyanListener extends AppCompatActivity
        implements View.OnClickListener {

    private static final String TAG = PickAnEmojiListener.class.getSimpleName();

    @Override
    public void onClick(View v) {
        Log.d(TAG, "clicked");

        Intent i = new Intent(getApplicationContext(), PickAMovieActivity.class);
        finish();
        startActivity(i);
    }
}
