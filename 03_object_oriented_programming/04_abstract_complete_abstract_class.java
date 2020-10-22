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

    // Calling a static method from the Abstract or Actual class
    // Static method can be called without creating object of class
    Person.getClassType();
    Student.getClassType();
  }
}

abstract class Person {
  public String type = "Human";
  public String first_name;
  public int birth_year;
  public abstract int currentAge();
  public abstract void introduce();

  public Person() {
    System.out.println("Abstract Class Person constructor");
  }

  public static void getClassType() {
    System.out.println("This is Student class");
    return;
  }
}

// Following is a completely abstract class with no implementation of any of
// its method
// It can't have any constructor as well
abstract class CompetelyAbstractPersonClass {
  public String type = "Human";
  public String first_name;
  public int birth_year;
  // Following methods with no body is defined with abstract modifier
  // which means it will need to be implemented in derived classes
  public abstract int currentAge();
  public abstract void introduce();
}

// Actual Class implemented using Abstract class
class Student extends Person  {

  public int currentAge() {
    LocalDate today = LocalDate.now();
    return (today.getYear() - birth_year);
  }

  public void introduce() {
    System.out.println("I am a " +  type + ", My name is " + first_name + " & my age is " + this.currentAge() );
  }

}
