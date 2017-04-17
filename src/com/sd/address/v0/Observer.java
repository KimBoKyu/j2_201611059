package com.sd.address.v0;

public interface Observer {
  public void update(String name, String number, String birth, String memo);
  public String getName(String name);
  public String getNumber(String number);
  public String getBirth(String birth);
  public String getMemo(String memo);
}