package _07_ForLoop;

import java.util.Scanner;

public class Q06 {

	 public static void main(String[] args) {
    /*  Problem Tan�m�
       2 boyutlu bir tablo olarak, ekrana carp�m tablosunu hesaplay�p yazan kodu yaz�n�z.

       Ornek Ekran C�kt�s�
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       Ekran c�kt�s� 5 x 5 boyutlar� icin ornek olarak verilmistir,
       isterseniz boyutlar� klavyeden okuyup istenen boyutlara gore
       ekrana basan bir kod yazabilirsiniz.
    */
   

	    	Scanner scan=new Scanner(System.in);
	    	
	    	System.out.print("Carp�m tablosunun boyutunu giriniz : ");
	    	int boyut=scan.nextInt();
		
		 for (int baba = 1; baba <= boyut ; baba++) {
			for (int evlat = 1; evlat <= boyut; evlat++) {
				System.out.print(" "+baba*evlat);
			}
			System.out.println();
		}
		 
		 
		scan.close(); 
		 
    }
}
