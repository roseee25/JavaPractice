package _07_ForLoop;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
     /*  Problem Tan�m�
            Matrisin boyutunu kullan�c�dan okuyup.
            Sadece diyagonu (kosegeni) 1 olan ve
            diger elemanlar� 0 olan bir kare matrisi ekrana bast�r�n.

           Ekran C�kt�s�
            Bir say� giriniz: 7
            1000000
            0100000
            0010000
            0001000
            0000100
            0000010
            0000001

            Bir sayi giriniz: 5
            10000
            01000
            00100
            00010
            00001
       */
		
		Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Matrisin boyutunu giriniz : ");
    	int boyut=scan.nextInt();
	
	 for (int baba = 1; baba <= boyut ; baba++) {
		for (int evlat = 1; evlat <= boyut; evlat++) {
			
		if (baba==evlat) {
			System.out.print("1");
		} else {
System.out.print("0");
		}
		}
	 System.out.println();
		
	 } 
	 scan.close();
    }
}
