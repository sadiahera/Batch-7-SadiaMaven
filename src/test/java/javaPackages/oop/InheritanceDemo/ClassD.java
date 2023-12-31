package oop.InheritanceDemo;

public class ClassD extends ClassC {


    public static void main(String[] args) {
        ClassD obj = new ClassD();
        System.out.println(obj.property1);
        System.out.println(obj.hasCar);
        obj.sellproperties();
    }
}
