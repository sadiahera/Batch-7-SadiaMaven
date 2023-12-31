package arrayPractic;

public class ArrayDemo {

    //array can hold multiple elements.
    // Array length is fixed.

   String[] studentName = {"Sadia , Fyza, Dharti, Lota, Jannat"}; // Array data
    //studentName is arrayVariable
    // we can not add or remove any element later.
    // length of this array = 4
    // what is the last index here -----3

    String location = "Texas";

    // print 10,15,30,60

    int []myNum= {10,15,30,60};

    public void arr() {
        System.out.println(studentName[0]);
        System.out.println(studentName[1]);
        System.out.println(studentName[2]);
        System.out.println(studentName[3]);
        //System.out.println(studentName[4]);// indexoutofboundException
        System.out.println(studentName.length);
        //  System.out.println(location);
//print 10,15,30,60;
        // int []myNum = {10,15,30,60};
        for (String m : studentName) { // for each loop
            System.out.println(m);

        }
        for (int i =0; i<studentName.length; i++){
            System.out.println(studentName);
        }
    }
    public static void main(String[] args) {

        ArrayDemo obj = new ArrayDemo();
        obj.arr();
    }


}
