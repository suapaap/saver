package lotto;

import java.util.Scanner;

public class T_로또실행프로그램 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int arr[] = {1,5,7,9,4,6};
//		T_Lotto l = new T_Lotto();
//		l.insertNumber(arr);
//		System.out.println(l);
		T_LottoManager lm = new T_LottoManager();
		int main=0;
		
		do {
			lm.printMenu(); 
			main=scan.nextInt();
			
			switch(main) {
			case 1 : lm.createLotto(scan); break;
			case 2 : lm.createLottoAuto(); break;
			case 3 : lm.insertLottoAuto(); break;
			case 4 : lm.checkLotto(); break;
			case 5 : lm.printLotto(); break;
			case 6 : break;
			default : 
				System.out.println("잘못된 메뉴입니다.");
			}			
		}while(main!=6);
		System.out.println("종료");
		
		scan.close();
	}

}
