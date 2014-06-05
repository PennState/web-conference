package edu.psu.javaee.web.conference.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="TELEPHONE_NUMBER")
@XmlRootElement(name="telephone-number")
@XmlAccessorType(XmlAccessType.NONE)
public class TelephoneNumber
{
  public enum Type
  {
    HOME,
    WORK,
    MOBILE,
    OTHER
  }
  
  @Id @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="id")
  @XmlElement(name="id")
  private long id_;
  
  @Column(name="COUNTRY_CODE")
  @XmlElement(name="country-code")
  private String countryCode_;
  
  @Column(name="PHONE_NUMBER")
  @XmlElement(name="phone-number")
  private String phoneNumber_;
  
  @Column(name="TYPE")
  @Enumerated(EnumType.STRING)
  @XmlElement(name="type")
  private Type phoneNumberType_;
  
  @Column(name="IS_PRIMARY")
  @XmlElement(name="primary")
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
