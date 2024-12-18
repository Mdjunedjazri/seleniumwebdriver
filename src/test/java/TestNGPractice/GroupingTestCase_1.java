package TestNGPractice;

import org.testng.annotations.Test;

public class GroupingTestCase_1 {
	
	@Test(priority=1,groups= {"sanity","regression","functional"})
	
		void loginFB()
		{
			System.out.println("Login to FB");
		}
	
	@Test(priority=2,groups= {"regression"})
	
		void loginIG()
		{
		System.out.println("Login to Instagram");
		}
	
	@Test(priority=3,groups= {"sanity"})
	void loginYT()
	{
		System.out.println("Loging to youtube");
	}
		
	
	

}
