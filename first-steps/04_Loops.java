public class App {

  public static void main(String[] args) {
    forLoopExample();
    whileLoopExample();
    doWhileLoopExample();
  }

  public static void forLoopExample() {
    // FOR LOOP - start, end with step size (increase/decrease)
    // for(assignment, condition, stepsize)

    // This will print 0 to 9
    System.out.print("[0 to 9] by 1  => ");
    for(int i=0; i<10; i=i+1)  {
      System.out.print(" " + i);
    }
    System.out.println();

    // This will print 9 to 0
    System.out.print("[9 to 0] by -1 => ");
    for(int i=9; i>=0; i=i-1)  {
      System.out.print(" " + i);
    }
    System.out.println();

    // This will print all even numbers
    System.out.print("[0 to 9] by -2 => ");
    for(int i=0; i<9; i=i+2)  {
      System.out.print(" " + i);
    }
    System.out.println();

    // This will print all odd numbers in reverse order from 9
    System.out.print("[9 to 0] by -2 => ");
    for(int i=9; i>=0; i=i-2)  {
      System.out.print(" " + i);
    }
    System.out.println();
  }

  public static void whileLoopExample() {
    // WHILE LOOP - Check for condition, if true then execute the code block else break out of while loop
    // while(this condition is true) { run this code block }

    int i = 0; // Initialization

    System.out.print("[0 to 9] by 1  => ");
    while(i<10) {
      System.out.print(" " + i);
      i = i+1; // Increment
    }
    System.out.println();

    // Breaking out of loop in between
    i = 0; // Initialization

    System.out.print("[0 to 9] by 1  => ");
    while(i<20) {
      System.out.print(" " + i);
      i = i+1; // Increment
      if(i>=10) break; // Condition and break to break out of loop
    }
    System.out.println();
  }

  public static void doWhileLoopExample() {
    // DO-WHILE LOOP - Check for condition, if true then execute the code block else break out of while loop
    // do { run this code block at least once } while(this condition is true);

    int i = 0; // Initialization

    System.out.print("[0 to 9] by 1  => ");
    do {
      System.out.print(" " + i);
      i = i+1; // Increment
    } while(i<10);
    System.out.println();

    // Breaking out of loop in between
    i = 0; // Initialization

    System.out.print("[0 to 9] by 1  => ");
    do {
      System.out.print(" " + i);
      i = i+1; // Increment
      if(i>=10) break; // Condition and break to break out of loop
    } while(i<20);

    System.out.println();
  }
}
