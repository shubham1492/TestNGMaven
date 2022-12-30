package Day2;

import org.testng.annotations.Test;

public class TestNGPriority {

    @Test(priority = 0)
    public void a_method(){
        System.out.println("a method");
    }

    @Test(priority = 5)
    public void b_method(){
        System.out.println("b method");
    }

    @Test(priority = 2)
    public void c_method(){
        System.out.println("c method");
    }
    @Test(priority = 3)
    public void d_method(){
        System.out.println("d method");
    }
    @Test(priority = 6)
    public void e_method(){
        System.out.println("e method");
    }
    @Test
    public void f_method(){
        System.out.println("f method");
    }
    @Test
    public void g_method(){
        System.out.println("g method");
    }


}
