package day04;

public class Method01 {

	public static void main(String[] args) {
		/* 메서드 : 기능 함수
		 * - 접근제한자 : 접근하 수 있는 주체의 제한범위
		 * - 리턴타입 : 반환값 메서드 실행 후 결과로 알려주는 정보의 값(자료형)
		 * - 메서드명 : 소문자로 작성
		 * - 매개변수 : 기능을 수행하기 위한 필요 정보값
		 * 메서드 선언 및 구현 :
		 *   리턴타입 메서드명 (매개변수) { 기능구현; }
		 * void : 반환할 것이 없을 경우 사용
		 * 메서드의 위치 : 클래스 안, 메서드 밖   
		 * */
		int hap = sum(10, 20);
		System.out.println(hap);
		int hap2 = sum(hap, hap);
		System.out.println(hap2);
		System.out.println("-------sumPrint");
		sumPrint(10,20);
		sumPrint(hap, hap2);
		
		
		int mul = son(hap, hap2);
		System.out.println(mul);
	}

	/* 기능 : 두 정수가 주어지면 두 정수의 합을 알려주는 메서드
	 * 메서드명 : sum
	 * 매개변수 : 두 정수 => int num1, int num2(모든 매개변수 앞에 자료형을 적어야 함)
	 * 리턴타입 : 합 => 정수 => int (리턴타입은 자료형만 기재)
	 * */
	
	public static int sum(int num1, int num2) {
		int hap = num1 + num2;
		
		return hap;
	} 
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 출력하는 메서드
	 * 메서드명 : sumPrint
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : void
	 * */
	
	public static void sumPrint(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	/* 기능 : 두 정수가 주어지면 두 정수의 곱을 알려주는 메서드
	 * 메서드명 : 
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : return => int
	 * */
	
	public static int son(int num1, int num2) {
		int hap5 = num1 * num2;
		
		return hap5;
		
		
	}	
}
