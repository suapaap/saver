package lotto;

import java.util.Scanner;

public class Lotto프로그램 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Lotto_maker lm = new Lotto_maker();
		LottoManager lom = new LottoManager();
		int []lotto = new int[7];
		int main=0;
		
		do {
			lom.printMain(); 
			main=scan.nextInt();
			switch(main) {
			case 1 : lm.createLotto(scan); break;
			case 2 : lm.createLottoAuto(); break;
			case 3 : 
			case 4 :
			case 5 :
			case 6 : 
			default : 
				lom.printAlert();
			}			
		}while(main!=6);
		lom.printend();
		scan.close();		
	}	
}
