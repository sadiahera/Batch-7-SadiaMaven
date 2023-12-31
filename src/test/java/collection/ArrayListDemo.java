package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    /*
    List is an interface and Arraylist implements list .
    Array list is not fixed. it is dynamic
    Arraylist can hold duplicate value
     */

    public void arrayListPractic() {
        // String name[] = {"Asraf" , " Sumaia" , "Jewel" , "Rupok" };

        // System.out.println(name.length);

        ArrayList<String> name = new ArrayList<>();
        boolean isEmptyOrNotBeloreAdd = name.isEmpty();
        System.out.println(isEmptyOrNotBeloreAdd);

        name.add("Asraf");
        name.add("Sumaia");
        name.add("Jewel");
        name.add("Rupok");

        boolean isEmptyOrNotAfterAdd = name.isEmpty();
        System.out.println(isEmptyOrNotAfterAdd);

        System.out.println(name);

        System.out.println(name.size());

        name.add("Razia");
        System.out.println(name);

        name.remove("Sumaia");
        System.out.println(name);

        name.add("Sumaia");
        System.out.println(name);

        name.add("Rupok");
        System.out.println(name);

        for (int i = 0; i < name.size(); i++) {

            System.out.println(name.get(i));
        }


        //for each loop
        for (String n : name) {
            System.out.println("The names contains " + n);


        }
    }

            public void arrayListPractic2 () {
                ArrayList<Integer> number = new ArrayList<>(); // Integer is a wrapper Class

                boolean isEmptybefore = number.isEmpty();
                System.out.println(isEmptybefore);

                number.add(50);
                number.add(60);
                number.add(70);
                number.add(80);
                number.add(80);
                number.add(90);

                boolean isEmptyAfter = number.isEmpty();
                System.out.println(isEmptyAfter);

                int size = number.size();
                System.out.println("Size of the numberList is " + size);

                System.out.println(number);

                int thirdNumber = number.get(2);
                System.out.println(thirdNumber);

                number.remove(2);
                System.out.println(number);

                number.add(2, 70);
                System.out.println(number);

                boolean ninetyIsThereOrNot = number.contains(90);

                System.out.println(ninetyIsThereOrNot);

                Collections.shuffle(number);

                System.out.println(number);

                Collections.sort(number);
                System.out.println(number);

                Collections.reverse(number);
                System.out.println(number);

                Collections.sort(number);
                System.out.println(number);

                int minimumnumber = Collections.min(number);
                System.out.println(minimumnumber);

                int maximumnumber = Collections.max(number);
                System.out.println(maximumnumber);

                // for loop for accessing the list and print all
                // the element of the list.
                // for(int i=0,i< number.size(); i++{
                // System.out.println("The list contains" + number.get(i));


                // for each loop
                for (Integer n : number) {
                    System.out.println(n);
                }
            }


    public static void main(String[] args) {
        ArrayListDemo obj = new ArrayListDemo();
        //obj.arrayListPractic();
        obj.arrayListPractic2();
    }
}



