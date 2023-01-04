package lotto;

public class T_LottoE extends T_Lotto {
	//당첨번호 생성 클래스 Lotto를 상속받아서 보너스 번호만 처리
	//멤버변수
	private int bonus;
	//메서드

	//오버라이딩 메서드 randomLotto, init, toString, insertNumber
	@Override
	protected void randomLotto() {
		super.randomLotto(); // 6자리 번호 랜덤생성 완료
		// 보너스 번호를 중복되지 않게 추가하기
		while(true) {
			int r = random();
			if(!isContain(r)) {
				bonus = r;
				break;
			}
		}
	}

	@Override
	protected void init() {
		super.init();
		// 보너스 번호 초기화하기
		bonus = 0;
	}

	@Override
	public String toString() {
		//보너스 번호 같이 출력
		return super.toString()+"["+bonus+"]"; // 6자리 번호 출력
	}

//오버로딩	
	@Override
	protected void insertNumber(int[] arr) {
		super.insertNumber(arr); // 6자리 배열생성된 것
		//보너스번호를 추가하기
		bonus = arr[numbers.length];
	}
	
	public void insertNumber(int[] arr, int bonus) {
	super.insertNumber(arr);
	this.bonus = bonus;
	}
	
	//get Bonus()
	public int getBonus() {
		return bonus;
	}	
}