package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MapEx03 {

	public static void main(String[] args) {
		/* 단어장 단어:의미 => hello:안녕
		 * 5 => 5개의 단어를 입력
		 * 메서드에서 호출 후 맵을 리턴받아 출력
		 * */
		HashMap<String, String> map2 = maker();
		Iterator<String> it = map2.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("단어 :"+key+" 뜻 :"+map2.get(key));		
		}
	}
	/* 기능 : 단어:의미 값을 입력받아 map으로 구성하여 map을 반환
	 * 리턴타입 : map HashMap<String, String>
	 * 매개변수 : 
	 * 메서드명 : maker
	 * */
	
	public static HashMap<String, String> maker() {
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		String word="";
		String mean="";
		while(map.size()<5) {
			System.out.println("단어를 입력하세요 그만하고싶으면 n을 눌러주세요");
			word = scan.next();
			if(word.equals("n")) {
				System.out.println("단어장을 종료합니다.");
				break;
			}
			System.out.println("뜻을 입력하세요");
			mean = scan.next();
			
			map.put(word, mean);
		}
		return map;	 
	}
}
