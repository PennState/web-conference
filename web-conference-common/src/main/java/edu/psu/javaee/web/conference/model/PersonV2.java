package edu.psu.javaee.web.conference.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElementWrapper;

public class PersonV2 extends Person
{
  @OneToMany(mappedBy = "person_", fetch=FetchType.EAGER)
  @XmlElementWrapper(name="vehicleList")
  private List<Vehicle> vehicleList_ = new ArrayList<>();
  
  @JoinColumn(name = "ID")
  @ManyToOne(fetch = FetchType.LAZY)
  @NotNull
  private Person person_;
  
  public void setVehicleList(List<Vehicle> vehicleList)
  {
    vehicleList_ = vehicleList;
  }
  
  public List<Vehicle> getVehicleList()
  {
    return vehicleList_;
  }
}
