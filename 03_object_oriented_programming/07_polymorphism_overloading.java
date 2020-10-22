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

// In this example we will use Overloading (Static) Polymorphism
//

public class App {
  public static void main(String[] args) {
    Student me = new Student();
    me.first_name = "Cupertinii";
    me.birth_year = 2001;
    me.introduce();
    me.currentAge();

    // Here we are calling introduce method but with a parameter
    me.introduce("Ananya");

    int Year = 2030;
    // Here we are calling currentAge method but with a parameter
    int age = me.currentAge(Year);
    System.out.println(Year + ": My age will be " + age);

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

  public void getClassType() {
    System.out.println("This is Student class");
    return;
  }
}

// Actual Class implemented using Abstract class
class Student extends Person  {

  public int currentAge() {
    LocalDate today = LocalDate.now();
    return (today.getYear() - birth_year);
  }

  // This is overloading the currentAge method with different set of arguments
  public int currentAge(int comparedToYear) {
    return (comparedToYear - birth_year);
  }

  public void introduce() {
    System.out.println("I am a " +  type + ", My name is " + first_name +
      " & my age is " + this.currentAge() );
  }

  // This is overloading the introduce method with different set of arguments
  public void introduce(String ToPerson) {
    System.out.println("Hi " + ToPerson + "! I am a " +  type +
      ", My name is " + first_name + " & my age is " + this.currentAge() );
  }

}
