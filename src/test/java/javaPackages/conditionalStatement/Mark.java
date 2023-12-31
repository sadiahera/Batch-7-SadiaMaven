package conditionalStatement;

import java.util.Scanner;

public class Mark {
    static int Number = 20;

    public void practice() {


    /* A school has following for grading system:
    a Below 25 - F
    b.25 to below 45 - E
    c.45 to  below 50 - D
     50 to below 60 - C
    e.60 to below 80 - B
    f.Above 80 - A
    Ask user to enter marks and print the corresponding grade.

    Ask user to enter any number and through your code you print the number.


   */

    }

    public void mark() {
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();

        if (mark < 25){
            System.out.println("The student go t F");
        }
        if ((mark == 25)||(mark<45)) {
            System.out.println("The student got E");
        }

         if
         ((mark == 45) ||(mark<50)){
            System.out.println("The student got D");
        }
         if ((mark == 50) ||(mark<60)){
            System.out.println("The student got C");
        }
         if ((mark == 60) ||(mark<80)){
            System.out.println("The student got B");
        }
        if ((mark == 80) ||(mark>80)){
            System.out.println("The student got A");
        }



    }

    public static void main(String[] args) {
        Mark obj =new Mark();
        obj.mark();

    }
}