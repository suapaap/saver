package day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map01 {

	public static void main(String[] args) {
		/* Map
		 * - 값을 2개 저장, key값과 value값으로 저장
		 * - key는 중복불가, value는 중복가능
		 * - 아이디/패스워드 처럼 같이 묶어서 저장해야 할 때 사용
		 * HashMap<key/value> map = new HashMap<key,value>();
		 * Map은 Map자체로 Iterator를 사용할 수 없음
		 * Map => set으로 바꿔서 사용
		 * list, set => .add 입력
		 * map => .put 입력 / getKey(), getValue() 로 값을 가져옴
		 * */
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("aaa111", "abc");
		map.put("111aaa", "1234");
		map.put("aaa111", "abc");
		map.put("111111", "abc");
		map.put("a+b", "ab");
		System.out.println(map);
		
		//Map => Set : entrySet(), keyset()
		Set<Map.Entry<String,String>> set = map.entrySet();
		Iterator<Map.Entry<String, String>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> tmp = it.next();
			System.out.println("ID:"+tmp.getKey()+" , password:"+tmp.getValue());
		}
		
		Iterator<String> it1 = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it1.next();
			System.out.println(key+":"+map.get(key));
		}
	}
}
