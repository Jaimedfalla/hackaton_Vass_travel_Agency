package com.celulac.advertising.api.controller;

import com.celulac.advertising.application.dto.response.common.ErrorResponse;
import com.celulac.advertising.application.dto.response.common.Response;
import com.celulac.advertising.application.service.AdvertisingService;
import com.celulac.advertising.application.util.FaultException;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Calendar;

@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("/roadmap")
public class RoadMap {

    private AdvertisingService service;
    private static final Logger log = LoggerFactory.getLogger(advertising.class);

    @GetMapping("/{idPlan}")
    public ResponseEntity<Response> getByPlanId(@PathVariable String idPlan){
        Response response;
        Calendar calendar = Calendar.getInstance();
        try {
            response = service.getByPlanId(idPlan);
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
