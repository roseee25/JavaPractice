package _06_Method_Creation;

public class Q05 {

    public static void main(String[] args) {
         /*
        Problem tan�m� :
        Bir String icinde kac kelime oldugunu yazd�ran bir method yaz�n�z.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */


        int sonuc = 0;

        sonuc = cumle("javac� arkadaslar zehir gibi maasallah en k�sa zamanda cok bin $'l� ic bulurlar");

        System.out.println("Girilen String kelime say�s� : "+sonuc);

    }

    public static int cumle(String str) {
        int count = 0;

        char space = ' ';//bu satırı tanımlamak yerine if şartını ==' ' şeklinde de tanımlayabilirdik.

        for (int a = 0; a < str.length(); a++) {
            if (str.charAt(a) == space) {
                count ++;

            }
        }

        return count+1;//niye count+1 cunki for icinde a<str.length e kadar ama esit degil 1 eksik verir


//
//        	   String[] words=str.split(" ");
//
//
//
//        	   return words.length;


    }
}
