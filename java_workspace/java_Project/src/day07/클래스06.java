package day07;

public class 클래스06 {
	/* static이 붙은 메서드/멤버변수는 클래스의 멤버 변수/메서드가 된다.
	 * static이 안붙은 멤버변수/메서드는 객체(인스턴스)의 멤버 변수/메서드가 된다.
	 * 
	 * - 객체의 멤버변수/메서드는 객체를 통해 사용된다.
	 * - 객체 멤버변수는 각 객체마다 멤버변수를 생성한다.
	 * - 클래스의 멤버변수/메서드는 클래스를 통해 사용된다.
	 * 	 // 클래스명. 메서드명or변수명
	 * 	 (객체를 통해서도 사용은 가능하나 일반적이진 않다.)
	 * - 클래스 멤버변수는 하나의 멤버변수를 모든 객체가 공유한다.
	 * 
	 * - 클래스/객체 변수는 생성 시점이 달라서 메서드에 사용될 수 있는 환경이 다르다.
	 * - 객체멤버 변수는 클래스멤버 메서드에서 사용할 수 없다.
	 * - 객체멤버 변수는 객체멤버 메서드에서만 사용할 수 있다.
	 * - 클래스멤버 변수는 클래스/객체 멤버 메서드에서 사용할 수 있다.
	 * - 클래스멤버 메서드는 클래스/객체 멤버 메서드에서 사용할 수 있다.
	 * - 객체멤버 메서드는 객체멤버 메서드에서만 사용할 수 있다.
	 * 
	 * - 객체멤버 변수는 생성시점이 객체가 생성될 때 변수가 생성된다.
	 * - 클래스 멤버변수는 클래스가 메모리에 올라가는 순간 생성된다.
	 * 	 => 클래스 멤버변수는 객체가 만들어지지 않아도 생성된다.
	 * 
	 * - final은 클랫, 변수, 메서드에 붙일 수 있다.
	 * - final(최종, 마지막) : 수정할 수 없다.
	 * - 멤버 변수 : 상수
	 * - 멤버 메서드 : 오버라이딩(메서드 재정의) 할 수 없다.
	 * - 클래스 : 상속할 수 없다.
	 * */

	public static void main(String[] args) {
		TV t = new TV();
		t.turnOn();
//		t.setBrand("SAMSUNG");
		t.printBrand();
		
		System.out.println();
		System.out.println("==============");
		TV t2 = new TV();
		t2.turnOn();
//		t2.setBrand("LG");
		t2.printBrand();
		t.printBrand();
	}
}

class TV {
	private boolean power;
	private static final String brand = "SAMSUNG";
	
	public void turnOn() { 
		power = true; 
		System.out.println("TV가 켜졌습니다.");
	}
	
	public void turnOff() { 
		power = false;
		System.out.println("TV가 꺼졌습니다.");
	}
	
	public void printBrand() {
		System.out.println("제조사"+brand);
	}

	public String getBrand() {
		return brand;
	}

//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
	
}

/* TV 클래스 생성
 * - 멤버변수
 * power,brand
 * - 메서드
 * turnOn, turnOff
 * printBrand()
 * */