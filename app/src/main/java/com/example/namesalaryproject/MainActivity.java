package com.example.namesalaryproject;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {

    private MaterialTextView main_LBL_name;
    private MaterialTextView main_LBL_salary;
    private EditText main_INPUTTXT_name;
    private EditText main_INPUTTXT_salary;
    private MaterialButton main_BTN_Enter;

    private String nameText = "Hi your name is ";
    private String salaryText = "and your salary is ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_INPUTTXT_name = findViewById(R.id.main_INPUTTXT_name);
        main_INPUTTXT_salary = findViewById(R.id.main_INPUTTXT_salary);

        main_LBL_name = findViewById(R.id.main_LBL_name);
        main_LBL_salary = findViewById(R.id.main_LBL_salary);
        main_BTN_Enter = findViewById(R.id.main_BTN_Enter);

        main_LBL_name.setText(nameText);
        main_LBL_salary.setText(salaryText);

        main_BTN_Enter.setOnClickListener(view -> changeNameAndSalary());
    }


    private void changeNameAndSalary() {
        if(main_INPUTTXT_name.getText().length()>0 && main_INPUTTXT_salary.getText().length()>0) {
            main_LBL_name.setText(nameText + main_INPUTTXT_name.getText());
            main_LBL_name.setBackgroundResource(R.color.teal_200);
            main_LBL_salary.setText("and your salary is " + main_INPUTTXT_salary.getText());
            main_LBL_salary.setBackgroundResource(R.color.teal_200);
        }
        else{
            main_LBL_name.setText("Try again!");
            main_LBL_name.setBackgroundResource(R.color.teal_200);
            main_LBL_salary.setText("No name or salary");
            main_LBL_salary.setBackgroundResource(R.color.teal_200);
        }
    }
}