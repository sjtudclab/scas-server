package com.dclab.service;

import com.dclab.entity.CitizenResident;
import com.dclab.entity.User;

import java.util.List;

/**
 * Created by DCLab on 12/13/2015.
 */
public interface PeopleService {
    int saveNewResident(CitizenResident resident);

    CitizenResident getCitizenResident(String identificationValue);

    List<CitizenResident> getCitizenResidents(Integer commId);

    List<CitizenResident> getCitizenResidents(Integer commId, Integer neighbourId);

    List<CitizenResident> getCitizenResidents(Integer commId, Integer neighbourId, Integer buildingId);
}
