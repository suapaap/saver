package day10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collection01 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크 : 표준화된 방식의 자료구조
		 * List, Set, Map
		 * 데이터를 묶어서 관리할 때 사용
		 * 주로 배열 대신 사용
		 * 
		 * List
		 * - 값을 하나씩 저장
		 * - 순서를 보장
		 * - 중복을 허용
		 * - 일반적으로 배열대신 가장 많이 사용
		 * 
		 * Set
		 * - 값을 하나씩 저장
		 * - 순서를 보장하지 않음
		 * - 중복 허용하지 않음
		 * 
		 * Map
		 * - 값을 두개 저장, key/value 값으로 저장
		 * - key는 중복 불가, value는 중복 가능
		 * - key가 중복되면 덮어쓰기 됨
		 * - 아이디/패스워드 처럼 같이 묶어서 저장해야 할 때 사용
		 * */
		
		/* collection에서는 어떤 데이터를 관리할지 클래스로 지정해야 한다.
		 * 숫자 형식 => int:X , Integer:O, String
		 * 클래스를 지정하지 않으면 Object(객체)로 자동으로 들어감
		 * */

		//List 사용방법		
		// <클래스>안에는 반드시 클래스가 와야 함.
		List list1 = new ArrayList(); // 모든 객체 저장 가능 
		ArrayList list2 = new ArrayList(); //모든 객체 저장 가능
		ArrayList<String> list3 = new ArrayList<String>(); 
		// 문자열만 가능
		ArrayList<Integer> list4 = new ArrayList<Integer>(); 
		// 정수형 숫자만 가능
		list4.add(1); //.add 요소를 추가
		list4.add(2);
		list4.add(5);
		System.out.println(list4);
		list3.add("가");
		list3.add("나");
		list3.add("다");
		System.out.println(list3);
		list1.add(1);
		list1.add("가");
		list1.add(2);
		list1.add("나");
		System.out.println(list1);
		list2.add(list4);
		list2.add(list3);
		list2.add(list1);
		System.out.println(list2);
		
		
		//1부터10까지 출력
		ArrayList<Integer> list5 = new ArrayList<Integer>();
		for(int i=1; i<=10; i++) {
			list5.add(i);
		}
			for(int i=1; i<=10; i++) {
				list5.add(i);
			}
		System.out.println(list5);
		System.out.println("size "+list5.size());
		list5.remove(0); //remove(index) 삭제(index번지의 요소 삭제)
		System.out.println(list5);
		Integer integer = 10;
		list5.remove(integer); // remove(객체) 객체로 넣어주면 해당 값을 삭제
		System.out.println(list5);
		
		list5.set(0, 1); // index 번지의 값을 (값)으로 변경
		System.out.println(list5);
		
		System.out.println(list5.get(0)); // get(index) : index번의 값을 가져오기
		for(int i=0; i<list5.size(); i++) {
			System.out.print(" "+list5.get(i));
		}
		System.out.println();
		for(int tmp : list5) {
			System.out.print(" "+tmp);
		}
		/* Iterator를 이용한 list 값 출력 (번지가 아닌 값을 이용하여 출력)
		 * list는 순서를 보장하기 때문에 get을 이용하여 원하는 번지에 값을 확인가능
		 * set은 순서를 보장하지 않기 때문에 for문으로 접근할 수 없다.
		 * List : for, Iterator
		 * Set : Iterator
		 * Map : 출력불가 (Set으로 변환하여 출력)
		 * */
		System.out.println();
		System.out.println("Iterator");
		Iterator<Integer> it = list5.iterator();
		while(it.hasNext()) {//hasnext() : 다음 요소에 값이 있다면 이라는 뜻
			Integer tmp = it.next(); // .next() : 다음 요소를 가져와라
			System.out.print(" "+tmp);
		}
		System.out.println();
		//indexOf(값) : 값의 위치를 반환
		System.out.println(list5.indexOf(integer));
		integer = 5;
		System.out.println(list5.indexOf(integer));
		
		/* sort(객체)
		 * - 객체 : Comparator 인터페이스를 구현한 객체를 넣어야 함.
		 * - 비교 :(cmopare)메서드를 가진 객체를 이용하여 정렬
		 * */
		Collections.sort(list5);
		
		list5.sort(new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2; //: 오름차순, o2 - o1 : 내림차순
			}
		});	
			System.out.println(list5);
	}
}