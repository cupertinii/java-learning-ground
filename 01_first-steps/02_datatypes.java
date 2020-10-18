public class App {
  public static void main(String[] args) {
    // Integers for storing the whole numbers
    int height = 123;
    int width = 5;
    int area = height * width;
    System.out.println("Area = " + area);

    // Double for storing the fractions
    double total_area = 125.5;
    int number_sections = 3;
    double area_per_section = total_area / number_sections;
    System.out.println("Area per Section = " + area_per_section);

    // char for storing single character
    // - Single quotes are used for string literals.
    char first_char = 'A';
    System.out.println("First Char = " + first_char);
    // We can also use ASCII code for Chars
    char char_A = 65;
    char char_7 = 55;
    System.out.println("Char = " + char_A);
    System.out.println("Char = " + char_7);

    // Boolean for storing true or false
    // useful for logical operations
    boolean isAvailable = true;
    boolean isOpen = false;
    boolean isNotAvailable = !isAvailable;
    boolean isAvailableAndOpen = isAvailable && isOpen;
    boolean isAvailableOrOpen = isAvailable || isOpen;
    System.out.println("IsAvailable = " + isAvailable + ", isOpen = " + isOpen);
    System.out.println("NOT operation => isNotAvailable = " + isNotAvailable);
    System.out.println("AND operation => isAvailableAndOpen = " + isAvailableAndOpen);
    System.out.println("OR operation => isAvailableOrOpen = " + isAvailableOrOpen);

    // String for storing sequences of multiple characters
    // - Single quotes are not allowed.
    String description = "sample name with spaces";
    System.out.println("description = " + description);
  }
}
