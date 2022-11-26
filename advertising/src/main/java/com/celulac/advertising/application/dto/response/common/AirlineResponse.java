package com.celulac.advertising.application.dto.response.common;

import com.celulac.advertising.infrastructure.model.Plan;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AirlineResponse {

    private Integer idAirline;
    private String nameAirline;
    private List<PlanResponse> plans;
}
