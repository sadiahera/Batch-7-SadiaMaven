package loopDemo;

public class LoopDemo {
    /*write a java  function and create an array in 4,5,6,7,8,9,10 and use
 a loop and determine that which number is divided by 2 or not .
  if divided by 2 that ia even else the num is odd.

     */

    public void loopdemo() {
        for (int a = 20; a <= 50; a++) {
            System.out.println(a);


            if (a % 7 == 0) {
                System.out.println(a + "is divided by 7");
            } else if (a % 7 != 0) {
                System.out.println(a + "is not divided by 7");
            }


        }
    }

    public static void main(String[] args) {
        LoopDemo obj = new LoopDemo();
        obj.loopdemo();

    }
}