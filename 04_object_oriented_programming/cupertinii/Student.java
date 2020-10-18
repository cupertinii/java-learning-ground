package cupertinii;
import cupertinii.Person;
import java.time.LocalTime;

public class Student extends Person {
  private int student_id;
  private LocalTime created_on;

  public Student() {
    created_on = LocalTime.now();
    System.out.println("Constructor Student");
    _type = "Student";
  }
  /**
   * @param student_id the student_id to set
   */
  public void setStudent_id(int student_id) {
  	this.student_id = student_id;
  }

  public String describe() {
    // super is used to access base class public or protected methods
    String str = super.describe() + " @id = " + student_id + ", created @" + created_on ;
    return str;
  }
}
