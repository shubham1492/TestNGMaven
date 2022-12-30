package Day2;

import org.testng.annotations.Test;

public class TestNGDependsOnMethod {


    @Test(dependsOnMethods = {"OpenBrowser"})
    public void SignIn(){
        System.out.println("This method will execute second after browser launch");
    }

    @Test
    public void OpenBrowser(){
        System.out.println("This method will execute First to launch the browser");
    }

    @Test(dependsOnMethods = {"SignIn"})
    public void ValidateHomePage(){
        System.out.println("This method will execute Third after signIn");
    }


    @Test(dependsOnMethods = {"SignIn","ValidateHomePage","OpenBrowser"})
    public void logout(){
        System.out.println("This method will execute Fourth after Validation");
    }


}