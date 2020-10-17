public class App {

  public static void main(String[] args) {
    strings_example();
  }

  public static void strings_example() {
    String name = "Cupertinii";

    System.out.printf("Name = %s \n", name);

    // Length of the string
    System.out.printf("Name length = %d \n", name.length() );

    // find nth character of string
    System.out.printf("Name length = %c \n", name.charAt(0) );

    // Make it all uppercase
    System.out.printf("Name = %s \n", name.toUpperCase() );

    // Make it all lowercase
    System.out.printf("Name = %s \n", name.toLowerCase() );

    // Replace all i with o
    System.out.printf("Name = %s \n", name.replace('i','o') );

    // Get characters between index 2 and 7
    System.out.printf("Name = %s \n", name.substring(2, 7) );

    // Get characters between index 2 and last char (both inclusive)
    System.out.printf("Name = %s \n", name.substring(2) );

    // Check if name is empty string
    System.out.printf("Name is empty? = %b \n", name.isEmpty() );

    // Check when i is appearing in the string name
    System.out.printf("Name 'i' = %d \n", name.indexOf('i') );
    System.out.printf("Name 'p' = %d \n", name.indexOf('p') );

    // Check whether it ends with specified string

    System.out.printf("Name ends with 'nii' = %b \n", name.endsWith("nii") );
    System.out.printf("Name ends with 'ing' = %b \n", name.endsWith("ing") );

    String input = "  Cupertinii of Cupertino  ";
    System.out.printf("Leading Whitespace stripped = %s \n", input.stripLeading() );
    System.out.printf("Trailing Whitespace stripped = %s \n", input.stripTrailing() );
    System.out.printf("All leading and trailing Whitespace stripped = %s \n", input.strip() );
  }

}
