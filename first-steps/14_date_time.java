// Import the Local Date and Time classes
import java.time.LocalDate;
import java.time.LocalTime;

public class App {

  public static void main(String[] args) {
    LocalDate today = LocalDate.now();

    System.out.println( "Today          : " + today );
    System.out.println( "Day            : " + today.getDayOfWeek() );
    System.out.println( "Day            : " + today.getDayOfYear() + "th day of year" );
    System.out.println( "Month          : " + today.getMonth() );
    System.out.println( "Year           : " + today.getYear() + "\n");

    // Parse Time from String
    String user_date = today.parse("2007-12-03").toString();
    System.out.println( "User date      : "  + user_date + "\n");

    LocalTime time_right_now = LocalTime.now();

    System.out.println( "Hour           : " + time_right_now.getHour() );
    System.out.println( "Minute         : " + time_right_now.getMinute() );
    System.out.println( "Second         : " + time_right_now.getSecond() );
    System.out.println( "Nanosecond     : " + time_right_now.getNano() );
    System.out.println( "Nanosecond Day : " + time_right_now.toNanoOfDay() + "\n");

    System.out.println( "Time            : " + time_right_now );
    System.out.println( "2 hrs later     : " + time_right_now.plusHours(2) );
    System.out.println( "140 mins later  : " + time_right_now.plusMinutes(145) );
    System.out.println( "360 secs later  : " + time_right_now.plusSeconds(360) + "\n");

    // Parse Time from String
    String user_time = time_right_now.parse("10:40:44").toString();
    System.out.println( "User tim        : "  + user_time );

  }

}
