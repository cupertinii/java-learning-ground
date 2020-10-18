public class App {

  public static void main(String[] args) {
    // Objects are created from Classes
    // As we saw Person in 10_classes.java example
    // String itself is a also a class so when we create a string variable
    // , it is actually an object of String with some associated methods
    // We saw it in 07_strings.java

    // Create a object of String class and assign some value to it.
    String str = "Sky Blue";
    // str is object of String class

    int foundAt = str.indexOf("Blue");
    // Here we are using indexOf method of String class with object 'str'

    System.out.printf("Found at %d \n", foundAt);
  }

}
