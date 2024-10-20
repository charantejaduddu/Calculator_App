package com.example.simple_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2, et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Initialize the EditText fields correctly
        et1 = findViewById(R.id.editTextNumber);
        et2 = findViewById(R.id.editTextNumber2);
        et3 = findViewById(R.id.editTextNumber3);
    }

    public void ADD(View v) {
        // Retrieve numbers from the first two EditTexts
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());

        // Perform the addition
        int result = n1 + n2;

        // Display the result in the third EditText
        et3.setText("Total Value: " + result);
    }

    public void SUBTRACT(View v) {
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 - n2;
        et3.setText("Total Value: " + result);
    }

    public void MULTIPLY(View v) {
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 * n2;

        et3.setText("Total Value: " + result);
    }

    public void DIVIDE(View v) {
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());

        // Check for division by zero
        if (n2 != 0) {
            int result = n1 / n2;
            et3.setText("Total Value: " + result);
        } else {
            et3.setText("Error: Division by Zero");
        }
    }
}
