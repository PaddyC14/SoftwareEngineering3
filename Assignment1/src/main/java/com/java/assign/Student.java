package com.java.assign;

public class Student {
	
	String name;
	String DOB;
	int age;
	String id;
	String username;
	
	
	public Student(String fullName, String dateOB, int Age, String ID){
		
		name = fullName;
		DOB = dateOB;
		age = Age;
		id  = ID;
		
	
		
	}
	
	
	public String getUserName(){
		
		username = name + age;
		
		
			return username;
			
			
		}
	
	

}
