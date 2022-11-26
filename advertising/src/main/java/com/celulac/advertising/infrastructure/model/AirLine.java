package com.celulac.advertising.infrastructure.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "AIRLINES", schema = "VASS")
public class AirLine {

    @Id
    @Column(name = "id_airline")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAirline;

    @Column(name = "name")
    private String nameAirline;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "airLine")
    @ToString.Exclude
    private List<Plan> plans;
}
