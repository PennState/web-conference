package edu.psu.javaee.web.conference.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import edu.psu.javaee.web.conference.model.Name;
import edu.psu.javaee.web.conference.model.Person;
import edu.psu.javaee.web.conference.model.TelephoneNumber;

@ApplicationPath("api")
public class PersonApplication extends Application
{
  private Set<Class<?>> clazzes_ = new HashSet<>();
  
  {
    clazzes_.add(Person.class);
    clazzes_.add(Name.class);
    clazzes_.add(TelephoneNumber.class);
    clazzes_.add(Name.class);
  }
  
  public Set<Class<?>> getClasses()
  {
    return clazzes_;
  }
}
