import cupertinii.*;
import java.time.LocalDate;

public class App {
  public static void main(String[] args) {
    // Following generate compile time error as Person is Abstract Class
    // Abstract class will need to be 'extends' or 'derived'
    // Error >> Person me = new Person();
    Student me = new Student();
    me.first_name = "Cupertinii";
    me.birth_year = 2001;
    me.introduce();
    me.currentAge();
  }
}

// Abstract => Idea or Concept
abstract class Person {
  public String type = "Human";
  public String first_name;
  public int birth_year;

  public Person() {
    System.out.println("Abstract Class Person constructor");
  }

  // Following method with no body is defined with abstract modifier
  // which means it will need to be implemented in derived classes
  public abstract int currentAge();

  public void introduce() {
    System.out.println("I am a " +  type + ", My name is " + first_name + " & my age is " + this.currentAge() );
  }
}

// Actual Class implemented using Abstract class
class Student extends Person {
  // Current Age method must be implemented here in this class as it is
  // abstract class in Person
  public int currentAge() {
    LocalDate today = LocalDate.now();
    return (today.getYear() - this.birth_year);
  }
}
