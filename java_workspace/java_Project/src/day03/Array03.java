package day03;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력받아 배열에 저장하고,
		 * 점수의 합계와 평균 출력
		 * 합계 : 
		 * 평균 :
		 * */
		
		Scanner scan = new Scanner(System.in);
		int[] arr1 = new int[5]; //01234
		int sum=0, avg=0;
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println("점수를 입력해주세요");
			
			arr1[i] = scan.nextInt(); //점수
			sum= sum+arr1[i];
			
		}
		avg= sum / arr1.length;
			
			System.out.println("합계 : "+sum);
			System.out.println("평균 : "+avg);
		
			scan.close();
			
			
	}

}
