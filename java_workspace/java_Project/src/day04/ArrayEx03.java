package day04;

public class ArrayEx03 {

	public static void main(String[] args) {
		/* 1~10까지 배열에 저장하고 출력
		 * 10개의 size의 배열을 생성하고, 1~20사이의 랜덤수를 입력 받은 후 출력
		 * 랜덤수의 배열을 오름차순 정렬 후 출력
		 * */

		int[] arr= new int[10];		

		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
			System.out.print(arr[i]);
			}
		System.out.println();
		System.out.println("========");
	
		int size = 10;
		int arr1[] = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr1[i] = (int)(Math.random()*20)+1;
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		System.out.println("========");
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=i+1; j<arr1.length; j++) {
				if( arr1[i] > arr1[j]) {
					int ems = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = ems;
					
				}
			}
			
		}
		
		System.out.println("오름차순 정렬" );
		
		for(int ems : arr1) {
			System.out.print(ems+" ");
		}
		
			

		
	}

}
