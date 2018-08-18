package com.maurdan.flaco.retreatinventoryapp.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

public class ProductContract {

    private ProductContract() {}

    public static final String AUTHORITY = "com.maurdan.flaco.retreatinventoryapp";
    public static final String PATH_PRODUCTS = "products";
    public static final Uri BASE_PRODUCT_URI = Uri.parse("content://" + AUTHORITY);

    public static final class ProductEntry implements BaseColumns {

        public static final Uri PRODUCT_URI =
                Uri.withAppendedPath(BASE_PRODUCT_URI, PATH_PRODUCTS);

        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + AUTHORITY + "/" + PATH_PRODUCTS;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + AUTHORITY + "/" + PATH_PRODUCTS;

        // Table name
        public static final String PRODUCT_TABLE_NAME = "products";

        // Unique Id for each product
        // Type int
        public static final String _ID = BaseColumns._ID;

        // Product name
        public static final String COLUMN_PRODUCT_NAME = "name";

        // Product vendor
        public static final String COLUMN_PRODUCT_VENDOR = "vendor";

        // Unit (eg cases, gallons, lbs)
        public static final String COLUMN_PRODUCT_UNIT = "unit";

        // Product Par. How many should be present in the shop.
        public static final String COLUMN_PRODUCT_PAR = "par";

        // Product brand.
        public static final String COLUMN_PRODUCT_BRAND = "brand";

    }
}
