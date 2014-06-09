package edu.psu.javaee.web.conference.rest;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import edu.psu.javaee.web.conference.model.Name;
import edu.psu.javaee.web.conference.model.Person;

public class PeopleResourceClientTest
{
  private static final String URL = "http://localhost:8080/web-conference-web/api";

  private PeopleResourceClient client_;
  
  @Before
  public void setup()
  {
    client_ = new PeopleResourceClient(URL);
  }
  
  @Test
  public void testGetPerson()
  {
    Person p = client_.getPerson(1);
    
    assertNotNull(p);
  }
  
  @Test
  public void testCreatePerson() {
    Person p = new Person();
    Name n = new Name();
    n.setLastName("Someone");
    p.setName(n);
    p.toString();
  }
}
