package Day3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {

    @DataProvider(name = "dataprovider")
    public Object[][] dataProvider(){
       return new Object[][]{{"first-value"},{"second-value"},{"thrid-vale"},{"forth-vale"}};
    }

    @Test(dataProvider = "dataprovider")
    public void myTest(String val){
        System.out.println("Passed Parameter is "+val);
    }

}
