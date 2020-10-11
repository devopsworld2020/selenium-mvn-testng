package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {
	
	@Test
	public void validateTitles( ) {
		
		String expected_title = "Yahoo.com";
		String actual_title = "Gmail.com";
		
		if(expected_title.equals(actual_title)) {
			System.out.println("Test Case Passed");
		}else {
			System.out.println("Test Case Failed");
		}
		
		/* Assert.assertEquals(actual_title, expected_title); */
		
		
	}
		

}
