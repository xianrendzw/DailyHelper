package com.easytoolsoft.dailyhelper.service.impl;

import com.easytoolsoft.dailyhelper.data.common.service.AbstractCrudService;
import com.easytoolsoft.dailyhelper.data.repository.RecordRepository;
import com.easytoolsoft.dailyhelper.data.repository.example.RecordExample;
import com.easytoolsoft.dailyhelper.domain.Record;
import com.easytoolsoft.dailyhelper.service.RecordService;
import org.springframework.stereotype.Service;

@Service
public class RecordServiceImpl
        extends AbstractCrudService<RecordRepository, Record, RecordExample>
        implements RecordService {

    @Override
    protected RecordExample getPageExample(String fieldName, String keyword) {
        RecordExample example = new RecordExample();
        // example.createCriteria().andFieldLike(fieldName, keyword);
        return example;
    }
}
