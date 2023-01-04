package day04;

public class String01 {

	public static void main(String[] args) {
		/* String 클래스 = 문자열을 다루는 클래스
		 * String str = "Hello World";
		 * 기본 자료형처럼 사용가능
		 * */

		String str = "Hello World";
		String email = "1234@gmail.com";
		String exe = "123.jpg";
		email.substring(0,3); // 시작은 포함인데 끝은 제외되서 나옴
		System.out.println(email);
		int position = exe.indexOf(".");
		
		System.out.println(position);
		System.out.println(str);
		System.out.println(str.charAt(6));
		
		String str1 = new String();
		str1 = "Hello java";
		System.out.println(str1);
		
		if(str.equals("Hello")) {
			
		} 
		
		
	}

}
