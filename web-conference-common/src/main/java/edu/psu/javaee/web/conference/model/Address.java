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
@Table(name="ADDRESS")
public class Address
{
  public enum Type
  {
    HOME,
    LOCAL,
    WORK,
    NONE
  }
  
  @Id
  @Column(name="ADDRESS_ID")
  private long addressId_;
  
  @Column(name="ADDRESS_TYPE")
  private Type addressType_;
  
  @Column(name="STREET_ADDRESS1")
  private String streetAddress1_;
  
  @Column(name="STREET_ADDERSS2")
  private String streetAddress2_;
  
  @Column(name="REGION")
  private String region_;
  
  @Column(name="COUNTRY")
  private String country_;
  
  @Column(name="POSTAL_CODE")
  private String postalCode_;
  
  @Column(name="IS_PRIMARY")
  private boolean primary_;
  
  @JoinColumn(name = "ID")
  @ManyToOne(fetch = FetchType.LAZY)
  @NotNull
  private Person person_;
  
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
