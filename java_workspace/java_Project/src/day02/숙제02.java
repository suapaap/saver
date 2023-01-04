package day02;

import java.util.Scanner;

public class 숙제02 {

	public static void main(String[] args) {
		/* 숫자맞추기 게임
		 * 1~50사이의 랜덤수를 하나를 생성하여 맞추는 게임
		 * 예) 컴퓨터가 생성한 랜덤수 :45
		 * 입력: 10 할시 up&down
		 * 1. 랜덤수 생성
		 * 2. 스캐너 열기
		 * 3. 반복문(while)-> 입력받기 
		 * */
		
		

		Scanner scan = new Scanner(System.in);
			int random = (int)(Math.random()*50)+1;
			int collect=0;
			
			while(random!=collect) {
				System.out.println("입력: ");
				collect=scan.nextInt();
				if(random>collect) {
					System.out.println("up!!");
				}else if(random<collect) {
					System.out.println("Down!!");
					
				}else {
					System.out.println("정답입니다.");
				}
		
		
			}		
			scan.close();	
	}
}

