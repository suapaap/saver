package day06;

public class CardPackClass {

	public static void main(String[] args) {
		Card c = new Card();
//		c.print();
		CardPack cp = new CardPack();
		cp.shuffle();
		for(int i=1; i<=4; i++) { // 4줄로 출력
			for(int j=1; j<=13; j++) {
				Card tmp = cp.pick();
				tmp.print();
			}
			System.out.println(); // 줄바꿈.
		}	
	}
}

/* CardPack 클래스
 * - 카드 팩 : 52장의 카드들
 * - 카드 섞는 기능 
 * - 카드 빼내는 기능
 * - 출력기능 : Card클래스에서 가져오기
 * - 카드 초기화 기능
 */
class CardPack{
	private Card[] pack = new Card[52]; // 52장의 카드가 들어갈수 있는 배열(pack)
	private int cnt=0; // 카드의 남은 개수
	

	//카드 섞기 기능 shuffle() 매개변수X , 리턴타입: void
	public void shuffle() {
		int min =0;
		int max = pack.length-1;
		for (int i=0; i<pack.length; i++){
			int index = (int)(Math.random()*(max-min+1))+min;
			Card tmp = pack[i];
			pack[i] = pack[index];
			pack[index] = tmp;
		}
	}
	
	//카드 빼내는 기능
	//cnt = 52 가정
	public Card pick() {
		if(cnt==0) {
			return null;
		}
		cnt--;
		return pack[cnt]; // pack의 마지막 번지를 pick하는 곳
	}
	// 카드 초기화 기능
	public void cnt() {
		cnt = 52;
		shuffle();
	}
	public int getCnt() {
		return cnt;
	}
	// 생성자 => 52장의 카드 생성
	public CardPack() {
		char shape = '♥';
		for(int i=1; i<=4; i++) {
			switch(i) {
			case 1: shape= '♥'; break;
			case 2: shape= '◆'; break;
			case 3: shape= '♣'; break;
			case 4: shape= '♠'; break;
			}
		for(int j=1; j<=13; j++) {
			Card tmp = new Card(); //카드 1장생성
			tmp.setNum(j); 
			tmp.setShape(shape);
			pack[cnt]=tmp; // 카드 팩에 카드 1장추가함
			cnt++;
			}
		}
	}
}

class CardPack2 {
    private CardPack2[] pack = new CardPack2[52];
    private int cnt = 0;

    public CardPack2 pick() {
        if (cnt == 0) {
            return null;
        }
        cnt--;
        return pack[cnt];
    }

    public CardPack2() {
        char shape = '♥';
        for (int i = 1; i <= 4; i++) {
            switch (i) {
                case 1:
                    shape = '♥';
                    break;
                case 2:
                    shape = '◆';
                    break;
                case 3:
                    shape = '♣';
                    break;
                case 4:
                    shape = '♠';
                    break;
            }
            for (int j = 1; j <= 13; j++) {
                CardPack2 tmp = new CardPack2();
                tmp.setNum(j);
                tmp.setShape(shape);
                pack[cnt] = tmp;
                cnt++;
            }
        }
    }

	private void setShape(char shape) {
		// TODO Auto-generated method stub
		
	}

	private void setNum(int j) {
		// TODO Auto-generated method stub
		
	}
}