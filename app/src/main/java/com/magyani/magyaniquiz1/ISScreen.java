package com.magyani.magyaniquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ISScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_is_screen);
    }

    public void goToHome (View view) {
        Intent intent = new Intent(this, MainScreen.class);
        startActivity(intent);
    }

    public void goToCS (View view){
        Intent intent = new Intent(this, CSScreen.class);
        startActivity(intent);
    }

    public void goToIT (View view){
        Intent intent = new Intent(this, ITScreen.class);
        startActivity(intent);
    }

}