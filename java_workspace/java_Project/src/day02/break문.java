package day02;

import java.util.Scanner;

public class break문 {

	public static void main(String[] args) {
		/* break문 : 반복문을 빠져나오게 만드는 키워드.
		 * - 반복문에서 break를 사용하려면 조건(if문)을 동반하게 된다.
		 * */
		//1~10까지 출력
		//초기화 1 ~ 무한대 1씩 증가
		//10에서 break
		
		for(int i=1; ; i++) {
			System.out.println(i+" ");
			if(i == 10) {
			break;				
			}	 
		}
		
		/* 한글자를 입력받아 글자를 출력
		 * y를 입력받으면 종료.
		 * 초기값 : 생략
		 * 조건식 : 생략
		 * 증강식 : 생략 무한루프
		 * 실행문 : y가 나오는경우 break;
		 * */
		
		Scanner scan = new Scanner(System.in);
		for(;;) {
			System.out.println("알파벳을 입력해주세요.");
			char word = scan.next().charAt(0);
			System.out.println(word);
			
			if(word =='y' || word =='Y') 
				break; }
		
			{	System.out.println("종료");		
		}
		
		
		scan.close();
		
	}}