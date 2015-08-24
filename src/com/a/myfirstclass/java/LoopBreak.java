package com.a.myfirstclass.java;

public class LoopBreak {

	public static void main(String[] args) {
		for(int x=0;x<12;x++){
			
			if( x == 7 ) {
			      //break;
			      continue;
		         }
			
			System.out.print(x);
			System.out.print(",");
		}
	}

}
