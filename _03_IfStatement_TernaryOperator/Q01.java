package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen iki say� giriniz:");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		System.out.println("Toplama icin=1 \nC�karma=2 \nCarpma=3 \nBolme=4");
		
		int islem=scan.nextInt();
		
		if (islem==1) 
		{System.out.println("girdiginiz sayilarin toplami:" + (sayi1+sayi2));
		
		} else if (islem==2) 	
		{System.out.println("girdiginiz sayilarin fark�:" + (sayi1-sayi2));
		
		}else if (islem==3)
		{System.out.println("girdiginiz sayilarin Carp�m�:" + (sayi1*sayi2));
		
		}else if (islem==4) 
		{System.out.println("girdiginiz sayilarin orani:" +(sayi1/sayi2));}
		
		else {System.out.println("agam hatal� giris yapt�n !!!");}
		
		scan.close();
		
		
		
		
		
		
	}

}
