package com.example.project_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SetStatus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_status);

        Spinner mySpinner = (Spinner) findViewById(R.id.UserInterest);

//        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(SetStatus.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.interests));
//
//        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        mySpinner.setAdapter(myAdapter);
    }
}