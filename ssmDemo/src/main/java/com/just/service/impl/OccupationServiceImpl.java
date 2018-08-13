package com.just.service.impl;

import com.just.mapper.OccupationMapper;
import com.just.pojo.Occupation;
import com.just.pojo.OccupationExample;
import com.just.service.OccupationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OccupationServiceImpl implements OccupationService {

    @Autowired
    private OccupationMapper occupationMapper ;

    @Override
    public List<Occupation> getOccupations() {
        OccupationExample example = new OccupationExample() ;
        return occupationMapper.selectByExample(example);
    }
}
