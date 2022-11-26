package com.celulac.advertising.infrastructure.repository;

import com.celulac.advertising.domain.entity.Advertising;
import com.celulac.advertising.domain.entity.AirlineDomain;
import com.celulac.advertising.domain.entity.PlanDomain;
import com.celulac.advertising.domain.entity.RoadMapDomain;
import com.celulac.advertising.domain.repository.AdvertisingRepositry;
import com.celulac.advertising.infrastructure.mapper_infrastructure.MapperRepo;
import com.celulac.advertising.infrastructure.model.Plan;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
public class AdvertisingRepoImpl implements AdvertisingRepositry {


    private AirlineRepositoryJPA airlineRepositoryJPA;
    private PlanRepositoryJPA planRepositoryJPA;
    private RoadMapJPA roadMapJPA;

    private MapperRepo mapperRepo;

    public List<PlanDomain> getAdvertisings(){
        return mapperRepo.toPlanDomain(planRepositoryJPA.findAll());
    }

    public List<RoadMapDomain> getRoadMapByIdPlan(String idPlan){
        return  mapperRepo.toRoadmapDomain(roadMapJPA.getRoadMapByIdPlan(UUID.fromString(idPlan) ));
    }

    public void save(PlanDomain plan){
        UUID uuid = UUID.randomUUID();
        plan.setIdPlan(uuid);
        planRepositoryJPA.save(mapperRepo.fromPlanDomain(plan));
        planRepositoryJPA.flush();
    }

    public AirlineDomain getAirlineById(Integer id){
        return  mapperRepo.toAirlineDomain(airlineRepositoryJPA.findById(id).get());
    }
}
