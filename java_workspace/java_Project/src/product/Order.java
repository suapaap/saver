package product;

import java.util.ArrayList;
import java.util.Scanner;

public class Order extends Product {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<Product> list = new ArrayList<>();
	ArrayList<Product> order = new ArrayList<>();
	ArrayList<Integer> count = new ArrayList<>();
	
	
	public void printmenu() {
		System.out.println("보기 중 하나를 고르시오");
		System.out.println("1. 제품추가");
		System.out.println("2. 제품리스트보기");
		System.out.println("3. 제품주문");
		System.out.println("4. 주문내역(주문리스트)(총 금액)");
		System.out.println("5. 프로그램 종료");
}
	public void addlist(Scanner scan) {
		Product pr = new Product();
	System.out.println("추가할 제품명을 입력하세요");
	pr.setMenu(scan.next());
	System.out.println("제품 가격을 입력하세요");
	pr.setPrice(scan.nextInt());
	System.out.println("입력이 완료되었습니다 ");
	list.add(pr);
	}
	
	public void checkList() {
		for(int i=0; i<list.size(); i++) {
		System.out.println((i+1)+". "+list.get(i).getMenu()+" : "
		+list.get(i).getPrice()+"원");
		}
	}
	public void orderList(Scanner scan) {
		int num=0;
		checkList();
		System.out.println("위 제품중 어떤 제품을 주문하시겠습니까(번호입력)?");
		num = scan.nextInt();
		order.add(list.get(num-1));
		System.out.println("몇개 주문하시겠습니까?");
		num = scan.nextInt();
		count.add(num);		
	}
	public void checkOrder() {
		int sum=0;
		for (int i=0; i<order.size(); i++) {
			sum = sum+order.get(i).getPrice()*count.get(i);
			System.out.println((i+1)+". "+order.get(i).getMenu()+" : "
			+order.get(i).getPrice()+" "+count.get(i)+"개");
       	}
			System.out.println("총 금액: "+sum);
	}
}