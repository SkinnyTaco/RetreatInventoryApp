package com.maurdan.flaco.retreatinventoryapp.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

public class VendorContract {

    public static final String AUTHORITY = "com.maurdan.flaco.retreatinventoryapp";
    public static final Uri BASE_VENDOR_URI = Uri.parse("content://" + AUTHORITY);
    public static final String PATH_VENDORS = "vendors";

    public static final class VendorEntry implements BaseColumns {

        public static final Uri VENDOR_URI =
                Uri.withAppendedPath(BASE_VENDOR_URI, PATH_VENDORS);

        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + AUTHORITY + "/" + PATH_VENDORS;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + AUTHORITY + "/" + PATH_VENDORS;

        // Vendor table name
        public static final String VENDOR_TABLE_NAME = "vendors";

        // Unique id
        public static final String _ID = BaseColumns._ID;

        // Vendor name
        public static final String VENDOR_NAME = "name";

        // Vendor number (10 digit form xxx-xxx-xxxx)
        public static final String VENDOR_PHONE = "number";

        // Vendor email
        public static final String VENDOR_EMAIL = "email";


    }
}
