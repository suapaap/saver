package studentmanager;

import java.util.Scanner;

public class StudentManager implements Program {
	private Student[] std = new Student[10];
	private int stuCount; // 등록한 학생 카운트
	
	//한명의 학생을 출력할 수 있는 메서드
	public void printStudentOne(Student s) {
		System.out.println("--학생정보--");
		s.stuPrint(); // 학생정보 출력메서드
		System.out.println("--수강정보--");
		s.print(); // 수강과목 출력메서드
	}
	@Override
	public void printStudent() {
		for(int i=0; i<stuCount; i++) {
			printStudentOne(std[i]);
		}
	}
	@Override
	public void insertStudent(Scanner scan) {
		System.out.println("학생을 등록하겠습니다.");
		System.out.println("학번을 입력하세요");
		int stuNum = scan.nextInt();
		System.out.println("이름을 입력하세요");
		String name = scan.next();
		System.out.println("주민번호를 입력하세요");
		int KrNum = scan.nextInt();
		System.out.println("학부를 입력하세요");
		String faculty = scan.next();
		System.out.println("학과를 입력하세요");
		String stuCls = scan.next();
		System.out.println("---등록완료---");
		Student st = new Student(stuNum, name, KrNum, faculty, stuCls);
		
		//배열이 다 찼다면 더 큰배열을 생성 후 배열복사
		if(stuCount== std.length) {
			Student[] cnt= new Student[stuCount*2];
			System.arraycopy(std, 0, cnt, 0, std.length);
			std = cnt;
		}
		
		std[stuCount] = st;
		stuCount++;
		
	}
	@Override
	public void serchStudent(Scanner scan) {
		//입력받은 학생명으로 std 검색
		// 검색어를 입력받기
		System.out.println("학생명을 입력해주세요");
		String serch = scan.next();
		//전체배열탐색
		for(int i=0; i<stuCount; i++) {
			if(std[i].getStuName().equals(serch)) {
				//한사람의 정보를 출력해주면 됨
				printStudentOne(std[i]);
			}
		}
		System.out.println("검색결과입니다.");
	}
	
	@Override
	public void registerSubject(Scanner scan) {
		//수강신청하고자 하는 학생이름 체크
		//학생의 위치를 알려주는 index변수
		int index = -1;
		//학번 입력받아 수강신청자 체크
		System.out.println("수강신청할 학번 입력:");
		int stuNum = scan.nextInt();
		for(int i=0; i<stuCount; i++) {
			if(stuNum == std[i].getStuNumber()){
				index = i;
				break;
			}
		}
			if(index==-1) {
				System.out.println("존재하지 않는 학번입니다.");
				return;
			}
			
			//과목명을 입력받아 과목 객체 생성 insertSubject 메서드 호출
			System.out.println("--과목명 :");
			String stuTitle = scan.next();
			//과목객체 생성
			Subject sb = new Subject(stuTitle);
			std[index].insertSubject(sb); 
			System.out.println("수강 신청 완료");
			// Student 에서 insertSubject메서드 호출
			
	}
	@Override
	public void deleteSubject(Scanner scan) { //입력하는 학생의 정보를 확인
		// registerSubject와 같음.
		int index= -1;
		System.out.println("수강철회할 학번 입력:");
		int stuNum = scan.nextInt();
		for(int i=0; i<stuCount; i++) {
			if(stuNum == std[i].getStuNumber()){
				index = i;
				break;
			}
		}		
		if(index == -1) {
			System.out.println("존재하지 않는 학번입니다.");
			return;
		} 				// 여기까지
		
		System.out.println("--과목명 :");
		String stuDelTitle = scan.next();
		System.out.println("수강 철회 완료");
		std[index].deleteSubject(stuDelTitle);
		
	}
	
	/* 수강관리프로그램 - main
	 * --메뉴--
	 * 1. 학생등록
	 * 2. 학생확인(학생리스트)
	 * 3. 학생검색
	 * 4. 수강신청
	 * 5. 수강철회
	 * 6. 종료
	 * */
	public void printMenu() {
		System.out.println("----menu----");
		System.out.println("1. 학생등록");
		System.out.println("2. 학생리스트");
		System.out.println("3. 학생검색");
		System.out.println("4. 수강신청");
		System.out.println("5. 수강철회");
		System.out.println("6. 종료");
		System.out.println("------------");
		System.out.println("메뉴를 선택해주세요");
	}
	//잘못입력된 메뉴일 때
	public void printAlert() {
		System.out.println("정해지지 않은 메뉴입니다");
	}
	
	public void printEnd() {
		System.out.println("종료!");
	}
}
