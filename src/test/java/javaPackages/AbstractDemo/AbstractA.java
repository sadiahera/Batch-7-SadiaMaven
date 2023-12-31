package javaPackages.AbstractDemo;

public abstract class AbstractA {
    //Hiding the implementation showing only functionality
    //Abstract class cannot be instantiated.
    //Abstract class can hold both abstract and non-abstract method.
    // Abstract class can be 0-100% abstraction.


    int cardNo;
    String customerName;
    int cvvNo;
    String billingAddress;
    int exp;

    public abstract void placeOrder();

    public abstract void emailMessege();

    public void cardInfo(){
        cardNo = 234567;
        customerName = "Sadia";
        cvvNo = 373;
        billingAddress = "406 drexel avenue";
        exp = 0725;

   }


    public static void main(String[] args) {
        //AbstractA obj = new AbstractA();
       // obj.placeOrder();


    }
}
