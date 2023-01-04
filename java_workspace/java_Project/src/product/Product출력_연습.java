package product;

import java.util.Scanner;

public class Product출력_연습 {

	public static void main(String[] args) {
		/* Manager로 구성
		 * 1. 제품추가(메뉴추가) void add(Scanner scan)
		 * 2. 제품리스트보기 void menuPrint()
		 * 3. 제품주문(제품명,수량)  String menu, int count // void orderpick(String menu, int count)
		 * 4. 주문내역(주문리스트 출력) (총 금액) void orderPrint() {
		 * 5. 프로그램 종료
		 * list에서 해당 햄버거를 찾아 price를 가져와서 수량을 곱해서 order price로 저장
		 * */
		ProManager pm = new ProManager();
		Scanner scan = new Scanner(System.in);
	
		int menu=-1;
		do {
			pm.printmenu();
			menu=scan.nextInt();
			
			switch(menu) {
			case 1: pm.add(scan); break;
			case 2: pm.menuPrint(); break;
			case 3: 
				System.out.println("주문 메뉴명 : ");
				String name = scan.next();
				System.out.println("주문 수량 : ");
				int count = scan.nextInt();
				pm.orderpick(name, count); 
				break;
			case 4: pm.orderPrint(); break;
			case 5: break;
			default : System.out.println("잘못된 값입니다.");
			}
		}
		while(menu!=5);
		System.out.println("프로그램 종료!!");
		scan.close();
	}
}