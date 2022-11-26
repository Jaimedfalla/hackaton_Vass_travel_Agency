package com.celulac.advertising.infrastructure.repository;

import com.celulac.advertising.domain.entity.PlanDomain;
import com.celulac.advertising.infrastructure.model.RoadMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RoadMapJPA extends JpaRepository<RoadMap, UUID> {


    @Query("SELECT u FROM RoadMap u WHERE u.plan.idPlan = :idPlan")
    List<RoadMap> getRoadMapByIdPlan(UUID idPlan);
}
