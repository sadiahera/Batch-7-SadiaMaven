package oop.polymorphismDemo;

public class OverLoadingDemo {
    /*  what is overloading ?
    method overloading can be achieved by the same method name but
    1.different number of parameter
    2.different data type
    3.different order of parameter

    *Overloading is called compile time polymarphism
     */

    public void add(int a, int b){

        System.out.println(a+b);
    }
    public void add(int a, int b, int c){

        System.out.println(a+b+c);
    }

    public void add(int a, float b){
        System.out.println(a+b);
    }

    public void add(float b, int a){

        System.out.println(a+b);
    }

    public static void main(String[] args) {
        OverLoadingDemo obj= new OverLoadingDemo();
        obj.add(2, 3);
        obj.add(2, 3, 5);
        obj.add(2, 5.45f);
        obj.add(5.45f, 4);
    }

    //Access modifiers
    // final
    // overloading
    //overriding
}
