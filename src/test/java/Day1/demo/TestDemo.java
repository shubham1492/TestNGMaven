package Day1.demo;

import org.testng.annotations.*;

public class TestDemo {


    @BeforeSuite
    public void a_method(){
        System.out.println("Before suit");
    }

    @BeforeTest
    public void b_method(){
        System.out.println("Before test");
    }

    @BeforeClass
    public void c_method(){
        System.out.println("Before class");
    }

    @BeforeMethod
    public void d_method(){
        System.out.println("Before method");
    }

    @AfterSuite
    public void e_method(){
        System.out.println("After suit");
    }

    @AfterTest
    public void f_method(){
        System.out.println("After test");
    }

    @AfterClass
    public void g_method(){
        System.out.println("After class");
    }

    @AfterMethod
    public void h_method(){
        System.out.println("After method");
    }


    @Test
    public void firstTest(){
        System.out.println("Test");
    }


}
