package oop.InheritanceDemo;

public class ClassB extends ClassA{
    private boolean property2;
    //inheritance

    public static void main(String[] args) {

        ClassB obj = new ClassB();
        System.out.println(obj.property1);
        System.out.println(obj.property2);
        System.out.println(obj.hasCar);
        obj.sellproperties();
    }


}
