package javaPackages.exceptionDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsPractice {
    /*
    There are two types of exceptions
    1. Compile Time exception.
      a.InterruptionException
      b.FileNotFound exception
    2.Run time exception(logical exception).
     a.ArrayIndexoutofBound Exception
     b.StringIndexOutofBoundsException.
     c.NumberFormateException.

     */

    public void compileTimeException() throws InterruptedException, IOException {

        System.out.println(3+3);
        Thread.sleep(4000);
        System.out.println(4+4);
        System.out.println(5+6);

        FileInputStream fs=new FileInputStream("src/test/java/info.properties");
        int number = fs.available();
        System.out.println(number);
    }

    public void runtimeException(){
        String name[] = {"Sadia " ,"Fayza", "Dharti"};

        //System.out.println(name[3]);

        String location = "pennsylvania";
       // char lastLetter = location.charAt(15);
        int locationNumber = Integer.valueOf(location);
       System.out.println(locationNumber);
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        ExceptionsPractice obj = new ExceptionsPractice();
        //obj.compileTimeException();
        obj.runtimeException();
    }
}
