package _08_While_DoWhile;

import java.util.Scanner;

public class Q14 {
  
	public static void main(String[] args) {
        /*  Problem Tan�m�
        Verilen bir say�n�n faktoriyelini Ozyineli (recursive) olarak
        hespalayan fonksiyonu yaz�n�z.

        Ornek Ekran C�kt�lar�
        Bir sayi giriniz: 6 *5*4*3*2*1=720
        Faktoriyeli: 720

        Bir say� giriniz: 3 *2*1
        Faktoriyeli 6
     */

    	Scanner scan=new Scanner(System.in);
		System.out.print("Bir Sayi Giriniz : ");
		int sayi=scan.nextInt();
		
        int faktoriyel=1;
        
		while(sayi>0);{
		faktoriyel*=sayi;
		sayi--;
		
		}
		
		System.out.println("Faktoriyeli : " +faktoriyel);
		scan.close();
    }
}


