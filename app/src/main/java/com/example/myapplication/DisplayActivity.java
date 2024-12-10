package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    private TextView displayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        displayTextView = findViewById(R.id.displayTextView);

        // Retrieve the data passed from MainActivity
        String name = getIntent().getStringExtra("name");
        String regNo = getIntent().getStringExtra("regNo");
        String department = getIntent().getStringExtra("department");

        // Display the data
        String details = "Name: " + name + "\n" +
                "Registration No: " + regNo + "\n" +
                "Department: " + department;
        displayTextView.setText(details);
    }
}

