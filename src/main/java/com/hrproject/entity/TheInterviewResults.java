package com.hrproject.entity;

import java.util.Date;

public class TheInterviewResults {

  private long id;
  private String oneInterviewer;
  private Date oneTime;
  private String oneEvaluate;
  private String twoInterviewer;
  private Date twoTime;
  private String twoEvaluate;
  private String threeInterviewer;
  private Date threeTime;
  private String threeEvaluate;

  //
  private Resumes resumes;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public Resumes getResumes() {
    return resumes;
  }

  public void setResumes(Resumes resumes) {
    this.resumes = resumes;
  }

  public String getOneInterviewer() {
    return oneInterviewer;
  }

  public void setOneInterviewer(String oneInterviewer) {
    this.oneInterviewer = oneInterviewer;
  }

  public void setOneTime(java.sql.Date oneTime) {
    this.oneTime = oneTime;
  }


  public String getOneEvaluate() {
    return oneEvaluate;
  }

  public void setOneEvaluate(String oneEvaluate) {
    this.oneEvaluate = oneEvaluate;
  }


  public String getTwoInterviewer() {
    return twoInterviewer;
  }

  public void setTwoInterviewer(String twoInterviewer) {
    this.twoInterviewer = twoInterviewer;
  }

  public void setTwoTime(java.sql.Date twoTime) {
    this.twoTime = twoTime;
  }

  public String getTwoEvaluate() {
    return twoEvaluate;
  }

  public void setTwoEvaluate(String twoEvaluate) {
    this.twoEvaluate = twoEvaluate;
  }


  public String getThreeInterviewer() {
    return threeInterviewer;
  }

  public void setThreeInterviewer(String threeInterviewer) {
    this.threeInterviewer = threeInterviewer;
  }

  public Date getOneTime() {
    return oneTime;
  }

  public void setOneTime(Date oneTime) {
    this.oneTime = oneTime;
  }

  public Date getTwoTime() {
    return twoTime;
  }

  public void setTwoTime(Date twoTime) {
    this.twoTime = twoTime;
  }

  public Date getThreeTime() {
    return threeTime;
  }

  public void setThreeTime(Date threeTime) {
    this.threeTime = threeTime;
  }

  public void setThreeTime(java.sql.Date threeTime) {
    this.threeTime = threeTime;
  }


  public String getThreeEvaluate() {
    return threeEvaluate;
  }

  public void setThreeEvaluate(String threeEvaluate) {
    this.threeEvaluate = threeEvaluate;
  }

}
