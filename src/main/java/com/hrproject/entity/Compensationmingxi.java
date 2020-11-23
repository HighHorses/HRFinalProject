package com.hrproject.entity;

public class Compensationmingxi {

  private long id;
  private long recordId;
  private long emolumentId;
  private double travellingFee;
  private double overtimeFee;
  private double deductMoney;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getRecordId() {
    return recordId;
  }

  public void setRecordId(long recordId) {
    this.recordId = recordId;
  }


  public long getEmolumentId() {
    return emolumentId;
  }

  public void setEmolumentId(long emolumentId) {
    this.emolumentId = emolumentId;
  }


  public double getTravellingFee() {
    return travellingFee;
  }

  public void setTravellingFee(double travellingFee) {
    this.travellingFee = travellingFee;
  }


  public double getOvertimeFee() {
    return overtimeFee;
  }

  public void setOvertimeFee(double overtimeFee) {
    this.overtimeFee = overtimeFee;
  }


  public double getDeductMoney() {
    return deductMoney;
  }

  public void setDeductMoney(double deductMoney) {
    this.deductMoney = deductMoney;
  }

}
