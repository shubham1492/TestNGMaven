package Day1.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGExample {

    WebDriver driver;
    @BeforeMethod
    public void Setup(){
        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");
        driver = new ChromeDriver();
        String Url = "https://www.google.com/";
        driver.get(Url);
        driver.manage().window().maximize();
    }


    @Test
    public void Test1(){

        String s = driver.getTitle();
        System.out.println(s);
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("macbook");
        driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();

    }


    @Test
    public void Test2(){

        String s = driver.getTitle();
        System.out.println(s);
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("macbook");
        driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();

    }

    @Test
    public void Test3(){

        String s = driver.getTitle();
        System.out.println(s);
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("macbook");
        driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
