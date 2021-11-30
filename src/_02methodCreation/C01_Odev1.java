package _02methodCreation;

import java.util.Scanner;

public class C01_Odev1 {

	public static void main(String[] args) {
	
		   /*
        Problem Tanýmý :
        Basit 4 iþlem yapan bir hesap makinesi kodlayýnýz....
        Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinýz.
        Kullanicidan iki sayi girmesini isteyiniz.
        Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirýnýz.
      */
		Scanner scan=new Scanner(System.in);
	    System.out.println("lutfen bir islem seciniz\ntoplama icin : +\ncikarma icin : -\ncarpma icin : x\nbolme icin : / \nkarakterlerine basiniz");
	    char islem=scan.next().charAt(0);
	    System.out.println("Lutfen islem yapmak istdiginiz iki sayiyi giriniz\nherbir sayidan sonra enter'a basiniz");
	    int sayi1=scan.nextInt();
	    int sayi2=scan.nextInt();
	  
	    if (islem=='+') {
			toplama(sayi1,sayi2);
		} else if (islem=='-') {
			cikarma(sayi1,sayi2);
		} else if (islem=='x') {
			carpma(sayi1,sayi2);
		} else if (islem=='/') {
			bolme(sayi1,sayi2);
		} else {
            System.out.println("gecersiz islem");
		}
	    
	  
	 
	    scan.close();
	}

	private static void carpma(int sayi1, int sayi2) {
		
		System.out.println("Sayilarin carpimi : "+(sayi1*sayi2));
		
	}

	private static void bolme(int sayi1, int sayi2) {
		
		System.out.println("Sayilarin bolumu : "+(sayi1/sayi2));
		
	}

	private static void toplama(int sayi1, int sayi2) {
		
		System.out.println("Sayilarin toplami : "+(sayi1+sayi2));
		
	}

	private static void cikarma(int sayi1, int sayi2) {
		
		System.out.println("Sayilarin farki : "+(sayi1-sayi2));
		
	}

}
