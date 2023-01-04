package day04;

public class 복습 {

	public static void main(String[] args) {
		/* 정리 !
		 * 1. 변수
		 * 	- 일반변수(기본형) : 값을 저장하는 기본 메모리공간
		 *    1) 정수형 : int, byte, short, long(접미사 L&r)
		 *    2) 실수형 : double, float(접미사 F&f)
		 *    3) 문자형 : char(정수형으로 분류하기도 함 : 유니코드표 코드로 저장) : 1글자
		 *    4) 불리언 : boolean 
		 *  - 참조변수 : 객체의 주소를 저장하는 변수(객체명) : new 키워드를 통해 객체 생성
		 *  - 자료형변환 : 변수, 상수, 리터럴값들을 일시적으로 다른 자료형으로 변환
		 *    - 자동형변환 : 정수 -> 실수, 작은byte -> 큰byte
		 *    - 명시적형변환 : 자동으로 자료형변환이 되지않아서 에러가 발생할 경우 사용
		 *    				(자료형)변수명 => 명식적 자료형 변환을 해줘야 합니다.
		 * 2. 연산자
		 *  - 대입연산자(=)
		 *    - 오른쪽에 있는 값을 왼쪽 변수에 저장
		 *    - 왼쪽에는 반드시 저장이 가능한 변수/객체가 와야함
		 *    - 왼쪽과 오른쪽의 자료형은 반드시 같아야 함
		 *  - 산술연산자 ( + - *  / %)
		 *    - 정수 / 정수 => 정수 , 0으로 나눌 수 없음
		 *  - 비교연산자 ( >= , <= , > , < , == , != )
		 *    - 결과가 항상 true / false로 표현됨.
		 *  - 논리연산자 ( &&, ||, ! )
		 *    - && : and 여러개의 조건이 모두 맞아야 true (ex: ~이고, ~면서)
		 *    - || : or 여러개의 조건 중 하나만 맞아도 true (ex: ~거나, ~또는)
		 *    - ! : not 현재 조건의 반대 
		 *  - 증감연산자 (++, --) : 1씩증가, 1씩감소
		 *  - 조건선택연산자 ( 조건식 ? true : false )
		 *    - 조건식이 참이면 true를 선택 아니면 false를 선택
		 *    
		 * 3. 조건문 : 조건식이 참이면 실행문을 실행
		 * 	1) if문   
		 * 	  - if(조건식){ 실행문; } <- 기본조건
		 * 	  - if(조건식){ 실행문; } {else { 실행문; } (else는 조건이 따로 없음)
		 * 	  - if(조건식){ 실행문; } {else if { 실행문; } (else에 조건을 넣고싶을 경우)
		 *  2) switch문
		 *   - switch(변수/식){case 값1: 실행문; break; , case 값2: 실행문; break; , default: 실행문; break; } 
		 *   - break; 를 적지 않으면 이후 모든 case가 계속 실행됨.
		 * 4. 반복문 : 규칙성 반복
		 *   - for문, while, do~while
		 *     - for(초기화 ; 조건식 ; 증감식){ 실행문; } 
		 *     - while(조건식){ 실행문; } : 반드시 참이어야함 , 조건식에서 사용한 변수의 증감이 실행문에서 일어나는 형태
		 *     - do~while : 최소 1회 무조건 실행시키는 반복문 , 조건이 참이어야 반복 
		 *       do{ 실행문; }while(조건식); 
		 *     - break;
		 *       - 반복문을 빠져나가는 역할 / switch문을 빠져나오는 역할
		 *       - 반복문과 같이 사용할 경우 if문과 같이 사용함
		 *     - continue;
		 *       - skip, pass 하는 역할 
		 *       - 조건이 맞을 때 실행하지 않고, 다음 증감으로 이동
		 *       - while문에서 사용 시 continue는 증감식을 찾을 수 없어 조건식으로 바로 이동
		 *5.  배열 : 동일한 자료형을 가진 데이터를 모아놓은 형태
		 *   - 배열 선언 : 자료형 배열명[]; , 자료형[] 배열명;
		 *   - 배열 생성 : 자료형 배열명[] = new 자료형[개수]; : 선언 후 생성 / 배열명 = new 자료형[개수];  
		 *   - 배열의 index는 0부터 시작 하며 배열.lnegth(총 길이)의 -1까지
		 *   - 배열명[index] = 값; : 배열의 index번지에 값을 저장
		 *   - 변수 = 배열명[index]; // 배열의 index 번지에 있는 값을 추출    		 
		 * */

//		int num =9;
//		for(int i= 1; i<=9; i++); {
//			
//			System.out.println(num+"*"+i+"="+num*i);
//		}
		
	}

}
