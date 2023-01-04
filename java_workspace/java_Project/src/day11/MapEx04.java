package day11;

import java.util.HashMap;
import java.util.Iterator;

public class MapEx04 {
	/* 3. 멤버변수에 map을 추가
	 * */
	static HashMap<String, Integer> wan1 = new HashMap<>();

	public static void main(String[] args) {
	HashMap<String, Integer> wangu1 = maker();
	int sum=0;
	Iterator<String> it = wangu1.keySet().iterator();
	while(it.hasNext()) {
		String key = it.next();
		sum=sum+maker().get(key);
		System.out.println("상품 :"+key+" 가격 "+wangu1.get(key));
		}
		System.out.println("합계: "+sum);
		wan(wan1);
		System.out.println(wan1);
	}
	
	/* 1. 해당 맵을 만들어서 리턴 => main에서 받아서 출력(합계도 같이) 
	 * map에 상품 이름과 값을 추가
	 * */
	static HashMap<String, Integer> maker(){
	HashMap<String, Integer> wangu = new HashMap<>();
	wangu.put("가위", 2500);
	wangu.put("크레파스", 5000);
	wangu.put("스케치북", 3000);
		return wangu;	
	}	
	/* 2. 메인에서 map을 생성 매개변수로 맵을 받아와서 
	 * 상품이름과 값을 추가
	 * map.put("가위,2500)
	 * map.put("크레파스,5000)
	 * ...
	 */
	static void wan(HashMap<String, Integer> map) {
		map.put("가위2", 2500);
		map.put("크레파스2", 5000);
		map.put("스케치북2", 3000);
		System.out.println(map);
	}
}