package com.pheonixdev.weblog.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by SAB on 3/23/2017.
 */

public class ErrorResponse {

    @SerializedName("error")
    String error;

    public ErrorResponse(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
