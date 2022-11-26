package com.celulac.advertising.application.dto.response.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityResponse {

    private Integer idCity;
    private String nameCity;
    private List<TouristicPlaceRespose> touristicPlaces;
}
