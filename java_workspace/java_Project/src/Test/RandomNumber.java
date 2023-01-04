package Test;

import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("난수의 개수를 입력하세요");
		int num = scan.nextInt();		
		int sum = 0;
		for(int i=0; i<num; i++) {
			int ran = (int)(Math.random()*100);
			sum+=ran;
			System.out.println("배정된 값은"+ran);
		}
		System.out.println("입력하신 난수의 개수는"+num+" 총 합은"+sum);
	}
}
