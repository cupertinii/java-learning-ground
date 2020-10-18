public class App {

  public static void main(String[] args) {
    // Classes are structure to bundle both variables and methods together
    // in a logical way. e.g. A Person can be represented with a class
    // where his name and date of birth will be stored and there will method
    // like age to calculate person's age on a specified date.

    // Create a new Person
    Person cupertinii = new Person(); // This will call Class constructor

    // Set Name with
    cupertinii.setName("Aditi Singh");
    // Or
    cupertinii.Name = "Aditi" ;

    // Since it is public, we can access it with
    System.out.println("Name = " + cupertinii.Name);

    cupertinii.setBirthYear(2021);
    int current_age = cupertinii.currentAge(2020);
    if(current_age!=-1) {
      System.out.println("Current age = " + current_age);
    }
  }

}

//
public class Person {

  // Clsass variables
  // Name is public which means it is accessible outside of this class
  public String Name;

  // BirthYear is private to this class and is not accessible outisde of
  // this class
  private int BirthYear;

  Person() {
    System.out.println("This is Person's constructor");
    BirthYear = -1;
  }

  // SETTER for assigning value to private variables
  /**
   * @param name the name to set
   */
  public void setName(String name) {
  	Name = name;
  }

  // SETTER for assigning value to private variables
  /**
   * @param birthYear the birthYear to set
   */
  public void setBirthYear(int birthYear) {
    if(birthYear > 2020) {
      System.out.println("Input error: future birth year is not allowed");
      return;
    }
  	BirthYear = birthYear;
  }

  int currentAge(int currentYear) {
    if(BirthYear == -1) {
      System.out.println("Specify a valid BirthYear first !");
      return -1;
    }
    return currentYear - BirthYear;
  }

}
