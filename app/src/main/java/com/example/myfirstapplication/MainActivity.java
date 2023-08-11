package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view) {
        TextView txtHello = findViewById(R.id.textView);
        txtHello.setText("Hello Zhiyuan");
    }

    public void add(View view) {
        EditText et1 = findViewById(R.id.editTextNumber);
        EditText et2 = findViewById(R.id.editTextNumber2);

        int firstNum = Integer.parseInt(et1.getText().toString());
        int secondNUm = Integer.parseInt(et2.getText().toString());

        TextView txtResult = findViewById((R.id.result));
        int res = firstNum + secondNUm;
        txtResult.setText("This is: " + res);
    }

    public void nextPage(View view) {
        startActivity(new Intent(this, MainActivity2.class));
    }
}