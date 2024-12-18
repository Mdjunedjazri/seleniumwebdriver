package TestNGPractice;

import org.testng.annotations.Test;

public class TestNgtest_1 {
	
	
	/*
	 * open app
	 * login 
	 * lougout
	 * 
	 */
	
	@Test(priority=1)
	void openApp()
	{
		System.out.println("Open App");
	}
	
	@Test(priority=2)
	void Login()
	{
		System.out.println("Login");
	}
	
	@Test(priority=3)
	void Logout()
	{
		System.out.println("Logout");
	}

}
