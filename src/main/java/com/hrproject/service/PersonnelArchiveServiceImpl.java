package com.hrproject.service;

import com.hrproject.dao.PersonnelArchiveDao;
import com.hrproject.entity.PersonnelArchive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonnelArchiveServiceImpl implements PersonnelArchiveService{

    @Autowired
    private PersonnelArchiveDao personnelArchiveDao;

    @Override
    public List<PersonnelArchive> findPersonnelArchive(PersonnelArchive personnelArchive) {
        return personnelArchiveDao.findPersonnelArchive(personnelArchive);
    }
}
