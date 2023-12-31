package Oparetor;

public class ArithmaticOparetor {
   // +, - , * , /

   public void arithmatic(){
   int a = 14;
   int b = 30;
   int c = a+b;
   int d = c;
   int e = d;
   System.out.println("14+30 = " + e); // + is called concatenation
   int f = b-a;
   System.out.println("30-14 = " + f);
   int g =a*b;
   System.out.println("14*30 = " + g);
   float h =(float) b/a; // 2.14
   System.out.println("30/14 = " +h);

   }

    public static void newArithmatic(int a, int b){ // parameter

        System.out.println(a+b);
        System.out.println(b-a);
        System.out.println(a*b);
        System.out.println(b/a);


    }

    public static void main(String[] args) {
        ArithmaticOparetor obj = new ArithmaticOparetor(); // instatiated the class /
       // created an object of the class
       // obj.arithmatic();
        newArithmatic( 15 , 30);// argument
       System.out.println("--------");
       newArithmatic( 10, 20);
       System.out.println("-------");
        newArithmatic(30 ,60);

    }
}
