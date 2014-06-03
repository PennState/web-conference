package edu.psu.javaee.web.conference.rest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response.Status;

import edu.psu.javaee.web.conference.model.Person;

@Path("people")
public class PeopleResourceImpl implements PeopleResource
{
  @PersistenceContext(name = "webconference-ds")
  private EntityManager entityManager_;

  @GET
  @Produces({ "application/xml", "application/json" })
  public Person getPerson(@PathParam("pid") long pid)
  {
    return getPersonLocal(pid);
  }

  @GET
  @Produces("application/vnd-psu-v1+json")
  public Person getPsuPerson(@PathParam("pid") long pid)
  {
    return getPersonLocal(pid);
  }

  @POST
  public void createPerson(Person p)
  {
    entityManager_.persist(p);
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
