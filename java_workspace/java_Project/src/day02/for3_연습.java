package day02;

import java.util.Scanner;

public class for3_연습 {

	public static void main(String[] args) {
		/*
		 * 숫자를 입력받아 num의 약수를 출력 약수 : 나누어서 떨어지는 수
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i + " ");
			}
		}
		scan.close();
	}

}
