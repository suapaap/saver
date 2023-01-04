package day02;

public class 별모양01 {

	public static void main(String[] args) {
		/* 별찍기
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * */

		for(int i=1; i<=5; i++) { // 줄 수
			for(int j=1; j<=5; j++) {//별 갯수
				System.out.print("*");
		}
		System.out.println();
	}
		System.out.println("--------");
		
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 * */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------");
		
		/* *****
		 * ****
		 * ***
		 * **
		 * *
		 * */
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-------------");
		/*     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * */
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
		System.out.println("--------");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j<=5-i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}

