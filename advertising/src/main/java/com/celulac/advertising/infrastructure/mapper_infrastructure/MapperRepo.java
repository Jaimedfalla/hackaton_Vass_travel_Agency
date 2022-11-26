package com.celulac.advertising.infrastructure.mapper_infrastructure;

import com.celulac.advertising.domain.entity.*;
import com.celulac.advertising.infrastructure.model.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapperRepo {


    //@Mapping(source = "roadMaps", target = "roadMap", ignore = true)
    List<PlanDomain> toPlanDomain(List<Plan> planList);

    //@Mapping(source = "roadMaps", target = "roadMap", ignore = true)
    PlanDomain toPlanDomain(Plan plan);

    //@Mapping(source = "roadMaps", target = "roadMap", ignore = true)
    Plan fromPlanDomain(PlanDomain planDomain);

    @Mapping(source = "plans", target = "plans", ignore = true)
    AirlineDomain toAirlineDomain(AirLine airLine);

    @Mapping(source = "plans", target = "plans", ignore = true)
    List<AirlineDomain> toAirlineDomain(List<AirLine> airLines);

    List<RoadMapDomain> toRoadmapDomain(List<RoadMap> roadMapList);

    RoadMapDomain toRoadmapDomain(RoadMap roadMap);

    @Mapping(source = "roadMaps", target = "roadMaps", ignore = true)
    List<HotelDomain> toHotelDomain(List<Hotel> hotelDomainList);

    @Mapping(source = "roadMaps", target = "roadMaps", ignore = true)
    HotelDomain toHotelDomain(Hotel hotel);

    @Mapping(source = "roadMaps", target = "roadMaps", ignore = true)
    List<TouristicPlaceDomain> toTouristicPlaceDomain(List<TouristicPlace> touristicPlaceList);

    @Mapping(source = "roadMaps", target = "roadMaps", ignore = true)
    TouristicPlaceDomain toTouristicPlaceDomain(TouristicPlace touristicPlace);


    @Mapping(source = "touristicPlaces", target = "touristicPlaces", ignore = true)
    CityDomain toCityDomain(City city);

    @Mapping(source = "touristicPlaces", target = "touristicPlaces", ignore = true)
    List<CityDomain> toCityDomain(List<City> city);

}
