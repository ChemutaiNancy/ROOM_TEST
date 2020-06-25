package com.example.room;

import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface UserDao {
    @Query("SELECT * FROM USER")
    List<User> getAllUsers();

    @Insert
    void insertAll(User...users);
}
