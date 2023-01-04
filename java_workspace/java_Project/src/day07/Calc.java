package day07;

public class Calc {

	public static void main(String[] args) {
		/* 메서드 오버로딩을 이용하여 메서드 생성
		 * 메서드 오버로딩 규칙
		 * 1. 메서드의 매개변수 타입이 달라야 한다.
		 * 2. 메서드의 매개변수 개수가 달라야 한다.
		 * 리턴타입 아무 영향을 주지 않는다.
		 * 메서드의 이름이 같다고 매개변수의 형태가 다르면 다른 메서드로 인식 맵핑
		 * */
// 1. 삼각형의 면적 (가로*세로 / 2)
		int width = 100; // 가로
		double height = 40; // 세로
		System.out.println("삼각형의 면적은 "+ area(width, height));
// 2. 사각형의 면적 (가로*세로)
		int w=50;
		int h=30;
		System.out.println("사각형의 면적은 "+ area(w, h));
// 3. 원의 면적 (PI*r제곱)
		double r = 3;
		final double PI = 3.141592;
		double pi = Math.PI;
		System.out.println("원의 면적은 "+ area(r, PI));
	}

	/* 메서드명 : area
	 * */
		public static double area(int w,double h) {
			return w*h*0.5;
		}
		
		public static int area(int num1, int num2) {
			return num1*num2;
		} 
		public static double area(double r, double pi) {
			return r*r*pi;
		}
}



