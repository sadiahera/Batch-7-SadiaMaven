package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    // Map is an Interface but Hashmap is a class. HashMap implements Map.
    // HashMap can hold two data types .
    //Hashmap is a key value paris
    //One object is used a key and another is used as value
    //

    public void hashMapPractice() {
        Map<Integer, String> cars = new HashMap<>();

        cars.put(1, "Toyota"); // here 1 is key and "Toyota" is value
        cars.put(2, "Nissan");
        cars.put(3, "BMW");
        cars.put(4, "Lexus");
        cars.put(5, "Tesla");
        cars.put(5, "Kia");
        cars.put(6, "Honda");
        cars.put(7, "Honda");

        System.out.println(cars.get(3));
        System.out.println(cars);

        cars.remove(7);
        System.out.println(cars);
        cars.put(7, "Honda");


      //  cars.replace(3, "Ford");
        System.out.println(cars);

        boolean boo = cars.containsKey(3);
        System.out.println(boo);

        boolean ford = cars.containsValue("Ford");
        System.out.println(ford);

    }
    public void hashMapPractice2(){
        Map<String , String> capitalCity = new HashMap<>();

        capitalCity.put("India" ,"Delhi");
        capitalCity.put("Pakistan" ,"Islamabad");
        capitalCity.put("Bangladesh" ,"Dhaka");

        Map<String, Integer> zipCode = new HashMap<>();
        zipCode.put("Sadia" , 19026);



    }

    public static void main(String[] args) {
        HashMapDemo ref = new HashMapDemo();
        ref.hashMapPractice();
    }

}
