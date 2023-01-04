package jdbc;

import java.util.List;
import java.util.Scanner;

public class ProductController {

	// 상품등록, 상품리스트보기, 상품상세페이지보기, 상품수정, 상품삭제
	// 데이터베이스 연동한 후 컨트롤러에서 모든메뉴를 분기처리
	// 서비스는 컨트롤러에서 호출, DAO는 서비스가 호출
	private Scanner scan;
	private Service svc;
	private boolean flag;
	
	public ProductController() {
		scan = new Scanner(System.in);
		svc = new ProductService(); // service 구현 객체
		flag = true;
		printMenu();
		}
	private void printMenu() {
		while(flag) {
			System.out.println("--상품관리시스템--");
			System.out.println("1.등록 2.목록 3.찾기 4.수정 5.삭제 Etc.종료");
			int menu = scan.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("register메뉴");
				register();
				break;
			case 2:
				System.out.println("list메뉴");
				list();
				break;
			case 3:
				System.out.println("detail메뉴");
				detail();
				break;
			case 4:
				System.out.println("edit메뉴");
				edit();
				break;
			case 5:
				System.out.println("remove메뉴");
				remove();
				break;
			default:
				flag = false;
				System.out.println("시스템이 종료되었습니다.");
				break;
			}
		}
	}
	
	private void remove() {
		// 상품번호를 입력받아 삭제
		System.out.println("상품번호 >>");
		int pno = scan.nextInt();
		int isOk = svc.remove(pno);
		System.out.println("상품삭제" + (isOk > 0? "성공" : "실패"));
		
	}
	private void edit() {
		// 상품번호, 이름, 가격, 제조사 입력받아서 매개변수로 보냄
		// 리턴 잘됬는지 체크 isOk
		System.out.println("상품번호 >>");
		int pno = scan.nextInt();
		System.out.println("상품이름 >>");
		String pname = scan.next();
		System.out.println("상품가격 >>");
		int price = scan.nextInt();
		System.out.println("제조사 >>");
		String madeby = scan.next();
		int isOk = svc.edit(new Product(pno,pname, price, madeby));
		System.out.println("상품수정" + (isOk > 0? "성공" : "실패"));
		
	}
	private void detail() {
		System.out.println("상품번호 >>");
		int pno = scan.nextInt();
		Product pvo = svc.detail(pno);
		System.out.println(pvo);
		
	}
	private void list() {
		System.out.println("상품목록입니다");
		List<Product> list = svc.list();
		
		//출력
		for(Product p : list) {
			System.out.println(p);
		}
		// select 구문 * all
		
	}
	private void register() {
		System.out.println("상품이름 >>");
		String pname = scan.next();
		System.out.println("상품가격>>");
		int price = scan.nextInt();
		System.out.println("제조사>>");
		String madeby = scan.next();
		int isOk = svc.register(new Product(pname, price, madeby));
		System.out.println("상품등록" + (isOk > 0? "성공" : "실패"));
	}
}
