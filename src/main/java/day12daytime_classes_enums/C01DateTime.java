package day12daytime_classes_enums;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class C01DateTime {

    public static void main(String[] args) {

        //How to get local date from Java

        LocalDate myDate= LocalDate.now();//Obtains h current date from the system clock in the default time zone
        System.out.println(myDate);// 2023-07-18

        //How to get to a future date

        LocalDate yourDate = myDate.plusMonths(3).plusDays(11);
        System.out.println("yourDate= " + yourDate);// 2023-10-29

        //How to get to a past date

        LocalDate oldDate = myDate.minusYears(2).minusMonths(10).minusDays(45);

        System.out.println("OldDate= " + oldDate);// 2020-08-04

        //when we use multiple methods in the same line it is called method chain

        //Hot to format date

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyDate = dtf.format(myDate);
        System.out.println(formattedMyDate);

        //
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String myDateFormatted = dt.format(myDate);
        System.out.println(myDateFormatted);

        //
        DateTimeFormatter d =DateTimeFormatter.ofPattern("dd MMM yyyy");
        String myDateFormat = d.format(myDate.plusMonths(1));
        System.out.println(myDateFormat);

        //How to see a different time zone

        LocalDate dateInJapan = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInJapan);

        LocalDate dateInIstanbul = LocalDate.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(dateInIstanbul);

        //How to ger LocalTime from Java
        LocalTime myTime = LocalTime.now();//Obtains the current time value from the system clock in the default time zone
        System.out.println(myTime);

        //How to get to a future time

        LocalTime  yourTime = myTime.plusHours(1).plusMinutes(25).plusSeconds(13);
        System.out.println(yourTime);

        //How to get to a past date

        LocalTime ourTime = myTime.minusNanos(2000);
        System.out.println(ourTime);

        //How to format time
        DateTimeFormatter f1 =DateTimeFormatter.ofPattern("hh:mm a");//MM returns hour value with 24 hour system
        String myTimeFormatted = f1.format(myTime);                  //MM returns hour value with 12 hour system
        System.out.println(myTimeFormatted);                         // a stands for Am or PM time value

        //How to get time in another time zone
        LocalTime timeInJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInJapan);

        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime);

        System.out.println(myDateTime.getMonth());//JULY
        System.out.println(myDateTime.getDayOfWeek());//TUESDAY
        System.out.println(myDateTime.getMonthValue());//7


        //Example 4: If the given date is before the current date give message to user like "Invalid date"
        //           If the given date equals the current date give message to user like "Give the time"
        //           If the time is before current time tell to user "No ticket" otherwise tell to user "There is just 1 ticket"
        //           If the given date is after the current date give message to user like "Buy the ticket"

        Scanner input = new Scanner(System.in);
        System.out.println("Enter year, month, day value");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(2023,7,18);
        LocalDate currentDate = LocalDate.now();
        System.out.println("Enter the hour you want to reserve");
        LocalTime givenTime = LocalTime.of(11,34);
        LocalTime currentTime = LocalTime.now();

        if(givenDate.isBefore(currentDate)){
            System.out.println("Invalid Date");
        }else if (givenDate.equals(currentDate)){
            System.out.println("Give the time");
            if(givenTime.isBefore(currentTime)){
                System.out.println("No ticket");
            }else{
                System.out.println("There is just one Ticket");
            }


        }else if (givenDate.isAfter(currentDate)){
            System.out.println("Buy the ticket");
        }
    }
}
