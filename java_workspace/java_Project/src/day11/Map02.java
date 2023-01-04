package day11;

import java.util.HashMap;
import java.util.Iterator;

public class Map02 {

	public static void main(String[] args) {
		// key/value 
		// set으로 변환 후 출력
		HashMap<String, Integer> map = new HashMap<>();
		map.put("국어", 89);
		map.put("영어", 91);
		map.put("수학", 74);
		System.out.println("국어: "+map.get("국어")); // get(key)값으로 출력값을 가져와야함 
		System.out.println("영어: "+map.get("영어"));
		System.out.println("수학: "+map.get("수학"));
		System.out.println(map.entrySet()); // map에 등록된 key/value값을 출력
		System.out.println(map.keySet()); // map에 key값만 출력
		System.out.println(map.values()); // map에 value값만 출력
		
		int sum=0;
		double avg=0;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			sum =sum+map.get(key);
			avg = sum/map.size();
			System.out.println(key+" : "+map.get(key));
			
		}
		System.out.println(sum+" 합계");
		System.out.println(avg+" 평균");
	}
}
