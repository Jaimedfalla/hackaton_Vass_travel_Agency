package com.celulac.advertising.infrastructure.model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;
import java.sql.Clob;
import java.sql.Timestamp;
import java.util.Currency;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PLAN", schema = "VASS")
public class Plan {

    @Id
    @Column(name = "id_plan")
    private UUID idPlan;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "origin")
    private String origin;

    @Column(name = "destination")
    private String destination;

    @Column(name = "number_passenger_adult")
    private Integer nPassengerAdult;

    @Column(name = "number_passenger_children")
    private Integer nPassengerChildren;

    @Column(name = "end_date")
    private Timestamp endDate;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "discount")
    private Integer discount;

    @Column(name = "food")
    private Boolean food;

    @Column(name = "n_days")
    private Integer days;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fk_airline")
    private AirLine airLine;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "plan")
    @ToString.Exclude
    private List<RoadMap> roadMaps;


}
