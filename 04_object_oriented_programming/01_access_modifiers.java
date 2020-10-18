import cupertinii.*;

public class App {
  public static void main(String[] args) {

    // There are three types of access modifiers
    // public - accessible to everyone
    // private - only accessible within the class
    // protected - only accessible within the class or subclasses

    // EXAMPLE
    // Person is a base class
    // Student is a Person with its own attributes (subclass of Person)
    // Teacher is a Person with its own attributes (subclass of Person)

    Person person = new Person();
    person.first_name = "First";
    person.last_name = "Last";
    System.out.println( person.describe() );

    Student student = new Student();
    student.first_name = "John";
    student.last_name = "Doe";
    // Following is not accessible as it is defined as 'private'
    // student.student_id = 1292;
    // In order to set student_id, we'll have to use it via setter method
    student.setStudent_id(1292);

    System.out.println( student.describe() );

    Teacher teacher = new Teacher();
    teacher.first_name = "Jim";
    teacher.last_name = "Landon";
    // Following is not accessible as it is defined as 'private'
    // teacher.teacher_id = 100;
    // In order to set teacher_id, we'll have to use it via setter method
    teacher.setTeacher_id(100);
    System.out.println( teacher.describe() );
  }
}
