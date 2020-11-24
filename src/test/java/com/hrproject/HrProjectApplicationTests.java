package com.hrproject;

import com.hrproject.entity.PersonnelArchive;
import com.hrproject.service.PersonnelArchiveService;
import com.hrproject.service.PersonnelArchiveServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@SpringBootTest
class HrProjectApplicationTests {

    @Test
    void contextLoads() {
        ApplicationContext ap = new ClassPathXmlApplicationContext("application.properties");
        PersonnelArchiveService personnelArchiveService = (PersonnelArchiveServiceImpl)ap.getBean("personnelArchiveServiceImpl");
        PersonnelArchive personnelArchive = new PersonnelArchive();
        personnelArchive.setCustomerName("张三");
        List<PersonnelArchive> p = personnelArchiveService.findPersonnelArchive(personnelArchive);
        for(PersonnelArchive s:p){
            System.out.println(s.getCustomerName());
        }
    }

}
