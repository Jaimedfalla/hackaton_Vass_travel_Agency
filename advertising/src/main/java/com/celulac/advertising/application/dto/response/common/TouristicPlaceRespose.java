package com.celulac.advertising.application.dto.response.common;

import com.celulac.advertising.infrastructure.model.City;
import com.celulac.advertising.infrastructure.model.RoadMap;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TouristicPlaceRespose {
    private Integer idTouristicPlace;
    private String name;
    private String description;
    private String location;
    private CityResponse city;
    private List<RoadMapResponse> roadMaps;
}
