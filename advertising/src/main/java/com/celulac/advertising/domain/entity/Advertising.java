package com.celulac.advertising.domain.entity;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Currency;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Advertising {

    private UUID idPlan;
    private String name;
    private Integer nPassengerAdult;
    private Integer nPassengerChildren;
    private Timestamp endDate;
    private BigDecimal price;
    private Integer discount;
    private Boolean food;
    private Integer days;
    private String nameAirline;
}
