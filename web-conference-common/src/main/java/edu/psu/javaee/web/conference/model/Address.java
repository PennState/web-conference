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
@Table(name="ADDRESS")
@XmlRootElement(name="address")
@XmlAccessorType(XmlAccessType.NONE)
public class Address
{
  public enum Type
  {
    HOME,
    LOCAL,
    WORK,
    OTHER
  }
  
  @Id @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="ADDRESS_ID")
  @XmlElement(name="id")
  private long addressId_;
  
  @Column(name="ADDRESS_TYPE")
  @Enumerated(EnumType.STRING)
  @XmlElement(name="type")
  private Type addressType_;
  
  @Column(name="STREET_ADDRESS1")
  @XmlElement(name="street-address1", nillable=true)
  private String streetAddress1_;
  
  @Column(name="STREET_ADDRESS2")
  @XmlElement(name="street-address2", nillable=true)
  private String streetAddress2_;
  
  @Column(name="REGION")
  @XmlElement(name="region", nillable=true)
  private String region_;
  
  @Column(name="COUNTRY")
  @XmlElement(name="country", nillable=true)
  private String country_;
  
  @Column(name="POSTAL_CODE")
  @XmlElement(name="postal-code", nillable=true)
  private String postalCode_;
  
  @Column(name="IS_PRIMARY")
  @XmlElement(name="primary")
  private boolean primary_ = false;
  
  @JoinColumn(name = "ID")
  @ManyToOne(fetch = FetchType.LAZY)
  @NotNull
  private Person person_;
  
  public long getId()
  {
    return addressId_;
  }
  
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
