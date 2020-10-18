package cupertinii;
import cupertinii.Person;
import java.time.LocalTime;

public class Teacher extends Person {
  private int teacher_id;
  private LocalTime created_on;

  public Teacher() {
    this.created_on = LocalTime.now();
    System.out.println("Constructor Teacher");
    _type = "Teacher";
  }
  /**
   * @param teacher_id the teacher_id to set
   */
  public void setTeacher_id(int teacher_id) {
  	this.teacher_id = teacher_id;
  }

  public String describe() {
    // super is used to access base class public or protected methods
    String str = super.describe() + " @id = " + teacher_id + ", created @" + created_on ;
    return str;
  }
}
