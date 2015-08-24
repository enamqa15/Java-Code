package com.a.myfirstclass.java;

public class MyConstructor{

	
		int a;
		int b;
		
		MyConstructor(){
			a =10;
			b = 2;
		}
		
		public static void main(String[] args) {
			MyConstructor s1 = new MyConstructor();
			MyConstructor s2 = new MyConstructor();

			System.out.println(s1.a);
			System.out.println(s2.b);

	}
}
