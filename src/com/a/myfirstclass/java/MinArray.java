package com.a.myfirstclass.java;

public class MinArray {

	public static void main(String[] args) {
		double[] myList= { 12, 4.2, 0.2, 0, 9 };
		double min = myList[0];
		for (int j = 0; j < myList.length; j++) {
			if (min<myList[j])
				min = myList[j];
		}
		System.out.println("Min is " + min);

	}

}
