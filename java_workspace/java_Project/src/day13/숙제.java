package day13;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.IntStream;

public class 숙제 {
	public static void main(String[] args) {
		
		int[] data = {5,6,4,2,3,1,1,2,2,4,4,6,6,7};
		//중복을 제거하고 출력     옵션 => (내림차순으로 출력)
		//스트림사용, 스트림 안쓰고 방법을 찾아보시오.
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0; i<data.length; i++) {
			hs.add(data[i]);
		}
		for(int tmp : hs) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			int tmp= it.next();
			System.out.print(tmp+" ");
		}
		
			
	}
}
//		Comparator<Integer> cp = new Comparator<Integer>() {
//			
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				
//				return 0;
//			}
//		};
