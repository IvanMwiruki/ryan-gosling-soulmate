package com.ivanmwiruki.ryangoslingsoulmate.listeners;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import com.ivanmwiruki.ryangoslingsoulmate.PickAPieceOfRyanActivity;
import com.ivanmwiruki.ryangoslingsoulmate.R;

public final class PickAnEmojiListener extends AppCompatActivity
        implements OnClickListener {

    private static final String TAG = PickAnEmojiListener.class.getSimpleName();

    @Override
    public void onClick(View v) {

        Intent i;

        //I realize all these cases are the same. Just showing I know what a switch case is
        switch(v.getId()) {
            case R.id.emojiSkull:
                Log.d(TAG, "clicked");
                i  = new Intent(getApplicationContext(), PickAPieceOfRyanActivity.class);
                finish();
                startActivity(i);
                break;
            case R.id.emojiWet:
                Log.d(TAG, "clicked");
                i = new Intent(getApplicationContext(), PickAPieceOfRyanActivity.class);
                finish();
                startActivity(i);
                break;
            case R.id.emojiGirl:
                Log.d(TAG, "clicked");
                i = new Intent(getApplicationContext(), PickAPieceOfRyanActivity.class);
                finish();
                startActivity(i);
                break;
        }
//        Log.d(TAG, "clicked");
//
//        Intent i = new Intent(getApplicationContext(), PickAPieceOfRyanActivity.class);
//        finish();
//        startActivity(i);
    }
}
