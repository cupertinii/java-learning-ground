
public class App {
  public static void main(String[] args) {
      System.out.println("App started");
      for( int i=0; i<10; i++) {
        System.out.print(".");
        Wait(1);
      }
      System.out.println("\nApp finished.");
  }

  public static void Wait(int seconds) {
    try {
      Thread.sleep(seconds*1000);
    }
    catch(InterruptedException ex) {
      System.out.println("Error"+ ex);
    }
  }
}
