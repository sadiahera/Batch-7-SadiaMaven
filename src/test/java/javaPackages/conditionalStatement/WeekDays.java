package conditionalStatement;

import java.util.Scanner;

public class WeekDays {
    /* write a java function and use the parameter of an integer between 1 and 7.
   it displays the weekday name.

     */

    public void weekdays(int a) {

        if (a == 1) {
            System.out.println("Sunday");
        }
        if (a == 2) {
            System.out.println("Monday");

        }
        if (a == 3) {

            System.out.println("Tuesday");
        }

        if (a == 4) {
            System.out.println("Wednesday");
        }
        if (a == 5) {
            System.out.println("Thursday");
        }

        if (a == 6) {
            System.out.println("Friday");
        }

        if (a == 7) {
            System.out.println("Saturday");
        }
    }

    public static void main(String[] args) {
     WeekDays obj = new WeekDays();
     obj.weekdays(5);
    }
}

