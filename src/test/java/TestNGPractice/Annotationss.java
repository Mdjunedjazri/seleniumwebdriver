package TestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotationss {
	
	
	/*
	///Before Method afterMethod

	@BeforeMethod 
	void login()
	{
		System.out.println("login");
	}
	@Test(priority=1)
	void search()
	{
	System.out.println("Search");	
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("logout");
	}
	@Test(priority=2)
	void advanceSearch()
	{
		System.out.println("advance Search");
	}
	
	*/
	
	///Before class after class

		@BeforeClass
		void login()
		{
			System.out.println("login");
		}
		@Test(priority=1)
		void search()
		{
		System.out.println("Search");	
		}
		
		@AfterClass
		void logout()
		{
			System.out.println("logout");
		}
		@Test(priority=2)
		void advanceSearch()
		{
			System.out.println("advance Search");
		}
	
}
