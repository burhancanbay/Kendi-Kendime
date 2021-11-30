package _01stringManipulations;

public class C01_Odev1 {

	public static void main(String[] args) {
		// Soru 1) String methodlarini kullanarak “  Java ogrenmek123 Cok guzel@  ”  
				// String’ini “Java ogrenmek cok guzel.” sekline getirin.

		String cumle="  Java ogrenmek123 Cok guzel@  ";
		
		cumle=cumle.trim();
		
		cumle=cumle.replace("@",".");
		
		cumle=cumle.replaceAll("\\d","");
		
		cumle=cumle.toLowerCase().substring(1);
		
		System.out.println("J"+cumle);
		

	}

}
