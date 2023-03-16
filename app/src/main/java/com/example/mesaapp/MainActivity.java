package com.example.mesaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginactivity);

        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextNumberPassword = (EditText) findViewById((R.id.editTextNumberPassword));
                TextView errorTextView = (TextView) findViewById((R.id.errorTextView));
                String passwordEntered = editTextNumberPassword.getText().toString();
                if(passwordEntered.equals(getResources().getString(R.string.prompt_password))) {setContentView(R.layout.loginactivity);}
                else{
                    errorTextView.setText("Incorrect password");
                }
            }
        });

    }
}