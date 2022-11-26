package com.celulac.advertising.api.controller;

import com.celulac.advertising.application.dto.request.PlanRequest;
import com.celulac.advertising.application.dto.response.common.ErrorResponse;
import com.celulac.advertising.application.dto.response.common.Response;
import com.celulac.advertising.application.dto.response.common.SuccessResponse;
import com.celulac.advertising.application.service.AdvertisingService;
import com.celulac.advertising.application.util.FaultException;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Calendar;

@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("/advertising")
public class advertising {

    private AdvertisingService service;
    private static final Logger log = LoggerFactory.getLogger(advertising.class);

    @GetMapping()
    public ResponseEntity<Response> getAll(){
        Response response;
        Calendar calendar = Calendar.getInstance();
        try {
            response = service.getAll();
            response.setStatusCode(HttpStatus.OK);
            response.setResponseTime(new Timestamp(calendar.getTime().getTime()));


        }catch(FaultException e){
            log.info(e.getMessage());
            response = new ErrorResponse<>(e.getCode(),
                    new Timestamp(calendar.getTime().getTime()),
                    e.getReason());
        }

        return new ResponseEntity<>(response, response.getStatusCode());
    }

    @PostMapping()
    public ResponseEntity<?> createUser(@RequestBody PlanRequest request){
        Response response = new Response();
        Calendar calendar = Calendar.getInstance();

        try {

            response = new SuccessResponse<>();
            service.savePlan(request);
            response.setStatusCode(HttpStatus.OK);
            response.setResponseTime(new Timestamp(calendar.getTime().getTime()));
        }catch(FaultException e){
            log.info(e.getMessage());
            response = new ErrorResponse<>(e.getCode(),
                        new Timestamp(calendar.getTime().getTime()),
                        e.getReason());
        }

        return new ResponseEntity<>(response, response.getStatusCode());
    }

}
