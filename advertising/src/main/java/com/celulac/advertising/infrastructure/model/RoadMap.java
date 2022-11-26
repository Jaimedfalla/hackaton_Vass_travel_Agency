package com.celulac.advertising.infrastructure.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Currency;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ROADMAP", schema = "VASS")
public class RoadMap {

    @Id
    @Column(name = "id_roadmap")
    private UUID idRoadmap;

    @Column(name = "destination")
    private String destination;

    @Column(name = "arrive_date")
    private Timestamp arriveDate;

    @Column(name = "stay_days")
    private Integer stayDays;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fk_touristic_place")
    private TouristicPlace touristicPlace;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fk_hotel")
    private Hotel hotel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fk_plan")
    private Plan plan;
}
