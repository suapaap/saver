package day04;

import java.util.Scanner;

public class StringEx01 {

	public static void main(String[] args) {
		/* 5개의 파일명이 주어졌을 때, 검색하고자 하는 단어를 입력하면 
		 * 해당 단어를 포함하는 파일을 출력
		 * */
		String[] fileName = { "java의 정석.text", "String메서드.jpg", "이것이java다.png", 
				"이것이java다.jpg", "String의 정석.png" };
		
		Scanner scan = new Scanner(System.in);
		System.out.println("검색어를 입력해주세요.");
		String serch = scan.next(); 			// 검색하고자 하는 변수 생성 (String으로 문장생성)
		int cnt=0;
		for(int i=0; i<fileName.length; i++) {  // 검색루트를 돌리기위해 반복
			if(fileName[i].contains(serch)) { // 만약 배열 내 입력된 문자와 동일하면 
				cnt++;
				System.out.println(fileName[i]); // 출력하라
			} 
		}
		if(cnt==0) {
			System.out.println("잘못 입력하셨습니다.");
		}
			
		scan.close();
	}
}
