package parameterization;

public class ParameterDemo {
    // parameterization is a part of the method signature.

    public void play(String game){
        System.out.println(game);
    }

    public static void main(String[] args) {
        ParameterDemo sadia = new ParameterDemo(); // object of the class
        sadia.play("Cricket"); // argument


        ParameterDemo fyza = new ParameterDemo(); // object of the class
        fyza.play("Football"); // argument

        ParameterDemo dharti = new ParameterDemo(); // object of the class
        dharti.play("Baseball"); // argument




    }



}
