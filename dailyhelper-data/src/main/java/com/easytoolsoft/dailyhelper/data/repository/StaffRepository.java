package com.easytoolsoft.dailyhelper.data.repository;

import com.easytoolsoft.dailyhelper.data.common.dao.ICrudDao;
import com.easytoolsoft.dailyhelper.domain.StaffExample;
import com.easytoolsoft.dailyhelper.domain.Staff;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StaffRepository extends ICrudDao<Staff, StaffExample> {
}
