package com.example.android.kaustav;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class SignIn extends AppCompatActivity {

    EditText edtphone, edtpassword;
    Button signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_layout);

        edtphone = (EditText) findViewById(R.id.edtphone);
        edtpassword = (EditText) findViewById(R.id.edtpassword);
        signIn = (Button) findViewById(R.id.signIn);
        Toast.makeText(getApplicationContext(),"here",Toast.LENGTH_SHORT);




    }
}
