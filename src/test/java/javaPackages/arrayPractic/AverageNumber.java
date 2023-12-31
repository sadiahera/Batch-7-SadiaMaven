package arrayPractic;

public class AverageNumber {
    /*
    Take 5 numbers like 100,200,300,400,500 as an array and find the average of those
    number.
     */
    public void array() {
        int number[] = {100, 200, 300, 400, 500};
        int sum = 0;

        //  System.out.println(number.length + "This is Array length");
        for (int i = 0; i <= number.length; i++) {
            //System.out.println(number[i]);
            sum = sum + number[i];
        }

        System.out.println(sum);

        float average = sum / number.length;
        System.out.println(average);
    }





    public static void main(String[] args) {
AverageNumber obj = new AverageNumber();
obj.array();
    }
}
