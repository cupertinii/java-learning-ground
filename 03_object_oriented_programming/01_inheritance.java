import cupertinii.*;

public class App {
  public static void main(String[] args) {

    // EXAMPLE
    // Person is a base class
    // Student is a Person with its own attributes (subclass of Person)
    // Teacher is a Person with its own attributes (subclass of Person)
    //
    // Student is derived from Person
    //
    // This is how we instantiate student object from Student class
    Student student = new Student();

    // This is how we can access Student attributes
    student.first_name = "John";
    student.last_name = "Doe";

    // This is how we can call Student method
    student.setStudent_id(1292);


    // This is how we can call another Student method
    System.out.println( student.describe() );

  }
}
