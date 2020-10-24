package com.mile1.service;
import com.mile1.bean.*;
import com.mile1.exception.*;

public class StudentReport{

	public String findGrade(Student s1) {
		
		int[] copy = s1.getMarks();
		int count=0;
		int sum=0;
		
		for(int i=0;i<s1.getMarks().length;i++){
			sum = sum+copy[i];
			if(copy[i]<35){
				count++;
				break;
			}
		}
		
		if(count>0) {
			return ("F");
		}
		else {
			if(sum<=150) {
				return ("D");
			}
			else if(sum>150 && sum<=200) {
				return ("C");
			}
			else if(sum>200 && sum<=250) {
				return ("B");
			}
			else {
				return ("A");
			}
		}
	}
	
	
	public String validate(Student s1) throws NullStudentException, 
	NullNameException, NullMarksArrayException
	{
		if(s1 == null) {
			throw new NullStudentException();
		}
		
		else {
			if(s1.getName() == null) {
				throw new NullNameException();
			}
			else if(s1.getMarks() == null) {
				
				throw new NullMarksArrayException();
			}
			else {
				return findGrade(s1);
			}
		}
	}
	
}