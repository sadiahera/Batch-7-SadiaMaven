package testNG_Basic;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class Pre_Requisit {

    @BeforeClass
    public void bc(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void ac(){
        System.out.println("After Class");
    }
}
