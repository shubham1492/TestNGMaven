package Day2;

import org.testng.annotations.Test;

public class TestNGDependsOnGroup {


    @Test(dependsOnGroups = {"browser"})
    public void SignIn(){
        System.out.println("This method will execute second after browser launch");
    }

    @Test(groups = {"browser"})
    public void OpenBrowser(){
        System.out.println("This method will execute First to launch the browser");
    }


    @Test(groups = {"browser1"})
    public void OpenBrowser1(){
        System.out.println("This method will execute First to launch the browser");
    }

    @Test(groups = {"browser1"})
    public void OpenBrowser2(){
        System.out.println("This method will execute First to launch the browser");
    }

    @Test(dependsOnMethods = {"SignIn"})
    public void ValidateHomePage(){
        System.out.println("This method will execute Third after signIn");
    }

}
