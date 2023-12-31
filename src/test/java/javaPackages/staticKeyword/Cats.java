package staticKeyword;

public class Cats {
    // instance variable
        /*
        Class-- Cats-- name,size, color, tail, eyes -- properties
       Objects- myCat, Fyza's Cat, Dharti's Cat


    */
    String name;
    String size;
    String color;
    String tail;
    char eyes;




    public static void main(String[] args) {

       Cats myCat = new Cats (); // created an object of the class.that means I instantiated the class.

        myCat.name =  "Mini";
        myCat.size= "Tall";
        myCat.color = "Black";
        myCat.tail = "Long";
        myCat.eyes = 'B';

        System.out.println(myCat.name); // using the variable
        System.out.println(myCat.size); // using the variable
        System.out.println(myCat.color); // using the variable
        System.out.println(myCat.tail);
        System.out.println(myCat.eyes);


        Cats fyzaCat = new Cats ();
    // created an object of the class . that means I instantiated the class.

        fyzaCat.name =  "Mini";
        fyzaCat.size= "Tall";
        fyzaCat.color = "Black";
        fyzaCat.tail = "Long";
        fyzaCat.eyes = 'B';

        System.out.println(fyzaCat.name); // using the variable
        System.out.println(fyzaCat.size); // using the variable
        System.out.println(fyzaCat.color); // using the variable
        System.out.println(fyzaCat.tail);
        System.out.println(fyzaCat.eyes);



    }
}
