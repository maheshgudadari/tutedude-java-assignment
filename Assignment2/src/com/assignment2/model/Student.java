package com.assignment2.model;

public class Student {

	 public String name;
	public  int  age;
	public char  grade;
	  
	  public Student(String name, int  age, char  grade){
		  this.name = name;
		  this.age = age;
		  this.grade = grade;
	  }
	  
	  public void printStudentData() {
		  System.out.println("Student Information:");
		  System.out.println("Name:"+ name);
		  System.out.println("Age:"+ age);
		  System.out.println("Grade:"+ grade);
	  }
	
	 

}
