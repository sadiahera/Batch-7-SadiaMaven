package Oparetor;

public class RelationalOperator {
    // > ,< ,>=, <=, == ,!= . these will not go to return a value.
    // these will give only true or false.

    static int a= 20; // static variable
    static int b= 9; // static variable

    public static void relational() {

        boolean result1 = a>b;
        System.out.println(result1);

        boolean result2 = a<b;
        System.out.println(result2);

        boolean result3 = a>=b; // greater than or equal
        System.out.println(result3);

        boolean result4 = a<=b;
        System.out.println(result4);

        boolean result5 = a==b; // == means equal
        System.out.println(result5);

        boolean result6 = a!=b; // != not equal
        System.out.println(result6);



}

    public static void main(String[] args) {

     // RelationalOperator  obj = new RelationalOperator();
     //   obj.relational();
        relational();

    }

    // open the gitbash
    // come to the folder cd ... javabatch7
    //javabatch7(master)
    //git add*
    //git commit -m "added two new files arithmatic and relation operator"
    // git push

    }