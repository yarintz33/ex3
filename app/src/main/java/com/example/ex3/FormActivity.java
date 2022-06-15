package com.example.ex3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

public class FormActivity extends AppCompatActivity {

    private PostDao postDao;
    private AppDataBase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        db = Room.databaseBuilder(getApplicationContext(), AppDataBase.class, "postsDB")
                .allowMainThreadQueries().build();
        postDao = db.postDao();

        Button saveBtn = findViewById(R.id.saveBtn);
        saveBtn.setOnClickListener(view -> {
            EditText editContact = findViewById(R.id.editContact);
            Post post = new Post(0,editContact.getText().toString());
            postDao.insert(post);
            finish();
        });
    }
}