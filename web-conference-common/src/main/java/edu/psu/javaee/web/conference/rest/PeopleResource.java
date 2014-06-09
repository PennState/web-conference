package edu.psu.javaee.web.conference.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import edu.psu.javaee.web.conference.model.Person;

@Path("people")
public interface PeopleResource
{
  @GET
  @Produces({"application/xml", "application/json"})
  @Path("{pid}")
  Person getPerson(@PathParam("pid") long pid);
  
//  @GET
//  @Produces("application/vnd-psu-v1+json")
//  @Path("{pid}")
//  Person getPsuPerson(@PathParam("pid") long pid);
  
  @GET
  @Produces("application/json")
  List<Person> getPersonByName(@QueryParam("last-name") String lastName, @QueryParam("first-name") String firstName);
  
  @POST
  @Consumes({"application/xml", "application/json"})
  void createPerson(Person person);
}
