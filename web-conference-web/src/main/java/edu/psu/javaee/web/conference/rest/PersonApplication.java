package edu.psu.javaee.web.conference.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("api")
public class PersonApplication extends Application
{
  private static Set<Class<?>> clazzes_ = new HashSet<>();
  
  static 
  {
    clazzes_.add(PeopleResourceImpl.class);
  }
  
  public Set<Class<?>> getClasses()
  {
    return clazzes_;
  }
}
