package Word;

import java.util.Collections;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
		/* 단어장 프로그램 작성
		 * 1. 단어등록
		 * 2. 단어검색
		 * 3. 단어수정
		 * 4. 단어출력
		 * 5. 종료
		 * */
		int menu=-1;
		Scanner scan = new Scanner(System.in);
		WordManager wm = new WordManager();
		
		do {
			wm.menuPrint();
			menu=scan.nextInt();
			switch(menu) {
			case 1: wm.wordCreate(scan); break;
			case 2: wm.wordSerch(scan); break;
			case 3: wm.wordFix(scan); break;
			case 4: wm.wordPrint(); break;
			case 5: break;
			default : System.out.println("잘못된 값입니다.");
			}
		}while(menu!=5);
		System.out.println("프로그램 종료 !!");
	}
}