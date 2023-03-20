package com.example.viikko9tehtava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchToAskInformation(View view) {
        Intent intent = new Intent(this, AskInformation.class);
        startActivity(intent);
    }

    public void switchToListStudents(View view) {
        Intent intent = new Intent(this, ListStudents.class);
        startActivity(intent);
    }
}