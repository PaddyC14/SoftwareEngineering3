package com.java.assign;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.junit.Test;

public class TestRegistration {
	
	@Test
	public void getUserNameTest(){
		
		
		Student sdnt1 = new Student("PatrickConway","24/09/94",22,"13329776");
		
		assertEquals("PatrickConway22", sdnt1.getUserName());	
		
	}
	
	

}
