package day02;

public class for1_연습 {

	public static void main(String[] args) {
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
		
		/* 10부터 1까지 출력
		 * */
		System.out.println();
		System.out.println("=====");
		for(int i=10; i>=1; i--) {
			System.out.print(i+" ");
		}
		/* 1~10까지 모든 짝수를 출력
		 * */
		System.out.println();
		System.out.println("=====");
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				System.out.print(i+" ");
			}
		}
		/* 1~10까지의 합계 출력
		 * 
		 * */
		System.out.println();
		System.out.println("=====");
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		System.out.print(sum);
		
		/* 2단출력
		 * */
		int num=0;
		System.out.println();
		System.out.println("=====");
		for(int i=1; i<=9; i++) {
			num = i*2;
			System.out.print(num+" ");
		}
	}
}