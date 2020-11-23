package com.hrproject.entity;

public class Daibanliebiao {

  private long id;
  private long backlogTypeId;
  private String backlogName;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getBacklogTypeId() {
    return backlogTypeId;
  }

  public void setBacklogTypeId(long backlogTypeId) {
    this.backlogTypeId = backlogTypeId;
  }


  public String getBacklogName() {
    return backlogName;
  }

  public void setBacklogName(String backlogName) {
    this.backlogName = backlogName;
  }

}
