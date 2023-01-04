package day01;

import java.util.Scanner;

public class IF04 {

	public static void main(String[] args) {
		/* 정수를 입력받아서 정수가 2의 배수인지, 3의 배수인지, 6의 배수인지 출력
		 * */

		Scanner scan = new Scanner(System.in);
				System.out.println("숫자를 입력하세요.");
				int num1 = scan.nextInt();
				
				if (num1 % 2 == 0) 
				{ System.out.println(num1 +"는 2의 배수입니다.");
				}
				if (num1 % 3 == 0) {
					System.out.println(num1 + "는 3의 배수입니다.");
				}						

				scan.close();
	}

}