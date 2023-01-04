package day05;

public class 클래스02 {

	public static void main(String[] args) {
		Car c= new Car();
		c.color = "red";
		c.power = true;
		c.speedUp();
		System.out.println(c.color);
		System.out.println(c.power);
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		System.out.println(c.speed);
		
		Car c2= new Car();
		c2.color = "black";
		System.out.println(c2.color);
	}

}
class Car{ //클래스명은 반드시 대문자로
	String color;
	boolean power;
	int speed;
	
	//메서드
	void power() {
		power = !power;
	}
	void speedUp() {
		speed++; 
	}
	void speedDown() {
		speed--;
	}
	
	
}