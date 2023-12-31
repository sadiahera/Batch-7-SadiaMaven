package parameterization;

public class Mathmatics {

    public void add(int a, int b){
        System.out.println(a+b);
    }


    public static void main(String[] args) {
        Mathmatics obj = new Mathmatics();
        obj.add(2, 6);
        obj.add(5, 10);
        obj.add(10, 15);
        obj.add(20, 25);
        obj.add(25, 30);
    }

}
/*
1.WHAT IS STATIC IN JAVA?
-- Static key work can be applied to variables and methods.
this belongs to the class not to the instance, but this is common to all instances.

2.CAN WE CALL A NON-STATIC VARIABLE IN STATIC METHOD?
-- NO

3.CAN A STATIC METHOD BE CALLED IN NON-STATIC METHOD?
-- YES

4.WHY IS THE MAIN METHOD STATIC?
-- Because compiler needs to call it without creating an object.
another reason is in java program compiler starts executing programs from main method.

5.CAN STATIC METHOD OR STATIC VARIABLE BE PRIVATE?
-- YES

6.WHAT IS DIFFERENT BETWEEN STATIC AND CONSTANT?
-- CONSTANT is a variable are fixed during compile time with value doesn't change in the
runtime.
But static variables can be changed in the run time.


 */