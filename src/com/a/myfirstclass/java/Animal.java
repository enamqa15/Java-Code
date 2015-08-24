package com.a.myfirstclass.java;



	 public class Animal{//Example for overriding 
		 
	public void move(){
	      System.out.println("Animals can move");
	}
		
	public void bark(){
	      System.out.println("Animals can bark");
	}
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.move();
		a.bark();
	}

}
