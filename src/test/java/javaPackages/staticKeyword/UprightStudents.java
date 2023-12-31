package staticKeyword;

public class UprightStudents {
// instance variable
    /*

    Class -- UprightStudents -- name , id , group,batch -- properties
    Objects-- Sadia, Fyza,Dharti, Lota, Keya, Shorna, Jannat


    */

    String name;
    String group;
    String batch;
    char id;


    public static void main(String[] args) {

        UprightStudents sadia = new UprightStudents(); // created an object of the class.
        // that means I instantiated the class.

        sadia.name = "Sadia";
        sadia.group = "IT";
        sadia.batch = "Batch 7";
        sadia.id = '1';

        System.out.println(sadia.name); // using the variable
        System.out.println(sadia.group); // using the variable
        System.out.println(sadia.batch); // using the variable
        System.out.println(sadia.id);



        UprightStudents dharti = new UprightStudents(); // created an object of the class.
        // that means I instantiated the class.

        dharti.name = "Dharti";
        dharti.group = "IT";
        dharti.batch = "Batch 7";
        dharti.id = '2';

        System.out.println(dharti.name); // using the variable
        System.out.println(dharti.group); // using the variable
        System.out.println(dharti.batch); // using the variable
        System.out.println(dharti.id);

        UprightStudents jannat = new UprightStudents(); // created an object of the class.
        // that means I instantiated the class.

        jannat.name = "Jannat";
        jannat.group = "IT";
        jannat.batch = "Batch 7";
        jannat.id = '3';

        System.out.println(jannat.name); // using the variable
        System.out.println(jannat.group); // using the variable
        System.out.println(jannat.batch); // using the variable
        System.out.println(jannat.id);
    }

}
