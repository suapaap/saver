package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List02 {

	public static void main(String[] args) {
		/* 두 배열을 하나로 합치는 ArrayList를 구성
		 * arr1 = d,e,f;
		 * arr2 = a,b,c;
		 * list = d,e,f,a,b,c; 출력
		 * list 정렬
		 * */
		String arr1[] = new String[] {"d","e","f"};
		String arr2[] = new String[] {"a","b","c"};
		ArrayList<String> list1 = new ArrayList<String>();
		for(int i=0; i<arr1.length; i++) {
			list1.add(arr1[i]);
		}
		for(int i=0; i<arr2.length; i++) {
			list1.add(arr2[i]);
		}
		for(String tmp:list1)
		System.out.print(tmp+" ");
		
		System.out.println();
		Collections.sort(list1);
		System.out.println(list1);
		
		Iterator<String> it = list1.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp+" ");
		}
	}
}
