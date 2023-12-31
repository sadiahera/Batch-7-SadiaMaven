package scanning;

import java.util.Scanner;

public class ScannerDemo {
   // Scanner scan = new Scanner(System.in);
   // String myAge = scan.nextLine();
   // System.out.println("My age is" + myAge);


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myName = scan.nextLine();
        System.out.println("My name is" + myName);


      int myAge = scan.nextInt();
      System.out.println("My age is" + myAge);


        int myRegno= scan.nextInt();
        System.out.println("My regno is" + myRegno);


        int myStockbalance = scan.nextInt();
        System.out.println("My stockbalance is" + myStockbalance);


        System.out.println("Enter your marks below:");
        int myMarks = scan.nextInt();
        System.out.println("My marks is" + myMarks);
    }
}
