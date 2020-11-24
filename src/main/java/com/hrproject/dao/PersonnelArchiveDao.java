package com.hrproject.dao;

import com.hrproject.entity.PersonnelArchive;

import java.util.List;

public interface PersonnelArchiveDao {

    //分页及动态查询人事档案信息
    List<PersonnelArchive> findPersonnelArchive(PersonnelArchive personnelArchive);
}
