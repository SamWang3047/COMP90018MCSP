package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void goBack(View view) {
        Intent returnIntent = new Intent();
        setResult(RESULT_OK, returnIntent);

        super.onBackPressed();
    }

    public void nextPage(View view) {
        startActivity(new Intent(this, MainActivity3.class));
    }
}