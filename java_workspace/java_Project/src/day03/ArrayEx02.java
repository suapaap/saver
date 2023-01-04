package day03;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자를 거꾸로 출력
		 * ex) 11456 => 65411 
		 * ex) 19463 => 36491
		 * 각 자리의 합계 출력
		 * */

		Scanner scan = new Scanner(System.in);
		System.out.println("5개의 숫자를 입력해주세요");
		int a = scan.nextInt();
		int num = (int)Math.log10(a)+1;
		int sum=0;
		for(int i=0; i<num; i++) {
			
			
			
			int n =(a%10);
			a=a/10;
			System.out.print(n);
				
			sum = sum + n;
			
			
		}
		System.out.println();
		System.out.println("합계 :" +sum);
		
		
		scan.close();
		
	}
}