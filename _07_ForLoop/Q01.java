package _07_ForLoop;

public class Q01 {
	
	 public static void main(String[] args) {
    /*

       sayac� ritmik ilerleyen ve ad�m say�s� belli ise FOR kullan�l�r.
       DEG�LSE While kullan�l�r
       Problem Tan�m�
        100'den 0'a kadar 13'e tam b�l�nebilen say�lar� ve toplamlar�n� ekrana yazd�r�n�z (buyukten kucuge).

         Ekran C�kt�s�
        91
        78
        65
        52
        39
        26
        13       */
		 
		 
       int toplam=0;
       
    	for (int i = 100; i >= 0; i--) {
    		
		if (i%13==0) {
			
			System.out.println(i + " ");
			toplam+=i;
		}	

		 
    	}	
    	System.out.println();
		System.out.println(toplam);; 
    }
}
