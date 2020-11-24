package com.hrproject.entity;

public class TheTitle {

  private long id;
  private String zcNo;
  private String zcName;
  private String describEs;
  private String remark;
  private long startUsing;

  private Department department;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getZcNo() {
    return zcNo;
  }

  public void setZcNo(String zcNo) {
    this.zcNo = zcNo;
  }


  public String getZcName() {
    return zcName;
  }

  public void setZcName(String zcName) {
    this.zcName = zcName;
  }


  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public String getDescribEs() {
    return describEs;
  }

  public void setDescribEs(String describEs) {
    this.describEs = describEs;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public long getStartUsing() {
    return startUsing;
  }

  public void setStartUsing(long startUsing) {
    this.startUsing = startUsing;
  }

}
