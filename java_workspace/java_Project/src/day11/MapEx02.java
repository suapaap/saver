package day11;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx02 {

	public static void main(String[] args) {
		/* 단어장 단어:의미 => hello:안녕
		 * 5 => 5개의 단어를 입력
		 * 1. Map생성
		 * 2. 입력할 단어 개수 받기
		 * 3. while을 이용하여 입력받은 값 만큼 단어와 뜻을 입력받고 맵에 put
		 * 4. 출력
		 * */
		Scanner scan = new Scanner(System.in); //객체 생성
		HashMap<String, String> map = new HashMap<>();
		String word = "";
		String mean = "";
		
		while(map.size()!=5) {
			System.out.println("단어를 입력해주세요 중간에 종료를 원하시면 n눌러주세요");
			word= scan.next();
			if(word.equals("n")) {
				System.out.println("단어장을 종료합니다.");
				break;
			}
			System.out.println("뜻을 입력해주세요");
			mean= scan.next();
		
			map.put(word, mean);
		}
		Iterator<String> it = map.keySet().iterator();
		System.out.println("---단어장 생성완료---");
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("단어 :"+key+" 뜻 :"+map.get(key));
		}
	}
}
