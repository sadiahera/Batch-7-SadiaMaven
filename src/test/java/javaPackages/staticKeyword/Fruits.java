package staticKeyword;

public class Fruits {
    // instance variable
      /*
     Class-- Fruits --name,color,size,vitamin -- properties
     Objects-- Banana, Mango, Apple,Grape, Orange

     Class-- Cats-- size, color, tail, eyes -- properties
     Objects- myCat, Fyza's Cat, Dharti's Cat

     Class -- Vegetables -- name, color, size, vitamin, nutrition, price,-- properties
     Objects-- Tomato, Cucumber, Potato, Carrots, Cabbage

    Class -- UprightStudents -- name , id , group,batch -- properties
    Objects-- Sadia, Fyza,Dharti, Lota, Keya, Shorna, Jannat

     */
    /*
    Variable has three parts--
    1.Declare the variable
    2.Initialize the variable
    3.Use the variable
     */
    String name; // instance variables/properties// Declaring variable
    String color;//Declaring variable
   static String size ="Small";//static variables and methods belongs to
    // class not object // Declare and initial variable

    char vitamin;//Declaring variable
    String state; // not static variable

//When we see the value of variable/variables are common to all objects

public static void hello(){
    String location = "USA"; // local variables // declare an initialize
    System.out.println(location); // use the variable
}



    public void price(int amount) {
        System.out.println(amount);
    }

    // instance/ object
    public static void main(String[] args) {

        Fruits banana = new Fruits(); // created an object of the class.that means
        // I instantiated the class.
        banana.name = "Banana";//Initializing/ Defining the variable// banana is a reference variable or obj
        banana.color = "Yellow";//Initializing/ Defining the variable
       // banana.size = "Small";
        banana.vitamin = 'C' ;// Initializing/ Defining the variable

        System.out.println(banana.name); // using the variable
        System.out.println(banana.color); // using the variable
        System.out.println(banana.vitamin); // using the variable
        System.out.println(size);


        hello(); //calling method
        banana.price(10);
        System.out.println("---------------");



        Fruits mango = new Fruits(); // created an object of the class.
        // that means I instantiated the class.
        mango.name = "Mango"; // initializing/ defining the variable
        mango.color = "Red"; // initializing/ defining the variable
       // mango.size = "Small";
        mango.vitamin = 'A'; //initializing/ defining the variable

        System.out.println(mango.name); // using the variable
        System.out.println(mango.color); // using the variable
        System.out.println(mango.vitamin); // using the variable
        System.out.println(size);

        hello(); //calling method
        mango.price(20);
        System.out.println("--------");

        Fruits apple = new Fruits(); // created an object of the class.
        // that means I instantiated the class.
        apple.name = "Apple"; //initializing/ defining the variable
        apple.color = "Red"; //initializing/ defining the variable
        //apple.size = "Small";
        apple.vitamin = 'D'; //initializing/ defining the variable

        System.out.println( apple.name); // using the variable
        System.out.println( apple.color); // using the variable
        System.out.println( apple.vitamin);// using the variable
        System.out.println( size);

         hello(); //calling method
        apple.price(12);
        System.out.println( "----------");



    }








}
