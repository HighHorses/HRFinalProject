package com.hrproject.entity;

import java.util.Date;

public class Compensationdan {

  private long id;
  private String payment;
  private long times;
  private long headcount;
  private double basic;
  private double practical;
  private Date grantTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getPayment() {
    return payment;
  }

  public void setPayment(String payment) {
    this.payment = payment;
  }


  public long getTimes() {
    return times;
  }

  public void setTimes(long times) {
    this.times = times;
  }


  public long getHeadcount() {
    return headcount;
  }

  public void setHeadcount(long headcount) {
    this.headcount = headcount;
  }


  public double getBasic() {
    return basic;
  }

  public void setBasic(double basic) {
    this.basic = basic;
  }


  public double getPractical() {
    return practical;
  }

  public void setPractical(double practical) {
    this.practical = practical;
  }

  public Date getGrantTime() {
    return grantTime;
  }

  public void setGrantTime(Date grantTime) {
    this.grantTime = grantTime;
  }

  public void setGrantTime(java.sql.Date grantTime) {
    this.grantTime = grantTime;
  }

}
