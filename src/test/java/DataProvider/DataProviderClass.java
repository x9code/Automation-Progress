package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
    @DataProvider
    public Object[] getData(){

        return new Object[]{"red","green","yellow"};
    }
    @Test(dataProvider = "getData")
    public void testDataProvider(String colors){

        System.out.println(colors);
    }
}
