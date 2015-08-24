package com.a.myfirstclass.java;

public class BreakLoop {

	
		public static void main(String args[]) {
		      int [] numbers = {10, 20, 30, 40, 50};

		      for(int x : numbers ) {
		         if( x == 30 ) {
			      break;
		         }
		         System.out.print( x );
		         System.out.print("\n");
		      }
		      System.out.print("\n");
		      String [] names ={"James", "Larry", "Tom", "Lacy"};
		      for( String name : names ) {
		         System.out.print( name );
		         System.out.print(",");
		      }
		   }
	}


