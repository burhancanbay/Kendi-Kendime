package _01stringManipulations;

import java.util.Scanner;

public class C03_Odev3 {

	public static void main(String[] args) {
		 /*Soru 3) Kullanicidan isim isteyin. Eger 
	- isim “a” harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
	- isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
	- isim “a” ve  “Z” harfi iceriyorsa “Girdiginiz isim a ve Z harfi iceriyor”
	- ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin
*/

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz ");
		String name=scan.nextLine();
		
		if (name.contains("a")) {
			 if (name.contains("Z")) {
				System.out.println("Girdiginiz isim a ve Z harfi iceriyor");
			} else {
				System.out.println("Girdiginiz isim a harfi iceriyor");
			}
		} else if (name.contains("Z")) {
			System.out.println("Girdiginiz isim Z harfi iceriyor");
		     } else {
              System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
		}
		scan.close();
	}

}
