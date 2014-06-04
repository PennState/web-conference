package edu.psu.javaee.web.conference.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;

@Embeddable
public class Name
{
  public enum HonorificPrefix
  {
    DR,
    SGT,
    PO1,
    NONE
  }
  
  public enum Prefix
  {
    MR,
    MRS,
    MS,
    NONE
  }
  
  public enum Suffix
  {
    I,
    II,
    III,
    IV,
    V,
    NONE
  }
  
  public enum HonorificSuffix
  {
    PHD,
    CPA,
    NONE
  }
  
  @Column(name="HONORIFIC_PREFIX")
  @XmlElement(name="honorific-prefix")
  private HonorificPrefix honorificPrefix_;
  
  @Column(name="PREFIX")
  @XmlElement(name="prefix")
  private Prefix prefix_;
  
  @Column(name="FIRST_NAME")
  @XmlElement(name="first-name")
  private String firstName_;
  
  @Column(name="MIDDLE_NAME")
  @XmlElement(name="middle-name")
  private String middleName_;
  
  @Column(name="LAST_NAME")
  @NotNull
  @XmlElement(name="last-name", nillable=false)
  private String lastName_;
  
  @Column(name="SUFFIX")
  @XmlElement(name="first-name")
  private Suffix suffix_;
  
  @Column(name="HONORIFIC_SUFFIX")
  @XmlElement(name="honorific-suffix")
  private HonorificSuffix honorificSuffix_;

  public HonorificPrefix getHonorificPrefix()
  {
    return honorificPrefix_;
  }
  
  public void setHonorificSuffix(HonorificPrefix honorificPrefix)
  {
    honorificPrefix_ = honorificPrefix;
  }
  
  public Prefix getPrefix()
  {
    return prefix_;
  }
  
  public void setPrefix(Prefix prefix)
  {
    prefix_ = prefix;
  }
  
  public String getFirstName()
  {
    return firstName_;
  }
  
  public void setFirstName(String firstName)
  {
    firstName_ = firstName;
  }
  
  public String getMiddleName()
  {
    return middleName_;
  }
  
  public void setMiddleName(String middleName)
  {
    middleName_ = middleName;
  }
  
  public String getLastName()
  {
    return lastName_;
  }
  
  public void setLastName(String lastName)
  {
    lastName_ = lastName;
  }
  
  public Suffix getSuffix()
  {
    return suffix_;
  }
  
  public void setSuffix(Suffix suffix)
  {
    suffix_ = suffix;
  }
  
  public HonorificSuffix getHonorificSuffix()
  {
    return honorificSuffix_;
  }
  
  public void setHonorificSuffix(HonorificSuffix honorificSuffix)
  {
    honorificSuffix_ = honorificSuffix;
  }
}
