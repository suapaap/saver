package product;

import java.util.ArrayList;
import java.util.Scanner;

public class Product출력 {

	public static void main(String[] args) {
		/* Manager로 구성
		 * 1. 제품추가(메뉴추가)
		 * 2. 제품리스트보기
		 * 3. 제품주문(제품명,수량)  String menu, int count
		 * 4. 주문내역(주문리스트 출력) (총 금액)
		 * 5. 프로그램 종료
		 * list에서 해당 햄버거를 찾아 price를 가져와서 수량을 곱해서 order price로 저장
		 * */
//		ArrayList<Product> list = new ArrayList<>(); // 메뉴등록 리스트
//		ArrayList<Product> order = new ArrayList<>(); // 주문 리스트
		Order od = new Order();
		Scanner scan = new Scanner(System.in);
		int menu=-1;
			
		while(menu!=5) {			
			od.printmenu();
			menu= scan.nextInt();
			
			switch(menu) {
			case 1: od.addlist(scan); break;			
			case 2: od.checkList(); break;
			case 3: od.orderList(scan); break; 
			case 4: od.checkOrder(); break;
			case 5:	System.out.println("프로그램 종료 !!"); break;
			default : System.out.println("잘못된 값입니다");
			}
		}
	}
}