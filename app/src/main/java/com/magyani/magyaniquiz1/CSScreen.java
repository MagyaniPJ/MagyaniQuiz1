package com.magyani.magyaniquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CSScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs_screen);
    }

    public void goToIT (View view){
        Intent intent = new Intent(this, ITScreen.class);
        startActivity(intent);
    }

    public void goToIS (View view){
        Intent intent = new Intent(this, ISScreen.class);
        startActivity(intent);
    }

    public void goToHome (View view) {
        Intent intent = new Intent(this, MainScreen.class);
        startActivity(intent);
    }
}