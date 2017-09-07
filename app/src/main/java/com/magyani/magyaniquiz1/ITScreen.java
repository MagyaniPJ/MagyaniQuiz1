package com.magyani.magyaniquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ITScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_screen);
    }

    public void goToCS (View view){
        Intent intent = new Intent(this, CSScreen.class);
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
