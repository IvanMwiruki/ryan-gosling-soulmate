package com.ivanmwiruki.ryangoslingsoulmate;

import android.content.Intent;
import android.view.View;

public class ButtonListener implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        finish();
        startActivity(intent);
    }
}
