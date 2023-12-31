package oop.polymorphismDemo;

public class OverRidingDemo2 extends OverRidingDemo1 {
    //Parent class == super class
    //Child class == subclass , derived class

    /**
     * Designed by Dharti
     * @param members
     */

    public void courseMember(int members) {
        System.out.println(members);
        String group = "Selanium";
        System.out.println(group);
    }

    public static void main(String[] args) {
        OverRidingDemo2 obj = new OverRidingDemo2();
        obj.courseMember(7);
    }
}
