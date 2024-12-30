package com.multiple.db.response;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AppResponse<T> {

    private String message;
    private int statusCode;
    private T data;

    public AppResponse(String message, int statusCode, T data) {
        this.message = message;
        this.statusCode = statusCode;
        this.data = data;
    }


}

