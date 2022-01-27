package _06_Method_Creation;

import java.util.Scanner;

public class Q08 {
	  /*
    Problem tan�m�:
    Kullan�c�dan ald���n�z bir String'deki kelimeleri sondan ba�a do�ru yerle�tiren
    String parametreli return type li reverseWord isminde bir method yaz�n�z

     Test DAta :
    �nput : Allah Javac� arkada�lara  zihin a��kl��� versin
    Output : versin a��kl��� zihin arkada�lara Javac� Allah
     */


    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Cumle giriniz: ");
        String str = scanner.nextLine();

        System.out.println(reverseWord(str));

    }

    public static String reverseWord(String str) {

        String[] arr = str.trim().split(" ");//split: her " " space den sonra her elemanı virgülle ayırır.

        String strTers = "";

        for (int i = arr.length - 1; i >= 0; i--) {

            strTers += arr[i] + " ";
        }

        return strTers.trim();
    }
}
