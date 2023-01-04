package day02;

public class 알파벳 {

	public static void main(String[] args) {
		// char : 유니코드 표에따라 글자에 코드가 매겨져 있음.
		char ch = 'B';
		System.out.println((int)ch);
		// A~Z 반복문을 활용하여 표시
		
		for(char ch1='A'; ch1<='Z'; ch1++) {
			System.out.print((int)ch1+" ");	
		}
		
		System.out.println();
		
		for(char ch1='a'; ch1<='z'; ch1++) {
			System.out.print(ch1+" ");	
		}
		System.out.println();
		System.out.println("==============");
		
		for(char i='A'; i<='Z'; i++) { // 줄 a~z
			for(char j='A'; j<=i; j++) { // A부터 시작하나 줄의개수에 맞게 찍겠다.
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);			
			
			}
			System.out.println();
			
		}
		
	}

}
