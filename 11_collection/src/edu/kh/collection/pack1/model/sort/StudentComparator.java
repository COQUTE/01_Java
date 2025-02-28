package edu.kh.collection.pack1.model.sort;

import java.util.Comparator;

import edu.kh.collection.pack1.model.dto.Student;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		String str1 = o1.getName();
		String str2 = o2.getName();
		
		return str1.compareTo(str2);
	}
	
}
