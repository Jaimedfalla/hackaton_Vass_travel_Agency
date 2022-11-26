package com.celulac.advertising.infrastructure.repository;


import com.celulac.advertising.infrastructure.model.AirLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AirlineRepositoryJPA extends JpaRepository<AirLine, Integer> {
}
