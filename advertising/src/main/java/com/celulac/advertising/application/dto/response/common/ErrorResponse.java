package com.celulac.advertising.application.dto.response.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse<T> extends Response {

    private T detail;

    public ErrorResponse(HttpStatus statusCode, Timestamp responseTime, T detail) {
        super(statusCode, responseTime);
        this.detail = detail;
    }
}