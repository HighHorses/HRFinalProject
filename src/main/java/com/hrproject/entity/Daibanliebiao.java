package com.hrproject.entity;

public class Daibanliebiao {

  private long id;
  private String backlogName;

  //待办实体
  private ToDo toDo;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public ToDo getToDo() {
    return toDo;
  }

  public void setToDo(ToDo toDo) {
    this.toDo = toDo;
  }

  public String getBacklogName() {
    return backlogName;
  }

  public void setBacklogName(String backlogName) {
    this.backlogName = backlogName;
  }

}
