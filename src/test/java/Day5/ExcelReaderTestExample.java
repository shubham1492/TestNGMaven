package Day5;

import dataprovider.DP;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelReaderTestExample {


    @Test(dataProvider = "loginDetails",dataProviderClass = DP.class)
    public void verifyLoginDetails(String username,String password,String status){
        System.out.println("Username: "+username);
        System.out.println("Password: "+password);
        System.out.println("status: "+status);
    }


}
