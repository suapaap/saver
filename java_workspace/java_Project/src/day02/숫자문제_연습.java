package day02;

public class 숫자문제_연습 {

	public static void main(String[] args) {
		/* 다음과 같이 출력되도록 반복문을 작성하시오.
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * */
		int num = 0;
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				num++;
				System.out.print(num+" ");				
			}
			System.out.println();
		}
	}
}
