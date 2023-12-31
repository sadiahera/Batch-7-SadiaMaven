package loopDemo;

public class LoopArray {
    /*3 write a function and create a loop inside it from 20-50 and find which number
    is divisible by 7.
    */

int [] number = {4,5,6,7,8,9,10};

public void Array(){

    System.out.println(number.length + "This is Array length");

    for(int i= 0; 1<6; i++){ // use for loop
        System.out.println(number[i]);

        if(number[i] % 2 ==0){

        System.out.println(number[i] + "is an Even number");

    } else if (number[i] % 2 ==1) {
            System.out.println(number[i] + "is an Odd number");
        }

        }
// even else the number is odd
    }

    public static void main(String[] args) {
        LoopArray obj =new LoopArray();
        obj.Array();
    }
}
