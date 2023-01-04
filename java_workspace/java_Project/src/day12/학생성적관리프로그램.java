package day12;

import java.awt.print.Printable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class 학생성적관리프로그램 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		/* map을 이용
		 * 한 학생의 성적을 관리하는 프로그램 작성
		 * >>menu
		 * 1. 성적추가 hashmap => insert(scan,map)(key=과목명, value=점수) scan 필요
		 * 2. 성적조회(전체출력) 합계,평균 value sum,avg  //print
		 * 3. 성적조회(과목별) serch - 과목별 서치 후 출력 => printSub(map) scan필요
		 * 4. 성적수정 => modify(map) scan필요
		 * 5. 종료
		 * */ 
		학생성적관리프로그램 sc = new 학생성적관리프로그램();
		int menu = -1;
		do {
			sc.printMenu();
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: sc.insert(scan); break;
			case 2: sc.print(); break;
			case 3: sc.printSub(scan); break;
			case 4: sc.modify(scan); break;
			case 5: break;
			default : System.out.println("잘못된 값입니다");
			}
		}while(menu!=5);
		System.out.println("프로그램을 종료합니다.");
		
		
	
	}
	public void printMenu() {
		System.out.println("원하는 번호를 누르세요");
		System.out.println("===MENU===");
		System.out.println("1. 성적추가");
		System.out.println("2. 성적조회(전체)");
		System.out.println("3. 성적조회(과목별)");
		System.out.println("4. 성적수정");
		System.out.println("5. 종료");
	}
	
	HashMap<String, Integer> map = new HashMap<>();
	//1. 성적추가 입력
	public void insert(Scanner scan) {
	System.out.println("과목을 입력해주세요");		
	String sub = scan.next();
	
	System.out.println("점수를 입력해주세요");
	int score = scan.nextInt();
	
	map.put(sub, score);
	}
	//2. 성적출력
	public void print() {
	int sum =0;
	int avg =0;
	Iterator<String> it = map.keySet().iterator();
	while(it.hasNext()) {
		String key = it.next();
		sum += map.get(key);
		avg = sum/map.size();
		System.out.println("과목 :"+ key + "점수 :" + map.get(key));
	}
	System.out.println("총 합계 : "+sum);
	System.out.println("평균 : "+avg);
	}
	
	//3. 성적조회
	public void printSub(Scanner scan) {
		System.out.println("조회하실 과목을 입력해주세요");
		String sub = scan.next();
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			if(key.equals(sub)){
			System.out.println("조회하신"+key+"는 "+key+", 점수는 "+map.get(key));
			return;
		}else {
			System.out.println("잘못된 값입니다.");
			}
		}
	}			
	
	//4. 성적수정
	public void modify(Scanner scan) {
		System.out.println("수정할 과목을 입력하세요");
		String before = scan.next();
		if(!map.keySet().equals(before)) {
			System.out.println("과목이 없습니다.");
		}
		else if(map.keySet().equals(before)){
		System.out.println("수정할 점수를 입력하세요");
		}
		int count = scan.nextInt();
		if(count < 0 || count > 100) {
			System.out.println("잘못된 점수입니다.");
		}else {
			map.put(before, count);
		}
	}
}
