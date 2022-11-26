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
@Table(name = "HOTELS", schema = "VASS")
public class Hotel {

    @Id
    @Column(name = "id_hotel")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHotel;

    @Column(name = "name")
    private String nameHotel;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "hotel")
    @ToString.Exclude
    private List<RoadMap> roadMaps;
}

