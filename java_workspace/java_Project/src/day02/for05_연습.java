package day02;

import java.util.Scanner;

public class for05_연습 {

	public static void main(String[] args) {
		/* 최소공배수 : 공통적인 배수 중 가장 작은 수
		 * 공배수 : 두정수에서 공통적으로 있는 배수
		 * 
		 * num1, num2를 입력받아 최소 공배수를 출력하는 예제
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		System.out.println("하나 더 입력해주세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		for(int i=num1; ; i+=num1) {
			if(i % num1 ==0 && i % num2 ==0) {
				System.out.println("최소공배수는"+i);
				break;
			}
		}
	}
}
