package Day2;

import org.testng.annotations.Test;

public class TestNGGroups {

    @Test(groups = {"sanity"})
    public void a_method(){
        System.out.println("a method");
    }

    @Test(groups = {"sanity1"})
    public void b_method(){
        System.out.println("b method");
    }

    @Test(groups = {"sanity2"})
    public void c_method(){
        System.out.println("c method");
    }
    @Test(groups = {"sanity3"})
    public void d_method(){
        System.out.println("d method");
    }
    @Test(groups = {"smoke"})
    public void e_method(){
        System.out.println("e method");
    }
    @Test(groups = {"smoke"})
    public void f_method(){
        System.out.println("f method");
    }
    @Test(groups = {"smoke"})
    public void g_method(){
        System.out.println("g method");
    }



}
