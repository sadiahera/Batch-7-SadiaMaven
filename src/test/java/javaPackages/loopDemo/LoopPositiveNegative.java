package loopDemo;

public class LoopPositiveNegative {


    /* write a function that and create a loop between 1-10 .
     and determine which is positive and which is negative.

     */


    public void loop() {
        for (int a = 1; a <= 10; a++) {

            System.out.println(a);

            if (a == 0) {
                System.out.println(a + "is a positive number");
            } else if (a > 0) {
                System.out.println(a + "is a positive number");
            } else if (a < 0) {
                System.out.println(a + "is a negative number");
            }
        }

    }

    public static void main(String[] args) {
        LoopPositiveNegative obj = new LoopPositiveNegative();
        obj.loop();
    }
}