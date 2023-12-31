package conditionalStatement;

import java.util.Scanner;

public class GreaterNumber { // user-defined class

    /* take two numbers from user and print the greater number.*/

    public void greaterNumber(int x, int y, int z){
        Scanner scan = new Scanner(System.in); // Pre-defined class
        int a = scan.nextInt();
        System.out.println("The value of a is" +a);

        int b = scan.nextInt();
        System.out.println("The value of b is" +b);


        if (a>b){
            System.out.println(a + "is the greater number");

        }

        else if(a==b){
            System.out.println(a+ "is equal to " +b);
        }
        else{
            System.out.println(a+ "is the smaller number");
        }
    }


    public static void main(String[] args) {
        GreaterNumber obj = new GreaterNumber();
        obj.greaterNumber(4,6,8);

    }
}
