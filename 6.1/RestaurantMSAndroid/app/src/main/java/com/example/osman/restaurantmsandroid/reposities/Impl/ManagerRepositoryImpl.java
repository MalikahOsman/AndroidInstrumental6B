package com.example.osman.restaurantmsandroid.reposities.Impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.osman.restaurantmsandroid.conf.databases.DBConstants;
import com.example.osman.restaurantmsandroid.domain.RestaurantManager;
import com.example.osman.restaurantmsandroid.reposities.ManagerRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Osman on 2016-04-23.
 */
public class ManagerRepositoryImpl extends SQLiteOpenHelper implements ManagerRepository{
    public static final String TABLE_NAME = "managerTable";
    private SQLiteDatabase db;

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_USER_NAME = "userName";
    public static final String COLUMN_PASSWORD = "password";
    public static final String COLUMN_EMPLOYEE_NUMBER = "empNum";
    public static final String COLUMN_EMPLOYEE_NAME = "empName";
    public static final String COLUMN_ADDRESS = "address";
    public static final String COLUMN_TELEPHONE = "telephone";

    //Database creation sql statement
    private static final String DATABASE_CREATE = " CREATE TABLE "
            + TABLE_NAME + " ("
            + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_USER_NAME + "TEXT NOT NULL , "
            + COLUMN_PASSWORD + "TEXT NOT NULL ), "
            + COLUMN_EMPLOYEE_NUMBER + "TEXT NOT NULL ), "
            + COLUMN_EMPLOYEE_NAME + "TEXT NOT NULL ), "
            + COLUMN_ADDRESS + "TEXT NOT NULL ), "
            + COLUMN_TELEPHONE + "TEXT NOT NULL );";

    public ManagerRepositoryImpl (Context context){
        super(context, DBConstants.DATABASE_NAME, null, DBConstants.DATABASE_VERSION);

    }

    public void open() throws SQLException {
        db = this.getWritableDatabase();
    }

    public void close(){
        this.close();
    }

    @Override
    public RestaurantManager findById(Long id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(
                TABLE_NAME,
                new String[]{
                        COLUMN_ID,
                        COLUMN_USER_NAME,
                        COLUMN_PASSWORD,
                        COLUMN_EMPLOYEE_NUMBER,
                        COLUMN_EMPLOYEE_NAME,
                        COLUMN_ADDRESS,
                        COLUMN_TELEPHONE},
                COLUMN_ID + " =? ",
                new String[]{String.valueOf(id)},
                null,
                null,
                null,
                null);

        if(cursor.moveToFirst()){
            final RestaurantManager RestaurantManager = new RestaurantManager.Builder()
                    .id(cursor.getLong(cursor.getColumnIndex(COLUMN_ID)))
                    .userName(cursor.getString(cursor.getColumnIndex(COLUMN_USER_NAME)))
                    .password(cursor.getString(cursor.getColumnIndex(COLUMN_PASSWORD)))
                    .empNum(cursor.getString(cursor.getColumnIndex(COLUMN_EMPLOYEE_NUMBER)))
                    .empName(cursor.getString(cursor.getColumnIndex(COLUMN_EMPLOYEE_NAME)))
                    .address(cursor.getString(cursor.getColumnIndex(COLUMN_ADDRESS)))
                    .telephone(cursor.getString(cursor.getColumnIndex(COLUMN_TELEPHONE)))
                    .build();
            return RestaurantManager;
        }else{
            return null;
        }
    }

    @Override
    public RestaurantManager save(RestaurantManager entity) {
        open();
        ContentValues values = new ContentValues();
        values.put(COLUMN_ID, entity.getId());
        values.put(COLUMN_USER_NAME, entity.getUserName());
        values.put(COLUMN_PASSWORD, entity.getPassword());
        values.put(COLUMN_EMPLOYEE_NUMBER, entity.getEmpNum());
        values.put(COLUMN_EMPLOYEE_NAME, entity.getEmpName());
        values.put(COLUMN_ADDRESS, entity.getAddress());
        values.put(COLUMN_TELEPHONE, entity.getTelephone());

        long id = db.insertOrThrow(TABLE_NAME, null, values);
        RestaurantManager insertedEntity = new RestaurantManager.Builder()
                .copy(entity)
                .id(new Long (id))
                .build();
        return insertedEntity;
    }

    @Override
    public RestaurantManager update(RestaurantManager entity) {
        open();
        ContentValues values = new ContentValues();
        values.put(COLUMN_ID, entity.getId());
        values.put(COLUMN_USER_NAME, entity.getUserName());
        values.put(COLUMN_PASSWORD, entity.getPassword());
        values.put(COLUMN_EMPLOYEE_NUMBER, entity.getEmpNum());
        values.put(COLUMN_EMPLOYEE_NAME, entity.getEmpName());
        values.put(COLUMN_ADDRESS, entity.getAddress());
        values.put(COLUMN_TELEPHONE, entity.getTelephone());
        db.update(
                TABLE_NAME,
                values,
                COLUMN_ID + " =? ",
                new String[]{String.valueOf(entity.getId())}
        );
        return entity;
    }

    @Override
    public RestaurantManager delete(RestaurantManager entity) {
        open();
        db.delete(
                TABLE_NAME,
                COLUMN_ID + " =? ",
                new String[]{String.valueOf(entity.getId())});
        return entity;

    }

    @Override
    public Set<RestaurantManager> findAll() {
        SQLiteDatabase db = this.getReadableDatabase();
        Set<RestaurantManager> RestaurantManager = new HashSet<>();
        open();

        Cursor cursor = db.query(TABLE_NAME, null,null,null,null,null,null);
        if (cursor.moveToFirst()){
            do{
                final RestaurantManager setting = new RestaurantManager.Builder()
                        .id(cursor.getLong(cursor.getColumnIndex(COLUMN_ID)))
                        .userName(cursor.getString(cursor.getColumnIndex(COLUMN_USER_NAME)))
                        .password(cursor.getString(cursor.getColumnIndex(COLUMN_PASSWORD)))
                        .empNum(cursor.getString(cursor.getColumnIndex(COLUMN_EMPLOYEE_NUMBER)))
                        .empName(cursor.getString(cursor.getColumnIndex(COLUMN_EMPLOYEE_NAME)))
                        .address(cursor.getString(cursor.getColumnIndex(COLUMN_ADDRESS)))
                        .telephone(cursor.getString(cursor.getColumnIndex(COLUMN_TELEPHONE)))
                        .build();
                RestaurantManager.add(setting);
            }while (cursor.moveToFirst());
        }
        return RestaurantManager;
    }

    @Override
    public int deleteAll() {
        open();
        int rowsDeleted = db.delete(TABLE_NAME, null, null);
        close();
        return rowsDeleted;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(this.getClass().getName(),
                " Upgrading database from version " + oldVersion + " to " + newVersion +
                        " which will destroy all old data ");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }
}
