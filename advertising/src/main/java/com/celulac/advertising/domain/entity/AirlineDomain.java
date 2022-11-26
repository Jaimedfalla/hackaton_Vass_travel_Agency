package com.celulac.advertising.domain.entity;

import com.celulac.advertising.infrastructure.model.Plan;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AirlineDomain {

    private Integer idAirline;
    private String nameAirline;
    private List<PlanDomain> plans;
}
