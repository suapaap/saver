package day05;

import java.util.Scanner;

public class 야구연습 {

	public static void main(String[] args) {
		/* 야구게임 메서드화
		 * 컴퓨터번호는 1~9 랜덤 생성 (중복X)
		 * 사용자 번호는 직접입력
		 * */
		int com[] = new int[3];
		int user[] = new int[3];
		int max=9, min=1;
		int s=0, b=0;
		
		Scanner scan=new Scanner(System.in);
		createArray(com,min,max);
		Method07_lotto.printArray(com);
		System.out.println();
		
		while(s!=3) { // 사용자번호 입력받기
			System.out.println("1~9까지 숫자 3개 입력");
			int cnt=0;
			while(cnt<3) {
				user[cnt] = scan.nextInt();
				cnt++;
			}
			s= strike(com, user);
			b= ball(com, user);
			if(s!=0) {
				System.out.println(s+"S ");
			}
			if(b!=0) {
				System.out.println(b+"B ");
			}
			if(s ==0 && b==0) {
				System.out.println("OUT!");
			}
		}
		System.out.println("정답입니다 게임종료 !");
	}
	
	/* 랜덤 배열 생성
	 * 1~9까지 랜덤 값
	 * min=1, max=9 (max - min+1) = 개수
	 * (int)(Math.random()*(max-min+1))+min 
	 * */
	public static int random(int max, int min) {
		if(max < min) { // max와 min값이 바뀌면
			int tmp = max;
			max = min;
			min = tmp;
			}
		return (int)(Math.random()*(max-min+1))+min;
		}
	
// 랜덤 수 저장
	public static boolean createArray(int arr[], int min, int max) {
		if(arr == null) {
		} 
		if(((max-min+1)) < arr.length) {
			return false;			
		}
		int cnt=0;
		while(cnt < arr.length) {
			int r=random(min, max);
			if(!Method07_lotto.isContain(arr, r)) {
				arr[cnt]=r;
				cnt++;
			}
		} return true;
	}
		
		/* 중복확인 메서드
 * 메서드명 : isContain
 * */		
		public static boolean isContain(int arr[], int num) {
			for(int i=0; i<arr.length; i++) {
				if(arr[i] == num) {
					return true;
				}
			}
			return false;
		}

	// 배열출력 메서드
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
		/* 스트라이크 메서드
		 * 기능 : 컴퓨터의 값과 유저의 값이 위치와 숫자가 일치하면 카운트하는 반환 기능
		 * 메서드명 : strike
		 * */
		public static int strike(int com[], int user[]) {
			int cnt = 0;
			for(int i=0; i<com.length; i++) {
				if(com[i] == user[i]) {
					cnt++;
				} 
			}
			return cnt;
		}
		
		/* 볼 메서드
		 * 기능 : 컴퓨터의 값과 유저의 값이 숫자만 일치하면 카운트하여 반환 가능
		 * 메서드명 : ball		
		 */
		public static int ball(int com[], int user[]) {
			int cnt = 0;
			for(int i=0; i<com.length; i++) {
				if(isContain(user, com[i])){
					cnt++;
				}
			}
			return cnt - strike(com, user);
		}
}