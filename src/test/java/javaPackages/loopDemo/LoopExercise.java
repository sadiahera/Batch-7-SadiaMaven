package loopDemo;

//import static Oparetor.RelationalOperator.;

public class LoopExercise {
    // with the help of gitbash ... I push the code to git(local) and github(Central Repo)

    /*
    What is loop
    ans--Repeating a block of code--
     */


    public void loopIntroduction() {
        // print 1-10

        // System.out.println(1);
        // System.out.println(2);
        // System.out.println(3);
        //System.out.println(4);
        // System.out.println(5);
        //System.out.println(6);
        //  System.out.println(7);
        // System.out.println(8);
        // System.out.println(9);
        //System.out.println(10);


    }

    //1.While loop, 2. for loop , 3. Do-while loop 4. foreach loop

    // public void whileLoop() {
    // int a = 1; // initialization
    //  while (a <= 10) { // condition 11
    // System.out.println(a);
    //  a++; // increase by 1--increment


    // print 10-50 using while loop

    public void whileLoop() {
        int a = 10; // initialization
        while (a <= 50) ; // condition
        System.out.println(a);

        a++;


        //print 50--1 using while loop
        System.out.println("----------------------");

        int b = 50; // initialization
        while (b >= 1) { //condition
            System.out.println(b);
            b--;//50,49,48,47, decrement
        }

        // print 1-50 in 2 intervals

        int c = 1; // initialization
        while (c <= 50) { //condition
            System.out.println(c);

            c = c + 2; // increase by 2 -- increment
        }
    }

    public static void forloop() {

        for (int a = 10; a >= 1; a = a - 2) {
            System.out.println(a);
        }
    }

    // do-while loop
    public void doWhileloop() {
        // print 5-10
        int d = 5;
        do {
            System.out.println(d);
            d++;//7
        }
        while (d <= 4);

    }


    public static void main(String[] args) {
        LoopExercise obj = new LoopExercise();
        //obj.loopIntroduction();
        obj.whileLoop();
        forloop();
        obj.doWhileloop();

    }


    // side by side
}
