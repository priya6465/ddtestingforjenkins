package com.qa.Test;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skiptestcasesorignore {


	  @Test()
	  public void T1() {
		  System.out.println("test2 .....method");
		
	  }
	
    @Test
	  public void t2() {
		  System.out.println("test2 is skiped .....method");
		  throw new SkipException("skip the testcase 2");
		  
	  }
	   
	  @Test()
	  public void t3() {
		  System.out.println("t3 .....method");
	
}}
