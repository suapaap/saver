package day02;

import java.util.Scanner;

public class for03 {

	public static void main(String[] args) {
		/* 숫자를 입력받아 num의 약수를 출력
		 * 약수 : 나누어서 떨어지는 수
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int num1= scan.nextInt();
		for(int i=1; i<=num1; i++) {
			if(num1 % i == 0) {
			System.out.print(i+" ");
			}
		}
		scan.close();	
	}
}
