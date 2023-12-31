package javaPackages.interfaceDemo;

public interface InterfaceA {
    //Interface is a process when Hiding the implementation showing only functionality
    //Interface cannot be instantiated.
    // Interface can hold only abstract methods.
    // Interface can be 100% abstraction.
    // In Interface the variables are final by default.

    int cardNo = 234567;
    String customerName = "Sadia";
    int cvvNo = 545;
    String billingAddress = "406 Drexel avenue";
    int exp = 0725;

    public void placeOrder();


    public void emailMessage();


}














