package day02;

import java.util.Scanner;

public class Dowhile문 {

	public static void main(String[] args) {
		/* for, while문은 조건식에 따라서 한번도 실행이 안되는 경우가 있음.
		 * do{
		 * 실행문; // 무조건 1회실행
		 * }while(조건식); //필수
		 * 
		 * */
		
		/* ---menu---
		 * 1. 저장하기
		 * 2. 새로만들기
		 * 3. 종료하기
		 * ----------
		 * 입력 : 1~3
		 * */

		Scanner scan = new Scanner(System.in);
		int menu = 0;
		do {
			System.out.println("---menu---");
			System.out.println("1. 저장하기");
			System.out.println("2. 새로만들기");
			System.out.println("3. 종료하기");
			System.out.println("----------");
			System.out.println("입력 : ");
			menu = scan.nextInt();
			//실제 기능을 처리
			
			switch(menu) {
			case 1 :
				System.out.println("저장이 완료되었습니다."); 
				break;
			case 2 : 
				System.out.println("새로 만들겠습니다.");
				break;
			case 3 : 
				System.out.println("프로그램을 종료합니다.");
				break;
				default : 
					System.out.println("잘못된 선택입니다.");
					break;
			}
		} while(menu!=3);
		System.out.println("프로그램이 종료되었습니다.");
		
		
		scan.close();
	}

}
