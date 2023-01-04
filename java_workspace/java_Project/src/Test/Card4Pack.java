package Test;

public class Card4Pack {

	public static void main(String[] args) {
		/*
		 * CardPack 클래스 - 카드 팩 : 52장의 카드들 - 출력기능 : Card클래스에서 가져오기 - 카드 초기화 기능
		 */
		Card4 cd = new Card4();
		for (int i = 1; i <= 4; i++) { // char 반복문
			for (int j = 1; j <= 13; j++) { // 숫자 반복문

			}
		}
		
	}
	private Card4[] card = new Card4[52];
	private int count = 0;
	
	public Card4 pick() {
		if (count==0) {
			return null;
		}
		count--;
		return card[count];
	}
	
	public Card4Pack() {
		char shape = ' ';
		for(int i=1; i<= 4; i++) {
			
		}
	}
	
	
}