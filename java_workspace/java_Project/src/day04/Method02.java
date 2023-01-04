package day04;

public class Method02 {

	public static void main(String[] args) {
		
//		System.out.println("숫자를 입력해주세요");
		
		
		System.out.println(bool(11));
		int sum=0;
		for(int i=2; i<100; i++) {
			if(bool(i)) {
				System.out.print(i+" ");
				sum = sum+i;
			}
		}
		System.out.println();
		System.out.println(sum+"소수합계");
	}
	/* 기능 : 정수가 주어지면 이 정수가 소수인지 아닌지 판별
	 * 소수 : 1과 자기자신의 수외에는 나누어떨어지지 않는 수
	 * 리턴타입 : boolean
	 * 매개변수 : int num1
	 * 메서드명 : isPrime 
	 * */
	
	public static boolean bool(int num1) {
		int cnt =0; //갯수 count위함		
		for(int i=2; i<num1; i++) {
			if(num1 % i == 0) {
				cnt++;
			}
		}
		if(cnt == 0) {
			return true;
		} else {
			return false;
		}
	}
}
