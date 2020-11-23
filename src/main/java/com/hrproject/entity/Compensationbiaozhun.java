package com.hrproject.entity;

public class Compensationbiaozhun {

  private long id;
  private String emolumentNo;
  private String emolumentName;
  private long rewardId;
  private String designer;
  private String registrant;
  private java.sql.Date creationTime;
  private double esum;
  private long backlogTypeId;
  private long auditStatus;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getEmolumentNo() {
    return emolumentNo;
  }

  public void setEmolumentNo(String emolumentNo) {
    this.emolumentNo = emolumentNo;
  }


  public String getEmolumentName() {
    return emolumentName;
  }

  public void setEmolumentName(String emolumentName) {
    this.emolumentName = emolumentName;
  }


  public long getRewardId() {
    return rewardId;
  }

  public void setRewardId(long rewardId) {
    this.rewardId = rewardId;
  }


  public String getDesigner() {
    return designer;
  }

  public void setDesigner(String designer) {
    this.designer = designer;
  }


  public String getRegistrant() {
    return registrant;
  }

  public void setRegistrant(String registrant) {
    this.registrant = registrant;
  }


  public java.sql.Date getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(java.sql.Date creationTime) {
    this.creationTime = creationTime;
  }


  public double getEsum() {
    return esum;
  }

  public void setEsum(double esum) {
    this.esum = esum;
  }


  public long getBacklogTypeId() {
    return backlogTypeId;
  }

  public void setBacklogTypeId(long backlogTypeId) {
    this.backlogTypeId = backlogTypeId;
  }


  public long getAuditStatus() {
    return auditStatus;
  }

  public void setAuditStatus(long auditStatus) {
    this.auditStatus = auditStatus;
  }

}
