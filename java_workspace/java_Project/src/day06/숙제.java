package day06;

public class 숙제 {

	public static void main(String[] args) {
		/* 두 정수 a,b가 주어졌을 때 a와 b사이에 속한 모든 정수의 합을 리턴하는 메서드
		 * 매개변수 : int a, int b
		 * 리턴타입 : 합 => int
		 * 메서드명 : solution
		 * ex) a=3, b=5 => 3+4+5 = 리턴
		 * 
		 * */
		System.out.println(solution(3,8));
		System.out.println(solution(1,5));
		System.out.println(solution2(3,8));
		System.out.println(solution2(1,5));
	}
	public static int solution(int num1, int num2) {
		int mid=0;
		
		for(int i=num1;i<=num2;i++) {
			if(num1<num2) {
			mid= i+mid;			
		}		
	}
		return mid;
	}
	
	public static int solution2(int a, int b) {
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		int res = 0;
		for(int i=min; i<=max; i++) {
			res+=i;
		}
		return res;		
	}
}