package lotto;

public class LottoManager {

	public void printMain() {
		System.out.println("----menu----");
		System.out.println("1. 로또 번호 생성(수동)");
		System.out.println("2. 로또 번호 생성(자동)");
		System.out.println("3. 당첨번호 생성(자동)");
		System.out.println("4. 당첨번호(내역)확인");
		System.out.println("5. 당첨번호 목록 확인(전체)");
		System.out.println("6. 종료");
		System.out.println("------------");
		System.out.println("메뉴를 선택해주세요");
	}
	public void printAlert() {
		System.out.println("정해지지 않은 메뉴입니다");
	}
	
	public void printend() {
		System.out.println("로또종료 !");
	}
}
