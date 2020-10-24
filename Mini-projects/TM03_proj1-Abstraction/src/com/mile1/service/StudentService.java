package com.mile1.service;
import com.mile1.bean.*;

public class StudentService{
	
	public int findNumberOfNullMarks(Student data[]) {
		int count_null_marks=0;
		for(int i=0;i<data.length;i++){
			
			if(data[i]!=null){
				
				if(data[i].getMarks()==null)
					count_null_marks++;
			}
		}
		return count_null_marks;
	}
	
	public int findNumberOfNullNames(Student data[]) {
		
		int count_null_names=0;
		for(int i=0;i<data.length;i++){
			
			if(data[i]!=null){
				
				if(data[i].getName()==null)
					count_null_names++;
			}
		}
		return count_null_names;
	}

	public int findNumberOfNullObjects(Student data[]) {
		
		int count_null_objects=0;
		for(int i=0;i<data.length;i++){
			if(data[i]==null)
				count_null_objects++;	
		}
		return count_null_objects;
	}
}