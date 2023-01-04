package day05;

import java.util.Scanner;

public class 야구 {

	public static void main(String[] args) {
		// 야구게임
		/* 컴퓨터가 3자리 숫자를 생성합니다. (1~9까지)
		 * 유저가 3자리의 숫자를 맞추는 게임
		 * 자리가 일치하는 숫자는 strike
		 * 숫자만 맞으면 ball, 아무것도 안맞으면 out 
		 * */

		Scanner sc = new Scanner(System.in);


		int cnt = 0;
		int comNum[] = new int [3];
		int myNum[] = new int [3];
		
		
		
		//앞에 썻던 메서드를 불라온다면..
		//static 클래스의 객체를 생성하지 않아도 불러올 수 있다.
//	Method07_lotto me = new Method07_lotto();
//	me.randomArray(comNum);
//	Method07_lotto.randomArray(comNum);
		
		// 컴퓨터 숫자를 중복되지 않게 추출
		for(int i=0; i<comNum.length; i++) {
			comNum[i] = (int)(Math.random()*9)+1;
			for(int j=0; j<i; j++) {
				if(comNum[j] == comNum[i]) {
					i--;
					break;
				}
			}
		}
		
		// 컴퓨터 숫자 추출결과체크
//		for(int a : comNum){
//			System.out.print(a+" ");
//			
//		}
		System.out.println();
		// 내 숫자 추출
		while(true) {
			int stk=0, ball=0;
			System.out.println("숫자를 입력해주세요 >");
			//문자로 입력받기
			String myStr = sc.next();
			String[] myNumStrArr = myStr.split(""); 
			//한글자마다 잘라서 배열로 저장
			cnt++;
			for(int i=0; i<myNum.length; i++) {
				myNum[i] = Integer.parseInt(myNumStrArr[i]);			
				}
			for(int i=0; i<comNum.length; i++){
				for(int j=0; j<myNum.length; j++) {
					if(comNum[i] == myNum[j] && i == j) {
						stk++; // 배열이 같고 숫자도 같을경우 스트라이크 증가
					}else if(comNum[i] == myNum[j] && i != j) {
						ball++; // 배열의 숫자가 같고 숫자는 다를경우 볼 증가
					}
				}
			}
			if(stk == 0 && ball == 0) {
				System.out.println("out");
			}else {
				System.out.println("시도횟수 : "+cnt);
				System.out.println(" > "+stk+"S "+ball+"B");
			}
			if(stk==3) {
				System.out.println("정답입니다 게임종료!!");
				System.out.println("시도회수 : "+cnt);
				break;
			}
			
		} 
		System.out.println("정답은 ");
		Method07_lotto.printArray(comNum);
		sc.close();
		
	}
}