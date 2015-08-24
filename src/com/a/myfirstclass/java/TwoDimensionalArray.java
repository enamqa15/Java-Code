package com.a.myfirstclass.java;

public class TwoDimensionalArray {

	public static void main(String[] args) {
int two[][]=new int[2][2];
two[0][0]=11;
two[0][1]=12;

System.out.println(two[0][1]);

System.out.println(two.length);
System.out.println(two[1].length);


for(int i=0;i<two.length;i++){

	for(int j=0;j<two.length; j++){

		System.out.println(two[i][j]);
		


	}

}

	}
}
	
