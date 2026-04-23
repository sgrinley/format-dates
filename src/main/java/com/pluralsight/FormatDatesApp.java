package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDatesApp {
    public static void main(String[] args) {

//      Get Current Local Date/Time (my system time)
        LocalDateTime now = LocalDateTime.now();

//      1st Format: MM/DD/YYYY
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MM/dd/yyyy ");
        System.out.println("1: " + now.format(f1));


//      2nd Format: dd/MM/yyyy
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy  ");
        System.out.println("2: " + now.format(f2));


//      3rd Format: yyyy-MM-dd
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("yyyy-MM-dd  ");
        System.out.println("3: " + now.format(f3));


//      4th Format: EEEE dd, yyyy
        DateTimeFormatter f4 = DateTimeFormatter.ofPattern("EEEE dd, yyyy  ");
        System.out.println("4: " + now.format(f4));









//       5th Format: EEEE, MM, dd, yyyy HH:mm
//       6th Format: EEEE, MM, dd, yyyy HH:mm:ss
//       7th Format: h:mm 'on' dd-MM-yyyy
//

    }
}
