package TestNg;

import org.testng.annotations.Test;

public class Customer_class 
{
	@Test(priority=1)
	public void createCustomerTest()
	{
		System.out.println("create  a new customer");
	}
	
	@Test(priority=2)
	public void modifyCustomerTest()
	{
		System.out.println("Modify a Customer");
	}
	
	@Test(priority=3)
	public void deleteCustomer()
	{
		System.out.println("delete a customer");
	
	}

}
