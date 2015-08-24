package com.a.myfirstclass.java;

public class TryCatch {

	public static void main(String[] args) {
		try{
			int a []=new int[3];
			System.out.println("Array is " + a[4]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Print array is " + e);
		}
		System.out.println("Out of the block");
	}

}
