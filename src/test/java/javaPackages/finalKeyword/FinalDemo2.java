package finalKeyword;

public class FinalDemo2 extends FinalDemo {

    /*
    * created by Fayza
     */
   // @Override  // annotation

    public void printName2(){
        String anotherName ="Lota";
        String anotherName2="Sadia";
        System.out.println("anotherName"+"anotherName2");
        System.out.println("Dharti");

    }

    public static void main(String[] args) {
        FinalDemo2 obj= new FinalDemo2();
        obj.printName2();
    }
}
