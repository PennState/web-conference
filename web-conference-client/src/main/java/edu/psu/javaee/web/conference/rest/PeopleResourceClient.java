package edu.psu.javaee.web.conference.rest;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import edu.psu.javaee.web.conference.model.Person;

public class PeopleResourceClient
{
  private PeopleResource peopleResource_;
  
  public PeopleResourceClient(String url)
  {   
    ResteasyClient client = new ResteasyClientBuilder().build();
    ResteasyWebTarget target = client.target(url);

    peopleResource_ = target.proxy(PeopleResource.class);
  }
  
  public Person getPerson(long personId)
  {
    return peopleResource_.getPerson(personId);
  }
}
