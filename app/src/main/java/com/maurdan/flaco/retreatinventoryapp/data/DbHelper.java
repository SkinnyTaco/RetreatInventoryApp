package com.maurdan.flaco.retreatinventoryapp.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = "Database helper";

    public static final String DATABASE_NAME = "inventory.db";

    public static final int DATABASE_VERSION = 1;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        updateDatabase(db, 0, DATABASE_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        updateDatabase(db, oldVersion, newVersion);
    }

    private void updateDatabase(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < 1) {
            String CREATE_VENDORS_TABLE = "CREATE TABLE" + VendorContract.VendorEntry.VENDOR_TABLE_NAME + " ("
                    + VendorContract.VendorEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + VendorContract.VendorEntry.VENDOR_NAME + " TEXT NOT NULL, "
                    + VendorContract.VendorEntry.VENDOR_EMAIL + " TEXT, "
                    + VendorContract.VendorEntry.VENDOR_PHONE + " TEXT);";

            String CREATE_PRODUCTS_TABLE = "CREATE TABLE" + ProductContract.ProductEntry.PRODUCT_TABLE_NAME + " ("
                    + ProductContract.ProductEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + ProductContract.ProductEntry.COLUMN_PRODUCT_NAME + " TEXT NOT NULL, "
                    + ProductContract.ProductEntry.COLUMN_PRODUCT_BRAND + " TEXT NOT NULL, "
                    + ProductContract.ProductEntry.COLUMN_PRODUCT_UNIT + " TEXT, "
                    + ProductContract.ProductEntry.COLUMN_PRODUCT_PAR + " INTEGER, "
                    + ProductContract.ProductEntry.COLUMN_PRODUCT_VENDOR + " TEXT);";

            db.execSQL(CREATE_PRODUCTS_TABLE);
            db.execSQL(CREATE_VENDORS_TABLE);

        }
    }
}
