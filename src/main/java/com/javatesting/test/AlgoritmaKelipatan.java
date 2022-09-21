package com.javatesting.test;

public class AlgoritmaKelipatan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int angka = 1; angka < 101; angka++) {
			
			if (angka % 5 == 0 && angka % 3 == 0) {
				System.out.println("BIZZBUZZ");
			}else if (angka % 3 == 0) {
				System.out.println("BIZZ");
			}else if (angka % 5 == 0) {
				System.out.println("BUZZ");
			}
		}
	}

}
