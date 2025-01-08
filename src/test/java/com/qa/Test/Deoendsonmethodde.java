package com.qa.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Deoendsonmethodde {
	 
	  @Test(enabled=false)
	  public void T2() {
		  System.out.println("test2 .....method");
		
	  }
	
      @Test
	  public void t3() {
		  System.out.println("test3 .....method");
		  Assert.fail();
	  }
	   
	  @Test(dependsOnMethods="t3")
	  public void t4() {
		  System.out.println("t4 .....method");
		  
	  }


}
