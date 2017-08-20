package com.ivanmwiruki.ryangoslingsoulmate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

public class PickAnEmojiActivity extends AppCompatActivity {

    private static final String TAG = PickAnEmojiActivity.class.getSimpleName();
    private Button emojiSkull;
    private Button emojiWet;
    private Button emojiGirl;
    private Context mContext;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_an_emoji);
        mContext = this;

        emojiSkull = (Button) findViewById(R.id.emojiSkull);
        emojiWet = (Button) findViewById(R.id.emojiWet);
        emojiGirl = (Button) findViewById(R.id.emojiGirl);

        //TODO: refactor repetitive listeners into 1 class or switch case
        emojiSkull.setOnClickListener(v -> {
            Log.d(TAG, "emojiSkull clicked");
            i = new Intent(mContext, PickAPieceOfRyanActivity.class);
            finish();
            startActivity(i);
        });
        emojiWet.setOnClickListener(v -> {
            Log.d(TAG, "emojiWet clicked");
            i = new Intent(mContext, PickAPieceOfRyanActivity.class);
            finish();
            startActivity(i);
        });
        emojiGirl.setOnClickListener(v -> {
            Log.d(TAG, "emojiGirl clicked");
            i = new Intent(mContext, PickAPieceOfRyanActivity.class);
            finish();
            startActivity(i);
        });
    }
}
