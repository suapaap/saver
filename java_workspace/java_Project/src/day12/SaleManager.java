package day12;

import java.util.ArrayList;
import java.util.Scanner;

import product.Product_연습;

public class SaleManager {
	private ArrayList<Sale_Generic01<String, Integer>> list = new ArrayList<>();
	private ArrayList<Sale_Generic01<String, Integer>> order = new ArrayList<>();

	//1. 제품추가메서드
	//스캐너로 입력받은 메뉴와 가격을 menu리스트에 추가
	//멤버변수로 선언된 리스트를 채우는 기능
	//매개변수 : 스캐너 , 리턴타입 : void
	//매서드명 : add()
		public void add(Scanner scan) {
		String menu = "";
		int price=0;
		System.out.println("등록할 제품명을 입력하세요");
		menu=scan.next();
		System.out.println("제품의 가격을 입력하세요");
		price=scan.nextInt();
		//product class 형식의 객체를 생성해서 (생성자로 메뉴와 가격을 넣어 생성)
		Sale_Generic01 pr = new Sale_Generic01(menu, price);
		list.add(pr);
		}
		
	//2. 메뉴리스트 출력메서드
	//리턴 : void , 매개변수 : 없음
	//메서드명 : Menuprint2()
		public void menuPrint() {
			for(Sale_Generic01 tmp : list) {
				System.out.println(tmp);
			}
		}
		//3. 제품주문 메서드
		//리턴 void , 매개변수 : String 메뉴, int 수량
		//메서드명 : orderpick
		public void orderpick(String menu, int count) {
			for(int i=0; i<list.size(); i++) { // menu List 순차 검색
				String ProductMenu = list.get(i).getMenu(); // 0번지에 추가된 메뉴명
				int ProductPrice = list.get(i).getPrice(); // 0번지에 추가된 가격
				if(ProductMenu.equals(menu)) { //i번지 메뉴명과 입력받은 메뉴가 같은지 확인
					//클래스 객체 생성 후 order list에 추가
					Sale_Generic01 pr = new Sale_Generic01(ProductMenu, (ProductPrice*count));
					order.add(pr);
				}
			}
		}
		//4. 주문출력 메서드
		//리턴 void , 매개변수 : x
		//지불 총 금액 계산
		//메서드명 printOrder
		public void orderPrint() {
			int sum = 0;
			for(Sale_Generic01 pr : order) {
				System.out.println(pr);
				sum +=(Integer) pr.getPrice(); // price : 가격*수량
			}
			System.out.println("지불총금액 "+ sum);
		}
		
		//5. 메인화면 출력
		public void printmenu() {
			System.out.println("보기 중 하나를 고르시오");
			System.out.println("1. 제품추가");
			System.out.println("2. 제품리스트보기");
			System.out.println("3. 제품주문");
			System.out.println("4. 주문내역(주문리스트)(총 금액)");
			System.out.println("5. 프로그램 종료");
		}
}
