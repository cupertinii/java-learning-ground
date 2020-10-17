public class App {

  public static void main(String[] args) {

    // 1. Recursion is calling same function from within the function
    // 2. Recursion function must have a exiting condition otherwise it will get
    //  into an infinite loop crashing the app.
    // 3. We can also write the same function logic using the loops

    // Example 1
    int max_call_counter = 10;
    int current_count = 0;
    // Following function will be called 10 times;
    simple_recursive_function(max_call_counter, current_count);


    // Example 2
    // Calculate factorial of N
    // which can be represented as
    //   f(n) = n * f(n-1)
    //   where n > 1 and f(0) = 1
    long factorial_output;
    int value = 10;
    factorial_output = factorial(value);
    System.out.printf("Factorial of %d = %d \n", value, factorial_output);

  }

  // Simple function with no return value (void)
  public static void simple_recursive_function(int max_count, int current_count) {
    System.out.println("simple_recursive_function called : " + current_count);
    // This is exiting condition
    if(current_count > max_count) {
      return;
    }
    // Call the function again but increase the current_count by 1
    simple_recursive_function(max_count, current_count+1);
    return;
  }

  // Factorial calculator
  public static long factorial(int n) {
    // This is exiting condition
    if(n==1) {
      return 1;
    }
    return n * factorial(n-1);
  }


}
