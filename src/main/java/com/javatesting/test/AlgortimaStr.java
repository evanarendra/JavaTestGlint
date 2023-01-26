package com.javatesting.test;

public class AlgortimaStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Randomword = "ForzaBca";
		int B = 1;
		for (int i = B; i <= 5; i++) {
			int C = Randomword.length();
			if ( i < C) {
				System.out.println( Randomword.substring(5));
			} else {
				System.out.println("wait");
			}
		}
//
//
		
//		int A = 1;
//		int B = 5;
//		for (int i = 1; i <= 5; i++) {
//			if (A %2==0) {
//				System.out.println("good");
//			}
//			int C = B * 2 % 2;
//			if (C==0) {
//				System.out.println("very good");
//			}
//			A++;
//			B--;
//		}
		
		for (int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
