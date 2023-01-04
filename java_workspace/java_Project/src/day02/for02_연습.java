package day02;

public class for02_연습 {

	public static void main(String[] args) {
		/* 1~10까지의 홀수 합, 짝수 합
		 * 조건 짝수/홀수 판별
		 * 초기화 :i=1
		 * 조건식 : i<=10
		 * 증감식 : i++
		 * 실행문 : 짝수인지 판별, 합
		 * 종료 후 : 합을 출력
		 * */
		
		int sum=0;
		int sum1=0;
		for(int i=1; i<=10; i++) {
			if(i % 2 ==0) {
				sum+=i;
			}
			else {
				sum1+=i;
			}
		}
		System.out.println("짝수 합은"+sum+" 홀수 합은"+sum1);
		//구구단 출력 2단 ~ 9단까지
		System.out.println();
		int gugu = 0;
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				gugu=i*j;
				System.out.println(i+" * "+j+"= "+gugu);
			}
			System.out.println();
		}
	}

}
