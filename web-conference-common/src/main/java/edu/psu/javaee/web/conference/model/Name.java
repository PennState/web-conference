package edu.psu.javaee.web.conference.model;

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
  
  private HonorificPrefix honorificPrefix_;
  private Prefix prefix_;
  private String firstName_;
  private String middleName_;
  private String lastName_;
  private Suffix suffix_;
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
