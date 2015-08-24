package com.a.myfirstclass.java;

public class OverridingCow {

	public void age(){
		System.out.println("The cow age is 20 years");
	}
	
	public void meat(){
		System.out.println("Cowmeat's is very expensive all over the world");
	}
	public static void main(String[] args) {
		OverridingCow a = new OverridingCow();
		a.age();
		a.meat();

	}

}
