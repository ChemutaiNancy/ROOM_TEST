package com.example.room;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class CreateUser extends AppCompatActivity {

    public static final String TAG = "CreateUser";

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    EditText firstname;
    EditText lastname;
    EditText email;
    Button saveuser;

    ArrayList<String> users;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setContentView(R.layout.create_user);

        recyclerView = findViewById(R.id.recycler_view);

        firstname = findViewById(R.id.first_name);
        lastname = findViewById(R.id.last_name);
        email = findViewById(R.id.email);
        saveuser = findViewById(R.id.button);

        users = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            users.add("Daniel #" + 1);
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new UserAdapter(users);
        recyclerView.setAdapter(adapter);

        saveuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                save to db
                Log.d(TAG, "onClick: Firstname:" + firstname.getText().toString());
            }
        });
    }
}
