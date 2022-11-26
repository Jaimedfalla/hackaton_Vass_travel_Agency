package com.celulac.advertising.application.dto.response.common;

import com.celulac.advertising.infrastructure.model.Hotel;
import com.celulac.advertising.infrastructure.model.Plan;
import com.celulac.advertising.infrastructure.model.TouristicPlace;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Currency;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoadMapResponse {
    private UUID idPlan;
    private String destination;
    private Timestamp arriveDate;
    private Integer stayDays;
    private PlanResponse plan;
    private TouristicPlaceRespose touristicPlace;
    private HotelResponse hotel;
}
