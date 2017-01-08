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
public class Staff implements Serializable {
    /**
     * 工号
     */
    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 花名
     */
    private String nickName;
    /**
     * 创建时间
     */
    private Date gmtCreated;
    /**
     * 更新时间
     */
    private Date gmtUpdated;
}