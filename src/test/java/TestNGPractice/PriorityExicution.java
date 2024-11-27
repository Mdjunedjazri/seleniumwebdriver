package TestNGPractice;

import org.testng.annotations.Test;

public class PriorityExicution {
	
	
	/*
	 open app 
	 login
	 logout
	 
	 */
	
	@Test(priority=1)
	
	void opneApp()
	{
		System.out.println("Openeing of application ");
		
	}
	
	
	@Test(priority=2) 
	void login()
	{
		System.out.println("login in the application");
	}
	
	@Test (priority=3)
	
	void logout()
	{
		System.out.println("Loging out of application");
	}

}
