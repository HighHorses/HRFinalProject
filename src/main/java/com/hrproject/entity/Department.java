package com.hrproject.entity;

public class Department {

  private long id;
  private String bmNo;
  private String bmName;
  private String bmforshort;
  private long bmRank;
  private String address;
  private String synopsis;
  private String remark;
  private long startUsing;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getBmNo() {
    return bmNo;
  }

  public void setBmNo(String bmNo) {
    this.bmNo = bmNo;
  }


  public String getBmName() {
    return bmName;
  }

  public void setBmName(String bmName) {
    this.bmName = bmName;
  }


  public String getBmforshort() {
    return bmforshort;
  }

  public void setBmforshort(String bmforshort) {
    this.bmforshort = bmforshort;
  }


  public long getBmRank() {
    return bmRank;
  }

  public void setBmRank(long bmRank) {
    this.bmRank = bmRank;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getSynopsis() {
    return synopsis;
  }

  public void setSynopsis(String synopsis) {
    this.synopsis = synopsis;
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
