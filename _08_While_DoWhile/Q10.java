package _08_While_DoWhile;

import java.util.Scanner;

public class Q10 {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        // Kullan�c�dan 5 say� isteyiniz, bu say�lardan en buyugunu bularak yazd�r�n�z.

    	Scanner scan=new Scanner(System.in);
		
    	int enbSayi=0;
    	int count=0;
		while(count < 5) {
			System.out.println("Sayi Giriniz :");
			
			int sayi=scan.nextInt();
			if (sayi > enbSayi) {
				
				enbSayi=sayi;
					
			}
			
			count++;
		}
		
    	System.out.println("enbuyuk sayi : "+enbSayi);
}

}
