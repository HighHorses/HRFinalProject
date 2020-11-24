package com.hrproject.entity;

import java.util.Date;

public class Training {

  private long id;
  private String trainName;
  private String trainer;
  private Date trainTimeStart;
  private Date trainTimeOver;
  private String goal;
  private String participant;
  private String synopsis;
  private String trainFile;
  private long trainStatus;
  private String opinion;
  private long feedback;
  private String summarize;
  private String result;

  private ToDo toDo;
  private PersonnelArchive personnelArchive;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTrainName() {
    return trainName;
  }

  public void setTrainName(String trainName) {
    this.trainName = trainName;
  }


  public String getTrainer() {
    return trainer;
  }

  public void setTrainer(String trainer) {
    this.trainer = trainer;
  }

  public Date getTrainTimeStart() {
    return trainTimeStart;
  }

  public void setTrainTimeStart(Date trainTimeStart) {
    this.trainTimeStart = trainTimeStart;
  }

  public Date getTrainTimeOver() {
    return trainTimeOver;
  }

  public void setTrainTimeOver(Date trainTimeOver) {
    this.trainTimeOver = trainTimeOver;
  }

  public void setTrainTimeStart(java.sql.Date trainTimeStart) {
    this.trainTimeStart = trainTimeStart;
  }

  public void setTrainTimeOver(java.sql.Date trainTimeOver) {
    this.trainTimeOver = trainTimeOver;
  }


  public String getGoal() {
    return goal;
  }

  public void setGoal(String goal) {
    this.goal = goal;
  }


  public ToDo getToDo() {
    return toDo;
  }

  public void setToDo(ToDo toDo) {
    this.toDo = toDo;
  }

  public String getParticipant() {
    return participant;
  }

  public void setParticipant(String participant) {
    this.participant = participant;
  }


  public String getSynopsis() {
    return synopsis;
  }

  public void setSynopsis(String synopsis) {
    this.synopsis = synopsis;
  }


  public String getTrainFile() {
    return trainFile;
  }

  public void setTrainFile(String trainFile) {
    this.trainFile = trainFile;
  }


  public long getTrainStatus() {
    return trainStatus;
  }

  public void setTrainStatus(long trainStatus) {
    this.trainStatus = trainStatus;
  }


  public PersonnelArchive getPersonnelArchive() {
    return personnelArchive;
  }

  public void setPersonnelArchive(PersonnelArchive personnelArchive) {
    this.personnelArchive = personnelArchive;
  }

  public String getOpinion() {
    return opinion;
  }

  public void setOpinion(String opinion) {
    this.opinion = opinion;
  }


  public long getFeedback() {
    return feedback;
  }

  public void setFeedback(long feedback) {
    this.feedback = feedback;
  }


  public String getSummarize() {
    return summarize;
  }

  public void setSummarize(String summarize) {
    this.summarize = summarize;
  }


  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

}
