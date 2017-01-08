package com.easytoolsoft.dailyhelper.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Record implements Serializable {
    /**
     * 自增标识
     */
    private Integer id;
    /**
     * 员工工号
     */
    private Integer staffId;
    /**
     *
     */
    private Integer date;
    /**
     * 昨日工作情况
     */
    private String yestoday;
    /**
     * 今日计划工作
     */
    private String today;
    /**
     * 备注说明
     */
    private String memo;
    /**
     * 记录创建时间
     */
    private Date gmtCreated;
    /**
     * 记录更新时间
     */
    private Date gmtUpdated;
}
