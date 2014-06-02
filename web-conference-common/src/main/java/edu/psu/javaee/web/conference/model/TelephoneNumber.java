package edu.psu.javaee.web.conference.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class TelephoneNumber
{
  public enum Type
  {
    HOME,
    WORK,
    MOBILE,
    OTHER
  }
  
  @Id
  @Column(name="id")
  private long id_;
  
  private String countryCode_;
  
  private String phoneNumber_;
  
  private Type phoneNumberType_;
  
  private boolean primary_;
  
  public String getCountryCode()
  {
    return countryCode_;
  }
  
  public String getPhoneNumber()
  {
    return phoneNumber_;
  }
  
  public Type getPhoneNumberType()
  {
    return phoneNumberType_;
  }
  
  public boolean isPrimary()
  {
    return primary_;
  }
  
  public void setCountryCode(String countryCode)
  {
    countryCode_ = countryCode;
  }
  
  public void setPhoneNumber(String phoneNumber)
  {
    phoneNumber_ = phoneNumber;
  }
  
  public void setPhoneNumberType(Type phoneNumberType)
  {
    phoneNumberType_ = phoneNumberType;
  }
  
  public void setPrimary(boolean primary)
  {
    primary_ = primary;
  }
}
