package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.FormatException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = findViewById(R.id.addButton);
        Button subButton = findViewById(R.id.subButton);
        Button divButton = findViewById(R.id.divButton);
        Button multButton = findViewById(R.id.multButton);
        EditText input1 = findViewById(R.id.firstNumber);
        EditText input2 = findViewById(R.id.secondNumber);
        TextView result = findViewById(R.id.result);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double i = Double.parseDouble(String.valueOf(input1.getText()));
                    double j = Double.parseDouble(String.valueOf(input2.getText()));
                    double r = i+j;
                    result.setText(String.valueOf(r));
                } catch (NumberFormatException e) {
                    result.setText("Invalid input(s)");
                }
            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double i = Double.parseDouble(String.valueOf(input1.getText()));
                    double j = Double.parseDouble(String.valueOf(input2.getText()));
                    double r = i-j;
                    result.setText(String.valueOf(r));
                } catch (NumberFormatException e) {
                    result.setText("Invalid input(s)");
                }
            }
        });

        multButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double i = Double.parseDouble(String.valueOf(input1.getText()));
                    double j = Double.parseDouble(String.valueOf(input2.getText()));
                    double r = i*j;
                    result.setText(String.valueOf(r));
                } catch (NumberFormatException e) {
                    result.setText("Invalid input(s)");
                }
            }
        });

        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double i = Double.parseDouble(String.valueOf(input1.getText()));
                    double j = Double.parseDouble(String.valueOf(input2.getText()));

                    if (j == 0) {
                        result.setText("Cannot divide by 0");
                    } else {
                        double r = i / j;
                        result.setText(String.valueOf(r));
                    }
                } catch (NumberFormatException e) {
                    result.setText("Invalid input(s)");
                }

            }
        });
    }
}