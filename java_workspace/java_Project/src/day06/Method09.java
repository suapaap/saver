package day06;

import java.util.Scanner;

public class Method09 {

	public static void main(String[] args) {
		/* calc(num1, num2, 사칙연산+나머지)
		 * calc(실수, 실수, 사칙연산+나머지)
		 * 메서드 오버로딩을 이용하여 두정수와 연산자, 두 실수와 연산자 값을 입력했을 때 
		 * 연산의 결과가 출력되는 calc메서드를 완성하시오.
		 * */
		Scanner scan = new Scanner(System.in);
		int mun = calc(1,2,'*');
		double c = calc(1.2, 2.1, '*');
		if(mun == 99999) {
			System.out.println("잘못 입력하였습니다.");
		}
		
		System.out.println(mun);
		System.out.println(c);
		scan.close();
		
	}
	
	public static int calc(int num1, int num2 , char mun) {
				int res = 0;
				
		switch(mun) {
		case '+' : res = num1+num2; break;		
		case '-' : res = num1-num2; break;		
		case '*' : res = num1*num2; break;		
		case '/' : res = num1/num2; break;		
		case '%' : res = num1%num2; break;
		default : res = 99999;
		}
		return res;
	}
	
	public static double calc(double num1, double num2 , char mun) {
		
		switch(mun) {
		case '+' : return num1+num2; 		
		case '-' : return num1-num2; 		
		case '*' : return num1*num2; 		
		case '/' : return num1/num2; 		
		case '%' : return num1%num2; 		
		}
			return 99999;
	}		
}
