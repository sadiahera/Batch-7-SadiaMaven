package conditionalStatement;

import java.util.Scanner;

public class EvenoddStatement {
/* write a java function and take an int parameter and determine thet the number is devided
    by 2 or not. if devided by 2 that is even else the number is odd.

    // when we declare the variable inside method signature. we initialize the variable
    //while we call method signature (int num = parametre)*/

    public void evenoddStatement () {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        if (num  % 2 == 0) {

            System.out.println(num + "is even");
        } else if (num % 2 == 1) {
            System.out.println(num + "is odd");

        }
    }

    public static void main(String[] args) {
        EvenoddStatement obj =new  EvenoddStatement();
        obj.evenoddStatement();
    }
    }
