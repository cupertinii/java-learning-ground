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
    me.setEnrolled_in_sports(true);
    me.introduce();
    me.currentAge();

    // Calling a static method from the Abstract or Actual class
    // Static method can be called without creating object of class
    Student.getClassType();
  }
}

// Interface Rules
// By default, all methods in Interface are by default Abstract and Public
// By default, all attributes in Interface are static and final
// No constructor

interface Person {
  // Can't define the variables here
  // public String first_name;
  // public int birth_year;

  // Following attribute is allowed as there is a value defined
  public String type = "Person";

  // Interface can't have a constructor
  // public Person() {
  // }

  public int currentAge();
  public void introduce();

  // Can't define the static
  // public static void getClassType();
}

interface Sportsperson {
  public String type = "Sports";
  public boolean enrolled_in_sports = false;

  public void setEnrolled_in_sports(boolean enrolled_in_sports);
  public boolean isEnrolledInSports();
}

// Actual Class implemented using Abstract class
class Student implements Person, Sportsperson  {
  public String first_name;
  public int birth_year;
  public boolean enrolled_in_sports;

  public int currentAge() {
    LocalDate today = LocalDate.now();
    return (today.getYear() - birth_year);
  }

  public void introduce() {
    System.out.println("I am a " +  Sportsperson.type + " " + Person.type +
      ", My name is " + first_name + " & my age is " +
      this.currentAge() +
      ", Sports enrollment : " + enrolled_in_sports
    );
  }

  public static void getClassType() {
    System.out.println("This is Student class");
    return;
  }

  /**
   * @param enrolled_in_sports the enrolled_in_sports to set
   */
  public void setEnrolled_in_sports(boolean enrolled_in_sports) {
  	this.enrolled_in_sports = enrolled_in_sports;
  }

  public boolean isEnrolledInSports() {
    return enrolled_in_sports;
  }
}
