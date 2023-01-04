package day07;

public class 클래스07 {

	public static void main(String[] args) {
		/* 학생정보의 클래스
		 * Student
		 * - 멤버변수 (이름, 나이, 반이름,번호, 교재수령유무)
		 * - 메서드 (print)
		 * */
		Student s = new Student();
		s.print();
		System.out.println();
		s.setAge(930627);
		s.setCls("JAVA");
		s.setName("이승원");
		s.setNumber("010-9909-1727");
		s.print();
		s.bookhave();
		System.out.println();
		Student s1 = new Student();
		s1.setAge(931117);
		s1.setCls("JAVA");
		s1.setName("강정연");
		s1.setNumber("010-9887-1727");
		s1.print();
		s1.bookhavent();
		
	}
}
/* 초기화 방법 : 기본값, 명시적초기화, 초기화블럭, 생성자
 * 1. 명시적초기화 : 멤버변수 선언과 동시에 값을 지정
 * 2. 초기화블럭 : {} 멤버변수를 초기화
 * 3. 생성자 : 생성자를 활용하여 초기화
 * 기본값 > 명시적초기화 > 초기화블럭 > 생성자
 * */
class Student{
	
	private String name;
	private int age;
	private String cls="JAVA"; // 명시적 초기화 
	private boolean book; 
	private String number;
	{
		//초기화 블럭 : 멤버변수 초기화
		cls="미정";
	}	
	
	public void print() {
		System.out.println("이름 :"+name+" "+ "생년월일 :"+age+" " +"연락처 :"+number);
		System.out.println("반명 :"+cls);
	}
		
	public void name() {
		System.out.println();
	}
	
	public void age() {
		System.out.println();
	}
	
	public void cls() {
		System.out.println();
	}
	
	public void number() {
		System.out.println();
	}
	
	public void bookhave() {
		book = true;
		System.out.println("교재를 받았습니다.");
	}
	
	public void bookhavent() {
		book = false;
		System.out.println("교재를 받지 않았습니다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCls() {
		return cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}