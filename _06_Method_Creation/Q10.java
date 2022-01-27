package _06_Method_Creation;

import java.util.Scanner;

public class Q10 {

	 /*
    Problem Tan�m� :
       powerOfThree isminde bir method olu�turun.
       Parametre olarak int
       Return tipi boolean
       Bir tamsay� verildi�inde, 3 �ss� olup olmad���n� teyit edin. 3'�n �ss�(kuvveti) ise true, de�ilse false d�nd�r�n.
       �rnek 1:
       Girdi: 27
       ��kt�: true
       A��klama: 3*3*3 =27
       Sonu�= true

       �rnek 2:
       Girdi: 0
       ��kt�: false
       �rnek 3:
       Girdi: 9
       ��kt�: true
       A��klama: 3*3 = 9
       Sonu�= true

       �rnek 4:
       Girdi: 45
       ��kt�:: false
       A��klama: 3*3*3*3 =81
       Sonu�= false
       45, 3�n �ss� (kuvveti) de�ildir.
    */


    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int num = scanner.nextInt();

        System.out.println(powerOfThree(num));


    }

    public static boolean powerOfThree(int num) {

        boolean b = false;
        int carpim = 1;

        for (int i = 1; i < num / 3; i++) { //num/3 olamdan direk num da yazılabilir
            carpim *= 3;

            if (carpim == num) {
                b = true;
                break;
            }
        }
        return b;
    }
}
