package oop.polymorphismDemo;

public class OverRidingDemo1 {
    //Overriding is called runtime polymarphism

    /**
     * designed by shifat
     * @param members
     */

    public void courseMember(int members){
        System.out.println(members);
    }


    public static void main(String[] args) {
        OverRidingDemo1 obj = new OverRidingDemo1();
        obj.courseMember(7);

    }
}
