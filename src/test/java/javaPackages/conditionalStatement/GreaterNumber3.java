package conditionalStatement;

import java.util.Scanner;

public class GreaterNumber3 {

    public void GreaterNumber(int x,int y , int z){
        /*
        x = 4
        y = 3
        z = 3
         */

        if ((x>y) && (x>z)){
            System.out.println(x + "is the greater number");
        }

        else if ((y>x) && (y>z)){
            System.out.println(y + "is the greater number");
        }

        else if((z>x) && (z>y)){
            System.out.println( z + "is the greater number");
        }
    }


    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
       // int a = scan.nextInt();

        GreaterNumber3 obj = new GreaterNumber3();
       // obj.GreaterNumber(12,13,14);
       // obj.GreaterNumber(22,21,20);

        obj.GreaterNumber(30,35,32);
    }
}
