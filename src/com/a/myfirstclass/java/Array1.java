package com.a.myfirstclass.java;

public class Array1 {

	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=60;
		a[2]=70;
		a[3]=80;
		a[4]=100;
		
//what is the length of array
		//how we can extract element of array
		System.out.println(a[3]);

	System.out.println(a.length);
	Integer total=0;
	for(int i=0; i<a.length;i++){
		total +=a[i];
		System.out.println("Total number is =" + " " + total);
	//System.out.println(a[i]);

	}	

	}

}
