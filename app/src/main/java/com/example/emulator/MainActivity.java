package com.example.emulator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private TextView string;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int myNumber = 82;
        int myNumber2 = 13;
        int sum;
        String name = "No one";

        result = findViewById(R.id.txtDisplay);
        string = findViewById(R.id.txtString);

        sum = myNumber + myNumber2;

        result.setText("The Number 1 Value is : "+myNumber+"\nThe Number 2 Value is : "+myNumber2+"\nThe Sum is: "+sum);
        string.setText("Your name is "+name);
    }
}