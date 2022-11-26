package com.celulac.advertising.infrastructure.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TOURISTIC_PLACES", schema = "VASS")
public class TouristicPlace {

    @Id
    @Column(name = "id_touristic_place")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTouristicPlace;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "location")
    private String location;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fk_city")
    private City city;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "touristicPlace")
    @ToString.Exclude
    private List<RoadMap> roadMaps;

}
