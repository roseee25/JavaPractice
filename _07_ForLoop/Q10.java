package _07_ForLoop;

import java.util.Scanner;

public class Q10 {
	
	public static void main(String[] args) {
    /*Kullan�c�dan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf oldugunu,
    degilse sessiz harf oldugunu ekrana yazd�rs�n. Girdigi deger harf degilse yada
            1 karakterden fazla ise hata mesaj� gostersin. (Test girilen harfi buyuk yada kucuklugune duyarl�d�r.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen C�kt�:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen C�kt�:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen C�kt�:
    Yanlis karakter girdiniz!

     */
    
		Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Luften bir harf giriniz : ");
    	String girilenHarf=scan.nextLine();
    	
    	String sesliHarfler="ae�uo";
    	String sessizHarfler="bcdfghjklmnprstvyxzwq";
    			
    	if (girilenHarf.length()==1) { // tek harf kontrolu yapildi	
				}
    		for (int i = 0; i < sessizHarfler.length(); i++) {
    			
				if (girilenHarf.charAt(0)==sesliHarfler.charAt(i)) {
					System.out.println("Girilen harf seslidir");
					break;
					
				} else if(girilenHarf.charAt(0)==sessizHarfler.charAt(i)) {
					System.out.println("Girilen harf sessizdir");
					break;
				}else{
                   //System.out.println("AGAM nedding yanlis karakter girdin :)");
                   //break;
                   
				}
    		
			}
	
		
		
scan.close();
       
    }
}

