package com.celulac.advertising.domain.entity;

import com.celulac.advertising.infrastructure.model.RoadMap;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelDomain {

    private Integer idHotel;
    private String nameHotel;
    private List<RoadMapDomain> roadMaps;
}
