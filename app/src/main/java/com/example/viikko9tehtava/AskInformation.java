package com.example.viikko9tehtava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;


public class AskInformation extends AppCompatActivity {

    private EditText FirstName;
    private EditText LastName;
    private EditText Email;
    private String DegreeProgram;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_information);

        FirstName = findViewById(R.id.editTextFirstName);

        LastName = findViewById(R.id.editTextLastName);
        Email = findViewById(R.id.editTextEmail);

    }

    public void addUser(View view) {

        UserStorage us = UserStorage.getInstance();  // luodaan uusi Singleton UserStoragesta uusi olio


        RadioGroup rgDegreeProgram = findViewById(R.id.rgDergees);

        switch (rgDegreeProgram.getCheckedRadioButtonId()) {
            case R.id.rbTite:
                DegreeProgram = "Tietotekniikka";
                break;
            case R.id.rbTuta:
                DegreeProgram = "Tuotantotalous";
            case R.id.rbLate:
                DegreeProgram = "Laskennallinen tekniikka";
                break;
            case R.id.rbSätky:
                DegreeProgram = "Sähkötekniikka";
        }

        // lisätääm käyttäjä
        us.addUser(new User(FirstName.getText().toString(), LastName.getText().toString(), Email.getText().toString(), DegreeProgram));



    }
}