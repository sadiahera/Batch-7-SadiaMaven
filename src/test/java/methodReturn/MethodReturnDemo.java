package methodReturn;

import constructDemo.ConstructorPractic;

public class MethodReturnDemo {

    public void location(){
     System.out.println("hello");
    }

    public String location1(){
       String location = "Pennsylvania" ;

       return location;
    }

    public int zipCode(){
        int myZip = 19026;
        return myZip;
    }


    public static void main(String[] args) {
        MethodReturnDemo obj = new MethodReturnDemo();
        obj.location();

        System.out.println(obj.location1());
        int myZipfromClass = obj.zipCode();
        System.out.println(myZipfromClass);

        ConstructorPractic obj1 = new ConstructorPractic("Dharti", 102, 1);
       // String newName = obj1.name;
        //System.out.println(obj1.id);
      //  System.out.println(obj1.batch);

        ConstructorPractic obj3 = new ConstructorPractic("pennsylvania");
       // System.out.println(obj3.location);
    }
}
