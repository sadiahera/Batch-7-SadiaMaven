package accessModifier;

public class Access1 {
/*
-public
-private
-protected

 */

    public int hours = 24; // is accessbile througout the projects.
    private int minutes = 60; // is accessbile only its own class.
    String day = "Tuesday";// package private/ no access/default modifier is
    // accessbile within the package
    protected int year = 365;//

    public void printHours(){
        System.out.println("This is a public method");
    }

private void printMinutes(){
    System.out.println("This is a private method");
}

void printDay(){
    System.out.println("This is package private access modifier");
}

protected void printYear(){
    System.out.println("This is protected method");
}



    public static void main(String[] args) {
        Access1 obj= new Access1();
        System.out.println(obj.hours);
        System.out.println(obj.year);
        System.out.println(obj.day);
        System.out.println(obj.minutes);
    }
}
