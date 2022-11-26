package com.celulac.advertising.domain.repository;

import com.celulac.advertising.application.dto.response.common.AirlineResponse;
import com.celulac.advertising.application.dto.response.common.PlanResponse;
import com.celulac.advertising.application.dto.response.common.RoadMapResponse;
import com.celulac.advertising.domain.entity.Advertising;
import com.celulac.advertising.domain.entity.AirlineDomain;
import com.celulac.advertising.domain.entity.PlanDomain;
import com.celulac.advertising.domain.entity.RoadMapDomain;

import java.util.List;

public interface AdvertisingRepositry{

    List<PlanDomain> getAdvertisings();
    List<RoadMapDomain> getRoadMapByIdPlan(String idPlan);

    void save(PlanDomain plan);

    AirlineDomain getAirlineById(Integer id);

}
