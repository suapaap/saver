package day04;

public class Method03 {

	public static void main(String[] args) {
		/* 최대공약수, 최소공배수 메서드
		 * 기능 : 두 정수의 최대공약수를 구하는 메서드
		 * 매개변수 : 두 정수
		 * 리턴타입 : 최대공약수
		 * 매서드명 : gcd
		 * */
		
		/* 기능 : 두 정수의 최소공배수를 구하는 메서드
		 * 매개변수 : 두 정수
		 * 리턴타입 : 최소공배수
		 * 메서드명 : lcm
		 * */
		
		System.out.println(gcd(10,15)); 
		System.out.println(lcm(10,30));
		System.out.println(lcm2(10,15));
	}
	
	public static int gcd(int num1 , int num2) {
		int result = 0; //공약수 들어올 변수
		for(int i=1; i<=num1; i++) {
			if(num1 % i == 0 && num2 % i == 0) { 
			result = i;
			}				 
		}
	
		return result;
	}
		
	public static int lcm(int num1 , int num2) {
		for(int i=num1; ;i=i+num1) {
			if(i % num1 ==0 && i % num2 ==0) {
				return i;
			}
		}
	}
	
	public static int lcm2(int num1 , int num2) {
		return num1 * num2 / gcd(num1, num2);
	}
		
}
