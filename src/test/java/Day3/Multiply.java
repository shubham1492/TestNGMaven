package Day3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiply {
    @Test
    @Parameters({"val1","val2"})
    public void Mul(int a , int b){
        int multiply = a*b;
        System.out.println("The multiply of the given value is :"+multiply);
    }
}
