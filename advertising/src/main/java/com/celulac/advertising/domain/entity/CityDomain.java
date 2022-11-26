package com.celulac.advertising.domain.entity;

import com.celulac.advertising.infrastructure.model.TouristicPlace;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityDomain {

    private Integer idCity;
    private String nameCity;
    private List<TouristicPlaceDomain> touristicPlaces;
}
