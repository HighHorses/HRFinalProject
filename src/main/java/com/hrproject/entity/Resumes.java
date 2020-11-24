package com.hrproject.entity;

import java.util.Date;

public class Resumes {

  private long id;
  private String acceptName;
  private long sex;
  private String xueli;
  private String school;
  private String zhuanye;
  private String phone;
  private String address;
  private String eMail;
  private String politicsStatus;
  private String idNo;
  private String experience;
  private long pay;
  private long onJob;
  private long freshGraduate;
  private Date checkTime;
  private String grlv;
  private String jlFile;
  private String referrer;
  private Date reTime;
  private String reIdea;
  private long reStatus;

  //职位发布
  private PositionRelease positionRelease;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public PositionRelease getPositionRelease() {
    return positionRelease;  }

  public void setPositionRelease(PositionRelease positionRelease) {
    this.positionRelease = positionRelease;
  }

  public String getAcceptName() {
    return acceptName;
  }

  public void setAcceptName(String acceptName) {
    this.acceptName = acceptName;
  }


  public long getSex() {
    return sex;
  }

  public void setSex(long sex) {
    this.sex = sex;
  }


  public String getXueli() {
    return xueli;
  }

  public void setXueli(String xueli) {
    this.xueli = xueli;
  }


  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }


  public String getZhuanye() {
    return zhuanye;
  }

  public void setZhuanye(String zhuanye) {
    this.zhuanye = zhuanye;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getEMail() {
    return eMail;
  }

  public void setEMail(String eMail) {
    this.eMail = eMail;
  }


  public String getPoliticsStatus() {
    return politicsStatus;
  }

  public void setPoliticsStatus(String politicsStatus) {
    this.politicsStatus = politicsStatus;
  }


  public String getIdNo() {
    return idNo;
  }

  public void setIdNo(String idNo) {
    this.idNo = idNo;
  }


  public String getExperience() {
    return experience;
  }

  public void setExperience(String experience) {
    this.experience = experience;
  }


  public long getPay() {
    return pay;
  }

  public void setPay(long pay) {
    this.pay = pay;
  }


  public long getOnJob() {
    return onJob;
  }

  public void setOnJob(long onJob) {
    this.onJob = onJob;
  }


  public long getFreshGraduate() {
    return freshGraduate;
  }

  public void setFreshGraduate(long freshGraduate) {
    this.freshGraduate = freshGraduate;
  }


  public void setCheckTime(java.sql.Date checkTime) {
    this.checkTime = checkTime;
  }


  public String getGrlv() {
    return grlv;
  }

  public void setGrlv(String grlv) {
    this.grlv = grlv;
  }


  public String getJlFile() {
    return jlFile;
  }

  public void setJlFile(String jlFile) {
    this.jlFile = jlFile;
  }


  public String getReferrer() {
    return referrer;
  }

  public void setReferrer(String referrer) {
    this.referrer = referrer;
  }

  public String geteMail() {
    return eMail;
  }

  public void seteMail(String eMail) {
    this.eMail = eMail;
  }

  public Date getCheckTime() {
    return checkTime;
  }

  public void setCheckTime(Date checkTime) {
    this.checkTime = checkTime;
  }

  public Date getReTime() {
    return reTime;
  }

  public void setReTime(Date reTime) {
    this.reTime = reTime;
  }

  public void setReTime(java.sql.Date reTime) {
    this.reTime = reTime;
  }


  public String getReIdea() {
    return reIdea;
  }

  public void setReIdea(String reIdea) {
    this.reIdea = reIdea;
  }


  public long getReStatus() {
    return reStatus;
  }

  public void setReStatus(long reStatus) {
    this.reStatus = reStatus;
  }

}
