import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class MyDate {
  void getCurrentDate() throws ParseException{
    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    Date date = new Date();
    String dates = format.format(date);
    System.out.println("Current datetime is: " + dates);
  }
  void calculateDaysBtwDates(String date1, String date2) throws ParseException {
    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    Date d1 = format.parse(date1);
    Date d2 = format.parse(date2);
    long mil = d2.getTime() - d1.getTime();
    long day = TimeUnit.MILLISECONDS.toDays(mil)%365;
    System.out.println(day);
  }
  void findDay(String date) throws ParseException{
    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    Date d1 = format.parse(date);
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(d1);
    String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
    System.out.println("The day is: " + days[calendar.get(Calendar.DAY_OF_WEEK) - 1]);
  }
}
public class Lab05_1_EmOrmrethRethtihpong {
  static void menu(){
    System.out.println("==== Menu ====");
    System.out.println("1. Current date and time");
    System.out.println("2. Calculate days btw two dates");
    System.out.println("3. Find the day of the week");
    System.out.println("4. Quit");
    System.out.print("Choose an opt: ");
  }
  static boolean askIfContinue(){
    System.out.print("Do you want to continue (y/n)?: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    input = input.toLowerCase();
    return input.equals("y") || input.equals("yes");
  }

  public static void main(String[] args) throws ParseException {
    Scanner scanner = new Scanner(System.in);
    int userInput;
    do {
      MyDate myDate = new MyDate();
      String date1,date2;
      menu();
      userInput = scanner.nextInt();
      switch (userInput){
        case 1:
          myDate.getCurrentDate();
          break;
        case 2:
          System.out.print("First date (dd-mm-yy): ");
          date1 = scanner.next();
          System.out.print("Second date (dd-mm-yy): ");
          date2 = scanner.next();
          myDate.calculateDaysBtwDates(date1,date2);
          break;
        case 3:
          do {
            System.out.print("Input a date (dd-mm-yy): ");
            date1 = scanner.next();
            myDate.findDay(date1);
          }while (askIfContinue());
          break;
        case 4:
          System.exit(0);
          break;
        default:
          System.out.println("Invalid Option....");
          break;
      }
    }while (true);
  }
}
