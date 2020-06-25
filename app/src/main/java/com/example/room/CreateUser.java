package com.example.room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class CreateUser extends AppCompatActivity {

    EditText firstname;
    EditText lastname;
    EditText email;
    Button saveuser;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_user);

        firstname = findViewById(R.id.first_name);
        lastname = findViewById(R.id.last_name);
        email = findViewById(R.id.email);
        saveuser = findViewById(R.id.button);

        saveuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                save to db

            }
        });
    }
}
