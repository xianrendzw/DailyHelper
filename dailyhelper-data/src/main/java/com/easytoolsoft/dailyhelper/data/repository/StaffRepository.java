package com.easytoolsoft.dailyhelper.data.repository;

import com.easytoolsoft.dailyhelper.data.common.dao.ICrudDao;
import com.easytoolsoft.dailyhelper.data.repository.example.StaffExample;
import com.easytoolsoft.dailyhelper.domain.Staff;
import org.springframework.stereotype.Repository;


@Repository
public interface StaffRepository extends ICrudDao<Staff, StaffExample> {
}
