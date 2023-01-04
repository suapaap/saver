package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List02 {

	public static void main(String[] args) {
		/* --메뉴판--
		 * 1. 햄버거 : 15000
		 * 2. 피자 : 20000
		 * 3. 음료 : 2000
		 * 4. 과자 : 1000
		 * 5. 사탕 : 500
		 * 6. 프로그램종료
		 * 
		 * 메뉴를 선택해주세요. 
		 * 수량을 선택해주세요.
		 * 추가 주문하시겠습니까? (Y/N)
		 * 
		 *  --선택한 메뉴
		 *  햄버거 1개 : 15000
		 *  피자 2개 : 40000
		 *  주문하신 음식의 총 금액은 55000원입니다.
		 * */
		Scanner scan = new Scanner (System.in);
		FoodManager1 fm = new FoodManager1();
		fm.add();
		int menu= -1; // 리스트는 0부터 메뉴입력은 1부터
			fm.printMenu();//메뉴출력(한번은 do 위에서, 계속은 do안에서
		do {
			menu=scan.nextInt(); // 메뉴입력받기
		if(menu==6) { // if문 조건성립 시 실행
		System.out.println("프로그램 종료");
		break; // 안쓰면 프로그램 안끝남
		}
		if(menu !=0) {
			System.out.println("수량: ");
			int cnt= scan.nextInt();
			fm.sale(menu, cnt);
			System.out.println("주문 완료시 0번 클릭");
			}
		}while(menu!=0);
		System.out.println("총 금액은 "+fm.total+"입니다");
	}
}

class FoodManager1{
	ArrayList<String> food = new ArrayList<String>(); // 메뉴
	ArrayList<Integer> price = new ArrayList<Integer>(); // 가격
	ArrayList<Integer> num = new ArrayList<Integer>(); // 주문복수
	int sum;
	int total;
	Scanner scan = new Scanner(System.in);

	public void printMenu() {
		System.out.println("--메뉴판--");
		System.out.println("1. 햄버거 : 15,000원");
		System.out.println("2. 피자 : 20,000원");
		System.out.println("3. 음료수 : 2,000원");
		System.out.println("4. 과자 : 1,000원");
		System.out.println("5. 사탕 : 500원");
		System.out.println("6. 종료");
		System.out.println("메뉴를 고르세요");
	}
	
	public void add(){
		food.add("햄버거");
		food.add("피자");
		food.add("음료수");
		food.add("과자");
		food.add("사탕");
		
		price.add(15000);
		price.add(20000);
		price.add(2000);
		price.add(1000);
		price.add(500);
	
	}
	
	public void sale(int menu, int count) {
	//list2.get(menu-1) : 메뉴에 대한 가격
		sum = price.get(menu-1)*count;
		total += sum;
		System.out.println("--------------");
		System.out.println("주문하신 메뉴는"+food.get(menu-1)+" ");
		System.out.println("수량은"+ count+" 개 입니다.");
		System.out.println("금액 : "+sum);
	}
}