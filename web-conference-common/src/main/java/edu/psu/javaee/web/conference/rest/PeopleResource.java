package edu.psu.javaee.web.conference.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import edu.psu.javaee.web.conference.model.Person;

@Path("people")
public interface PeopleResource
{
  @GET
  @Produces({"application/xml", "application/json"})
  Person getPerson(@PathParam("pid") long pid);
  
  @GET
  @Produces("application/vnd-psu-v1+json")
  Person getPsuPerson(@PathParam("pid") long pid);
}
