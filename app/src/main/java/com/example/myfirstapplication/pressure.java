package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class pressure extends AppCompatActivity implements SensorEventListener {

    private static final String TAG = "Pressure";
    private SensorManager sensorManager;
    Sensor pressure;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);

        Log.d(TAG, "onCreate: Initializing Sensor Service ");
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        pressure = sensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE);
        sensorManager.registerListener(this, pressure, SensorManager.SENSOR_DELAY_NORMAL);
        Log.d(TAG, "onCreate: Registered pressure listener");
    }

    public void goBack(View view) {
        Intent returnIntent = new Intent();
        setResult(RESULT_OK, returnIntent);

        super.onBackPressed();
    }

    public void nextPage(View view) {
        startActivity(new Intent(this, MainActivity3.class));
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        Log.d(TAG, "onSensorChanged:" + sensorEvent.values[0]);
        TextView textView = findViewById(R.id.tvPressureValue);
        textView.setText("Pressure: " + sensorEvent.values[0] + " hPa");  // Update the TextView with the new pressure value
        System.out.println(sensorEvent.values[0]);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}