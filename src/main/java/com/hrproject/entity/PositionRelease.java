package com.hrproject.entity;

import java.util.Date;

public class PositionRelease {

  private long id;
  private long bmId;
  private long zwId;
  private long zptype;
  private long zpCount;
  private String creator;
  private Date creationTimeStart;
  private Date creationTimeOver;
  private String describEs;
  private String conditioNs;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getBmId() {
    return bmId;
  }

  public void setBmId(long bmId) {
    this.bmId = bmId;
  }


  public long getZwId() {
    return zwId;
  }

  public void setZwId(long zwId) {
    this.zwId = zwId;
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
