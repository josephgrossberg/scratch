/***
 * Excerpted from "Rails For Java Programmers"
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/fr_r4j for more book information.
***/
import java.util.*;

public class Person {
  //START:fields
  private long id;
  private String firstName;
  private String lastName;
  //END:fields

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  //START:accessors
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  //END:accessors

}
