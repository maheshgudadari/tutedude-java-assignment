
package com.assignment2;

import com.assignment2.model.Dog;
import com.assignment2.model.Student;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**public : access specifier
static : no need to create object to call methad
void : method will not return any data type.
main: method name */
		
		System.out.println(" Hello, World!");
		
		System.out.println("(Question 1)sum of two integer::"+question1(5,10));
	System.out.println("\n Question 3");
		Student std= new Student(" John Doe",  20, 'A');
		std.printStudentData();
		System.out.println("\n Question 4:");
		Dog d= new Dog();
		System.out.println("Dog makes a sound:"+ d.sound());
		System.out.println("Dog can play:"+ d.play());

	}
	
	public static int question1(int a, int b){
		
		return a+b;
	}
	
	public void question2(){
		
	}

}
