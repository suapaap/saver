package day04;

public class String02 {

	public static void main(String[] args) {
		/* String method 
		 *  
		 */

		String str = "Hello World JAVA";
		System.out.println(str);
		
		System.out.println("===length===");
		//길이
		int len = str.length();
		System.out.println(len);
		
		System.out.println("===indexof===");
		//indexof
		System.out.println(str.indexOf("W")); // 단일 문자값 인덱스(char)
		System.out.println(str.indexOf("ll")); // 일치하는 문자열의 시작index
		System.out.println(str.indexOf('l',5)); // 지정한 위치부터 찾기 
		
		System.out.println("===latsindex===");
		System.out.println(str.lastIndexOf('l'));
		System.out.println(str.lastIndexOf("World"));
		
		System.out.println("===CharAt===");
		
		//CharAt(index) : 특정 인덱스의 값 반환 => char
		System.out.println(str.charAt(0));
		
		System.out.println("===contains===");
		//contains : 특정 값의 존재여부 ( true : false )
		System.out.println(str.contains("JAVA"));
		
		System.out.println("===equals===");
		//** equals : 특정값과 동일한지 확인 [문자열을 비교할 때는 반드시 equals로 비교해야함 ** ]
		// string은 참조자료형이기 때문에 서로 다른 주소값을 가지고 있음
		// ==로 비교 시 주소의 값만 비교를 하기때문에 false를 반환
		System.out.println(str.equals("Hello World JAVA"));
		System.out.println(str.equalsIgnoreCase("hello world java"));
		
		System.out.println("===toLower/toUpper===");
		// 대소문자 변환 toLowerCase(), toUpperCase()
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		System.out.println("===isEmpty===");
		// 비어있는 객체인지 판단 isEmpty()
		System.out.println(str.isEmpty());
		
		System.out.println("===replace===");
		// 문자값 대체
		System.out.println(str.replace('l', 'L'));
		
		System.out.println("===split===");
		// 문자열 분리 후 배열 리턴 split
		String[] strArr = str.split(" "); // 띄어쓰기가 없을 경우 한글자씩 자르기
		System.out.println(strArr[2]);
		
		System.out.println("===substring===");
		// **문자열 추출 substring
		System.out.println(str.substring(6,11)); // 6번부터~11번전까지
		System.out.println(str.substring(6)); // 6번부터 끝까지
		
		System.out.println("===trim===");
		// 양쪽 공백을 제거 trim
		System.out.println(str.trim());
		
		System.out.println("===compareTo===");
		// 문자값이 비교값보다 앞(크면)에 있으면 -1, 같으면 0, 뒤(작으면)에 있으면 1
		System.out.println("A".compareTo("a"));	
		System.out.println("b".compareTo("a"));
		
		System.out.println("===Integer , valueof===");
		// 문자 -> 숫자 
		String str1 = "12345";
		int num = Integer.parseInt(str1);
		System.out.println(str1 instanceof String); // 자료형인지 확인방법 instanceof
		System.out.println(num);
		// 숫자 -> 문자
		int num2 = 123456;
		String str2 = String.valueOf(num2); 
		System.out.println(str2);
		
		
	}
	
}
