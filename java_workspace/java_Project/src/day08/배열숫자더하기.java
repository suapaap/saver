package day08;

public class 배열숫자더하기 {

	public static void main(String[] args) {
		int[][] arr1 = {{1,2},{3,4}};
		int[][] arr2 = {{3,4},{5,6}};
		solution(arr1, arr2);
//		int[][] arr3 = solution(arr1, arr2);
//		
//		for(int i=0; i<arr3.length; i++) {
//			for(int j=0; j<arr3[0].length; j++) {
//				System.out.println(arr3[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		//		int[][] result = new int[2][2];
//		
//	for(int i=0; i<result.length; i++) {
//		for(int j=0; j<result.length; j++) {
//			result[i][j] = arr1[i][j] + arr2[i][j];
//			System.out.print(result[i][j]);
//		}
//	}
		
}
	/* 두 배열(2차원) => 행,열 크기가 같은 두 배열
	 * 이 두 배열의 같은행, 같은 열의 값을 더해서 새로운 배열을 생성
	 * 매개변수 : 2차원 배열 arr1, arr2
	 * 리턴타입 : 2차원 배열
	 * 메서드명 : solution
	 * 예) arr1 = [[1,2][3,4]] arr2 = [[3,4],[5,6]] => [[4,6],[8,10]]
	 * */
		public static int[][] solution(int arr1[][], int arr2[][]) {
		int [][]result = new int [2][2];		
			 
			int cnt=0;
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result.length; j++) {
				result[i][j] = arr1[i][j] + arr2[i][j];
				System.out.println(result[i][j] + " ");
			}
		}
		return result;
	}
}