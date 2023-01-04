package day01;

public class MathClass {

	public static void main(String[] args) {
		// Math.method 
		// 반올림 (Math.round)
		double num1 = 5.1234;
		System.out.println(Math.round(num1));
		//절대값 지정하기(Math.abs)
		System.out.println(Math.abs(-1));
		//Math.max, Math.min
		System.out.println(Math.max(3, 5));
		System.out.println(Math.min(1, 6));
		//Math.ceil, Math.floor
		System.out.println(Math.ceil(5.1234)); // 6.0 올림
		System.out.println(Math.floor(5.1234)); // 5.0 내림
		//Math.pow, Math.sqrt, Math.random
		System.out.println(Math.pow(4, 3)); // 제곱 8.0
		System.out.println(Math.sqrt(25)); // ? 5.0
		System.out.println(Math.random()); //0~1사이의 아무값
	
				int random = (int)(Math.random()*10+1);
				System.out.println(random);
	}

}
