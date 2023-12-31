package conditionalStatement;

import java.util.Scanner;

public class StoreQuantity {
int discount;
    /* 1.A shop gives discount of 10% if the cost of purchased quantity is more than 1000 unit .
ask user for quantity suppose,one unit will cost 20 dollar .

     */
    public void discount(int quantity){
      int totalCost =0;
      //int discount =0;
if (quantity>1000){
         totalCost =(quantity*20);
        System.out.println("Total Cost" +totalCost);
         discount = (totalCost/100)*10;

            System.out.println("Discount" + discount);
        }
        else if (quantity<1000){
            System.out.println("No Discount");
        }
    }

    public void buySomthingWithDiscount(){
        //int discount = 2400;
        System.out.println("buying some burger and fries with the discount value"+ discount);
    }

    public static void main(String[] args) {
        StoreQuantity obj = new StoreQuantity();
       obj.discount(1200);
       // obj.discount(900);
        obj.buySomthingWithDiscount();


    }
}
