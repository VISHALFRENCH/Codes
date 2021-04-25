package org.student;

import org.department.Department;

public class Student extends Department

{
	public void studentname(String name) {
		// TODO Auto-generated method stub
		System.out.println(" the student name is :" + name);
	}

	public void studentDept(String Dept) {
		// TODO Auto-generated method stub
		System.out.println(" the student department is :" + Dept);
	}

	public void studentId(int Id) {
		// TODO Auto-generated method stub
		System.out.println(" the student id :" + Id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sd = new Student();
		sd.college("i&c");
		sd.collegecode(233);
		sd.collegeRank(26);
		sd.studentDept("electrical");
		sd.studentId(566);
		sd.studentname("vishal");
		
	}

	
		
	}

	
		
	
	


