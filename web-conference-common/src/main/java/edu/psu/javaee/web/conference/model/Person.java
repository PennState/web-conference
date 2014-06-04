package edu.psu.javaee.web.conference.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="PERSON")
@NamedQueries({
  @NamedQuery(name = "Person.getPersonByName", query = "SELECT p FROM Person p WHERE p.firstName_ = :firstName AND p.lastName_ = :lastName")
})
@XmlRootElement(name="person")
@XmlAccessorType(XmlAccessType.NONE)
public class Person
{ 
  @Id @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="ID")
  @XmlElement(name="id")
  private long id_;
  
  @Embedded
  @XmlElement(name="name")
  private Name name_;
  
  @OneToMany(mappedBy = "person_", fetch=FetchType.EAGER)
  @XmlElementWrapper(name="address-list")
  private List<Address> addressList_ = new ArrayList<>();
  
  @OneToMany(mappedBy = "person_", fetch=FetchType.EAGER)
  @XmlElementWrapper(name="telephone-number-list")
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
