package com.celulac.advertising.application.dto.response.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response{


    @JsonInclude(JsonInclude.Include.NON_NULL)
    private HttpStatus statusCode;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Timestamp responseTime;

    @Override
    public String toString() {
        return "Datos Incorrectos";
    }
}

