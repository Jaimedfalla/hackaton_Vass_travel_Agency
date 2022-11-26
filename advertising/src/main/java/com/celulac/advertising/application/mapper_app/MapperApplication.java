package com.celulac.advertising.application.mapper_app;

import com.celulac.advertising.application.dto.request.PlanRequest;
import com.celulac.advertising.application.dto.response.common.*;
import com.celulac.advertising.domain.entity.*;
import com.celulac.advertising.infrastructure.model.*;
import org.mapstruct.Mapper;

import java.sql.Timestamp;
import java.util.List;
import java.util.Random;

@Mapper(componentModel = "spring")
public interface MapperApplication {

    List<PlanResponse> fromPlanDomain(List<PlanDomain> planList);

    PlanResponse fromPlanDomain(PlanDomain plan);

    AirlineResponse fromAirlineDomain(AirlineDomain airLine);

    List<AirlineResponse> fromAirlineDomain(List<AirlineDomain> airLines);



    List<RoadMapResponse> fromRoadmapDomain(List<RoadMapDomain> roadMapDomainList);

    RoadMapResponse fromRoadmapDomain(RoadMapDomain roadMap);

    List<HotelResponse> fromHotelDomain(List<HotelDomain> hotelList);

    HotelResponse fromHotelDomain(HotelDomain hotel);

    List<TouristicPlaceRespose> fromTouristicPlaceDomain(List<TouristicPlaceDomain> touristicPlaceDomainList);

    TouristicPlaceRespose fromTouristicPlaceDomain(TouristicPlaceDomain touristicPlaceDomain);

    default PlanDomain toPlanDomain(PlanRequest planRequest){
        PlanDomain planDomain = new PlanDomain();
        planDomain.setName(planRequest.getName());
        planDomain.setDescription(planRequest.getDescription());
        planDomain.setNPassengerAdult(planRequest.getNPassengerAdult());
        planDomain.setNPassengerChildren(planRequest.getNPassengerChildren());
        planDomain.setPrice(planRequest.getPrice());
        planDomain.setDiscount(planRequest.getDiscount());
        planDomain.setDays(planRequest.getDays());
        planDomain.setOrigin(planRequest.getOrigin());
        planDomain.setDestination(planRequest.getDestination());

        Random random = new Random();
        planDomain.setEndDate(new Timestamp(System.currentTimeMillis() + random.nextInt(1, 100000)));
        planDomain.setFood(Boolean.TRUE);

        return planDomain;
    }

}
