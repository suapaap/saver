package day08;

public class Exception01 {

	public static void main(String[] args) {
		try {//예외가 발생할 수 있는 구문들...
			System.out.println(calc(4, 0, '+')); 
			System.out.println(calc(4, 0, '-')); 
			System.out.println(calc(4, 0, '*')); 
			System.out.println(calc(4, 0, '?')); // 가능성
			System.out.println(calc(4, 0, '/')); // 예외발생
			System.out.println(calc(4, 0, '%')); // 예외발생
			
		}catch(Exception e) {//예외가 발생 시 처리할 문구출력
			System.out.println(e.getMessage());
//			System.out.println("예외가 발생했습니다");
//			e.printStackTrace();
			
		}finally {//예외와 상관없이 꼭 나와야 하는 구문
			System.out.println("계산기 종료!!");
			
			int res =0;
			if(res == 99999) {
				System.out.println("잘못된 값입니다");
			}
		}
	}
	
	/* 기능 : 두 정수와 산술연산자가 주어졌을 때 산술연산의 결과를 알려주는 메서드
	 * 매개변수 : num1,num2,char c 
	 * 리턴타입 : int,double,char
	 * 메서드명 : calc
	 * 발생할 수 있는 예외를 적어주어야 한다.
	 * RuntimeException일 경우 생략가능
	 * */ 
	public static int calc(int num1, int num2, char c) {
		int res = 0;
		
		switch(c) {
		case '+' : res = num1 + num2; break; 
		case '-' : res = num1 - num2; break; 
		case '*' : res = num1 * num2; break; 
		case '/' : res = num1 / num2; break; 
		case '%' : res = num1 % num2; break; 
		default : res=99999; 
		}
		return res; 
	}		
	public static double calc(double num1, double num2, char c)throws RuntimeException {
		double res;
		if((c=='/' || c=='%') && num2 == 0) {
			throw new RuntimeException("Num2는 0이 될 수 없습니다.");		
			}
		switch(c) {
		case '+' : res= num1 + num2;  
		case '-' : res= num1 - num2;  
		case '*' : res= num1 * num2;  
		case '/' : res= num1 / num2;  
		case '%' : res= num1 % num2;
		default : 
			throw new RuntimeException(c+"는 잘못된 값입니다.");
	}
//		return res;
	}
}