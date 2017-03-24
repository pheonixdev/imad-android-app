package com.pheonixdev.weblog.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by SAB on 3/23/2017.
 */

public class MessageResponse {
    @SerializedName("message")
    String message;

    public String getMessage() {
        return message;
    }
}
