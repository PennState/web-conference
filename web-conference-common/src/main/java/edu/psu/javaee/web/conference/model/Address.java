package edu.psu.javaee.web.conference.model;

public class Address
{
  public enum Type
  {
    HOME,
    LOCAL,
    WORK,
    NONE
  }
  
  private Type addressType_;
  private String streetAddress1_;
  private String streetAddress2_;
  private String region_; 
  private String country_;
  private String postalCode_;
  private boolean primary_;
  
  public Type getType()
  {
    return addressType_;
  }
  
  public void setAddressType(Type addressType)
  {
    addressType_ = addressType;
  }
  
  public String getStreetAddress1()
  {
    return streetAddress1_;
  }
  
  public void setAddress1(String streetAddress1)
  {
    streetAddress1_ = streetAddress1;
  }
  
  public String getStreetAddress2()
  {
    return streetAddress2_;
  }
  
  public String getRegion()
  {
    return region_;
  }
  
  public void setRegion(String region)
  {
    region_ = region;
  }
  public void setStreetAddress2(String streetAddress2)
  {
    streetAddress2_ = streetAddress2;
  }
  
  public String getCountry()
  {
    return country_;
  }
  
  public void setCountry(String country)
  {
    country_ = country;
  }
  
  public String postalCode()
  {
    return postalCode_;
  }
  
  public void setPostalCode(String postalCode)
  {
    postalCode_ = postalCode;
  }
  
  public boolean isPrimary()
  {
    return primary_;
  }
  
  public void setPrimary(boolean primary)
  {
    primary_ = primary;
  }
}
