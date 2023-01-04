package day07;
/* 학생기본정보 : 이름, 생년월일, 나이, 전화번호
 * 학원 정보 : 학원이름, 지점
 * 학생 수강 정보 :수강과목, 기간
 * */
public class EzenComputer {
	/* 학생의 기본정보 출력
	 * 학생의 학원정보 출력
	 * 학생의 수강정보 출력
	 * 학생의 수강정보 추가기능
	 * 생성자
	 * */
		
//	public static void main(String[] args) {
//		EzenStudent ez = new EzenStudent();
//		stu1 st1 = new stu1();
//		st1.stuinfo();
//		st1.assistinfo();
//		st1.stuclsinfo();
	
	

	//멤버변수 선언
	private String name;
	private int birth;
	private int age;
	private String number;
	private static final String assist = "Ezen"; 
	private String where;
	private String[] cls = new String[5];
	private int[] month = new int[5];
	private int cnt=0;
	
	public void stuinfo() {
		System.out.println("=======");
		System.out.println("이름 : "+ name);
		System.out.println("생년월일 : "+ birth);
		System.out.println("나이 : "+ age);
		System.out.println("전화번호 : "+ number);
	}
	
	public void assistinfo() {
		System.out.println("========");
		System.out.println("학원 : "+ assist);
		System.out.println("지점 : "+ where);
	}
	
	public void stuclsinfo(String cls, int month) {
				
		this.cls[cnt]=cls;
		this.month[cnt]=month;
		//System.out.println(this.cls[cnt]+","+ this.month[cnt]);
		System.out.printf("수강과목 %s, 수강기간은 %d개월입니다.%n",this.cls[cnt], this.month[cnt]);
		cnt++;
			
				
		
//		System.out.println("=========");
//		System.out.println("수강과목 "+ cls);
//		System.out.println("수강기간 "+ month);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}
	
	public EzenComputer() {} // 기본생성자
	
	public EzenComputer(
	 String name, int birth, int age, String number, 
	 String where) {
		this.name=name; this.birth=birth; this.age=age; this.number=number;
		this.where=where;  
	}

	public String[] getCls() {
		return cls;
	}

	public void setCls(String[] cls) {
		this.cls = cls;
	}

	public int[] getMonth() {
		return month;
	}

	public void setMonth(int[] month) {
		this.month = month;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
}

class stu1 extends EzenComputer {
	public stu1() {
		super("이길동",930627,30,"010-1234-1234","인천");		
	}

//	@Override
//	public void stuclsinfo() {
//		super.stuclsinfo();
//	}
	
}