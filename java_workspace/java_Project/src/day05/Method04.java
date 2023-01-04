package day05;

public class Method04 {

	public static void main(String[] args) {
		/* 메서드 선언부 구성
		 * 접근제한자 리턴타입 메서드명(매개변수){
		 * 기능구현; 
		 * }
		 * 메서드 선언 위치
		 * 클래스 안, 메서드 밖에서 진행
		 * */
		int hap = sum(10, 20);
		System.out.println(hap);
		
		int bbaegi = bbae(30,10);
		System.out.println(bbaegi);
		System.out.println(gob(10,10));
		System.out.println(nanum(10,5));
		
		int namum = namuzi(30,2);
		System.out.println(namum);
	}
	/* 기능 : 두 정수의 합을 구하는 메서드
	 * 리턴타입 : 결과를 자료형으로 표현
	 * 매개변수 : 두 정수( 각각 자료형 변수명)
	 * 메서드명 : sum
	 * */
	public static int sum(int num1,  int num2) {
		int hap = num1+num2;
		return hap;
	}
	// 기능 : 두 정수의 차를 구하는 메서드
	public static int bbae(int num1, int num2) {
		int bbaegi = num1-num2;
		return bbaegi;
	}
	// 기능 : 두 정수의 곱셈을 구하는 메서드
	public static int gob(int num1, int num2) {
		return num1*num2;
	}
	
	// 기능 : 두 정수의 나누기를 구하는 메서드
	public static int nanum(int num1, int num2) {
		return num1/num2;
	}
	// 기능 : 두 정수를 나눈 나머지를 알려주는 메서드
	public static int namuzi(int num1, int num2) {
		int namum = num1 % num2;
		return namum;
		
	}
	 
	
}
