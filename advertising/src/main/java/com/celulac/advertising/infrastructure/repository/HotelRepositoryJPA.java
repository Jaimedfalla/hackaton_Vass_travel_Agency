package com.celulac.advertising.infrastructure.repository;

import com.celulac.advertising.infrastructure.model.AirLine;
import com.celulac.advertising.infrastructure.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepositoryJPA extends JpaRepository<Hotel, Integer> {
}
