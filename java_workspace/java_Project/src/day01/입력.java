package day01;

import java.util.Scanner;

public class 입력 {

	public static void main(String[] args) {
		// Scanner : 클래스 => 콘솔에서 값을 입력받을 수 있게 해주는 클래스
		/* 내가 입력한 값이 짝수인지, 홀수인지 판별
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("num1을 입력하세요.");
		int num1 = scan.nextInt();
		if(num1 % 2 ==0) { 
			System.out.println(num1 + ": 짝수");
		} else { System.out.println(num1 + ": 홀수");		
		}
		/* num2를 입력받아 num2의 상태가 양수인지 음수인지 0인지 판별, 출력
		 * 
		 * */
		
		System.out.println("num2을 입력하세요.");
		int num2 = scan.nextInt();
		if(num2 == 0) {System.out.println("num2는 0입니다"); 
		} else if (num2 < 0){System.out.println("num2는 음수입니다");
		} else {System.out.println("num2는 양수입니다"); }
		
		scan.close();
	}

}
