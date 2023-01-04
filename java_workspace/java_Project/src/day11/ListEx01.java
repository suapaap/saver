package day11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx01 {

	public static void main(String[] args) {
		/* ArrayList를 만들고 1~10까지 저장한 후 출력
		 * */
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=1; i<=10; i++) {
			al.add(i);
		}
		for(Integer tmp: al)
		System.out.print(tmp+" ");
		
		System.out.println();
		
		Iterator<Integer> is = al.iterator();
		while(is.hasNext()) {
			Integer tmp = is.next();
			System.out.print(tmp+" ");
		}
		
		String[] arr1 = new String[] {"a","b","c"};
		ArrayList<String> list3 = new ArrayList<>();
		for(int i=0; i<arr1.length;i++) {
			list3.add(arr1[i]);
		}
		System.out.println(list3);
	}
}
