package _07_ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
        // Kullan�c�dan 5 adet say� isteyiniz
        // Bu say�lardan 5 ile 10 aras�ndakiler haric, digerlerinin toplam�n� bulunuz.
        // bu soruyu continue kullanarak cozunuz
    	
    	Scanner scan=new Scanner(System.in);
    	int toplam=0;
    	
    	for (int i = 1; i <=5; i++) {
			System.out.print("sayi " + i + " giriniz : ");
			int sayi=scan.nextInt();
			
			if (sayi>5 && sayi<10) {
			
				System.out.println("Girilen sayi 5 ile 10 arasi oldugundan isleme alinmadi");
				continue;
			}
			toplam+=sayi;
		}
    	
    System.out.println("Girdiginiz sayilarin toplami : "+ toplam);
    	
    	scan.close();
    }

}
