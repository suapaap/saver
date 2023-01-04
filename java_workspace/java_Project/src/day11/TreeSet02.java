package day11;

import java.util.TreeSet;

public class TreeSet02 {

	public static void main(String[] args) {
		//가장 큰 점수 출력, 가장 작은 점수 출력
		//80점 이상 점수출력(tailSet, 50점이하 점수출력(headSet)
		int[] score = {80,95,78,32,56,12,98,66};
		TreeSet<Integer> set = new TreeSet<>(); //객체 생성
		for(int i=0; i<score.length; i++) { //i는 score배열미만 하나씩 들어간다
			set.add(score[i]);				//set에 score배열1개를 추가하라
		}									//반복 
		System.out.println(set); 
		System.out.println(set.first()); // 지정된 객체의 첫번째 값 출력
		System.out.println(set.last()); // 지정된 객체의 마지막 값 출력
		System.out.println(set.headSet(50)); // 지정된 객체보다 작은값 출력
		System.out.println(set.tailSet(80)); // 지정된 객체보다 큰값 출력
		
		TreeSet<String> set2 = new TreeSet<>(); //객체 생성
		set2.add("aaa"); set2.add("abc"); set2.add("bbb");
		set2.add("sua"); set2.add("sooa"); set2.add("boa");
		set2.add("sun"); set2.add("run"); set2.add("bat");
		set2.add("dance"); set2.add("sing"); set2.add("song");
		set2.add("road"); set2.add("mvp"); set2.add("vip");
		System.out.println(set2); 
		
		String from = "m"; // subset(시작값, 끝값 제공해야함,끝값은 포함되지않음)
		String to = "z";
		System.out.println(set2.subSet(from, to));
		
	}
}
