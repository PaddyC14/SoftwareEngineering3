package com.java.assign;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class CourseProgamme {
	
	DateTimeZone timeZone = DateTimeZone.forID( "Dublin" );
	
	DateTime now = DateTime.now(timeZone);
	
	DateTime semesterStart = now.withTimeAtStartOfDay();
	
	DateTime semesterEnd = now.plusDays(90).withTimeAtStartOfDay();
	
	//A course programme class (Course Name (CS & IT or ECE, etc), 
	//List of modules, Academic Start date and End dates). 
	//Start and end dates should use Joda Time classes, which should be added 
	//as a project dependency
	
	public DateTime getStartDate(DateTime start){
		
		semesterStart = start;
				
		return start;
		
	}
	
	public DateTime getEndDate(DateTime end){
		
		semesterEnd = end;
		
		return end;
	
}
}
