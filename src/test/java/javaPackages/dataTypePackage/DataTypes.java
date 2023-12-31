package dataTypePackage;

public class DataTypes { //Carle Braces
    // Class can hold Variables and methods

    // String group = "Evening";
    // int batch = 7;

    // ( ) -- Parenthesis
    // { } -- carle Braces
    // [ ] -- Square Bracket
    /* There are two types of methods
    1. main method-- Very special -- coming from java --all commands from here
    2. custom method -- creating by us--for particular groups of code
     */



    public static void main(String[] args) { // main methods used for commands

        /* There are many types of data.
        1. byte-- it can store whole numbers up to 127;
        2. short -- Stores whole number up to 32,767
        3. int -- Stores whole number up to 2,147,483,647
        4.long-- Stores whole number up to 9,223,372,036,854,775,807
        5. float -- Stores fractional numbers, Sufficient for storing 6 to 7 decimal digits
        6. double-- Stores fractional numbers, Sufficient for storing 15 decimal digits
        7. boolean -- Stores true or false values
         */

 String name = "Sadia is a student of Upright teach"; // variable ..name, value = Sadia, data type = String
        byte age = 100; // variable = age, value = 100, data type = int (integer--number)
        //

//        System.out.println(name);

//        System.out.println(age);
          short CheckingACCount = 32767;
          int savings = 234568902;
          long regNum = 82233775679802L;
          float height= 5.23456f;
          double stock = 5467.3089753624;
          boolean snoringInTheClass = true;
          char MiddleInitial = 'j';

          //ctrl+C =Copy
          //ctrl+V = Paste
          //ctrl+A = Select whole in the page
          //ctrl+Z = undo
          //ctrl+S = save

        // double quotation " " -- String
        //Single quotation ' ' -- char

        System.out.println("The checking account balancs is " + CheckingACCount);
        // + sign means =concatenation
        System.out.print(savings + " dollar amount of my savings account");
        // + sign we can do before and after
        System.out.println("The registration number " + regNum);
        System.out.println(height + " My height");
        System.out.println(stock + " My stock amount");
        System.out.println(snoringInTheClass);
        System.out.println(MiddleInitial + " My name");










    }


}
