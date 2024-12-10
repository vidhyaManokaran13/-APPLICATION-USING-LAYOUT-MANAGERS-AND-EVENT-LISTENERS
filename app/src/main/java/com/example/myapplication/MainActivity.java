package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText, regNoEditText;
    private Spinner departmentSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.nameEditText);
        regNoEditText = findViewById(R.id.regNoEditText);
        departmentSpinner = findViewById(R.id.departmentSpinner);
        Button submitButton = findViewById(R.id.submitButton);

        setupDepartmentSpinner();

        submitButton.setOnClickListener(v -> submitForm());
    }

    private void setupDepartmentSpinner() {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.departments_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        departmentSpinner.setAdapter(adapter);
    }

    private void submitForm() {
        Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
        intent.putExtra("name", nameEditText.getText().toString());
        intent.putExtra("regNo", regNoEditText.getText().toString());
        intent.putExtra("department", departmentSpinner.getSelectedItem().toString());
        startActivity(intent);
    }
}
