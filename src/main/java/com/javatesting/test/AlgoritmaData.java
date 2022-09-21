package com.javatesting.test;


import java.util.List;
import java.util.ArrayList;

public class AlgoritmaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> dataPertama = new ArrayList<String>();
		List<String> dataKedua = new ArrayList<String>();
		List<String> dataKetiga = new ArrayList<String>();


		String Hpertama = ":Tsatu:202112SOAL3";
		String Hkedua = ":Tsatu:202111SOAL3";
		String Hketiga = ":Tsatu:202110SOAL3";

		String Tag = ":Tdua:";

		String Tsatu = "SOAL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY .DT";
		String Tdua = "SOAL3/2111/BC000011100 OD:0003452100EFG2451300 SOAL003 EFGHI25134 XAS SKILL TEST ESSAY .DT";
		String Ttiga = "SOAL3/2110/DE210031010 OD:0001524300HIJ2145300 SOAL003 JKLMN52431 XAS SKILL TEST ESSAY .DT";

		dataPertama.add(Tsatu.substring(0, 17));
		dataPertama.add(Tsatu.substring(18, 35));
		dataPertama.add(Tsatu.substring(36, 53));
		dataPertama.add(Tsatu.substring(54, 71));
		dataPertama.add(Tsatu.substring(72));

		dataKedua.add(Tdua.substring(0, 17));
		dataKedua.add(Tdua.substring(18, 35));
		dataKedua.add(Tdua.substring(36, 53));
		dataKedua.add(Tdua.substring(54, 71));
		dataKedua.add(Tdua.substring(72));

		dataKetiga.add(Ttiga.substring(0, 17));
		dataKetiga.add(Ttiga.substring(18, 35));
		dataKetiga.add(Ttiga.substring(36, 53));
		dataKetiga.add(Ttiga.substring(54, 71));
		dataKetiga.add(Ttiga.substring(72));

		String new_datasatu = dataPertama.get(2) + dataPertama.get(3) + dataPertama.get(4) + dataPertama.get(0) + dataPertama.get(1);

		String new_datadua = dataKedua.get(2) + dataKedua.get(3) + dataKedua.get(4) + dataKedua.get(0) + dataKedua.get(1);

		String new_datatiga = dataKedua.get(2) + dataKedua.get(3) + dataKedua.get(4) + dataKedua.get(0) + dataKedua.get(1);

		System.out.println(Hpertama);
		System.out.println(Tag + new_datasatu);

		System.out.println(Hkedua);
		System.out.println(Tag + new_datadua);

		System.out.println(Hketiga);
		System.out.println(Tag + new_datatiga);

	}
}
