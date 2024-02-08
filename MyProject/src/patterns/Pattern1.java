package patterns;

public class Pattern1 {

	public static void main(String[] args) {

		int n = 5;

		/*
		 * 1 
		 * 2 6 
		 * 3 7 10 
		 * 4 8 11 13 
		 * 5 9 12 14 15
		 */

//		for (int i = 1; i <= n; i++) {
//			int counter = i;
//			for (int j = 1; j <= i; j++) {
//				System.out.print(counter + " ");
//				counter = counter + n - j;
//			}
//			System.out.println();
//		}

		
		/*1 
          1 2 1 
          1 2 3 2 1 
          1 2 3 4 3 2 1 
          1 2 3 4 5 4 3 2 1 
          */
		
//		for(int i = 1; i <= n; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			for(int j = i-1; j >= 1; j--) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
		
	/*	1
		2 1
		3 2 1
		4 3 2 1
    */
		
//		for(int i = 1; i <= n; i++) {
//			if(i==1) {
//				continue;
//			}
//			for(int j = i-1; j >=1; j--) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
		
		/*
		   1 
           1 2 
           1 2 3 
           1 2 3 4 
           1 2 3 4 5 
           1 2 3 4 5 6   
        */
		
//		for(int i = 1; i <= 6; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
		
		/*
		  1 2 3 4 5 6 
          1 2 3 4 5 
          1 2 3 4 
          1 2 3 
          1 2 
          1 
        */
		
//		for(int i = 6; i >= 1; i--) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
		
		/*
		 1 
         1 2 
         1 2 3 
         1 2 3 4 
         1 2 3 4 5 
         1 2 3 4 5 6 
         1 2 3 4 5 
         1 2 3 4 
         1 2 3 
         1 2 
         1
        */
//		
//		for(int i = 1; i <= 6; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//		for(int i = 5; i >= 1; i--) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
		
		/*1          1
          12        21
          123      321
          1234    4321
          12345  54321
          123456654321
          12345  54321
          1234    4321
          123      321
          12        21
          1          1
        */
		
//		for(int i = 1; i <= 6; i++) {
//			int counter = i;
//			for(int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			for(int j = 1; j <= 2*(6-i); j++) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= i; j++) {
//				System.out.print(counter);
//				counter--;
//			}
//			System.out.println();
//		}
//		for(int i = 5; i >=1; i--) {
//			int counter = i;
//			for(int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			for(int j = 1; j <= 2*(6-i); j++) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= i; j++) {
//				System.out.print(counter);
//				counter--;
//			}
//			System.out.println();
//		}
//		
		
		
		/*  1 
           2 2 
          3 3 3 
         4 4 4 4 
        5 5 5 5 5 
       6 6 6 6 6 6 
      */
		
//		for(int i = 1; i <= 6; i++) {
//			for(int j = 1; j <= 6-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= i; j++) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
		
		
		 /*   ♥︎ ♥︎   ♥︎ ♥︎   
            ♥︎     ♥︎     ♥︎ 
            ♥︎           ♥︎ 
              ♥︎       ♥︎   
                ♥︎   ♥︎     
                  ♥︎       
	     */     
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		for (int i = 0; i < 6; i++) {
			System.out.print("\t\t\t\t\t\t");
			for (int j = 0; j <= 6; j++) {
				if ((i == 0 && j % 3 != 0) || (i == 1 && j % 3 == 0) || (i - j == 2) || (i + j == 8)) {
					System.out.print("♥︎ ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
