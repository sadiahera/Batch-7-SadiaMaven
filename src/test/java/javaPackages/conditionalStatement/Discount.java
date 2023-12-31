package conditionalStatement;

import java.util.Scanner;

public class Discount {
// a shop give discount of 10% if the cost of purchased quantity is more than 100.
    //ask user for quantity suppose ,
// one unit will cost 100 judge and print total cost for user.
    public void discount(){
        System.out.println("Enter the quqntity");
        Scanner scan = new Scanner(System.in);
        int quantity = scan.nextInt();
        int total_cost = quantity *20;

        if (quantity>1000){
            int discount = ((total_cost/100)*10);
            System.out.println(discount);
        }

        else {
            System.out.println("No discount");

        }
    }

    public static void main(String[] args) {
        Discount obj = new Discount ();
        obj.discount();


    }
}
