package finalKeyword;

public class FinalDemo {
    /* what is final?
    Final keyword can be used before the class, methods and variables final class cannot be
    extended. this class cannot have any child final variable cannot be modified. the value
    is final. final method cannot be overridden.


// what is overiding?
    override -- is a part of opp concept

    Sadia and Fayza they both of them work in a same project
    Sadia--
     */

    String name = "Jannat";

    /*
    *created by Sadia
    * when date
     */

    public final void printName(){
        System.out.println("Printing name");
    }

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        //obj.name = "Jannat";
        System.out.println(obj.name);
    }
}
