package lotto;

import java.util.Scanner;

public class Lotto_maker {
	Scanner scan = new Scanner(System.in);
	
	private int createLotto[] = new int[7];
	private int createLottoAuto[] = new int[7];
	private int insertLotto[] = new int[6];
	private int checkLotto;
	private int printLotto;
	private int lottoCount;

	public static int random() {
		int ran1=(int)(Math.random()*45)+1;
		return ran1;
	} 
	public void createLotto(Scanner scan) {
		for(int i=0; i<createLotto.length; i++) {
			System.out.print((i+1)+"번째 숫자를 입력하세요 : ");
			createLotto[i] = scan.nextInt();			
		}
		System.out.println("로또 생성완료");
	}

	public void createLottoAuto() {
	for(int i=0; i<createLottoAuto.length; i++) {
		
		//		createLottoAuto[i] = random();	
//		if(isContain(createLottoAuto)) {
//			return;
//			} 
		}
	System.out.println("숫자가 랜덤으로 생성되었습니다.");
	System.out.println(createLottoAuto);
	}
	
	public boolean isContain(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			int num=0;
			if(arr[i]==num) {
				return true;
			}
		} return false;
	}
	
	public int[] getCreateLottoAuto() {
		return createLottoAuto;
	}


	public void setCreateLottoAuto(int[] createLottoAuto) {
		this.createLottoAuto = createLottoAuto;
	}

	public int[] getCreateLotto() {
		return createLotto;
	}
	
	public void setCreateLotto(int[] createLotto) {
		this.createLotto = createLotto;
	}
	
	public int[] getInsertLotto() {
		return insertLotto;
	}
	
	public void setInsertLotto(int[] insertLotto) {
		this.insertLotto = insertLotto;
	}
	
	public int getCheckLotto() {
		return checkLotto;
	}

	public void setCheckLotto(int checkLotto) {
		this.checkLotto = checkLotto;
	}


	public int getPrintLotto() {
		return printLotto;
	}


	public void setPrintLotto(int printLotto) {
		this.printLotto = printLotto;
	}


	public int getLottoCount() {
		return lottoCount;
	}
	
	
}
