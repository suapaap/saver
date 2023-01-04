package day08;

import java.util.Scanner;

public class Product출력 {

	public static void main(String[] args) {
		/* 앞에서 만든 Product class를 이용하여 상품을 등록/출력
		 * 상품을 등록하시겠습니까? (Y/N)
		 * 상품명 : 가방
		 * 가격 : 20000
		 * 상품을 등록하시겠습니까? (Y/N)
		 * 상품명 : 신발
		 * 가격 : 30000
		 * N 입력 시 상품리스트 출력
		 * 1. 가방 : 20000
		 * 2. 신발 : 30000 
		 * */
		Scanner scan = new Scanner(System.in);
//		Product p = new Product();
//		p.print("가방", 20000);
		
		Product p1[] = new Product[1];
		int cnt = 0;
		int end = 0;
		String name ="";
		int price = 0; 
		String menu;
		
		do {
			System.out.println("상품을 등록하시겠습니까? Y/N");
			menu = scan.next();
			
			switch(menu) {
			case "Y" : case "y" :
				System.out.println("상품명과 가격을 입력하세요");
				name=scan.next();
				price=scan.nextInt();
				p1[cnt] = new Product(name,price);
//				p1.print(scan.next(), scan.nextInt());
//				p1.print(scan.next(), scan.nextInt());
				cnt++;
				System.out.println("상품등록이 완료되었습니다");
				
				break;
				
			case "N" : case "n" :
				end=1;
				System.out.println("프로그램을 종료합니다");
				
				break;
				
			default :
				System.out.println("잘못된 값입니다");
			}
		}while(end!=1);
		
		for(int i=0; i<cnt; i++) {
			p1[i].print();
		}
		scan.close();
	}
}
