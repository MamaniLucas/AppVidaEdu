package com.mamani.myriam.appvidaedu;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String databaseName = "Signup.db";

    public DatabaseHelper(@Nullable Context context) {
        super(context, "Signupdb", null,1 );
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
       MyDatabase.execSQL("create Table allusers(email TEXT primary key, password TEXT)")
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
