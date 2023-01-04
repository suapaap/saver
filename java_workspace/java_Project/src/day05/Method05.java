package day05;

public class Method05 {

	public static void main(String[] args) {
		
		System.out.println("==============1단");
		printMulti(1);
		System.out.println("==============2단");
		printMulti(2);
		System.out.println("==============3단");
		printMulti(3);
		System.out.println("==============4단");
		printMulti(4);
		System.out.println("==============5단");
		printMulti(5);
		System.out.println("==============6단");
		printMulti(6);
		System.out.println("==============7단");
		printMulti(7);
		System.out.println("==============8단");
		printMulti(8);
		System.out.println("==============9단");
		printMulti(9);
	
	}
	/* 구구단 출력메서드
	 * 매개변수 : 정수를 주면 정수에 해당하는 단을 출력
	 * return : void 
	 * 메서드명 : printMulti
	 * */
	
	public static void printMulti(int num1) {
		int gugu= 0;
		for(int i=1; i<=9; i++) {
		gugu = num1 * i;
		System.out.println(num1+ "*"+ i+ "="+ gugu +" ");
		}	
	}
}
