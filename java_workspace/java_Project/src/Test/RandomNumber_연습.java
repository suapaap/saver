package Test;

import java.util.Scanner;

public class RandomNumber_연습 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* 랜덤수를 1~99까지 전달받아 난수의 합을 구하시오
		 * */	
		System.out.println("난수를 입력하세요");
		int num = scan.nextInt();
		System.out.println("입력한 난수의 수는"+ num );
		int sum = 0; 
		for(int i=0; i<num; i++) {
			int random = (int)(Math.random()*100);
			sum += random;
			System.out.println(i+1+"번째 난수"+random);
			
		}
		System.out.println("총 합은"+sum);
	}

}