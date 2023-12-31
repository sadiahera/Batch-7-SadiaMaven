package conditionalStatement;

import java.util.Scanner;

public class ifElseStatement {


    int age = 20;

    public void ifelse(){

    if(age == 10){
        System.out.println("age is 10");
    }

    else if (age == 15){
        System.out.println("age is 15");
    }

    else if (age == 20){
        System.out.println("age is 20");
    }

    else {
        System.out.println("none of the above is true");
    }

    }

 public void practice(){
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
    Scanner scan = new Scanner(System.in);
    int mark = scan.nextInt();
     boolean b = mark < 45;
     if (mark < 25){
        System.out.println("The student go t F");
    }
    else if (mark == 25) {
        System.out.println("The student got E");
    }

else if (mark == 60){
        System.out.println("The student got C");
    }
else if (mark == 80){
        System.out.println("The student got B");
    }
 }

    public static void main(String[] args) {
        ifElseStatement obj = new ifElseStatement();
        obj.practice();
    }



    }








