package DataProvider;

import org.testng.annotations.Test;

public class CustomerDataTest {
	@Test(dataProvider = "readCustomer")
	public void customerdata(String name, String desc, String status) {
		System.out.println(name+" | "+desc+" | "+status);
	}
}
