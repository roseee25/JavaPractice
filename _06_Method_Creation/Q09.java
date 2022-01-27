package _06_Method_Creation;

import java.util.Scanner;

public class Q09 {
	/*
    Problem Tan�m�:
    addDigits isminde bir method olusturun.
    Parametresi int
    Return tipi de int
    Pozitif int degerler ver ve en son sonuc tek basamakl� c�kana kadar basamaklar� birbiriyle topla.
    Tek basamakl�c�kt�g�nda, d�ndurun

    �rnek1:
    Girdi 38
    C�kt�: 2
    Ac�klama: islemler s�yle olacak: 3 + 8 = 11, 1 + 1 = 2.
                 2 , tek basamakl� oldugundan, bunu d�ndurun.
    */


    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Say� Giriniz: ");
        int num = scanner.nextInt();

        System.out.println(addDigits(num));


    }

    public static int rakamTopla(int sayi) {
/*
        String str = String.valueOf(num);//num a girilen int değerlerini str ye ata
        String[] arr = str.split("");//str deki arr  arraysa ata

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        return sum;

 */

        int toplam =0;
        int rakam =0;


        while (sayi>0) {

            rakam = sayi%10;
            toplam+=rakam;
            sayi/=10;
        }
        System.out.println("Girdiginiz sayinin rakamlar toplami: "+toplam);



        return toplam;
    }

    public static int addDigits(int num) {
        nasil("kolay gelsin method run oluyor");
        for (int i = 0; i < 2; i++) {
            num = rakamTopla(num);//girilen int num sayısını sum metoduna gönder gelen değeri tekrar num a ata tekrar sum a gönder

            if (num < 10)//tek basamaklı yani rakamsa kodu kır.
                break;
        }
       // gozunAydin("helal olsun bu method calistiysa dewamkeee");
        return num;
    }

    private static void gozunAydin(String naber) {
        System.out.println("gozunAydin method calisti"+naber);
    }

    private static void nasil(String mesaj) {
        System.out.println("nasıl methodu calisti :"+mesaj);
        gozunAydin("helal olsun bu method calistiysa dewamkeee");
    }

}
