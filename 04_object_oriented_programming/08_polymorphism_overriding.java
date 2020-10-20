import java.time.LocalDate;

//
// Polymorphism := Occurring in several different forms
//
// Object Oriented Polymorphism can be implemented using two ways:
//     1. Method overloading - same functiona name but different arguments and
//                             return types.
//                             It is also called Static Polymorphism.
//     2. Method overriding -  same functiona name with exact same list of
//                             arguments and return types but different
//                             implementation in inherited classes (subclasses)
//                             It is also called Dynamic Polymorphism.

// In this example we will use Overriding (Dyanamic) Polymorphism
//

public class App {
  public static void main(String[] args) {

    Person me = new Teacher();
    me.first_name = "Cupertinii";
    me.birth_year = 2001;
    me.introduce();
    me.currentAge();
    // Although it is Person type object but we used Teacher for object
    // creation and so getClassType method will call the student Method
    me.getClassType();

    Person teacher = new Student();
    teacher.first_name = "Ananya";
    teacher.birth_year = 2005;
    teacher.introduce();
    teacher.currentAge();
    // Although it is Person type object but we used Student for object
    // creation and so getClassType method will call the student Method
    teacher.getClassType();

  }
}

abstract class Person {
  public String type = "Person";
  public String first_name;
  public int birth_year;
  public abstract int currentAge();
  public abstract void introduce();

  public Person() {
    System.out.println("Abstract Class Person constructor");
  }

  // If the method is overrided in subclass, it will not be called for the
  // Subclass object
  public void getClassType() {
    System.out.println("This is " + type + " class");
    return;
  }
}

// Actual Class implemented using Abstract class
class Student extends Person  {
  public String type = "Student";
  public int currentAge() {
    LocalDate today = LocalDate.now();
    return (today.getYear() - birth_year);
  }

  public void introduce() {
    System.out.println("I am a " +  type + ", My name is " + first_name +
      " & my age is " + this.currentAge() );
  }

  // Overriding the base class method with its own implementation
  public void getClassType() {
    System.out.println("This is " + type + " class");
    return;
  }
}

// Actual Class implemented using Abstract class
class Teacher extends Person  {
  public String type = "Teacher";
  public int currentAge() {
    LocalDate today = LocalDate.now();
    return (today.getYear() - birth_year);
  }

  public void introduce() {
    System.out.println("I am a " +  type + ", My name is " + first_name +
      " & my age is " + this.currentAge() );
  }

  // Overriding the base class method with its own implementation
  public void getClassType() {
    System.out.println("This is " + type + " class");
    return;
  }
}
