package com.hrproject.entity;

import java.util.Date;

public class PositionRelease {

  private long id;
  private long zptype;
  private long zpCount;
  private String creator;
  private Date creationTimeStart;
  private Date creationTimeOver;
  private String describEs;
  private String conditioNs;

  //职位
  private Zhiwei zhiwei;
  //部门
  private Department department;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public Zhiwei getZhiwei() {
    return zhiwei;
  }

  public void setZhiwei(Zhiwei zhiwei) {
    this.zhiwei = zhiwei;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public long getZptype() {
    return zptype;
  }

  public void setZptype(long zptype) {
    this.zptype = zptype;
  }


  public long getZpCount() {
    return zpCount;
  }

  public void setZpCount(long zpCount) {
    this.zpCount = zpCount;
  }


  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public Date getCreationTimeStart() {
    return creationTimeStart;
  }

  public void setCreationTimeStart(Date creationTimeStart) {
    this.creationTimeStart = creationTimeStart;
  }

  public Date getCreationTimeOver() {
    return creationTimeOver;
  }

  public void setCreationTimeOver(Date creationTimeOver) {
    this.creationTimeOver = creationTimeOver;
  }

  public void setCreationTimeStart(java.sql.Date creationTimeStart) {
    this.creationTimeStart = creationTimeStart;
  }

  public void setCreationTimeOver(java.sql.Date creationTimeOver) {
    this.creationTimeOver = creationTimeOver;
  }


  public String getDescribEs() {
    return describEs;
  }

  public void setDescribEs(String describEs) {
    this.describEs = describEs;
  }


  public String getConditioNs() {
    return conditioNs;
  }

  public void setConditioNs(String conditioNs) {
    this.conditioNs = conditioNs;
  }

}
