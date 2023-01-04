package day03;

public class Array04 {

	public static void main(String[] args) {
		
		/* 합계, 평균, 최대값, 최소값 출력
		 * */
		int arr[] = new int[] {3,5,7,1,6,9,4};
		int sum = 0, avg = 0;
		int max = 3, min = 3;
		max=arr[0]; min=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i]; 
		}
			if (min > arr[i]) {
				min = arr[i]; }
			
			sum = sum+arr[i];
		}		
		avg = sum/arr.length;
		
		System.out.println("최소값 : "+min);
		System.out.println("최대값 : "+max);
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
	}
}