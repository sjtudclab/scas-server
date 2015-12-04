package com.dclab.service.impl;

import com.dclab.entity.GBXZQH;
import com.dclab.mapper.GBXZQHMapper;
import com.dclab.service.MetaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DCLab on 12/4/2015.
 */
@Service
public class MetaDataServiceImpl implements MetaDataService {
    @Autowired
    private GBXZQHMapper gbxzqhMapper;

    @Override
    public List<GBXZQH> getGBXZQHs() {
        return gbxzqhMapper.getGBXZQHs();
    }
}
