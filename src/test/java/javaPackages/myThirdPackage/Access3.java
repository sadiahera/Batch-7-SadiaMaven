package myThirdPackage;

import accessModifier.Access1;

public class Access3 extends Access1 {


    public static void main(String[] args) {
        Access3 obj= new Access3();
       // Access1 obj= new Access1();
        System.out.println(obj.hours);
        //System.out.println(obj.minute);
       // System.out.println(obj.day);
        System.out.println(obj.year);


    }
}
