package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void goBack(View view) {
        Intent returnIntent = new Intent();
        setResult(RESULT_OK, returnIntent);

        super.onBackPressed();
    }

    public void login(View view) {
        EditText username = findViewById(R.id.Username);
        EditText password = findViewById(R.id.Password);

        TextView tv = findViewById(R.id.textView3);
        if (username.getText().toString() == "3047" && password.getText().toString() == "1234") {
            tv.setText("Login Success!");
        }

    }
    public void goAcce(View view) {
        startActivity(new Intent(this, accelerometer_main.class));
    }

    public void goPressure(View view) {
        startActivity(new Intent(this, pressure.class));
    }
}