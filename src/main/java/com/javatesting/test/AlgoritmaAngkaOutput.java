package com.javatesting.test;

public class AlgoritmaAngkaOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 5;
		for (int angka = count; angka >= 1; angka--) {
		  int tempts = 0;
		  int j = count - angka + 1;
		  while (tempts != angka) {
		    if (j % 2 != 0) {
		      if (!(angka % 2 == 0 && tempts >= angka - 1)) {
		    	  System.out.print(j);
		      }
		      tempts++;
		    } else {
		    	System.out.print("_");
		    }
		    j++;
		  }
		  System.out.println("");
		}


	}
}
