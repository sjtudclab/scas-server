package com.dclab.service.impl;

import com.dclab.entity.CitizenResident;
import com.dclab.mapper.CitizenResidentMapper;
import com.dclab.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DCLab on 12/13/2015.
 */
@Service
public class PeopleServiceImpl implements PeopleService {
    @Autowired
    private CitizenResidentMapper citizenResidentMapper;

    @Override
    public int saveNewResident(CitizenResident resident) {
        return citizenResidentMapper.insertSelective(resident);
    }

    @Override
    public CitizenResident getCitizenResident(String identificationValue) {
        return citizenResidentMapper.getCitizenResident(identificationValue);
    }

    @Override
    public List<CitizenResident> getCitizenResidents(Integer commId) {
        return citizenResidentMapper.getCitizenResidentsInCommunity(commId);
    }

    @Override
    public List<CitizenResident> getCitizenResidents(Integer commId, Integer neighbourId) {
        return citizenResidentMapper.getCitizenResidentsInNeighbour(commId, neighbourId);
    }

    @Override
    public List<CitizenResident> getCitizenResidents(Integer commId, Integer neighbourId, Integer buildingId) {
        return citizenResidentMapper.getCitizenResidentsInBuilding(commId, neighbourId, buildingId);
    }
}
