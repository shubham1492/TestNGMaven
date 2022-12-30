package Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGSoftAssert {

    WebDriver driver;
    @BeforeMethod
    public void Setup(){
        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");
        driver = new ChromeDriver();

    }


    @Test(priority = 0)
    public void closeBrowser(){
        driver.close();
    }

    @Test(priority = -1)
    public void openBrowser(){

        String Url = "https://www.google.com/";
        driver.get(Url);
        driver.manage().window().maximize();

        SoftAssert softAssert = new SoftAssert();
        String expectedResult = "Google Home page";
        String origalTitle = driver.getTitle();
        softAssert.assertEquals(origalTitle,expectedResult,"Title of the page does not matched");

        String expectedTitle = "Google";
        softAssert.assertEquals(origalTitle,expectedTitle);

        String expectedTitle1 = "Google page";
        softAssert.assertEquals(origalTitle,expectedTitle1);

        softAssert.assertAll();


    }

}
