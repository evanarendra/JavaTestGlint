package com.javatesting.test;
import java.util.Scanner;

public class GlintTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
        
        int jam, menit, detik, konversi;
        
        System.out.print("Masukkan jumlah detik : ");
        konversi = input.nextInt();
        
        jam     = konversi/3600;
        menit   = (konversi%3600)/60;
        detik   = (konversi%3600)%60;
        
        System.out.println("Konversi dari : "+konversi+" detik, Adalah : ");
        System.out.println(jam+" jam, "+menit+" menit, "+detik+" detik");
		
		
	}

}
