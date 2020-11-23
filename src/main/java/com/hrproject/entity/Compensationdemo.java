package com.hrproject.entity;

public class Compensationdemo {

  private long id;
  private String rewardNo;
  private String rewardName;
  private double reward;
  private String describEs;
  private long startUsing;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getRewardNo() {
    return rewardNo;
  }

  public void setRewardNo(String rewardNo) {
    this.rewardNo = rewardNo;
  }


  public String getRewardName() {
    return rewardName;
  }

  public void setRewardName(String rewardName) {
    this.rewardName = rewardName;
  }


  public double getReward() {
    return reward;
  }

  public void setReward(double reward) {
    this.reward = reward;
  }


  public String getDescribEs() {
    return describEs;
  }

  public void setDescribEs(String describEs) {
    this.describEs = describEs;
  }


  public long getStartUsing() {
    return startUsing;
  }

  public void setStartUsing(long startUsing) {
    this.startUsing = startUsing;
  }

}
