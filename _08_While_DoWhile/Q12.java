package _08_While_DoWhile;

import java.util.Scanner;

public class Q12 {

		public static void main(String[] args) {
			
    // Bir top 220 m  yukseklikten at�lmaktad�r.
    // At�ld�ktan sonra, at�ld�g� yuksekligin 3/4 u kadar yerden yukar� dogru z�plamaktad�r
    // Top z�plama  yuksekligi 1 metrenin alt�na indiginde durmaktad�r.
    // Bu ana kadar aldigi toplam yolu ve yere vurma say�s�n� bulunuz.

			Scanner scan=new Scanner(System.in);
			
			System.out.print("Topun Birakildigi �lk Y�kseklikgi Giriniz : ");
			double yukseklik=scan.nextDouble();
			double topunToplamYolu=0;
			int yerevurmaSayisi=0;
			
			do {
				yerevurmaSayisi++;
				topunToplamYolu+=yukseklik;
				yukseklik*=(0.75);
				topunToplamYolu+=yukseklik;
			
			}
			
			while (yukseklik>=1); 
				
				System.out.println("Topun Yere Vurma Sayisi : " +yerevurmaSayisi);
				System.out.println("Topun Aldigi Toplam Yol : " +topunToplamYolu);
			
			scan.close();
			
			
			
			
			
			
		

    }
}
