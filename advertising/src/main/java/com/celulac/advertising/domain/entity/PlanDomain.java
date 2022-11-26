package com.celulac.advertising.domain.entity;

import com.celulac.advertising.infrastructure.model.AirLine;
import com.celulac.advertising.infrastructure.model.RoadMap;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanDomain {

    private UUID idPlan;
    private String name;
    private String description;
    private String origin;
    private String destination;
    private Integer nPassengerAdult;
    private Integer nPassengerChildren;
    private Timestamp endDate;
    private BigDecimal price;
    private Integer discount;
    private Boolean food;
    private Integer days;
    private AirlineDomain airLine;
    private List<RoadMapDomain> roadMap;

}
