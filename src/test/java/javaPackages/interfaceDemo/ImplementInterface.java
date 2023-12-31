package javaPackages.interfaceDemo;

public class ImplementInterface implements InterfaceA{



    public void placeOrder() {
        System.out.println(cardNo);
        System.out.println(customerName);
        System.out.println(cvvNo);
        System.out.println(billingAddress);
        System.out.println(exp);
        System.out.println("Your order has been placed");

    }
    public void emailMessage(){
        System.out.println("Your order has been successfull");

    }


    public static void main(String[] args) {
        ImplementInterface obj= new ImplementInterface();
        obj.placeOrder();
        //obj.emailMessage();
    }
}
