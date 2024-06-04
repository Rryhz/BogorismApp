package com.example.bogorismapp.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.bogorismapp.database.DatabaseModel;

import java.util.List;


@Dao
public interface DatabaseDao {

    //untuk get semua data
    @Query("SELECT * FROM tbl_bogorism where uid != 1")
    LiveData<List<DatabaseModel>> getAllOrder();

    //untuk login
    @Query("SELECT * FROM tbl_bogorism where username= :username AND password= :password")
    LiveData<List<DatabaseModel>> getUserByName(String username, String password);

    //untuk insert data
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertData(DatabaseModel... modelDatabases);

}
