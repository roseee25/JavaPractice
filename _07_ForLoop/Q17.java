package _07_ForLoop;

public class Q17 {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6      Seklini konsola yazdiriniz.

        
    	int x=1;
    	
        for (int sat�r = 0; sat�r <=6 ; sat�r++) {
			for (int sutun = 0; sutun <=6; sutun++) {
				System.out.print(x++);
			
		}
    	System.out.println();
    	
        }
    	
    	
    }
}


