package com.assignment2.model;



public class Dog extends Animal implements Playable {
		
	public String sound() {
		return "Woof";
	}

	@Override
	public boolean play() {
	
		return true;
	}


}
