package com.celulac.advertising.infrastructure.repository;

import com.celulac.advertising.infrastructure.model.AirLine;
import com.celulac.advertising.infrastructure.model.TouristicPlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TouristicPlaceRepositoryJPA extends JpaRepository<TouristicPlace, Integer> {
}
