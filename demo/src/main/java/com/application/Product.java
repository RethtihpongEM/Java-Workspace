package com.application;


public class Product{
  private int pID;
  private String pName;
  private double pPrice;
  private int pQty;
  private String pType;

  public int getpID() {
    return pID;
  }

  public String getpName() {
    return pName;
  }

  public double getpPrice() {
    return pPrice;
  }

  public int getpQty() {
    return pQty;
  }

  public String getpType() {
    return pType;
  }

  public void setpID(int pID) {
    this.pID = pID;
  }

  public void setpName(String pName) {
    this.pName = pName;
  }

  public void setpPrice(double pPrice) {
    this.pPrice = pPrice;
  }

  public void setpQty(int pQty) {
    this.pQty = pQty;
  }

  public void setpType(String pType) {
    this.pType = pType;
  }
}
