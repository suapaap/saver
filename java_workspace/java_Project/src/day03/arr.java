package day03;

public class arr {

	public static void main(String[] args) {
		System.out.println("줴훈줴훈 바보바보");
		int x=10;
		int y=20;
		int z=30;
		int[] arr=new int[]{x,y,z};
		int result =0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int[] arr2= {1,2,3,4,5};
		int vv=arrSum(arr2);
		System.out.println(vv);
	}

	private static int arrSum(int[] x) {
		int hap=0;
		for(int i=0; i<x.length; i++) {
			hap+=x[i];
		}
		return hap;
	}
}
