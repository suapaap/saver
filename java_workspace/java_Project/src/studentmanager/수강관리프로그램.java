package studentmanager;

import java.util.Scanner;

public class 수강관리프로그램 {

	public static void main(String[] args) {
		StudentManager sm = new StudentManager();
		Scanner scan = new Scanner(System.in);
		int menu= 0;
		do{
			sm.printMenu();
			menu = scan.nextInt();
		
		switch(menu){
			case 1: sm.insertStudent(scan);	break;
			case 2: sm.printStudent(); break;
			case 3: sm.serchStudent(scan); break;
			case 4: sm.registerSubject(scan); break;
			case 5: sm.deleteSubject(scan); break;
			case 6: break;
			default : 
				sm.printAlert();
			}
		}while(menu!=6); 
		sm.printEnd();
		scan.close();
	}
}
	
//			System.out.println("----menu----");
//			System.out.println("1. 학생등록");
//			System.out.println("2. 학생리스트");
//			System.out.println("3. 학생검색");
//			System.out.println("4. 수강신청");
//			System.out.println("5. 수강철회");
//			System.out.println("6. 종료");
//			System.out.println("------------");
//			System.out.println("메뉴를 선택해주세요");

//				
//				