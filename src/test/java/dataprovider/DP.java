package dataprovider;

import org.testng.annotations.DataProvider;
import utils.ExcelReader;

public class DP {

    @DataProvider(name = "dp")
    public Object[][] dpMethod(){
        return new Object[][]{
                              {2,3},
                              {15,5},
                              {20,10}};
    }

    @DataProvider(name = "loginDetails")
    public Object[][] loginMethod(){
        Object[][] arryObject = ExcelReader.getExcelData("C:\\Users\\shubh\\OneDrive\\Desktop\\JAVA- Selenium\\TestNG Content\\Testdata.xls","userdata");
        return arryObject;
    }




}
