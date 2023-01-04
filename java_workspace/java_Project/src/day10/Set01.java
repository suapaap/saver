package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set01 {

	public static void main(String[] args) {
		// Set은 순서보장X, 중복X
		//HashSet 가장 많이 사용
		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("toy");
		set.add("apple");
		set.add("peach");
		System.out.println(set);
		
		//정렬 : set은 순서X 정렬이 안됨 => set을 list로 변경후 정렬
		List<String> list = new ArrayList<>(set);
		Collections.sort(list);
		System.out.println(list);
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				return o1.compareTo(o2);
			}
		});
		System.out.println(list);
		
		//Iterator를 이용한 set 출력
		Iterator<String>it = set.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp);
		}
	}
}
