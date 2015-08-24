package com.a.myfirstclass.java;

public class MaxArray {

	public static void main(String[] args) {

		double[] myList = { 19, 29, 34, 35, 4.2 };

		double max = myList[0];
		for (int i = 1; i < myList.length; i++) {
			if (myList[i] > max)
				max = myList[i];
		}
		System.out.println("The max value is = " + max);

		
		 

	}
}
