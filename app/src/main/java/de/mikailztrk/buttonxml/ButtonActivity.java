package de.mikailztrk.buttonxml;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ButtonActivity extends AppCompatActivity {


    View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        v = findViewById(R.id.hintergrund);
    }

    public void klickRed (View view) {
        v.setBackgroundColor(Color.RED);
    }

    public void klickGreen (View view) {
        v.setBackgroundColor(Color.GREEN);
    }

    public void klickBlue (View view) {
        v.setBackgroundColor(Color.BLUE);
    }

    public void klickWhite (View view) {
        v.setBackgroundColor(Color.WHITE);
    }

    public void Random (View view) {

    }


}
