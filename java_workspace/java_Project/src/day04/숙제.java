package day04;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		/* 가위바위보게임 만들기
		 * 컴퓨터가 가위바위보를 랜덤으로 선택 (0=가위,1=바위,2=보)
		 * 내가 가위바위보 중 하나를 선택해서 입력 (가위,바위,보)
		 * 승패무의 결과를 출력
		 * */ 
		System.out.println("묵찌빠 게임을 시작합니다.");
		int ran =(int)(Math.random()*3); // 랜덤생성 
		Scanner scan = new Scanner(System.in);
		System.out.println("묵 , 찌 , 빠 "); 
		System.out.println("중 하나를 입력하세요!!");
		String me = scan.next();	//내가 선택하기

		if(me.equals("찌")) {
			switch (ran) {
			case 0 : 
				System.out.println("찌! 비겼습니다 한번 더 !");
				break;
			case 1 : 
					System.out.println("묵! 졌습니다..");
				break;
			case 2 :
					System.out.println("빠! 이겼습니다 !");
				break;
			default : 
					System.out.println("잘못된 값입니다.");
					}
			
		}
		
		if(me.equals("묵")) {
			switch (ran) {
			case 0 : 
				System.out.println("찌! 이겼습니다 !");
				break;
			case 1 : 
					System.out.println("묵! 비겼습니다 한번 더 !");
				break;
			case 2 :
					System.out.println("빠! 졌습니다 ..");
				break;
			default : 
				System.out.println("잘못된 값입니다.");
			}
		}
		
		if(me.equals("빠")) {
			switch (ran) {
			case 0 : 
				System.out.println("찌! 졌습니다..");
				break;
			case 1 : 
					System.out.println("묵! 이겼습니다 !");				
				break;
			case 2 :
					System.out.println("빠! 비겼습니다 한번 더 !");
				break;
			default : 
				System.out.println("잘못된 값입니다.");
			}
		}
		
				scan.close();
	}
}
	
