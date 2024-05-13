package TestNg;

import org.testng.annotations.Test;

public class CustomerTest_dependOnMethod
{
	@Test
	public void createCustomerTest()
	{
		System.out.println("create  a new customer");
	}
	
	@Test(dependsOnMethods="createCustomerTest")
	public void modifyCustomerTest()
	{
		System.out.println("Modify a Customer");
	}
	
	@Test(dependsOnMethods="modifyCustomerTest")
	public void deleteCustomerTest()
	{
		System.out.println("delete a customer");
	
	}


}
