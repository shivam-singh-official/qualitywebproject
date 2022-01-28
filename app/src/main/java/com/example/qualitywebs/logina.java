package com.example.qualitywebs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class logina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logina);
    }


    public void signupclick(View view){
        Intent intent= new Intent(this,signupa.class);
        startActivity(intent);
    }

    public void loginclick(View view){
        Intent intent= new Intent(this,afterlogin.class);
        startActivity(intent);
    }
}

