package com.dfg;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class login {

	
//	
//	@Test
//	public void get() {
//		
//		String temp="That yes";
//		
//	int  a=10;
//		String b=" ";
//		//Assertions.assertThat(temp)
//		//.isNotNull()
//		//.as("String is actually blank").isNotBlank()
//		//.isEqualTo("That yes");
//		//.contains("yes");
//		//.doesNotContain("ys");
//		//.containsIgnoringCase("thaT yes");
//		//.matches("\\s.*"+"yes");
//		
//		Assertions.assertThat(a)
//		.isInstanceOf(Integer.class);
//		
//	}

	@Test
	public void get() {
	
		int a=10;
		Assertions.assertThat(a>12).isTrue();
		System.out.println("same");
		
	}
}
