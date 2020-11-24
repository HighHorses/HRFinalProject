package com.hrproject.dao;

import com.hrproject.entity.PositionRelease;

public interface PositionReleaseDao {
    //在职位表中插入一行数据
    public int insertPositionRelease(PositionRelease positionRelease);
    //通过主键删除一条职位信息
    public int delPositionRelease(Integer psId);
    //通过职位发布获取单条数据
    public PositionRelease selectPositionRelease(Integer psIs);
}
