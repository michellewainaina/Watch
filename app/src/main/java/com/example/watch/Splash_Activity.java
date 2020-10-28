package com.example.watch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashpage_);
    }

    public void onClickSignUp(View view){
        Intent intent=new Intent(this,Sign_Up_Activity.class);
        startActivity(intent);

    }
    public void onClickLogIn(View view){
        Intent intent=new Intent(this,LogIn_Activity.class);
        startActivity(intent);
    }
}
