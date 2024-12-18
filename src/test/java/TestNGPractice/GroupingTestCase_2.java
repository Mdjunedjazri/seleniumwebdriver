package TestNGPractice;

import org.testng.annotations.Test;

public class GroupingTestCase_2 {
	
	
	@Test(priority=1, groups= {"sanity"})
	void sigupFB()
	{
		System.out.println("sigupto FB ");
	}
	
	@Test(priority=2, groups= {"regression"})
	
	void singupYT()
	{
		System.out.println("sigup to YT");
	}

	@Test(priority=3, groups= {"sanity","regression","functional"})
	void sigupIG()
	{
		System.out.println("sigup to ID");
	}
	
}
