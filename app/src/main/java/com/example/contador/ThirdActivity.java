package com.example.contador;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    private Button buttonSort;
    private Button buttonNewCountdown;
    private TextView textViewCountdownDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        buttonNewCountdown = findViewById(R.id.buttonNewCountdown);
        textViewCountdownDetails = findViewById(R.id.textViewCountdownDetails);

        buttonSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this, "Sort button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        buttonNewCountdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);
                startActivity(intent);
            }
        });

        // Verificação dos objetos
        if (getIntent().hasExtra("countdown")) {
            Countdown countdown = (Countdown) getIntent().getSerializableExtra("countdown");
            String countdownDetails = "Countdown Name: " + countdown.getName() + "\n" +
                    "Start Date: " + countdown.getStartDate() + "\n" +
                    "Repeat Weekly: " + countdown.isRepeatWeekly() + "\n" +
                    "Repeat Monthly: " + countdown.isRepeatMonthly() + "\n" +
                    "Repeat Annually: " + countdown.isRepeatAnnually() + "\n" +
                    "Remind 1 Day Before: " + countdown.isRemindOneDayBefore() + "\n" +
                    "Remind 1 Week After: " + countdown.isRemindOneWeekAfter() + "\n" +
                    "Color: " + countdown.getColor();
            textViewCountdownDetails.setText(countdownDetails);
        } else {
            textViewCountdownDetails.setText("No countdown data received");
        }
    }
}