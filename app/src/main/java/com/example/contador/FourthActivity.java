package com.example.contador;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FourthActivity extends AppCompatActivity {

    private EditText editTextCountdownName;
    private DatePicker datePickerStartDate;
    private CheckBox checkBoxWeekly, checkBoxMonthly, checkBoxAnnually;
    private CheckBox checkBoxOneDayBefore, checkBoxOneWeekAfter;
    private RadioGroup radioGroupColor;
    private Button buttonSave, buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        editTextCountdownName = findViewById(R.id.editTextCountdownName);
        datePickerStartDate = findViewById(R.id.datePickerStartDate);
        checkBoxWeekly = findViewById(R.id.checkBoxWeekly);
        checkBoxMonthly = findViewById(R.id.checkBoxMonthly);
        checkBoxAnnually = findViewById(R.id.checkBoxAnnually);
        checkBoxOneDayBefore = findViewById(R.id.checkBoxOneDayBefore);
        checkBoxOneWeekAfter = findViewById(R.id.checkBoxOneWeekAfter);
        radioGroupColor = findViewById(R.id.radioGroupColor);
        buttonSave = findViewById(R.id.buttonSave);
        buttonCancel = findViewById(R.id.buttonCancel);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveCountdown();
            }
        });

        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancel();
            }
        });
    }

    private void saveCountdown() {
        String countdownName = editTextCountdownName.getText().toString();
        int day = datePickerStartDate.getDayOfMonth();
        int month = datePickerStartDate.getMonth() + 1;
        int year = datePickerStartDate.getYear();
        String startDate = day + "/" + month + "/" + year;
        boolean repeatWeekly = checkBoxWeekly.isChecked();
        boolean repeatMonthly = checkBoxMonthly.isChecked();
        boolean repeatAnnually = checkBoxAnnually.isChecked();
        boolean remindOneDayBefore = checkBoxOneDayBefore.isChecked();
        boolean remindOneWeekAfter = checkBoxOneWeekAfter.isChecked();
        int selectedColorId = radioGroupColor.getCheckedRadioButtonId();
        String selectedColor = "None";
        if (selectedColorId != -1) {
            RadioButton radioButton = findViewById(selectedColorId);
            selectedColor = radioButton.getText().toString();
        }


        Countdown countdown = new Countdown(countdownName, startDate, repeatWeekly, repeatMonthly,
                repeatAnnually, remindOneDayBefore, remindOneWeekAfter, selectedColor);

        Intent intent = new Intent(FourthActivity.this, ThirdActivity.class);
        intent.putExtra("countdown", countdown);
        startActivity(intent);
        finish(); // Finaliza a FourthActivity
    }

    private void cancel() {
        finish();
    }
}