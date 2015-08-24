package com.a.myfirstclass.java;

public class TotalArray {

	public static void main(String[] args) {
		double[] a = { 12, 2, 1, 12, 3, 45, 6.6 };//decimal value 
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		System.out.println(total);

	}

}
