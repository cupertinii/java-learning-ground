//
// Read more about Exceptions at
// https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html
//

public class App {

  public static void main(String[] args) {
    // Exceptions are runtime (during execution of program) errors
    // If not handled properly, these can cuase program to terminate
    // Try-Catch-Finally is provided to handle these exceptions

    // Example 1: (Divide by Zero)
    divideByZero_with_try_catch_example(0);

    // Example 2: Array out of bound
    arrayOutOfBound_with_try_catch_example();

    // Example 3: Both Exception in one
    multipleExceptions_with_try_catch_example();

  }

  // This will generate following exception if divisor = 0
  // "Exception in thread "main" java.lang.ArithmeticException: / by zero"
  public static void divideByZero_example(int divisor) {
    double output = 10 / divisor;
    System.out.printf("Output = %.2f \n", output);
  }

  public static void divideByZero_with_try_catch_example(int divisor) {
    System.out.println("\n divideByZero_with_try_catch_example");
    try {
      double output = 10 / divisor;
      System.out.printf("Output = %.2f \n", output);
    }
    catch(ArithmeticException e) {
      System.out.printf("Divide by Zero. Change the value of divisor : %d \n", divisor);
    }
  }

  // Array Index Out of Bound Example
  // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
  public static void arrayOutOfBound_with_try_catch_example() {
    System.out.println("\n arrayOutOfBound_with_try_catch_example");
    try {
      int MAX_SIZE = 10;
      int array [] = new int[MAX_SIZE];

      // Following will generate exception
      System.out.printf("Accessing = %d \n", array [ MAX_SIZE ] );
    }
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.printf("Array index out of bound. \n");
    }
  }

  // Catching multiple types of exeception Example
  public static void multipleExceptions_with_try_catch_example() {
    System.out.println("\n multipleExceptions_with_try_catch_example");
    try {
      double output = 10 / 1;
      System.out.printf("Output = %.2f \n", output);

      int MAX_SIZE = 10;
      int array [] = new int[MAX_SIZE];
      // Following will generate exception
      System.out.printf("Accessing = %d \n", array [ MAX_SIZE ] );
    }
    catch(ArithmeticException e) {
      System.out.printf("Divide by Zero. Change the value of divisor.\n");
    }
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.printf("Array index out of bound. \n");
    }
    finally {
      System.out.printf("Finally code is executed irrespective of exception is thrown or not. \n");
    }
  }

}
