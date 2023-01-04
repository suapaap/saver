package day05;

import java.util.Scanner;

public class BaseBallGame {

	public static void main(String[] args) {
		/* 야구게임 메서드화
		 * 컴퓨터번호는 1~9 랜덤 생성 (중복X)
		 * 사용자 번호는 직접입력
		 * */
		
		int cnt=0;
		int[] comNum = new int[3];
		int[] userNum = new int[3];
		Scanner scan = new Scanner(System.in);
		
		//Method07_lotto.randomArray(comNum);//랜덤배열출력
		randomArray(comNum);
		System.out.println();
		System.out.println("숫자야구 게임을 시작합니다 . ");
		int stk= 0;
		while(stk !=3) {
			
			System.out.println("숫자를 입력해주세요");
			String user = scan.next();
			String[] userNumArr = user.split("");
			for(int i=0; i<userNum.length; i++) {
				userNum[i] = Integer.parseInt(userNumArr[i]);
				}
			 stk=strike(comNum, userNum);
			int ball=ball(comNum, userNum);
			if(stk ==0 && ball== 0) {
				System.out.println("out!!");
			} else {
				System.out.println(">"+ stk+"S " + ball+"B");
			}
			if(stk==3) {
				System.out.println("정답입니다 게임종료!");
				System.out.println("컴퓨터 숫자는");
				Method07_lotto.printArray(comNum);//배열출력
				break;
			}
		}
		scan.close();
		
		
		

		
		/* 중복확인 메서드
 * 메서드명 : isContain
 * */		
//		Method07_lotto me = new Method07_lotto();
		
	}

	/* 랜덤 배열 생성 
	 * */
	public static int random() {
		int ran=(int)(Math.random()*9)+1;
		return ran;
		}
	// 랜덤 수 저장
	public static void randomArray(int arr[]) {	
	int i=0; 	
		while(i<arr.length) { 
			int cnt = random();
			if( !Method07_lotto.isContain(arr, cnt)) {
				arr[i]= cnt;
				i++;
			}
		}
	}
	
//	public static void printArray(int arr[]) {
//		for(int i=0; i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//			}
//	}
		/* 스트라이크 메서드
		 * 기능 : 컴퓨터의 값과 유저의 값이 위치와 숫자가 일치하면 카운트하는 반환 기능
		 * 메서드명 : strike
		 * */
	public static int strike(int comNum[], int userNum[]) {
		int stk=0;
		for(int i=0; i<comNum.length; i++) {
			for(int j=0; j<userNum.length; j++){
				if (comNum[i] == userNum[j] && i == j) {
					stk++;
				}
			}
		}
	return stk;}
		
		
		/* 볼 메서드
		 * 기능 : 컴퓨터의 값과 유저의 값이 숫자만 일치하면 카운트하여 반환 가능
		 * 메서드명 : ball		
		 */
	public static int ball(int comNum[], int userNum[]) {
		int ball=0;
		for(int i=0; i<comNum.length; i++) {
			for(int j=0; j<userNum.length; j++){
				if (comNum[i] == userNum[j] && i != j) {
					ball++;
				}
			}
		}
		return ball;}
}
