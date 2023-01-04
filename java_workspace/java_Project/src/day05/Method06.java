package day05;

public class Method06 {

	public static void main(String[] args) {

		int arr[] = new int[] {1,3,2,6,5,4,7,5,8,6,10,11};
		 
		printArray(arr);
		
		sortArray(arr);
		
		}
	
	/* 기능 : 주어진 정수 배열을 콘솔에 출력하는 메서드
	 * 매개변수 : 정수 배열 (int arr[])
	 * 리턴타입 : void
	 * 메서드명 : printArray
	 * 옆으로 출력 / 5개씩 한줄에 나열
	 * */
	
	public static void printArray(int arr[]) {
				
		for(int i=0; i<arr.length; i++) {
			if(i % 5 ==0 && i != 0) {
				System.out.println();					
			}
			System.out.print((arr[i]+" "));		
		}	
		System.out.println();
		System.out.println("============");
		}
		
		
	public static void sortArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			for (int j=i; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("============");
	}
//	public static int createArray(int size[]) {
//		return new int[size];			
//		}
		
	
}

	/* 기능 : 새로운 배열을 만들어서 돌려주는 메서드
	 * 매개변수 : size
	 * 리턴타입 : 
	 * 메서드명 : createArray
	 * */
	 