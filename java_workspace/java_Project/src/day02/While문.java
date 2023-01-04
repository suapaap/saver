package day02;

public class While문 {

	public static void main(String[] args) {
		/* while(조건식){
		 * 실행문;  //증감식을 포함한 문 
		 * 증감식;
		 * }
		 * */
		
		System.out.println(">> for문을 활용해서 1~10까지 출력");
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");	
		}
		
		System.out.println();
		System.out.println(">> while문을 활용");
		
		int i=1; //초기값
		while(i<=10) { //조건식
			System.out.print(i+" "); //실행문
			i++; // 증강식
		}
		
		System.out.println();
		System.out.println("===========");
		
		// 짝수 만들기
		int j=1;
		while(j<=10) {
			if (j % 2==0) {
				System.out.print(j+" ");
			}
			j++;
		}
		
		System.out.println();
		System.out.println("===========");
	
		
	}

}
