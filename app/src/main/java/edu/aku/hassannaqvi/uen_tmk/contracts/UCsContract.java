package edu.aku.hassannaqvi.uen_tmk.contracts;


import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

public class UCsContract {

    private static final String TAG = "UCs_CONTRACT";
    String ID;
    String ucs;

    public UCsContract() {
        // Default Constructor
    }

    public UCsContract Sync(JSONObject jsonObject) throws JSONException {
        this.ID = jsonObject.getString(singleUCs.COLUMN_ID);
        this.ucs = jsonObject.getString(singleUCs.COLUMN_UCS);
        return this;
    }

    public UCsContract HydrateUCs(Cursor cursor) {
        this.ID = cursor.getString(cursor.getColumnIndex(singleUCs.COLUMN_ID));
        this.ucs = cursor.getString(cursor.getColumnIndex(singleUCs.COLUMN_UCS));
        return this;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUcs() {
        return ucs;
    }

    public void setUcs(String ucs) {
        this.ucs = ucs;
    }

    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();
        json.put(singleUCs.COLUMN_ID, this.ID == null ? JSONObject.NULL : this.ID);
        json.put(singleUCs.COLUMN_UCS, this.ucs == null ? JSONObject.NULL : this.ucs);
        return json;
    }


    public static abstract class singleUCs implements BaseColumns {

        public static final String TABLE_NAME = "ucs";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UCS = "union_council";

        public static final String _URI = "ucs.php";
    }
}