package TestNg;

import org.testng.annotations.Test;

public class CustomerTest_InvocationCount 
{
	@Test(priority=1,invocationCount=5)
	public void createCustomerTest()
	{
		System.out.println("Create new customer");
		
	}
	
	@Test(priority=2,invocationCount=2)
	public void modifyCustomerTest()
	{
		System.out.println("Modify a customer");
	}
	
	@Test(priority=3,invocationCount=3)
	public void deleteCustomer()
	{
		System.out.println("delete Customer");
	}

}
