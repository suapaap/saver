package day07;

public class 상속02 {

	public static void main(String[] args) {
		/* 오버라이딩 : 부모클래스에게 물려받은 매서드를 재정의하는 것
		 * - 부모클래스의 메서드와 일치해야함 (선언부 일치)
		 * - 접근제한자는 같거나 넓은 접근제한자를 써야함
		 * => 범위를 축소할 수 없다.
		 * */
		Dog d = new Dog();
		d.info();
		d.howl();
		Cat c = new Cat();
		c.info();
		c.howl();
		Tiger t = new Tiger();
		t.info();
		t.howl();
		
		Dog d2 = new Dog();
		d2.setName("멍멍이");
		d2.setCategory("퍼피");
		d2.info();
		d2.howl();
	}

}

class Animal{
	private String name;
	private String category;
	
	public void info() {
		System.out.println("-----------");
		System.out.println("이름 : "+name);
		System.out.println("분류 : "+category);

	}
	public void howl() {
		System.out.println("--"+name+" 울음소리--");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Animal(String name, String category) {
		this.name = name;
		this.category = category;
	}
	public Animal() {} // 기본생성자
	
}

class Dog extends Animal{
	public Dog() {
		super("강아지","뽀삐");
	}
	@Override
	public void howl() {
		super.howl();
		System.out.println("멍멍");
	}	
}

class Cat extends Animal{
	public Cat() {
		super("고양이","포유류");
	}
	@Override
	public void howl() {
		super.howl();
		System.out.println("야옹");
	}	
}

class Tiger extends Animal{
	public Tiger() {
		super("호랑이","포유류");
	}
	@Override
	public void howl() {
		super.howl();
		System.out.println("어흥");
	}
	
}