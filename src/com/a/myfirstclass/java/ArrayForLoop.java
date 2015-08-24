package com.a.myfirstclass.java;

public class ArrayForLoop {

	public static void main(String[] args) {
		int[] myArray = { 1, 2, 3, 2, 1, 2, 3, 4, 5, 64, 54, 54, 3, 2, 7 };
		System.out.println(myArray);
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("The value is =" + " " + myArray[i]);
		}
	}

}
