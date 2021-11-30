package _01stringManipulations;

import java.util.Scanner;

public class C04_Odev4 {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz ");
		String name=scan.nextLine();
		System.out.println("Lutfen soyisminizi giriniz ");
		String surname=scan.nextLine();
		
		if (name.length()==surname.length()) {
			System.out.println("Isminiz ve Soyisminiz esit uzunlukta");
		} else if (name.length()>surname.length()) {
			   System.out.println("Isminiz daha uzun");
	      	} else {
               System.out.println("Soyisminiz daha uzun");
               
               scan.close();
		}

	}

}
