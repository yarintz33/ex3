package com.example.ex3;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Post.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract PostDao postDao();

}