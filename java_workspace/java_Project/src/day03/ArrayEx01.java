package day03;

public class ArrayEx01 {

	public static void main(String[] args) {
		/* 1~10까지 담고있는 배열arr생성
		 * 
		 * */
		//배열을 섞는 코드
		//방법 : 랜덤 번지(0~arr.length)를 선택해서 다른 번지와 교환
		
		//random번지 생성

		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]= i+1;
			System.out.print(arr[i]+" ");
		}
		
		int min=0; //시작번지 
		int max=arr.length-1; 
		for(int i=0;i<arr.length; i++) {
			int random = (int)(Math.random()*max)+min;
			int tmp = arr[i];
			arr[i] = arr[random];
			arr[random] =tmp;
		}
		System.out.println();
		System.out.println("================");
		
		//출력코드 아래로
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			
		} 
		System.out.println();
		System.out.println("======");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
