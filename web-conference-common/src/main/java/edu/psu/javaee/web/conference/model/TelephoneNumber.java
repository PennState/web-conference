package edu.psu.javaee.web.conference.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TELEPHONE_NUMBER")
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
  
  @Column(name="COUNTRY_CODE")
  private String countryCode_;
  
  @Column(name="PHONE_NUMBER")
  private String phoneNumber_;
  
  @Column(name="TYPE")
  private Type phoneNumberType_;
  
  @Column(name="IS_PRIMARY")
  private boolean primary_;
  
  @JoinColumn(name = "ID")
  @ManyToOne(fetch = FetchType.LAZY)
  @NotNull
  private Person person_;
  
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
