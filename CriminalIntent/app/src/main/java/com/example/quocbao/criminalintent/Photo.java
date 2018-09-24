package com.example.quocbao.criminalintent;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by QUOC BAO on 1/7/2016.
 */
public class Photo {
    private static final String JSON_FILENAME = "filename";
    private String mFilename;
    /** Create a Photo representing an existing file on disk */
    public Photo(String filename) {
        mFilename = filename;
    }
    public Photo(JSONObject json) throws JSONException {
        mFilename = json.getString(JSON_FILENAME);
    } public JSONObject toJSON() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(JSON_FILENAME, mFilename);
        return json;
    }
    public String getFilename() {
        return mFilename;
    }

}
