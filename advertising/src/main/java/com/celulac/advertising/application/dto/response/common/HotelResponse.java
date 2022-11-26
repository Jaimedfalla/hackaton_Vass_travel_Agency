package com.celulac.advertising.application.dto.response.common;

import com.celulac.advertising.infrastructure.model.RoadMap;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelResponse {

    private Integer idHotel;
    private String nameHotel;
    private List<RoadMapResponse> roadMaps;
}
