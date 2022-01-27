package _06_Method_Creation;

public class Q06 {

 /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

    public static void main(String[] args) {

        birKereYazdir("javac�lar coook afilli arkadaslar");

    }

    public static void birKereYazdir(String str) {

        String sonuc = "";  //string default degeri "" atad�k cunku isleme etki etmemeli.
        for (int i = 0; i < str.length(); i++) {
            if (!sonuc.contains(str.substring(i, i + 1))) {//sonuc metni str'nin

                sonuc += str.substring(i, i + 1);
            }
        }


        System.out.println(sonuc);
    }
}
