package day04;

import java.util.Scanner;

public class 숙제2 {

	public static void main(String[] args) {
		/* 가위바위보게임 만들기
		 * 컴퓨터가 가위바위보를 랜덤으로 선택 (0=가위,1=바위,2=보)
		 * 내가 가위바위보 중 하나를 선택해서 입력 (가위,바위,보)
		 * 승패무의 결과를 출력
		 * */ 
		System.out.println("묵찌빠 게임을 시작합니다.");
		int ran =(int)(Math.random()*3); // 랜덤생성 
		Scanner scan = new Scanner(System.in);
		System.out.println("가위 , 바위 , 보 "); 
		System.out.println("중 하나를 입력하세요!!");
		String myChoice = scan.next();	//내가 선택하기
		
		//컴퓨터 상태를 String으로 변환
		String ranChoice = ran == 0? "가위 " : ran == 1? "바위" : "보";
		
		//비교식 입력
		if(ranChoice.equals(myChoice)) {
			System.out.println("비겼습니다.");
		}else {
			if(ranChoice.equals("가위")) {
			System.out.println(myChoice.equals("바위")? "이겼습니다." : "졌습니다.");
		}else if(ranChoice.equals("바위")) {
			System.out.println(myChoice.equals("보")? "이겼습니다." : "졌습니다.");
				}
		else {
			System.out.println(myChoice.equals("가위")? "이겼습니다." : "졌습니다.");
		}
		}
		System.out.println("컴퓨터는 "+ranChoice);
		System.out.println("게임종료");
	}

}
