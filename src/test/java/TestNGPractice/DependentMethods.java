package TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentMethods {
	
	@Test(priority=1)
	void openApp()
	{
		Assert.assertTrue(true);
		System.out.println("Opne App");
	}
	@Test(priority=2, dependsOnMethods={"openApp"})
	void login()
	{
		Assert.assertTrue(false);
		System.out.println("login to App");
	}
	@Test(priority=3,dependsOnMethods={"login"})
	void search()
	{
		Assert.assertTrue(true);
		System.out.println("search");
	}
	@Test(priority=4, dependsOnMethods={"login"})
	void AdvanceSearch()
	{
		Assert.assertTrue(true);
		System.out.println("advance search");
	}
	@Test(priority=5, dependsOnMethods={"login"})
	void logout()
	{
		Assert.assertTrue(true);
		System.out.println("Logout");
	}
}
