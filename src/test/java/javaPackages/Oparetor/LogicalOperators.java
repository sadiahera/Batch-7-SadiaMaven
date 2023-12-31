package Oparetor;

import java.util.Scanner;

public class LogicalOperators {
    // and/or and(&&) or(||) --these are also returning true/false


  /*  int a =20;
    int b = 9;
    int c = 12;

   */
 public void logical(){
     /*  int a =20;
    int b = 9;
    int c = 12;
 */

     Scanner scan = new Scanner(System.in);
     int a = scan.nextInt();
     int b = scan.nextInt();
     int c = scan.nextInt();

     //When there is && ...either one is false== total is false

     boolean result1 = (a>b) && (b>c);
     System.out.println(result1);

     boolean result2 = (a<b) && (b==c);
     System.out.println(result2);

// When there is || either one is true === total is true
     boolean result3 = (a<b)||(b<c);
     System.out.println(result3);

     boolean result4 = (a>b)||(c<b);
     System.out.println(result4);
 }


    public static void main(String[] args) {
        LogicalOperators obj = new LogicalOperators();
        // obj.logical();

        Scanner scan = new Scanner(System.in);
       // scan.nextLine(); //next line is String data, next int is int data
        String myname = scan.nextLine();
        System.out.println("My name is" + myname);

        // ifElse statement -- coditional statement

        String veg = "potato";

        if (veg == "tomotoo"){
            System.out.println("bring it home");
        }
        else {
            System.out.println("bring something else");
        }



}





    }