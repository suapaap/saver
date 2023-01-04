package day06;

public class Method10 {

	public static void main(String[] args) {
		/* 재귀 메서드 : 메서드 A 안에 메서드A를 호출하는 메서드(드물게 사용함)
		 * 10! = 10*9*8*7*6*5*4*3*2*1
		 * 5!=5*4*3*2*1
		 * 0!=1
		 * */
		System.out.println(fact(5));
		System.out.println(factorial(5));
	}
		/* 기능 : 양수가 주어지면 주어진 양수의 팩토리얼값을 알려주는 메서드
		 * 매개변수 : 양수 => int num
		 * 리턴타입 : 팩토리얼 값 => int
		 * */
	public static int fact(int num) {
		if(num<0) { // num가 0보다 작다면 0리턴
			return 0; // 이 부분이 없다면, 스택 오버플로 발생하여 에러가 남
		} if(num == 0 || num == 1) { // 0이나 1이 나오면 1로 변환
			return 1; // 꼭 필요한 부분
		} int res = 1;
		for(int i=2; i<=num; i++) {
			res*=i;
		}
		return res;
	}
	
	public static int factorial(int num) {
		if(num<0) { // num가 0보다 작다면 0리턴
			return 0; // 이 부분이 없다면, 스택 오버플로 발생하여 에러가 남
		} if(num == 0 || num == 1) { // 0이나 1이 나오면 1로 변환
			return 1; // 꼭 필요한 부분
		}
		return num * factorial(num-1);
	}
}
