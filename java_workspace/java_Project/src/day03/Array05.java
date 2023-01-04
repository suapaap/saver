package day03;

public class Array05 {

	public static void main(String[] args) {
		/* 5개짜리 배열에 랜덤으로 값을 저장한 후 출력
		 * 1~50 사이의 수로 생성
		 * */
		
		int[] arr= new int[5];
		int sum=0, avg=0;
		int max=1; 
		int min=1;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*50)+1;
			System.out.print(arr[i]);
			System.out.println();
			if (max < arr[i]) {
				max = arr[i];
		}
			if (min > arr[i]) {
				min = arr[i];
		}
			sum = sum + arr[i];
		}
			avg = sum / arr.length;
			
		System.out.println("최소값 : "+min);
		System.out.println("최대값 : "+max);
		System.out.println("합 계 : "+sum);
		System.out.println("평균값 : "+avg);
		
	}

}
