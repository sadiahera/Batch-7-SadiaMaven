package arrayPractic;

public class ArrayProgram {
    /*
    Write a program to find the sum of 20-30
     */
    public void arrayProgram(){
        int sum=0;
        for (int i =20; i <= 30; i++){
           // System.out.println( i);
            sum = sum+i; // sum =20, sum = 41, sum= 63, ..
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        ArrayProgram obj =new ArrayProgram();
        obj.arrayProgram();
    }
}
