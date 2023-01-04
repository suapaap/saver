package day02;

public class for01 {

	public static void main(String[] args) {
		/* 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * 종류 : for, while, do~while문
		 * - for, while문은 문법은 다르지만 동작은 같음
		 * - do~while문은 동작이 조금 다르다.
		 * 
		 * for(1.초기화값; 2.5.8조건식 ; 4.7증감연산식){
		 * 3.6 실행문;
		 * }
		 * 1. 초기화 : 조건식이나 실행문에서 사용하는 변수를 초기화하는 과정
		 * 			 실행시 처음한번 실행, 생략가능
		 * 2. 조건식 : 반복문의 반복을 결정하는 식. 참이면 반복, 거짓이면 스탑
		 * 			 생략가능 (생략하면 무조건 true)
		 * 3. 증강연산식 : 조건식에서 사용하는 변수가 증가/감소되어 반복횟수를 결정하는 식
		 * 				생략가능 
		 * */
		
		/* 1~10까지 출력하는 예제
		 * 초기화 : 1부터 (i=1)
		 * 조건식 : 10까지 (i<=10)
		 * 증감연산식 : 1씩중가 (i++) i=i+1
		 * 실행문 : i를 출력
		 * 반복문이 종료 후 : 없음.
		 * */
		
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		} 
		
		System.out.println();
		
		/* 10부터 1까지 출력
		 * */
		for(int j=10; j>=1; j--) {
			System.out.print(j+" ");
		}
		
		System.out.println();
		
		/* 1~10까지 모든 짝수를 출력
		 * */
		for(int i=2; i<=10; i=i+2) {
			System.out.print(i+" ");
			}
		
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			if(i %2 == 0) 
				System.out.print(i+" ");		
		}
		
		System.out.println();
		/* 1~10까지의 합계 출력
		 * 
		 * */		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum = sum+i;
			System.out.print(sum);
		}		

		/* 2단출력
		 * */
		for(int i=2; i<=18; i=i+2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=1; i<=9; i++) {
			System.out.println("2*"+i+"="+(2*i));
		}
		
	}
}

