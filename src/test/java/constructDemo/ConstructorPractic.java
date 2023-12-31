package constructDemo;

public class ConstructorPractic {
    // Constructor is a special method that has the same name as class.

    String name;
    int id;
    int batch;

    String location;

    public ConstructorPractic(   String name, int id , int batch){
       this.name = name;
        this.id = id;
        this.batch = batch;

    }
    public ConstructorPractic( String location){
        this.location =location;

    }



    public static void main(String[] args) {
        ConstructorPractic obj1= new ConstructorPractic("Dharti" ,102,1);
       // obj1.name = "Dharti";
       // obj1.id= 102;
       // obj1.batch = 1;

        System.out.println(obj1.name);
        System.out.println(obj1.id);
        System.out.println(obj1.batch);

        System.out.println("--------------");

        ConstructorPractic obj2 = new ConstructorPractic("Sadia", 103,2);
        //obj2.name = "Sadia";
       // obj2.id= 103;
        //obj2.batch = 2;

        System.out.println(obj2.name);
        System.out.println(obj2.id);
        System.out.println(obj2.batch);

        System.out.println("--------------");


        ConstructorPractic obj3 = new ConstructorPractic("Fayza",104, 3);
       // obj3.name = "Fayza";
       // obj3.id= 104;
       // obj3.batch = 3;

        System.out.println(obj3.name);
        System.out.println(obj3.id);
        System.out.println(obj3.batch);

        System.out.println("--------------");

        ConstructorPractic obj4= new ConstructorPractic("Pennsilvania");
        System.out.println(obj4.location);




    }
}
