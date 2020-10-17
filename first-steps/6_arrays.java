public class App {

  public static void main(String[] args) {
    array_with_values_example();
    array_with_size_example();
    string_array_example();
  }

  public static void array_with_values_example() {

    // Array of Integers initialized with some values
    int scores[] = { 23, 45, 44, 34, 50 };
    // or following will work too
    // int[] scores = { 23, 45, 44, 34, 50 };

    System.out.printf("First score is = %d, 5th score is = %d \n", scores[0], scores[4]);

    int total_score_entries = scores.length;
    double sum = 0;
    double average = 0;
    int idx;
    for(idx=0; idx<total_score_entries; idx++) {
      sum = sum + scores[idx];
    }
    average = sum/total_score_entries;
    System.out.printf("Average Score = %.2f \n", average);
  }

  public static void array_with_size_example() {
    // Array of Integers - initialized size
    int scores[] = new int[5];
    System.out.printf("First score is = %d, 5th score is = %d \n", scores[0], scores[4]);
    // scores[5] won't be accessible and will throw error

    // We can initiatialize the array with values now
    scores[0] = 23;
    scores[1] = 45;
    scores[2] = 44;
    scores[3] = 34;
    scores[4] = 50;

    int total_score_entries = scores.length;
    double sum = 0;
    double average = 0;
    int idx;
    for(idx=0; idx<total_score_entries; idx++) {
      sum = sum + scores[idx];
    }
    average = sum/total_score_entries;
    System.out.printf("Average Score = %.2f \n", average);
  }

  public static void string_array_example() {
    // Array of Integers - initialized size
    String weekdays[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
    for(int i=0; i<weekdays.length; i++) {
      System.out.printf("% 2d %s\n", i, weekdays[i]);
    }
  }

}
