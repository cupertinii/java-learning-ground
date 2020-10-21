// Examples of using STATIC
// Static modifier can be used to access attribute or method without
// the need for instantiating object
// e.g in following Student class, we are directly accessing type attribute
// using the Student class
// Similarly, we are directly accessing sayHello functionality using the Student
// class
public class App {
  public static void main(String[] args) {
    Student std = new Student();

    // Accessing via Student Object
    std.type = "Student Object";
    std.sayHello();

    // Accessing via Student Class 
    System.out.println(Student.type);
    Student.sayHello();
  }
}

public class Student {
  public static String type = "Student";
  public static void sayHello() {
    System.out.println(type + " Hello");
  }
}
