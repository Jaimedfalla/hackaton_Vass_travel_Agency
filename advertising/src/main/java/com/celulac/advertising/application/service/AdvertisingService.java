package com.celulac.advertising.application.service;

import com.celulac.advertising.application.dto.request.PlanRequest;
import com.celulac.advertising.application.dto.response.common.*;
import com.celulac.advertising.application.mapper_app.MapperApplication;
import com.celulac.advertising.application.util.FaultException;
import com.celulac.advertising.domain.entity.AirlineDomain;
import com.celulac.advertising.domain.entity.PlanDomain;
import com.celulac.advertising.domain.entity.RoadMapDomain;
import com.celulac.advertising.domain.repository.AdvertisingRepositry;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
@AllArgsConstructor
public class AdvertisingService {


    private MapperApplication mapper;

    private AdvertisingRepositry repository;


    public Response getAll() throws FaultException {
        Response response;
        try{
            SuccessResponse<List<PlanResponse>> successResponse = new SuccessResponse<>();
            successResponse.setData(mapper.fromPlanDomain(repository.getAdvertisings()));
            response = successResponse;
        }catch (Exception e){
            throw new FaultException(HttpStatus.INTERNAL_SERVER_ERROR,
                    FaultException.MESSAGE_SERVER_ERROR);
        }

        return response;
    }

    public Response getByPlanId(String id) throws FaultException {
        Response response;
        try{
            SuccessResponse<List<RoadMapResponse>> successResponse = new SuccessResponse<>();
            successResponse.setData(mapper.fromRoadmapDomain(repository.getRoadMapByIdPlan(id)));
            response = successResponse;
        }catch (Exception e){
            throw new FaultException(HttpStatus.INTERNAL_SERVER_ERROR,
                    FaultException.MESSAGE_SERVER_ERROR);
        }

        return response;
    }

    public Response savePlan(PlanRequest request) throws FaultException{
        Response response;
        try{
            SuccessResponse<PlanResponse> successResponse = new SuccessResponse<>();
            PlanDomain plan = mapper.toPlanDomain(request);
            Random random = new Random();
            AirlineDomain airLine = repository.getAirlineById(random.nextInt(1,9) +1);
            List<RoadMapDomain> roadMaps = new ArrayList<RoadMapDomain>();
            plan.setAirLine(airLine);
            plan.setRoadMap(roadMaps);
            repository.save(plan);
            response = successResponse;
        }catch (Exception e){
            throw new FaultException(HttpStatus.INTERNAL_SERVER_ERROR,
                    FaultException.MESSAGE_SERVER_ERROR);
        }

        return response;
    }
}
