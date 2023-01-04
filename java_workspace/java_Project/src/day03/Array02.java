package day03;

public class Array02 {

	public static void main(String[] args) {
		/* 5개짜리 배열을 생성하여 1~5까지의 값을 입력하고 출력
		 * 출력예시 : arr[0]=1
		 * */

		int [] arr1 = new int[5];
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = i+1;
			System.out.println(arr1[i]);
			
		}
		
		int size = 5;
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
			System.out.printf("arr[%d]=%d%n", i, arr[i]);			
			}
		
		
		// 10개 값을 갖는 배열을 생성 후 짝수의 값을 저장하고 출력
		int meter = 10;
		int arr5[] = new int[meter];
		for(int i=0; i<arr5.length; i++) {
			arr5[i]=(i+1)*2;
			System.out.println(arr5[i]);
		}
		
	}

}
