package conditionalStatement;

import java.util.Scanner;

public class NegativePositive {

    /* take a number from user find that the number is positive or negative
*/
    public void positiveNegative(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if (a==0){
            System.out.println(a+ "is a positive number");
        }
        else if (a>0){
            System.out.println(a+ "is a positive number");

        }
        else if (a<0){
            System.out.println(a+ "is a negative number");
        }
    }

    public static void main(String[] args) {
     NegativePositive obj = new NegativePositive();
     obj.positiveNegative();

    }
}
