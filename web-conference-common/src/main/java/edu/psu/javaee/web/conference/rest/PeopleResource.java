package edu.psu.javaee.web.conference.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import edu.psu.javaee.web.conference.model.Person;
import edu.psu.javaee.web.conference.model.PersonV2;

@Path("people")
public interface PeopleResource
{
  @GET
  @Produces({"application/xml", "application/json"})
  @Path("{pid}")
  Person getPerson(@PathParam("pid") long pid);
  
  @GET
  @Produces("application/vnd-psu-v2+json")
  @Path("{pid}")
  PersonV2 getPsuPerson(@PathParam("pid") long pid);
  
  @GET
  @Produces("application/json")
  List<Person> getPersonByName(@QueryParam("last-name") String lastName, @QueryParam("first-name") String firstName);
}
