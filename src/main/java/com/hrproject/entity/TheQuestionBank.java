package com.hrproject.entity;

import java.util.Date;

public class TheQuestionBank {

  private long id;
  private String topicName;
  private long topicId;
  private long bmId;
  private String topicgrade;
  private String topicPeople;
  private String content;
  private Date creationTime;
  private String topicFile;
  private String remark;
  private long startUsing;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }


  public long getTopicId() {
    return topicId;
  }

  public void setTopicId(long topicId) {
    this.topicId = topicId;
  }


  public long getBmId() {
    return bmId;
  }

  public void setBmId(long bmId) {
    this.bmId = bmId;
  }


  public String getTopicgrade() {
    return topicgrade;
  }

  public void setTopicgrade(String topicgrade) {
    this.topicgrade = topicgrade;
  }


  public String getTopicPeople() {
    return topicPeople;
  }

  public void setTopicPeople(String topicPeople) {
    this.topicPeople = topicPeople;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Date getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
  }

  public void setCreationTime(java.sql.Date creationTime) {
    this.creationTime = creationTime;
  }


  public String getTopicFile() {
    return topicFile;
  }

  public void setTopicFile(String topicFile) {
    this.topicFile = topicFile;
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
