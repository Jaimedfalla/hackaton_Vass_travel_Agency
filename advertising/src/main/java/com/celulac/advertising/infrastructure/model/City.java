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
@Table(name = "CITIES", schema = "VASS")
public class City {

    @Id
    @Column(name = "id_city")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCity;

    @Column(name = "name")
    private String nameCity;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
    @ToString.Exclude
    private List<TouristicPlace> touristicPlaces;
}
