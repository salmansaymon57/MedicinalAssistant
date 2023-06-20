package com.example.robin.medicinalassistant;

import android.app.TimePickerDialog;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import static com.example.robin.medicinalassistant.R.id.noon_alarm_text;

public class reminder extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

        Button button1 = (Button) findViewById(R.id.morning_alarm_button);
        Button button2 = (Button) findViewById(R.id.noon_alarm_button);
        Button button3 = (Button) findViewById(R.id.night_alarm_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                DialogFragment timePicker1 = new TimePickerFragment();
                timePicker1.show(getSupportFragmentManager(),"time picker");

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                DialogFragment timePicker2 = new TimePickerFragment();
                timePicker2.show(getSupportFragmentManager(),"time picker");

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                DialogFragment timePicker3 = new TimePickerFragment();
                timePicker3.show(getSupportFragmentManager(),"time picker");

            }
        });
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

        TextView textview1 = (TextView) findViewById(R.id.morning_alarm_text);
        textview1.setText("Hour: "+hourOfDay + " Minute: "+minute);
    }



}
