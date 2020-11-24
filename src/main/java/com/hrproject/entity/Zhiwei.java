package com.hrproject.entity;

public class Zhiwei {

  private long id;
  private String zwNo;
  private String zwName;
  private String describEs;
  private String remark;
  private long startUsing;

  private Department department;
  private JobCategory jobCategory;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getZwNo() {
    return zwNo;
  }

  public void setZwNo(String zwNo) {
    this.zwNo = zwNo;
  }


  public String getZwName() {
    return zwName;
  }

  public void setZwName(String zwName) {
    this.zwName = zwName;
  }


  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public JobCategory getJobCategory() {
    return jobCategory;
  }

  public void setJobCategory(JobCategory jobCategory) {
    this.jobCategory = jobCategory;
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
