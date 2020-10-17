public class App {

  public static void main(String[] args) {
    if_else_example(); // simple if else
    if_else_if_example(); // also known as nested if else
    switch_case_example(); // switch case
  }

  public static void if_else_example() {

    // if (condition) { run this code if condition is true }
    // else { run this code if condition is false }
    boolean isOn = true;
    if(isOn) {
      System.out.println("System is ON");
    }
    else {
      System.out.println("System is OFF");
    }

    int age = 18;
    if(age > 18) {
      System.out.println("Adult");
    }
    else {
      System.out.println("Minor");
    }
  }

  public static void if_else_if_example() {
    int age = 67;

    if(age > 110) {
      System.out.println("Late Centenary");
    }
    else if(age > 100) {
      System.out.println("Early Centenary");
    }
    else if(age > 80) {
      System.out.println("Late Elder");
    }
    else if(age > 65) {
      System.out.println("Early Elder");
    }
    else if(age > 45) {
      System.out.println("Preelder");
    }
    else if(age > 29) {
      System.out.println("Middle Aged Adult");
    }
    else if(age > 25) {
      System.out.println("Grown Adult");
    }
    else if(age > 19) {
      System.out.println("Young Adult");
    }
    else if (age > 12 ) {
      System.out.println("Teenager");
    }
    else if (age > 9 ) {
      System.out.println("Tweenager");
    }
    else if (age > 5 ) {
      System.out.println("Gradeschooler");
    }
    else if (age > 3 ) {
      System.out.println("Preschooler");
    }
    else if (age > 1 ) {
      System.out.println("Toddler");
    }
    else {
      System.out.println("Baby");
    }
  }

  public static void switch_case_example() {
    char direction_code = 'N';

    switch(direction_code) {
      case 'N':
        System.out.println("NORTH");
        break;
      case 'S':
        System.out.println("SOUTH");
        break;
      case 'E':
        System.out.println("EAST");
        break;
      case 'W':
        System.out.println("WEST");
        break;
      default:
        System.out.println("Incorrect");
    }
  }

}
