package com.ivanmwiruki.ryangoslingsoulmate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.ivanmwiruki.ryangoslingsoulmate.listeners.PickAnEmojiListener;

public class PickAnEmojiActivity extends AppCompatActivity {

    private Button emojiSkull;
    private Button emojiWet;
    private Button emojiGirl;
    private PickAnEmojiListener pickAnEmojiListener = new PickAnEmojiListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_an_emoji);

        emojiSkull = (Button) findViewById(R.id.emojiSkull);
        emojiWet = (Button) findViewById(R.id.emojiWet);
        emojiGirl = (Button) findViewById(R.id.emojiGirl);

        emojiSkull.setOnClickListener(pickAnEmojiListener);
        emojiWet.setOnClickListener(pickAnEmojiListener);
        emojiGirl.setOnClickListener(pickAnEmojiListener);
    }
}
