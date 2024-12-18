package TestNGPractice;

import org.testng.annotations.Test;

public class GroupingTestCase_3 {
	
	@Test (priority=1, groups= {"sanity","regression","functional"})
	void paymentinRupee()
	{
		System.out.println("Payment in rupee");
	}
	@Test (priority=2, groups= {"sanity"})
	void paymentinDollar()
	{
		System.out.println("Payment in  dollar");
	}
	
	@Test (priority=3, groups= {"regression"})
	
	void paymentinRiyal()
	{
		System.out.println("Payment in riya ");
	}
	
	

}
