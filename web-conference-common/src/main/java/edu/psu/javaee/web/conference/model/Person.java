package edu.psu.javaee.web.conference.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PERSON")
public class Person
{ 
  @Id
  @Column(name="ID")
  private long id_;
  
  @Embedded
  private Name name_;
  
  @OneToMany(mappedBy = "person_", fetch=FetchType.EAGER)
  private List<Address> addressList_ = new ArrayList<>();
  
  @OneToMany(mappedBy = "person_", fetch=FetchType.EAGER)
  private List<TelephoneNumber> telephoneNumberList_ = new ArrayList<>();
  
  public List<Address> getAddressList()
  {
    return addressList_;
  }
  
  public Name getName()
  {
    return name_;
  }
  
  public List<TelephoneNumber> getTelephoneNumberList()
  {
    return telephoneNumberList_;
  }
  
  public void setAddressList(List<Address> addressList)
  {
    addressList_ = addressList;
  }
  
  public void setName(Name name)
  {
    name_ = name;
  }
  
  public void setTelephoneNuumberList(List<TelephoneNumber> telephoneNumberList)
  {
    telephoneNumberList_ = telephoneNumberList;
  }
}
