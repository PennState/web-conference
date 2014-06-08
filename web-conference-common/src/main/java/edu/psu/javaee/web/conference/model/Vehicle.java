package edu.psu.javaee.web.conference.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="VEHICLE")
@XmlRootElement(name="vehicle")
@XmlAccessorType(XmlAccessType.NONE)
public class Vehicle
{
  @Id
  @Column(name="VEHICLE_ID")
  @XmlElement(name="vehicle-id")
  private long vehicleId_;
  
  @Column(name="MAKE")
  @NotNull
  @XmlElement(name="make")
  private String make_;
  
  @Column(name="MODEL")
  @NotNull
  @XmlElement(name="model")
  private String model_;
  
  @Column(name="COLOR")
  @NotNull
  @XmlElement(name="color")
  private String color_;
  
  public long getVehicleId()
  {
    return vehicleId_;
  }

  public void setMake(String make)
  {
    make_ = make;
  }
  
  public String getMake()
  {
    return make_;
  }
  
  public void setModel(String model)
  {
    model_ = model;
  }
  
  public String getModel()
  {
    return model_;
  }
  
  public void setColor(String color)
  {
    color = color_;
  }
  
  public String getColor()
  {
    return color_;
  }
}
