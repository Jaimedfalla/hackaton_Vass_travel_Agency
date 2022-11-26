package com.celulac.advertising.infrastructure.repository;

import com.celulac.advertising.infrastructure.model.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlanRepositoryJPA extends JpaRepository<Plan, UUID> {

}
