package _01stringManipulations;

import java.util.Scanner;

public class C06_Odev6 {

	public static void main(String[] args) {
		/*
		Soru 6) Kullanicidan bir sifre girmesini isteyin. 
	 Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”, 
	 sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
		- Ilk harf buyuk harf olmali
		- Son harf kucuk harf olmali
		- Sifre bosluk icermemeli
		- Sifre uzunlugu en az 8 karakter olmali
	 */

	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen bir sifre giriniz ");
	String sifre = scan.nextLine();
    int work=0;
	
	if (!(sifre.charAt(0)>='A' && sifre.charAt(0)<='Z')) 
		System.out.println("Ilk harf buyuk harf olmali");
		work++;
		
    if (!(sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z')) 
    	 System.out.println("Son harf kucuk harf olmali");	
    	 work++;
    	
    if (sifre.contains(" ")) 
    	System.out.println("Sifre bosluk icermemeli");	
    	work++;
    	
    if (sifre.length()<8) 
    	System.out.println("Sifre uzunlugu en az 8 karakter olmali");
    	work++;
    	
    if (work==0) {
    	System.out.println("Sifre basari ile tanimlandi");
	} else {
        System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
	}
    	
    scan.close();
    }
	
	}


