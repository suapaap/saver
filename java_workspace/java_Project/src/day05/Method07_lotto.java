package day05;

public class Method07_lotto {

	public static void main(String[] args) {
		/* 로또번호 생성 (랜덤으로 1~45번호를 생성)
		 * 당첨확인
		 * */
		//랜덤번호 생성기
		int lotto[] = new int[7]; // 당첨번호가 나오는 배열 6개+보너스번호 1개는 마지막번호
		int user[] = new int[6]; // 내가 입력하는 번호
		randomArray(lotto);
		System.out.println("이번 당첨 번호는");
		printArray(lotto);
		System.out.println();
		System.out.println("==================================");
		System.out.println("내 자동 번호는");
		randomArray(user);
		printArray(user);
		int rank = lottoRank(lotto, user);
		if(rank == -1) {
			System.out.println();
			System.out.println("==============================");
			System.out.println("꽝이오!!");
		}else {
			System.out.println();
			System.out.println("==============================");
			System.out.println(rank + "등 당첨!");
		}
	}
	
	/* 1. 번호 랜덤 생성기능
	 * 매개변수 :
	 * 리턴타입 : int
	 * 메서드명 : random 
	 * */
	public static int random() {
		int ran1=(int)(Math.random()*45)+1;
		
		return ran1;
	}
	/* 2. 배열에 1의 랜덤번호를 저장하는 기능.
	 * 매개변수 : arr[]
	 * 리턴타입 : void
	 * 메서드명 : randomArray
	 * */
	public static void randomArray(int arr[]) {	
	int i=0; 
	
		while(i<arr.length) { 
			int cnt = random();
			if( !isContain(arr, cnt)) {
				arr[i]= cnt;
				i++;
			}
		}
	}
		
//		for(int i=0; i<arr.length; i++) {
//		 int cnt = random();
//			if (!isContain(arr, cnt)) {
//			arr[i]= cnt;
//			}else {
//				i--;
//			}
//		}	
	/* 3. 정수 배열을 콘솔에 출력하는 기능
	 * 매개변수 : num    
	 * 리턴타입 : void
	 * 메서드명 : printArray 
	 * */
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");	
		}
		
		}
			
	/* 4. 같은 값이 있는지 확인
	 * 매개변수 : 
	 * 리턴타입 : boolean
	 * 메서드명 : isContain 
	 * */
	public static boolean isContain (int arr[],int num) {
		for(int i=0; i<arr.length; i++) {			 
			if(arr[i] == num ) {
				return true;
			} 				
			
		} return false;
		}
	
	/* 5. 등수를 알려주는 메서드
	 * 매개변수 : arr1[], arr2[]
	 * 리턴타입 : void
	 * 메서드명 : lottoRank
	 * 6개 일치 : 1등 
	 * 5개 일치 +보너스 : 2등 
	 * 5개 일치 : 3등
	 * 4개 일치 : 4등
	 * 3개 일치 : 5등
	 * 나머지 꽝
	 * */
	public static int lottoRank(int lotto[], int user[]) {
			if (lotto.length <= user.length) { // 배열의 순서가 바뀌었거나, 같은 배열을 넣었을 경우
				return -1; 
			}
				int cnt =0; // 맞춘개수
				for(int i=0; i<user.length; i++) {
				if(isContain(user ,lotto[i])) {
					cnt++;		
			}
		}	
			switch(cnt) {
			case 6: return 1;
			case 5:
				if(isContain(user, lotto[lotto.length-1])) {
					return 2;
				}else {
					return 3;
				}
			case 4: return 4;
			case 3: return 3;
			default : 
				return -1;
				}
			}	
}