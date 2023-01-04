package day05;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		// 야구게임
		/* 컴퓨터가 3자리 숫자를 생성합니다. (1~9까지)
		 * 유저가 3자리의 숫자를 맞추는 게임
		 * 자리가 일치하는 숫자는 strike
		 * 숫자만 맞으면 ball, 아무것도 안맞으면 out 
		 * */
		int com[] = new int[3];
		int user[] = new int[3];
		int cnt = 0;
		int strike = 0;
		int ball = 0;
		int out = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 맞춰보세요");
		
		randomArray(com);
		
		while(out<3) {
		for(int i=0; i<3; i++) {
			user[i]  = scan.nextInt();
			}
		
		for(int i=0; i<user.length; i++) {
				if(isContain(user, com[i])) {
					ball++;
					if(user[i]==com[i]) {
						strike++;
						ball--;
					}
					if(!isContain(user, com[i])) {
						out++;
				}
				}
			}

			System.out.println("ball : " + ball);
			System.out.println("out : " + out);
			System.out.println("strike : " + strike);
		}
		printArray(com);
		System.out.println("수고하셨습니다.");
	scan.close();	
	}
	
	// 랜덤숫자생성
	public static int random() {
		int ran1=(int)(Math.random()*9)+1;
		
		return ran1;
	}
	// 3자리 입력되게하기
	public static void randomArray(int arr[]) {
		for(int i=0; i<arr.length; i++) { 
			int cnt = random();
			if(!isContain(arr, cnt)) {
				arr[i] = cnt;				
			} else {
				i--;
			}
		}
	}
	
	//출력하기
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	// 중복값 체크
	public static boolean isContain (int arr[],int num) {
		for(int i=0; i<arr.length; i++) {			 
			if(arr[i] == num ) {
				return true;
			} 				
			
		} return false;
		}
	
	//스트라이크 체크
	public static int str(int com[], int user[]) {
		int strike=0;
		for(int i=0; i<com.length; i++) {
			if(com[i] == user[i]) {
				strike ++;
			}
		}
		return strike;
	}
	
	//볼 체크
	public static int ball(int com[], int user[]) {
		int ball=0;
		for(int i=0; i<com.length; i++) {
			if(isContain(com, user[i])) {
			} else {
				ball++;
			}
		}
		return ball;
	}
}

