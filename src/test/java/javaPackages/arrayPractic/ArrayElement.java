package arrayPractic;

public class ArrayElement {
    /*
    consider an array of the following numbers:25,26,28,29,30,35 print the sum of even
    numbers only for the array elements.
     */
    public void arrayElement() {
        int[] num = {25, 26, 28, 29, 30, 35};// last index 5,6
        int sum = 0;

        for (int i = 0; i < 6; i++) {// 0,1 ,2,3,4,5

            //System.out.println("The value of i is" + num[i]);

        }
       int i = 0;
        if (num[i] % 2 == 0) {
            System.out.println(num[i] + "is an even number");
            sum = sum + num[i];//26+0= 26 ,//28+26= 54// 30+54 = 84
        }


        System.out.println( sum);
    }



    public static void main(String[] args) {
        ArrayElement obj = new ArrayElement();
        obj.arrayElement();
    }
}
