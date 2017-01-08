package com.easytoolsoft.dailyhelper.service.impl;

import com.easytoolsoft.dailyhelper.data.common.service.AbstractCrudService;
import com.easytoolsoft.dailyhelper.data.repository.StaffRepository;
import com.easytoolsoft.dailyhelper.data.repository.example.StaffExample;
import com.easytoolsoft.dailyhelper.domain.Staff;
import com.easytoolsoft.dailyhelper.service.StaffService;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpl
        extends AbstractCrudService<StaffRepository, Staff, StaffExample>
        implements StaffService {
    
    @Override
    protected StaffExample getPageExample(String fieldName, String keyword) {
        StaffExample example = new StaffExample();
        //example.createCriteria().andFieldLike(fieldName, keyword);
        return example;
    }
}
