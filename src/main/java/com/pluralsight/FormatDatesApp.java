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










//       2nd Format: MM/dd/yyyy
//       3rd Format: yyyy-MM-dd
//       4th Format: EEEE dd, yyyy
//       5th Format: EEEE, MM, dd, yyyy HH:mm
//       6th Format: EEEE, MM, dd, yyyy HH:mm:ss
//       7th Format: h:mm 'on' dd-MM-yyyy
//

    }
}
