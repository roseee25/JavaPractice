package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class NotHesaplama {
    	
    public static void main(String[] args) {
        /*
        1.Kullan�c�ya    "Vize s�nav� sonucunuzu giriniz :"
        
        2.vize notu double degerlerinde girilecek.

        3. Kullan�c�ya  "Vize s�nav� y�zdesini giriniz". ->> double olmal� ->> 0,40 etkiliyor   !!Y�zde ka� etkiledigini Sisteme siz giriyorsunuz.!!

        4.Kullan�c�ya    "Final s�nav sonucunuzu giriniz.

        5. final notu double degerinde olmali. (�rn: 65,5)

        6.Kullan�c�ya    "Final s�navi yuzdesini giriniz"-->> double olmal� ->> 0,60 etkiliyor.

        7. Vize final ortalamas�n� bulmak icin, vize nin yuzde40 �, finalin yuzde60 � al�nmal� ve c�kan sonuclar toplanmal�d�r.

        8. C�kan sonucu (dersin not ortalamas�n�)   double toplam  ' a esitleyebiliriz.

        todo  :  Kosul k�sm�
 			eger ortalamas� 90(90 dahil) 'dan buyuk ise, harf notu olarak 
 			AA, 80(80dahil)   ile 90 aras�nda ise  
 			BA, 70(70 dahil)   ile 80 aras�nda ise 
 			BB, 60(60dahil) ile 70 aras�nda ise 
 			CB, 50(50 dahil) ile 60 aras�nda ise 
 			CC, 40(40 dahil) ile 50 aras�nda ise 
 			DC, 30(30 dahil) ile 40 aras�nda ise 
 			DD, 30 'dan dusuk ise FF  gelmeli.
 			
         */
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.println( "Vize s�nav� sonucunuzu giriniz :");
    	double vize=scan.nextDouble();
    	
    	System.out.println( "Vize s�nav� y�zdesini giriniz");
    	double vize_y�zdesi=scan.nextDouble();
    	
    	System.out.println( "Final s�nav sonucunuzu giriniz.");
    	double fnl=scan.nextDouble();
    	
    	System.out.println(  "Final s�navi yuzdesini giriniz");
    	double fnl_y�zdesi=scan.nextDouble();
    	
		
		double ortalama=(vize*vize_y�zdesi/100)+(fnl*fnl_y�zdesi/100);
		
		System.out.println("ortalamaniz:"+ortalama);
		if (ortalama>=90) {
			System.out.println("gecme notunuz AA");
		}else if (ortalama>=80) {
			System.out.println("gecme notunuz BA");
		}else if (ortalama>=70) {
				System.out.println("gecme notunuz BB");
	     }else if (ortalama>=60) {
				System.out.println("gecme notunuz CB");
	     }else if (ortalama>=50) {
				System.out.println("gecme notunuz CC");
	     }else if (ortalama>=40) {
			System.out.println("gecme notunuz DC");
		}else if (ortalama>=30) {
			System.out.println("gecme notunuz DD");
		}else {
			System.out.println("Agam niddin sen ya gecme notunuz FF");
		}
		scan.close();
    }
}
