package com.celulac.advertising.application.dto.request;

import com.celulac.advertising.application.dto.response.common.AirlineResponse;
import com.celulac.advertising.application.dto.response.common.RoadMapResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanRequest {

    @NonNull
    private String name;
    @NonNull
    private String description;

    @NonNull
    private String origin;

    @NonNull
    private String destination;

    private Timestamp endDate;

    @NonNull
    private BigDecimal price;

    @NonNull
    private Integer discount;

    private Boolean food;

    @NonNull
    private Integer days;

    @NonNull
    private Integer nPassengerAdult = 5;

    @NonNull
    private Integer nPassengerChildren = 2;

    private AirlineResponse airLine;
    private List<RoadMapResponse> roadMaps;
}
