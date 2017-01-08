package com.easytoolsoft.dailyhelper.data.repository;

import com.easytoolsoft.dailyhelper.data.common.dao.ICrudDao;
import com.easytoolsoft.dailyhelper.data.repository.example.RecordExample;
import com.easytoolsoft.dailyhelper.domain.Record;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends ICrudDao<Record, RecordExample> {
}
