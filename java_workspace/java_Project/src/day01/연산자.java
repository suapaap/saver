package day01;

public class 연산자 {

	public static void main(String[] args) {
		/* 대입 연산자 : =, +=, -=
		 * = 을 기준으로 오른쪽에 있는 값을 왼쪽에 저장
		 *  a=b : b를 a에 넣어라(저장해라,덮어라 라는 의미지 같다는 의미가 아님)
		 *  a 는 반드시 변수여야 한다.
		 * */
		int a = 10;
		System.out.println("a = " +a);

		int b = 20;
		a = b ;
		System.out.println("a = " +a);

		int c=1;
		c=c+a; // 누적 1+10 = 11
		c+=a; // c=c+a; 와 동일
		c-=a; // c=c-a; 와 동일
		
		c = c+1;
		c=10;
		System.out.println("25번줄"+(++c));
		System.out.println(c);
		
		c++; 
		System.out.println(c);
		c--;
		System.out.println(c);
		
		
		/* 산술연산자 : +, -, *, /, %(나머지)
		 * 나누기일 경우 정수/정수 =정수 (소수점 버려짐)
		 * 정수/ 실수 = 실수 
		 * 실수/ 실수 = 실수
		 * 값 / 0 = 예외발생(infinity)
		 * */
		
		System.out.println("3+2=" +(3+2));
		System.out.println("3-2=" +(3-2));
		System.out.println("3*2=" +(3*2));
		System.out.println("3/2=" +(3/2.0));
		
		//나머지 연산자 %
		//배수나 약수를 구할 때 사용함
		System.out.println("7%5="+(7%5));
	
		/* 비교연산자
		 * >=(이상), <=(이하), >(초과), <(미만)
		 * ==(같음), !=(같지않다)
		 * &&(and), ||(or)
		 * */
		
		/* 조건선택 연산자 : 3항연산자
		 * (조건식) ? 참 : 거짓
		 * */
		System.out.println(3<2? true : false);
		
		int even = 10;
		//even 짝수인지 아닌지 판별하는 조건선택 연산자로 출력		
		System.out.println((even % 2 == 0)? "짝수" : "홀수");
		boolean result = ((even % 2 == 0)? true : false);
		System.out.println(result);
	}

}
