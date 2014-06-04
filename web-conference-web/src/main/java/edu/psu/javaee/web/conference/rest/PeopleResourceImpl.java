package edu.psu.javaee.web.conference.rest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import edu.psu.javaee.web.conference.model.Person;

public class PeopleResourceImpl implements PeopleResource
{
  @PersistenceContext(name = "webconference-ds")
  private EntityManager entityManager_;

  public Person getPerson(long pid)
  {
    return getPersonLocal(pid);
  }
  
  public Person getPsuPerson(long pid)
  {
    return getPersonLocal(pid);
  }

  public void createPerson(Person p)
  {
    entityManager_.persist(p);
  }
  
  public List<Person> getPersonByName(String lastName, String firstName)
  {
    if (lastName == null || lastName.isEmpty() || firstName == null || firstName.isEmpty())
    {
      throw new WebApplicationException(Response.status(Status.BAD_REQUEST).entity("Empty or null query arguments are not allowed").build());
    }
    
    TypedQuery<Person> query = entityManager_.createNamedQuery("Person.getPersonByName", Person.class);
    
    query.setParameter("firstName", firstName);
    query.setParameter("lastName",  lastName);
    List<Person> results  = query.getResultList();
    
    if (results.isEmpty())
    {
      throw new WebApplicationException(Status.NOT_FOUND);
    }
    
    return results;
  }
  
  //I realize that this is unnecessary,this is only intended to illustrate
  //content negotiation
  private Person getPersonLocal(long pid)
  {
    Person p = entityManager_.find(Person.class, pid);

    if (p == null)
    {
      throw new WebApplicationException(Status.NOT_FOUND);
    }

    return p;
  }
}
