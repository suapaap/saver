package day01;

import java.util.Scanner;

public class IF03 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학의 값을 입력받아 합계와 평균
		 * 평균90이상이면 A / 평균이 80이상이면 B / 평균이 70이상이면 C / 나머지 D
		 * */

		Scanner scan = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요");
		int kor = scan.nextInt();
		if(kor <0 || kor >100) {
			System.out.println("잘못된 값입니다.");
		}
		System.out.println("영어점수를 입력하세요");
		int eng = scan.nextInt();
		if(eng <0 || eng >100) {
			System.out.println("잘못된 값입니다.");
		}
		System.out.println("수학점수를 입력하세요");
		int math = scan.nextInt();
		if(math <0 || math >100) {
			System.out.println("잘못된 값입니다.");
		}
		int sum = kor+eng+math;
		System.out.println("합계 : " +sum);
		double avg = sum/3.0;
		System.out.println("평균 : " +avg);
		
			if (avg > 100 || avg <0) {System.out.println("잘못된 값입니다");	
		}	else if (avg >= 90) { System.out.println("Class A"); 
		}	else if (avg >= 80) {System.out.println("Class B"); 
		}	else if (avg >= 70) {System.out.println("Class C"); 
		}	else {System.out.println("Class D");			
		}
		
		scan.close();
		
	}
		

}
