package com.celulac.advertising.application.util;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class FaultException extends Exception{


    private final HttpStatus code;
    private final String reason;

    public static final String MESSAGE_SERVER_ERROR = "Request execution error, contact support to report your problem";
    public static final String MESSAGE_NOT_FOUND = "Item not found, Please check the parameters sent";

    public FaultException(HttpStatus httpStatus, String cause){
        this.code = httpStatus;
        this.reason = cause;
    }
}
