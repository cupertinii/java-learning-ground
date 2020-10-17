public class App {

  public static void main(String[] args) {

    // 1. Java is always pass-by-value
    // 2. Nested functions = functions/method in functions are not allowed

    function_simple_example();

    int new_total;
    new_total = addScoreToTotal(45, 100);
    System.out.printf("new_total = %d \n", new_total);

    int size = 5;
    int initial_value = -1;
    int array[] = createAndInitializeArrayWithValue(size, initial_value);
    for(int i=0; i<5; i++) {
      System.out.printf("Array[%d] = %d \n", i, array[i]);
    }
  }

  // Simple function with no return value (void)
  public static void function_simple_example() {
    System.out.println("function_simple_example called");
  }

  // Function with arguments (score and prev_total) and a return value of type int
  public static int addScoreToTotal(int score, int prev_total) {
    prev_total = prev_total + score;
    return prev_total;
  }

  // Function to return value of type array
  public static int[] createAndInitializeArrayWithValue(int size, int initial_value) {
    // new_array is a local variable and accessible only in this function
    int new_array[] = new int[size];
    for(int i=0; i<size; i++) {
      new_array[i] = initial_value;
    }
    return new_array;
  }

}
