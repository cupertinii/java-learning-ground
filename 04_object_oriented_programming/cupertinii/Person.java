package cupertinii;
import java.time.LocalTime;

public class Person {

  // Following public attributes will be accessible directl outside of
  // this class
  //
  // These can be accessed with either
  // object.attribute or object.setAttribute() method
  public String first_name;
  public String last_name;

  // Following private attribute will not be accessible outside of this class
  //
  // These can be accessed with only object.setAttribute() method
  // provided setter/getter method are exposed as public
  private LocalTime created_on;

  // Following protected attribute will be accessible to subclass or
  // derived subclasses of this class like Student or Teacher
  protected String _type;

  public Person() {
    this.created_on = LocalTime.now();
    System.out.println("Constructor Person");
    this._type = "Person";
  }
  /**
   * @param first_name the first_name to set
   */
  public void setFirst_name(String first_name) {
  	this.first_name = first_name;
  }
  /**
   * @param last_name the last_name to set
   */
  public void setLast_name(String last_name) {
  	this.last_name = last_name;
  }

  public String describe() {
    String str = "Type : " + _type + " => " + first_name + " " + last_name + ", created @" + created_on ;
    return str;
  }
}
