package _01stringManipulations;

import java.util.Scanner;

public class C05_Odev5 {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
				
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 4 harfli bir kelime giriniz ");
		String kelime = scan.next();
		
		if (kelime.length()!=4) {
			System.out.println("Lutfen 4 hafli bir kelime giriniz");
		} else {
           String tersKelime=kelime.substring(3,4);
           tersKelime+=kelime.subSequence(2,3);
           tersKelime+=kelime.substring(1,2);
           tersKelime+=kelime.substring(0,1);
           System.out.println("Girdiginiz kelimenin tersten yazilisi : "+tersKelime);
           
           System.out.print(kelime.charAt(3));
           System.out.print(kelime.charAt(2));
           System.out.print(kelime.charAt(1));
           System.out.print(kelime.charAt(0));
		}
		scan.close();
	}

}
