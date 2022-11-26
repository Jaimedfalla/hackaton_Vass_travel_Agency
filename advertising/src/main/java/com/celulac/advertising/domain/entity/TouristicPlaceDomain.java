package com.celulac.advertising.domain.entity;

import com.celulac.advertising.infrastructure.model.City;
import com.celulac.advertising.infrastructure.model.RoadMap;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TouristicPlaceDomain {

    private Integer idTouristicPlace;
    private String name;
    private String description;
    private String location;
    private CityDomain city;
    private List<RoadMapDomain> roadMaps;
}
