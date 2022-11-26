package com.celulac.advertising.domain.entity;

import com.celulac.advertising.infrastructure.model.Hotel;
import com.celulac.advertising.infrastructure.model.Plan;
import com.celulac.advertising.infrastructure.model.TouristicPlace;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Currency;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoadMapDomain {

    private UUID idPlan;
    private String destination;
    private Timestamp arriveDate;
    private Integer stayDays;
    private PlanDomain plan;
    private TouristicPlaceDomain touristicPlace;
    private HotelDomain hotel;
}
