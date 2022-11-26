package com.celulac.advertising.application.util;

import com.celulac.advertising.domain.repository.AdvertisingRepositry;
import com.celulac.advertising.infrastructure.mapper_infrastructure.MapperRepo;
import com.celulac.advertising.infrastructure.repository.AdvertisingRepoImpl;
import com.celulac.advertising.infrastructure.repository.AirlineRepositoryJPA;
import com.celulac.advertising.infrastructure.repository.PlanRepositoryJPA;
import com.celulac.advertising.infrastructure.repository.RoadMapJPA;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class ManagerBean {

    private AirlineRepositoryJPA airlineRepositoryJPA;

    private PlanRepositoryJPA planRepositoryJPA;
    private RoadMapJPA roadMapJPA;

    private MapperRepo mapperRepo;

    @Bean
    public AdvertisingRepositry capComanServRepository(){
        return new AdvertisingRepoImpl(airlineRepositoryJPA, planRepositoryJPA, roadMapJPA, mapperRepo);
    }

}
