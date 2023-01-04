package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list 생성<String>
		 * */
		List<String> list = new ArrayList<String>();
//		List<String> list2 = new ArrayList<String>();
//		List<String> list3 = new ArrayList<String>();
		list.add("기상");
		list.add("와이프랑 수아 처갓집 보내기");
		list.add(" 아침 시리얼먹기");
		list.add(" 학원 갈 준비");
		list.add("버스정류장 출발");
		list.add("버스탑승");
		list.add("학원도착");
		list.add("오전수업 시작");
		list.add("점심식사");
		list.add("오후수업 시작");
		list.add("학원수업 종료");
		list.add("집도착");
		list.add("수아 저녁먹이기, 수아 씻기기");
		list.add("씻기");
		list.add("수아 재우기");
		list.add("와이프랑 담소나누기 및 개인시간");
		list.add("취침");
		
		list.sort(new Test()); //직접 구현 Test()
		Collections.sort(list); 
		
		Iterator<String> is = list.iterator();
		while(is.hasNext()) {
			String tmp = is.next();
			System.out.println(tmp+" ");
		}
		//list 0번지 지우기
		list.remove(0);
		System.out.println(list);
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("08시 아침 시리얼먹기");
		list1.add("00시경 취침");
		
		list.retainAll(list1); // 주어진 컬렉션의 값과 일치하는 값만 남기고 삭제
		System.out.println(list);
		
		
		
//		System.out.println("나의 평균하루 오전일과");
//		System.out.println(list);
//		System.out.println();
//		System.out.println("나의 평균하루 오후일과");
//		System.out.println(list2);
//		System.out.println();
//		System.out.println("나의 평균하루 야간일과");
//		System.out.println(list3);
	}

}
class Test implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
	
}