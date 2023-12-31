package staticKeyword;

public class Vegetables {
    // instance variable
    /*

    Class -- Vegetables -- name, color, size, vitamin, nutrition, price,-- properties
   Objects-- Tomato, Cucumber, Potato, Carrots, Cabbage


     */
    String name;
    String color;
    String size;
    String nutrition;
    String price;
    char vitamin;




    public static void main(String[] args) {

        Vegetables tomato = new Vegetables(); // created an object of the class.
        // that means I instantiated the class.
       tomato.name = "Tomato";
       tomato.color = "Red";
       tomato.size = "Small";
       tomato.vitamin = 'C';
       tomato.nutrition = "32c";
       tomato.price = "1.99";

        System.out.println(tomato.name); // using the variable
        System.out.println(tomato.color); // using the variable
        System.out.println(tomato.size);
        System.out.println(tomato.vitamin); // using the variable
        System.out.println(tomato.nutrition);
        System.out.println(tomato.price);



        Vegetables cucumber = new Vegetables(); // created an object of the class.
        // that means I instantiated the class.
        cucumber.name = "Cucumber";
        cucumber.color = "Green";
        cucumber.size = "Small";
        cucumber.vitamin = 'C';
        cucumber.nutrition = "32c";
        cucumber.price = "1.99";

        System.out.println(cucumber.name); // using the variable
        System.out.println(cucumber.color); // using the variable
        System.out.println(cucumber.size);
        System.out.println(cucumber.vitamin); // using the variable
        System.out.println(cucumber.nutrition);
        System.out.println(cucumber.price);


        Vegetables potato= new Vegetables(); // created an object of the class.
        // that means I instantiated the class.
        potato.name = "Potato";
        potato.color = "Yellow";
        potato.size = "Small";
        potato.vitamin = 'C';
        potato.nutrition = "32c";
        potato.price = "1.99";

        System.out.println(potato.name); // using the variable
        System.out.println(potato.color); // using the variable
        System.out.println(potato.size);
        System.out.println(potato.vitamin); // using the variable
        System.out.println(potato.nutrition);
        System.out.println(potato.price);



    }





}
